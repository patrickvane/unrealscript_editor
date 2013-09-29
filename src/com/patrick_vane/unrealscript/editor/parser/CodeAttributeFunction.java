package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeAttributeFunction extends CodeAttribute
{
	public CodeAttributeFunction( ArrayList<String> modifiers, String type, String name, ArrayList<CodeAttributeParameterLocalVariable> parameters, String className, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( className, true, modifiers, type, name, null, parameters, firstCharacterPosition, lastCharacterPosition );
	}
	public CodeAttributeFunction( ArrayList<String> modifiers, String type, String name, String defaultValue, ArrayList<CodeAttributeParameterLocalVariable> parameters, String className, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( className, true, modifiers, type, name, defaultValue, parameters, firstCharacterPosition, lastCharacterPosition );
	}
	
	
	public String getParametersAsString( boolean addParentheses )
	{
		StringBuilder parametersBuffer = new StringBuilder();
		boolean firstParameter = true;
		for( CodeAttributeVariable parameter : getParameters() )
		{
			if( !firstParameter )
				parametersBuffer.append( ", " );
			else
				firstParameter = false;
			
			StringBuilder modifiersBuffer = new StringBuilder();
			for( String modifier : parameter.getModifiers() )
			{
				modifiersBuffer.append( modifier );
				modifiersBuffer.append( " " );
			}
			
			if( parameter.getDefaultValue() == null )
				parametersBuffer.append( modifiersBuffer.toString()+parameter.getType()+" "+parameter.getName() );
			else
				parametersBuffer.append( modifiersBuffer.toString()+parameter.getType()+" "+parameter.getName()+"="+parameter.getDefaultValue() );
		}
		String parameters = parametersBuffer.toString();
		
		if( addParentheses )
			return "(" + (parameters.isEmpty()?"":" ") + parameters + (parameters.isEmpty()?"":" ") + ")";
		return parameters;
	}
	
	
	@Override
	public String toString()
	{
		return getModifiers()+" ["+getType()+"] ["+getName()+"] "+getParameters();
	}
}
