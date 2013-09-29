package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeAttributeVariable extends CodeAttribute
{
	public CodeAttributeVariable( ArrayList<String> modifiers, String type, String name, String className, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( className, false, modifiers, type, name, null, null, firstCharacterPosition, lastCharacterPosition );
	}
	public CodeAttributeVariable( ArrayList<String> modifiers, String type, String name, String className, String defaultValue, ArrayList<CodeAttributeParameterLocalVariable> parameters, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( className, false, modifiers, type, name, defaultValue, parameters, firstCharacterPosition, lastCharacterPosition );
	}
	
	
	@Override
	public String toString()
	{
		return getModifiers()+" ["+getType()+"] ["+getName()+"]";
	}
}
