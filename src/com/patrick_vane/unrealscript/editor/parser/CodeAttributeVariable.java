package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeAttributeVariable extends CodeAttribute
{
	public CodeAttributeVariable( ArrayList<String> modifiers, String type, String name, String className, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( className, firstCharacterPosition, lastCharacterPosition, false, modifiers, type, name, null );
	}
	
	
	@Override
	public String toString()
	{
		return getModifiers()+" ["+getType()+"] ["+getName()+"]";
	}
}
