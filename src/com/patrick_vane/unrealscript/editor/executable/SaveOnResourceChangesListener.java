package com.patrick_vane.unrealscript.editor.executable;

import java.io.File;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.default_classes.AbstractResourcesChangedListener;


public class SaveOnResourceChangesListener extends AbstractResourcesChangedListener
{
	public SaveOnResourceChangesListener( File root )
	{
		super( root );
	}
	
	@Override
	public void fileChanged( String name )
	{
		if( name.endsWith(".uc") )
		{
			UDKCompiler.compile( UnrealScriptEditor.getActiveProject() );
		}
	}
}
