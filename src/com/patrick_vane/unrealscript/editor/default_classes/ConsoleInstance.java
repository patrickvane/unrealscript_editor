package com.patrick_vane.unrealscript.editor.default_classes;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;


public class ConsoleInstance
{
	protected final MessageConsole			console;
	protected final MessageConsoleStream	stream;
	
	
	public ConsoleInstance( String name )
	{
		console = findMessageConsole( name );
		stream = console.newMessageStream();
		stream.setActivateOnWrite( true );
	}
	
	protected static MessageConsole findMessageConsole( String name )
	{
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		
		// look for console >>
			IConsole[] existing = conMan.getConsoles();
			for( int i=0; i<existing.length; i++ )
				if( name.equals(existing[i].getName()) )
					return (MessageConsole) existing[i];
		// look for console <<
		
		// create a new one if it doens't exist yet >>
			MessageConsole myConsole = new MessageConsole( name, null );
			conMan.addConsoles( new IConsole[]{myConsole} );
			return myConsole;
		// create a new one if it doens't exist yet <<
	}
	
	
	public void print( String string )
	{
		stream.print( string );
	}
	
	public void println( String string )
	{
		stream.println( string );
	}
	
	
	public void print( String string, Color color )
	{
		//Color oldColor = stream.getColor();
		//stream.setColor( color );
		stream.print( string );
		//flush();
		//stream.setColor( oldColor );
	}
	
	public void println( String string, Color color )
	{
		//Color oldColor = stream.getColor();
		//stream.setColor( color );
		stream.println( string );
		//flush();
		//stream.setColor( oldColor );
	}
	
	
	public void flush()
	{
		try
		{
			stream.flush();
		}
		catch( IOException e )
		{
		}
	}
	
	public void clear()
	{
		console.clearConsole();
	}
	
	
	public OutputStream getOutputStream()
	{
		return stream;
	}
	public PrintStream getPrintStream()
	{
		return new PrintStream( stream );
	}
	
	
	public Object getSynchronizer()
	{
		return stream;
	}
}
