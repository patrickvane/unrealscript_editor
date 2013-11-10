package com.patrick_vane.unrealscript.editor.default_classes;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;


public abstract class PreferencesPage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage
{
	public PreferencesPage()
	{
		super( GRID );
	}
	
	@Override
	public void init( IWorkbench workbench )
	{
		setPreferenceStore( UnrealScriptEditor.getActiveEditorPreferenceStore() );
	}
	
	
	@Override
	protected void addField( FieldEditor editor )
	{
		if( editor instanceof GroupFieldEditor )
		{
			GroupFieldEditor group = (GroupFieldEditor) editor;
			group.init();
		}
		
		super.addField( editor );
	}
}
