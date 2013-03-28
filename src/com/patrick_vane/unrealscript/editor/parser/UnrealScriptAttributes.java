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
}
