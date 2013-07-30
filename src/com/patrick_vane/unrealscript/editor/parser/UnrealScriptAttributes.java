package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;
import java.util.HashMap;


public class UnrealScriptAttributes
{
	private final ArrayList<HashMap<String,CodeAttributeVariable>>	variables		= new ArrayList<HashMap<String,CodeAttributeVariable>>();
	private final ArrayList<HashMap<String,CodeAttributeFunction>>	functions		= new ArrayList<HashMap<String,CodeAttributeFunction>>();
	private final ArrayList<CodeAttribute>							attributesArray	= new ArrayList<CodeAttribute>();
	private final ArrayList<CodeAttributeVariable>					variablesArray	= new ArrayList<CodeAttributeVariable>();
	private final ArrayList<CodeAttributeFunction>					functionsArray	= new ArrayList<CodeAttributeFunction>();
	
	private HashMap<String,CodeAttributeVariable>					variablesChildOverrides;
	private HashMap<String,CodeAttributeFunction>					functionsChildOverrides;
	
	
	public void addAttributes( ArrayList<CodeAttribute> attributes )
	{
		HashMap<String,CodeAttributeVariable> variables = new HashMap<String,CodeAttributeVariable>();
		HashMap<String,CodeAttributeFunction> functions = new HashMap<String,CodeAttributeFunction>();
		
		for( CodeAttribute attribute : attributes )
		{
			if( attribute instanceof CodeAttributeVariable )
			{
				CodeAttributeVariable castedAttribute = (CodeAttributeVariable) attribute;
				variables.put( attribute.getName().toLowerCase(), castedAttribute );
				variablesArray.add( castedAttribute );
			}
			else if( attribute instanceof CodeAttributeFunction )
			{
				CodeAttributeFunction castedAttribute = (CodeAttributeFunction) attribute;
				functions.put( attribute.getName().toLowerCase(), castedAttribute );
				functionsArray.add( castedAttribute );
			}
			attributesArray.add( attribute );
		}
		
		this.variables.add( variables );
		this.functions.add( functions );
	}
	
	
	public ArrayList<CodeAttribute> getAttributes()
	{
		return attributesArray;
	}
	public ArrayList<CodeAttributeVariable> getAttributeVariables()
	{
		return variablesArray;
	}
	public ArrayList<CodeAttributeFunction> getAttributeFunctions()
	{
		return functionsArray;
	}
	
	public HashMap<String, CodeAttributeVariable> getAttributeVariablesChildOverrides()
	{
		if( variablesChildOverrides != null )
			return variablesChildOverrides;
		
		HashMap<String, CodeAttributeVariable> attributes = new HashMap<String,CodeAttributeVariable>();
		for( HashMap<String,CodeAttributeVariable> variables : this.variables )
		{
			for( CodeAttributeVariable variable : variables.values() )
			{
				String key = variable.getName().toLowerCase();
				if( !attributes.containsKey(key) )
				{
					attributes.put( key, variable );
				}
			}
		}
		
		variablesChildOverrides = attributes;
		return attributes;
	}
	public HashMap<String, CodeAttributeFunction> getAttributeFunctionsChildOverrides()
	{
		if( functionsChildOverrides != null )
			return functionsChildOverrides;
		
		HashMap<String, CodeAttributeFunction> attributes = new HashMap<String,CodeAttributeFunction>();
		for( HashMap<String,CodeAttributeFunction> functions : this.functions )
		{
			for( CodeAttributeFunction function : functions.values() )
			{
				String key = function.getName().toLowerCase();
				if( !attributes.containsKey(key) )
				{
					attributes.put( key, function );
				}
			}
		}
		
		functionsChildOverrides = attributes;
		return attributes;
	}
	
	
	public CodeAttributeVariable getAttributeVariable( String name )
	{
		return getAttributeVariable( name, 0 );
	}
	public CodeAttributeVariable getAttributeVariable( String name, int skipDepth )
	{
		name = name.toLowerCase();
		for( HashMap<String,CodeAttributeVariable> variables : this.variables )
		{
			if( skipDepth > 0 )
			{
				skipDepth--;
				continue;
			}
			CodeAttributeVariable variable = variables.get( name );
			if( variable != null )
				return variable;
		}
		return null;
	}
	
	public CodeAttributeFunction getAttributeFunction( String name )
	{
		return getAttributeFunction( name, 0 );
	}
	public CodeAttributeFunction getAttributeFunction( String name, int skipDepth )
	{
		name = name.toLowerCase();
		for( HashMap<String,CodeAttributeFunction> functions : this.functions )
		{
			if( skipDepth > 0 )
			{
				skipDepth--;
				continue;
			}
			CodeAttributeFunction function = functions.get( name );
			if( function != null )
				return function;
		}
		return null;
	}
	
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attributesArray == null) ? 0 : attributesArray.hashCode());
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
		UnrealScriptAttributes other = (UnrealScriptAttributes) obj;
		if( attributesArray == null )
		{
			if( other.attributesArray != null )
				return false;
		}
		else if( !attributesArray.equals( other.attributesArray ) )
			return false;
		return true;
	}
}
