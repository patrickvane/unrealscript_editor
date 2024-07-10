package com.patrick_vane.unrealscript.editor.perspective.handlers;

import java.io.File;
import java.util.Map.Entry;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.constants.ProjectConstant;
import com.patrick_vane.unrealscript.editor.constants.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.executable.Profile;
import com.patrick_vane.unrealscript.editor.popups.UDKImportProject;


public class ImportProject extends AbstractHandler
{
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked( event );
		IProgressMonitor progressMonitor = new NullProgressMonitor();
		
		File root = null;
		String rootPath = null;
		String projectName = null;
		IProject project = null;
		String path = UnrealScriptEditor.getActivatorPreferenceStore().getString(UnrealScriptID.PROPERTY_CONTENT_ASSISTANT_UDK_DIR.toString());
		UDKImportProject dialog = new UDKImportProject( null, path);
		boolean ok = false;
		while( !ok )
		{
			dialog.showAndBlock( window );
			if( dialog.isCanceled() )
				return null;
			
			root 		= new File( dialog.getInstallationPath() );
			rootPath 	= root.getAbsolutePath()+"/";
			projectName = dialog.getNewProjectName();
			
			project = ResourcesPlugin.getWorkspace().getRoot().getProject( projectName );
			if( project.exists() )
			{
				MessageDialog.openError( window.getShell(), "Error", "A project with this name already exists." );
				ok = false;
				continue;
			}
			
			ok = true;
			for( Entry<String,String> subfolder : ProjectConstant.neededSubfolders.entrySet() )
			{
				String filepath = rootPath+subfolder.getValue()+"/";
				try
				{
					if( new File(filepath).exists() == false )
					{
						MessageDialog.openError( window.getShell(), "Error", "Wrong installation path, can't find folder: \n"+filepath );
						ok = false;
						break;
					}
				}
				catch( Exception e )
				{
					try
					{
						MessageDialog.openError( window.getShell(), "Error", "Wrong installation path, can't find folder: \n"+filepath+"\n\nReason: \n"+e.getMessage() );
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
			UnrealScriptEditor.createProjectFolders( project, "file:/"+root.getAbsolutePath().replaceAll("\\\\", "/").replaceAll(" ", "%20")+"/", progressMonitor, window );
		}
		catch( CoreException e )
		{
			MessageDialog.openError( window.getShell(), "Error", "Can't make project: "+e.getMessage() );
		}
		
		try
		{
			project.setPersistentProperty( UnrealScriptID.PROPERTY_GAME_MAP, Profile.DEFAULT_MAP );
			project.setPersistentProperty( UnrealScriptID.PROPERTY_GAME_MODE, Profile.DEFAULT_MODE );
			project.setPersistentProperty( UnrealScriptID.PROPERTY_EXTRA_EXECUTE_ARGUMENTS, Profile.DEFAULT_EXTRA_ARGS );
			project.setPersistentProperty( UnrealScriptID.PROPERTY_DISABLE_SOUND, Boolean.toString(Profile.DEFAULT_DISABLE_SOUND) );
			project.setPersistentProperty( UnrealScriptID.PROPERTY_DISABLE_STARTUP_VIDEOS, Boolean.toString(Profile.DEFAULT_DISABLE_STARTUP_VIDEOS) );
		}
		catch( Exception e )
		{
		}
		
		return null;
	}
}
