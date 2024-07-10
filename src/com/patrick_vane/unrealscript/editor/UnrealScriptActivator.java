package com.patrick_vane.unrealscript.editor;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import com.patrick_vane.unrealscript.editor.constants.UnrealScriptID;


public class UnrealScriptActivator extends AbstractUIPlugin
{

	private final static UnrealScriptActivator instance = new UnrealScriptActivator();
	
	public static UnrealScriptActivator getDefault()
	{
		return instance;
	}
	
	
	private UnrealScriptActivator()
	{
		IPreferenceStore store = getPreferenceStore();
		if( store != null )
		{
			store.setDefault( UnrealScriptID.PROPERTY_COMPILE_ON_SAVE.toString(), true );
			store.setDefault( UnrealScriptID.PROPERTY_CONTENT_ASSISTANT_ENABLED.toString(), false );
			store.setDefault( UnrealScriptID.PROPERTY_CONTENT_ASSISTANT_DELAY.toString(), 500 );
			store.setDefault( UnrealScriptID.PROPERTY_CONTENT_ASSISTANT_TRIGGERS.toString(), "." );
			store.setDefault( UnrealScriptID.PROPERTY_CONTENT_ASSISTANT_UDK_DIR.toString(), "C:/UDK" );
		}
	}

	public static String getSymbolicName() {
		return  instance.getBundle().getSymbolicName();
	}
}
