package com.patrick_vane.unrealscript.editor;

import java.io.File;
import org.eclipse.core.resources.IProject;
import com.patrick_vane.unrealscript.editor.default_classes.AbstractResourcesChangedListener;
import com.patrick_vane.unrealscript.editor.executable.UDKCompiler;


public class FileChangesListener extends AbstractResourcesChangedListener
{
	private Configuration configuration;
	private IProject project;
	
	
	public FileChangesListener( Configuration configuration, IProject project, File root )
	{
		super( root );
		
		this.configuration = configuration;
		this.project = project;
	}
	
	
	@Override
	public void fileChanged( String name )
	{
		if( name.endsWith(".uc") )
		{
			configuration.fileChanged();
			UDKCompiler.compile( project );
		}
	}
}
