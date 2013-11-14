package com.patrick_vane.unrealscript.editor.perspective.handlers;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.QualifiedName;
import com.patrick_vane.unrealscript.editor.constants.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.executable.Profile;
import com.patrick_vane.unrealscript.editor.executable.UDKEditor;


public class RunEditor extends RunAbstract
{
	@Override
	public QualifiedName getLastUsedProfileKey()
	{
		return UnrealScriptID.PROPERTY_LAST_USED_RUN_EDITOR_PROFILE;
	}
	
	@Override
	public void run( IProject project )
	{
		UDKEditor.run( project );
	}
	@Override
	public void run( IProject project, Profile profile )
	{
		UDKEditor.run( project, profile );
	}
}