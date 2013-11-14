package com.patrick_vane.unrealscript.editor.perspective.handlers;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.QualifiedName;
import com.patrick_vane.unrealscript.editor.constants.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.executable.Profile;
import com.patrick_vane.unrealscript.editor.executable.UDKGame;


public class RunGame extends RunAbstract
{
	@Override
	public QualifiedName getLastUsedProfileKey()
	{
		return UnrealScriptID.PROPERTY_LAST_USED_RUN_GAME_PROFILE;
	}
	
	@Override
	public void run( IProject project )
	{
		UDKGame.run( project );
	}
	@Override
	public void run( IProject project, Profile profile )
	{
		UDKGame.run( project, profile );
	}
}
