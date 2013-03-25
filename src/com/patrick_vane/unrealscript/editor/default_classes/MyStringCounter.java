package com.patrick_vane.unrealscript.editor.default_classes;


public class MyStringCounter
{
	public static int count( String s, char c )
	{
		int counter = 0;
		for( int i=0; i<s.length(); i++ )
		{
			if( s.charAt(i) == c )
			{
				counter++;
			}
		}
		return counter;
	}
}