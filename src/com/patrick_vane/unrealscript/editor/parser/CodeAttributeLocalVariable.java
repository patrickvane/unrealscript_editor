package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeAttributeLocalVariable extends CodeAttributeVariable
{
	public CodeAttributeLocalVariable( ArrayList<String> modifiers, String type, String name, String className, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( modifiers, type, name, className, firstCharacterPosition, lastCharacterPosition );
	}
}
