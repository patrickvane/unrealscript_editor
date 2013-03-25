package com.patrick_vane.unrealscript.editor.default_classes;

import java.net.MalformedURLException;
import java.net.URL;


public class MyUrlChecker
{
	public static boolean isURL( String string )
	{
		boolean ok = false;
		
		if( !ok && (MyStringCounter.count(string, '.') >= 3) )
			ok = true;
		
		if( !ok && (string.endsWith(".nl") || string.endsWith(".com") || string.endsWith(".org")) )
			ok = true;
		
		
		if( !ok )
			return false;
		
		
		try
		{
			if( !string.startsWith("http") && !string.startsWith("ftp") )
				string = "http://"+string;
			
			@SuppressWarnings( "unused" )
			URL url = new URL( string );
			
			return true;
		}
		catch( MalformedURLException e )
		{
			return false;
		}
	}
}
