package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeAttributeFunction extends CodeAttribute
{
	public CodeAttributeFunction( ArrayList<String> modifiers, String type, String name, ArrayList<CodeAttributeVariable> parameters, String className, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( className, firstCharacterPosition, lastCharacterPosition, true, modifiers, type, name, parameters );
	}
	
	
	@Override
	public String toString()
	{
		return getModifiers()+" ["+getType()+"] ["+getName()+"] "+getParameters();
	}
}
