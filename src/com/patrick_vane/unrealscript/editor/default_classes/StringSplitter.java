package com.patrick_vane.unrealscript.editor.default_classes;

import java.util.ArrayList;


public class StringSplitter
{
	public static String[] splitCommandlineLike( String string )
	{
		ArrayList<String> strings = new ArrayList<String>();
		
		StringBuilder buffer = new StringBuilder();
		boolean inString = false;
		char prev = '\0';
		for( int i=0; i<string.length(); i++ )
		{
			char c = string.charAt( i );
			
			if( (c == '"') && (prev != '\\') )
			{
				inString = !inString;
				continue;
			}
			
			if( (c == ' ') && !inString )
			{
				strings.add( buffer.toString() );
				buffer = new StringBuilder();
				continue;
			}
			
			buffer.append( c );
			
			prev = c;
		}
		if( buffer.length() > 0 )
		{
			strings.add( buffer.toString() );
		}
		
		return strings.toArray( new String[0] );
	}
}
