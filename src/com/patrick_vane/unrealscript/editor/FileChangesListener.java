package com.patrick_vane.unrealscript.editor;

import java.io.File;
import org.eclipse.core.resources.IProject;
import com.patrick_vane.unrealscript.editor.class_hierarchy.TypeHierarchyView;
import com.patrick_vane.unrealscript.editor.default_classes.AbstractResourcesChangedListener;
import com.patrick_vane.unrealscript.editor.executable.UDKCompiler;


public class FileChangesListener extends AbstractResourcesChangedListener
{
	private IProject project;
	
	public FileChangesListener( IProject project, File root )
	{
		super( root );
		this.project = project;
	}
	
	@Override
	public void fileChanged( String name )
	{
		if( name.endsWith(".uc") )
		{
			TypeHierarchyView.fileChanged();
			UDKCompiler.compile( project );
		}
	}
}
