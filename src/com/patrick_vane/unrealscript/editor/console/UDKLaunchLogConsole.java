package com.patrick_vane.unrealscript.editor.console;

import java.io.OutputStream;
import java.io.PrintStream;
import org.eclipse.swt.graphics.RGB;
import com.patrick_vane.unrealscript.editor.default_classes.ConsoleInstance;
import com.patrick_vane.unrealscript.editor.default_classes.ConsoleInstance.Err;
import com.patrick_vane.unrealscript.editor.default_classes.ConsoleInstance.Out;
import com.patrick_vane.unrealscript.editor.default_classes.ConsoleInstance.Warn;


public class UDKLaunchLogConsole
{
	private static final ConsoleInstance					console					= new ConsoleInstance( "UDK Launch Log" );
	private static final UDKLaunchLogConsolePrintStream		filteringPrintStream	= new UDKLaunchLogConsolePrintStream();
	
	public static final Out		out		= new Out( console );
	public static final Warn	warn	= new Warn( console );
	public static final Err		err		= new Err( console );
	
	
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
	
	public static PrintStream getFilteringOutputStream()
	{
		return filteringPrintStream;
	}
	
	public static Object getSynchronizer()
	{
		return console.getSynchronizer();
	}
	
	public static String getContent()
	{
		return console.getContent();
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
