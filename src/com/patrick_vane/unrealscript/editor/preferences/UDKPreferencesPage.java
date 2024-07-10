package com.patrick_vane.unrealscript.editor.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;

import com.patrick_vane.unrealscript.editor.constants.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.default_classes.GroupFieldEditor;
import com.patrick_vane.unrealscript.editor.default_classes.PreferencesPage;


public class UDKPreferencesPage extends PreferencesPage
{
	@Override
	protected void createFieldEditors()
	{
		addField( new DirectoryFieldEditor(UnrealScriptID.PROPERTY_CONTENT_ASSISTANT_UDK_DIR.toString(), "UDK Root Folder:", getFieldEditorParent()));
		addField( new BooleanFieldEditor(UnrealScriptID.PROPERTY_COMPILE_ON_SAVE.toString(), "Compile on Save", getFieldEditorParent()) );
		
		GroupFieldEditor contentAssistant = new GroupFieldEditor( "Content Assistant", getFieldEditorParent() );
		contentAssistant.add( new BooleanFieldEditor(UnrealScriptID.PROPERTY_CONTENT_ASSISTANT_ENABLED.toString(), "Enable auto activation", contentAssistant.getFieldEditor()) );
		contentAssistant.add( new IntegerFieldEditor(UnrealScriptID.PROPERTY_CONTENT_ASSISTANT_DELAY.toString(), "Auto activation delay (ms):", contentAssistant.getFieldEditor()) );
		contentAssistant.add( new StringFieldEditor(UnrealScriptID.PROPERTY_CONTENT_ASSISTANT_TRIGGERS.toString(), "Auto activation triggers:", contentAssistant.getFieldEditor()) );
		addField( contentAssistant );
	}
}
