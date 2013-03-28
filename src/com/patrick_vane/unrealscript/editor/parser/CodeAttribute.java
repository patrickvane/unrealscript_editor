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
	
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((className == null) ? 0 : className.hashCode());
		result = prime * result + firstCharacterPosition;
		result = prime * result + (isFunction ? 1231 : 1237);
		result = prime * result + lastCharacterPosition;
		result = prime * result + ((modifiers == null) ? 0 : modifiers.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parameters == null) ? 0 : parameters.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	
	@Override
	public boolean equals( Object obj )
	{
		if( this == obj )
			return true;
		if( obj == null )
			return false;
		if( getClass() != obj.getClass() )
			return false;
		CodeAttribute other = (CodeAttribute) obj;
		if( className == null )
		{
			if( other.className != null )
				return false;
		}
		else if( !className.equals( other.className ) )
			return false;
		if( firstCharacterPosition != other.firstCharacterPosition )
			return false;
		if( isFunction != other.isFunction )
			return false;
		if( lastCharacterPosition != other.lastCharacterPosition )
			return false;
		if( modifiers == null )
		{
			if( other.modifiers != null )
				return false;
		}
		else if( !modifiers.equals( other.modifiers ) )
			return false;
		if( name == null )
		{
			if( other.name != null )
				return false;
		}
		else if( !name.equals( other.name ) )
			return false;
		if( parameters == null )
		{
			if( other.parameters != null )
				return false;
		}
		else if( !parameters.equals( other.parameters ) )
			return false;
		if( type == null )
		{
			if( other.type != null )
				return false;
		}
		else if( !type.equals( other.type ) )
			return false;
		return true;
	}
}
