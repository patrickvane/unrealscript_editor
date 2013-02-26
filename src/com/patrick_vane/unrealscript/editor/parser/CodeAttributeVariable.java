package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeAttributeVariable implements CodeAttribute
{
	private final ArrayList<String> modifiers;
	private final String type;
	private final String name;
	
	
	public CodeAttributeVariable( ArrayList<String> modifiers, String type, String name )
	{
		this.modifiers = modifiers;
		this.type = type;
		this.name = name;
	}
	
	
	@Override
	public boolean isFunction()
	{
		return false;
	}
	
	@Override
	public ArrayList<String> getModifiers()
	{
		return modifiers;
	}
	@Override
	public String getType()
	{
		return type;
	}
	@Override
	public String getName()
	{
		return name;
	}
	@Override
	public ArrayList<CodeAttributeVariable> getParameters()
	{
		return null;
	}
	
	
	@Override
	public String toString()
	{
		return modifiers+" ["+type+"] ["+name+"]";
	}
}
