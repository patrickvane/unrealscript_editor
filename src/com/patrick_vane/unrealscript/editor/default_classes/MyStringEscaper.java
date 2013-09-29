package com.patrick_vane.unrealscript.editor.default_classes;

import java.util.Locale;


public class MyStringEscaper
{
	private static String hex( char ch )
	{
		return Integer.toHexString( ch ).toUpperCase( Locale.ENGLISH );
	}
	
	
	public static String escape( String string )
	{
		if( string == null )
			return null;
		
		StringBuilder result = new StringBuilder();
		
		int sz = string.length();
		for( int i=0; i<sz; i++ )
		{
			char ch = string.charAt( i );
			
			// handle unicode
			if( ch > 0xfff )
			{
				result.append( "\\u" + hex(ch) );
			}
			else if( ch > 0xff )
			{
				result.append( "\\u0" + hex(ch) );
			}
			else if( ch > 0x7f )
			{
				result.append( "\\u00" + hex(ch) );
			}
			else if( ch < 32 )
			{
				switch( ch )
				{
					case '\b':
						result.append( '\\' );
						result.append( 'b' );
						break;
					case '\n':
						result.append( '\\' );
						result.append( 'n' );
						break;
					case '\t':
						result.append( '\\' );
						result.append( 't' );
						break;
					case '\f':
						result.append( '\\' );
						result.append( 'f' );
						break;
					case '\r':
						result.append( '\\' );
						result.append( 'r' );
						break;
					default:
						if( ch > 0xf )
						{
							result.append( "\\u00" + hex(ch) );
						}
						else
						{
							result.append( "\\u000" + hex(ch) );
						}
						break;
				}
			}
			else
			{
				switch( ch )
				{
					case '\'':
						result.append( '\\' );
						result.append( '\'' );
						break;
					case '"':
						result.append( '\\' );
						result.append( '"' );
						break;
					case '\\':
						result.append( '\\' );
						result.append( '\\' );
						break;
					case '/':
						result.append( '\\' );
						result.append( '/' );
						break;
					default:
						result.append( ch );
						break;
				}
			}
		}
		
		return result.toString();
	}
	
	
	public static String unescape( String string )
	{
		if( string == null )
			return null;
		
		StringBuilder result = new StringBuilder();
		
		int sz = string.length();
		StringBuffer unicode = new StringBuffer( 4 );
		boolean hadSlash = false;
		boolean inUnicode = false;
		for( int i=0; i<sz; i++ )
		{
			char ch = string.charAt( i );
			if( inUnicode )
			{
				// if in unicode, then we're reading unicode
				// values in somehow
				unicode.append( ch );
				if( unicode.length() == 4 )
				{
					// unicode now contains the four hex digits
					// which represents our unicode character
					try
					{
						int value = Integer.parseInt( unicode.toString(), 16 );
						result.append( (char) value );
						unicode.setLength( 0 );
						inUnicode = false;
						hadSlash = false;
					}
					catch( NumberFormatException nfe )
					{
						throw new RuntimeException( "Unable to parse unicode value: "+unicode, nfe );
					}
				}
				continue;
			}
			if( hadSlash )
			{
				// handle an escaped value
				hadSlash = false;
				switch( ch )
				{
					case '\\':
						result.append( '\\' );
						break;
					case '\'':
						result.append( '\'' );
						break;
					case '\"':
						result.append( '"' );
						break;
					case 'r':
						result.append( '\r' );
						break;
					case 'f':
						result.append( '\f' );
						break;
					case 't':
						result.append( '\t' );
						break;
					case 'n':
						result.append( '\n' );
						break;
					case 'b':
						result.append( '\b' );
						break;
					case 'u':
						// uh-oh, we're in unicode country....
						inUnicode = true;
						break;
					default:
						result.append( ch );
						break;
				}
				continue;
			}
			else if( ch == '\\' )
			{
				hadSlash = true;
				continue;
			}
			result.append( ch );
		}
		if( hadSlash )
		{
			// then we're in the weird case of a \ at the end of the
			// string, let's output it anyway.
			result.append( '\\' );
		}
		
		return result.toString();
	}
}
