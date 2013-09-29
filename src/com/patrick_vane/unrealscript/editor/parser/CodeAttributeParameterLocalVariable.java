package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeAttributeParameterLocalVariable extends CodeAttributeLocalVariable
{
	public CodeAttributeParameterLocalVariable( ArrayList<String> modifiers, String type, String name, String className, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( modifiers, type, name, className, null, null, firstCharacterPosition, lastCharacterPosition );
	}
	public CodeAttributeParameterLocalVariable( ArrayList<String> modifiers, String type, String name, String className, String defaultValue, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( modifiers, type, name, className, defaultValue, null, firstCharacterPosition, lastCharacterPosition );
	}
	public CodeAttributeParameterLocalVariable( ArrayList<String> modifiers, String type, String name, String className, String defaultValue, ArrayList<CodeAttributeParameterLocalVariable> parameters, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( modifiers, type, name, className, defaultValue, parameters, firstCharacterPosition, lastCharacterPosition );
	}
}
