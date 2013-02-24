package com.patrick_vane.unrealscript.editor;

import java.io.File;
import com.patrick_vane.unrealscript.editor.class_hierarchy.TypeHierarchyView;
import com.patrick_vane.unrealscript.editor.default_classes.AbstractResourcesChangedListener;
import com.patrick_vane.unrealscript.editor.executable.UDKCompiler;


public class FileChangesListener extends AbstractResourcesChangedListener
{
	public FileChangesListener( File root )
	{
		super( root );
	}
	
	@Override
	public void fileChanged( String name )
	{
		if( name.endsWith(".uc") )
		{
			TypeHierarchyView.fileChanged();
			UDKCompiler.compile( UnrealScriptEditor.getActiveProject() );
		}
	}
}
