package com.patrick_vane.unrealscript.editor.console;

import java.io.OutputStream;
import java.io.PrintStream;
import org.eclipse.swt.graphics.RGB;
import com.patrick_vane.unrealscript.editor.constants.ColorConstant;
import com.patrick_vane.unrealscript.editor.default_classes.ConsoleInstance;


public class UDKLaunchLogConsole
{
	private static ConsoleInstance console;
	
	
	public static void init()
	{
		if( console == null )
		{
			console = new ConsoleInstance( "UDK Launch Log" );
		}
	}
	
	
	public static final Out out = new Out();
	public static class Out
	{
		public void print( String string )
		{
			console.print( string, ColorConstant.INFO_COLOR );
		}
		public void println( String string )
		{
			console.println( string, ColorConstant.INFO_COLOR );
		}
	}
	
	public static final Warn warn = new Warn();
	public static class Warn
	{
		public static void print( String string )
		{
			console.print( string, ColorConstant.WARNING_COLOR );
		}
		public static void println( String string )
		{
			console.println( string, ColorConstant.WARNING_COLOR );
		}
	}
	
	public static final Err err = new Err();
	public static class Err
	{
		public static void print( String string )
		{
			console.print( string, ColorConstant.ERROR_COLOR );
		}
		public static void println( String string )
		{
			console.println( string, ColorConstant.ERROR_COLOR );
		}
	}
	
	
	public static void print( String string, RGB color )
	{
		console.print( string, color );
	}
	public static void println( String string, RGB color )
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
	
	public static OutputStream getOutputStream( RGB color )
	{
		return console.getOutputStream( color );
	}
	public static PrintStream getPrintStream( RGB color )
	{
		return console.getPrintStream( color );
	}
	
	public static Object getSynchronizer()
	{
		return console.getSynchronizer();
	}
	
	public static void addClearListener( Runnable runnable )
	{
		console.addClearListener( runnable );
	}
	public static void removeClearListener( Runnable runnable )
	{
		console.removeClearListener( runnable );
	}
}
