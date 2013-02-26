package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeAttributeFunction implements CodeAttribute
{
	private final ArrayList<String> modifiers;
	private final String type;
	private final String name;
	private final ArrayList<CodeAttributeVariable> parameters;
	
	
	public CodeAttributeFunction( ArrayList<String> modifiers, String type, String name, ArrayList<CodeAttributeVariable> parameters )
	{
		this.modifiers = modifiers;
		this.type = type;
		this.name = name;
		this.parameters = parameters;
	}
	
	
	@Override
	public boolean isFunction()
	{
		return true;
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
		return parameters;
	}
	
	
	@Override
	public String toString()
	{
		return modifiers+" ["+type+"] ["+name+"] "+parameters;
	}
}
