package com.patrick_vane.unrealscript.editor;

import java.io.File;
import org.eclipse.core.resources.IProject;
import com.patrick_vane.unrealscript.editor.constants.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.default_classes.AbstractResourcesChangedListener;
import com.patrick_vane.unrealscript.editor.executable.UDKCompiler;


public class FileChangesListener extends AbstractResourcesChangedListener
{
	private Configuration	configuration;
	private IProject		project;
	
	
	public FileChangesListener( Configuration configuration, IProject project, File root )
	{
		super( root );
		
		this.configuration = configuration;
		this.project = project;
	}
	
	
	@Override
	public void onFileChanged( final String name )
	{
		if( name.endsWith(".uc") )
		{
			configuration.fileChanged();
			
			if( UnrealScriptEditor.getActiveEditorPreferenceStore() != null )
			{
				if( UnrealScriptEditor.getActiveEditorPreferenceStore().getBoolean(UnrealScriptID.PROPERTY_COMPILE_ON_SAVE.toString()) )
				{
					UDKCompiler.compile( project );
				}
			}
		}
	}
}
