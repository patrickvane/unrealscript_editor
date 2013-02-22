package com.patrick_vane.unrealscript.editor.perspective.handlers;

import java.io.File;
import java.net.URI;
import java.util.Map.Entry;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import com.patrick_vane.unrealscript.editor.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.constants.ProjectConstant;
import com.patrick_vane.unrealscript.editor.popups.UDKImportProject;


public class ImportProject extends AbstractHandler
{
	public ImportProject()
	{
	}
	
	
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked( event );
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		
		File root = null;
		String rootPath = null;
		String projectName = null;
		IProject project = null;
		UDKImportProject dialog = new UDKImportProject( null, null );
		boolean ok = false;
		while( !ok )
		{
			dialog.showAndBlock( window );
			if( dialog.isCanceled() )
				return null;
			
			root 		= new File( dialog.getInstallationPath() );
			rootPath 	= "file:"+root.toURI().getPath();
			projectName = dialog.getNewProjectName();
			
			project = ResourcesPlugin.getWorkspace().getRoot().getProject( projectName );
			if( project.exists() )
			{
				MessageDialog.openError( window.getShell(), "Error", "A project with this name already exists." );
				ok = false;
				continue;
			}
			
			ok = true;
			for( Entry<String,String> subfolder : ProjectConstant.subfolders.entrySet() )
			{
				String filepath = rootPath+subfolder.getValue()+"/";
				try
				{
					if( new File(new URI(filepath)).exists() == false )
					{
						MessageDialog.openError( window.getShell(), "Error", "Wrong installation path, can't find folder \""+filepath+"\"" );
						ok = false;
						break;
					}
				}
				catch( Exception e )
				{
					try
					{
						MessageDialog.openError( window.getShell(), "Error", "Wrong installation path, can't find folder \""+filepath+"\"" );
					}
					catch( Exception e2 )
					{
					}
					ok = false;
					break;
				}
			}
		}
		if( root == null )
			return null;
		if( rootPath == null )
			return null;
		if( projectName == null )
			return null;
		if( project == null )
			return null;
		
		try
		{
			project.create( progressMonitor );
			project.open( progressMonitor );
			project.setPersistentProperty( UnrealScriptID.PROPERTY_IS_UDK_IMPORT, "true" );
			for( Entry<String,String> subfolder : ProjectConstant.subfolders.entrySet() )
			{
				IFolder folder = project.getFolder( subfolder.getKey() );
				try
				{
					folder.createLink( URI.create(rootPath+subfolder.getValue()+"/"), 0, progressMonitor );
				}
				catch( CoreException e )
				{
					try
					{
						MessageDialog.openError( window.getShell(), "Error", "Can't make subfolder "+subfolder.getKey()+": "+e.getMessage() );
					}
					catch( Exception e2 )
					{
					}
				}
				String[] hides = ProjectConstant.hiddensubfolders.get( subfolder.getValue() );
				if( hides != null )
				{
					for( String hide : hides )
					{
						IFolder hideFolder = folder.getFolder( hide );
						try
						{
							hideFolder.create( true, true, progressMonitor );
						}
						catch( CoreException e )
						{
						}
						if( hideFolder.exists() )
						{
							hideFolder.setHidden( true );
						}
					}
				}
			}
		}
		catch( CoreException e )
		{
			MessageDialog.openError( window.getShell(), "Error", "Can't make project: "+e.getMessage() );
		}
		return null;
	}
}
