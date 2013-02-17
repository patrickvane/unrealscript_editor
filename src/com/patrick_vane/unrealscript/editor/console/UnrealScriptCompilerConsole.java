package com.patrick_vane.unrealscript.editor.console;

import java.io.OutputStream;
import java.io.PrintStream;
import org.eclipse.swt.graphics.Color;
import com.patrick_vane.unrealscript.editor.default_classes.ConsoleInstance;


public class UnrealScriptCompilerConsole
{
	private static ConsoleInstance console;
	
	
	public static void init()
	{
		if( console == null )
		{
			console = new ConsoleInstance( "UnrealScript Compiler" );
		}
	}
	
	
	public static final Out out = new Out();
	public static class Out
	{
		public void print( String string )
		{
			console.print( string );//, ColorManager.getColor(0,0,0) );
		}
		public void println( String string )
		{
			console.println( string );//, ColorManager.getColor(0,0,0) );
		}
	}
	
	public static final Err err = new Err();
	public static class Err
	{
		public static void print( String string )
		{
			console.print( string );//, ColorManager.getColor(200,0,0) );
		}
		public static void println( String string )
		{
			console.println( string );//, ColorManager.getColor(200,0,0) );
		}
	}
	
	
	public static void print( String string, Color color )
	{
		console.print( string, color );
	}
	public static void println( String string, Color color )
	{
		console.println( string, color );
	}
	
	public static void flush()
	{
		console.flush();
	}
	public static void clear()
	{
		console.clear();
	}
	
	public static OutputStream getOutputStream()
	{
		return console.getOutputStream();
	}
	public static PrintStream getPrintStream()
	{
		return console.getPrintStream();
	}
	
	public static Object getSynchronizer()
	{
		return console.getSynchronizer();
	}
}
