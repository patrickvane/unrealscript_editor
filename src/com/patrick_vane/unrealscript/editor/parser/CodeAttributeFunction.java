package com.patrick_vane.unrealscript.editor.parser;

import java.util.ArrayList;


public class CodeAttributeFunction extends CodeAttribute
{
	public CodeAttributeFunction( ArrayList<String> modifiers, String type, String name, ArrayList<CodeAttributeVariable> parameters, String className, int firstCharacterPosition, int lastCharacterPosition )
	{
		super( className, firstCharacterPosition, lastCharacterPosition, true, modifiers, type, name, parameters );
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
			
			parametersBuffer.append( parameter.getType()+" "+parameter.getName() );
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
