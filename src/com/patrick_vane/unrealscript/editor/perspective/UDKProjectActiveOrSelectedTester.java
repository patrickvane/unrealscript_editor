package com.patrick_vane.unrealscript.editor.perspective;

import org.eclipse.core.expressions.PropertyTester;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;


public class UDKProjectActiveOrSelectedTester extends PropertyTester 
{
	@Override
	public boolean test( Object receiver, String property, Object[] args, Object expectedValue )
	{
		try
		{
			return UnrealScriptEditor.isProjectUDK( UnrealScriptEditor.getSelectedOrActiveProject() );
		}
		catch( Exception e )
		{
			return false;
		}
	}
}