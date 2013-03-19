package com.patrick_vane.unrealscript.editor.perspective.handlers;

import java.util.HashMap;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.default_classes.HashMapOrderer;
import com.patrick_vane.unrealscript.editor.default_classes.MySerializer;
import com.patrick_vane.unrealscript.editor.executable.Profile;
import com.patrick_vane.unrealscript.editor.executable.UDKGame;


public class RunGame extends AbstractHandler
{
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked( event );
		IProject project = null;
		try
		{
			project = UnrealScriptEditor.getSelectedOrActiveUDKProject( window );
		}
		catch( Exception e )
		{
			MessageDialog.openError( window.getShell(), "Error", e.getMessage() );
			return null;
		}
		
		UDKGame.run( project );
		return null;
	}
	
	
	private static HashMap<String,Profile> getProfiles( IProject project )
	{
		String profilesString;
		try
		{
			profilesString = project.getPersistentProperty( UnrealScriptID.PROPERTY_EXECUTE_SETTINGS_PROFILES );
		}
		catch( CoreException e )
		{
			profilesString = null;
		}
		
		HashMap<String,Profile> profiles;
		try
		{
			profiles = (HashMap<String,Profile>) MySerializer.fromString( profilesString );
		}
		catch( Exception e )
		{
			profiles = null;
		}
		if( (profiles == null) || profiles.isEmpty() )
		{
			profiles = new HashMap<String,Profile>();
			profiles.put( "Default", new Profile() );
		}
		profiles = HashMapOrderer.orderHashMap( profiles );
		
		return profiles;
	}
}
