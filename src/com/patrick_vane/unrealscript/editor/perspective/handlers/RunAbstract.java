package com.patrick_vane.unrealscript.editor.perspective.handlers;

import java.util.HashMap;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.QualifiedName;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.executable.Profile;


public abstract class RunAbstract extends AbstractHandler
{
	public abstract QualifiedName getLastUsedProfileKey();
	
	
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		IProject project = null;
		HashMap<String,Profile> profiles = null;
		String lastUsedProfileName = null;
		try
		{
			project = UnrealScriptEditor.getSelectedOrActiveProject();
			profiles = UnrealScriptEditor.getProfiles( project );
			lastUsedProfileName = project.getPersistentProperty( getLastUsedProfileKey() );
		}
		catch( Exception e )
		{
		}
		
		if( (profiles == null) || profiles.isEmpty() )
		{
			run( project );
			return null;
		}
		
		if( lastUsedProfileName != null )
		{
			Profile profile = profiles.get( lastUsedProfileName );
			if( profile != null )
			{
				run( project, profile );
				return null;
			}
		}
		
		if( profiles.size() == 1 )
		{
			run( project, profiles.values().toArray(new Profile[0])[0] );
			return null;
		}
		
		run( project );
		return null;
	}
	
	public abstract void run( IProject project );
	public abstract void run( IProject project, Profile profile );
}

