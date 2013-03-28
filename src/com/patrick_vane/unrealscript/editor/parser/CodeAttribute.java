package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public abstract class CodeAttribute
{
	private final String className;
	private final int firstCharacterPosition;
	private final int lastCharacterPosition;
	
	private final boolean isFunction;
	
	private final ArrayList<String> modifiers;
	private final String type;
	private final String name;
	private final ArrayList<CodeAttributeVariable> parameters;
	
	
	public CodeAttribute( String className, int firstCharacterPosition, int lastCharacterPosition, boolean isFunction, ArrayList<String> modifiers, String type, String name, ArrayList<CodeAttributeVariable> parameters )
	{
		this.className = className;
		this.firstCharacterPosition = firstCharacterPosition;
		this.lastCharacterPosition = lastCharacterPosition;
		
		this.isFunction = isFunction;
		
		this.modifiers = modifiers;
		this.type = type;
		this.name = name;
		this.parameters = parameters;
	}
	
	
	public String getClassName()
	{
		return className;
	}
	public int getFirstCharacterPosition()
	{
		return firstCharacterPosition;
	}
	public int getLastCharacterPosition()
	{
		return lastCharacterPosition;
	}
	
	/** Is function or variable? */
	public boolean isFunction()
	{
		return isFunction;
	}
	
	public ArrayList<String> getModifiers()
	{
		return modifiers;
	}
	public String getType()
	{
		if( type == null )
			return "void";
		return type;
	}
	public String getName()
	{
		return name;
	}
	public ArrayList<CodeAttributeVariable> getParameters()
	{
		return parameters;
	}
}
