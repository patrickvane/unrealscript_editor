package com.patrick_vane.unrealscript.editor.default_classes;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import com.patrick_vane.unrealscript.editor.constants.ColorConstant;


public class ConsoleInstance
{
	protected final MessageConsole						console;
	protected final HashMap<RGB,MessageConsoleStream>	streams				= new HashMap<RGB,MessageConsoleStream>();
	protected final MessageConsoleStream				defaultStream;
	protected final ArrayList<Runnable>					clearedListeners	= new ArrayList<Runnable>();
	
	
	public ConsoleInstance( String name )
	{
		console = findMessageConsole( name );
		defaultStream = getStream( new RGB(0, 0, 0) );
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
	
	protected MessageConsoleStream getStream( final RGB color )
	{
		synchronized( streams )
		{
			MessageConsoleStream stream = streams.get( color );
			if( stream == null )
			{
				stream = console.newMessageStream();
				stream.setActivateOnWrite( true );
				
				final MessageConsoleStream STREAM = stream;
				Display.getDefault().syncExec
				(
					new Runnable()
					{
						@Override
						public void run()
						{
							STREAM.setColor( ColorManager.getColor(color) );
						}
					}
				);
				
				streams.put( color, stream );
			}
			return stream;
		}
	}
	
	
	public void print( String string )
	{
		defaultStream.print( string );
	}
	
	public void println( String string )
	{
		defaultStream.println( string );
	}
	
	
	public void print( String string, RGB color )
	{
		getStream( color ).print( string );
	}
	
	public void println( String string, RGB color )
	{
		getStream( color ).println( string );
	}
	
	
	public static class Out
	{
		private ConsoleInstance instance;
		
		public Out( ConsoleInstance instance )
		{
			this.instance = instance;
		}
		
		public void print( String string )
		{
			instance.print( string, ColorConstant.INFO_COLOR );
		}
		public void println( String string )
		{
			instance.println( string, ColorConstant.INFO_COLOR );
		}
	}
	
	public static class Warn
	{
		private ConsoleInstance instance;
		
		public Warn( ConsoleInstance instance )
		{
			this.instance = instance;
		}
		
		public void print( String string )
		{
			instance.print( string, ColorConstant.WARNING_COLOR );
		}
		public void println( String string )
		{
			instance.println( string, ColorConstant.WARNING_COLOR );
		}
	}
	
	public static class Err
	{
		private ConsoleInstance instance;
		
		public Err( ConsoleInstance instance )
		{
			this.instance = instance;
		}
		
		public void print( String string )
		{
			instance.print( string, ColorConstant.ERROR_COLOR );
		}
		public void println( String string )
		{
			instance.println( string, ColorConstant.ERROR_COLOR );
		}
	}
	
	
	public void flush()
	{
		try
		{
			defaultStream.flush();
		}
		catch( IOException e )
		{
		}
	}
	public void flush( RGB color )
	{
		try
		{
			getStream( color ).flush();
		}
		catch( IOException e )
		{
		}
	}
	
	public void clear()
	{
		console.clearConsole();
		synchronized( clearedListeners )
		{
			for( Runnable runnable : clearedListeners )
			{
				runnable.run();
			}
		}
	}
	
	
	public OutputStream getOutputStream()
	{
		return defaultStream;
	}
	public PrintStream getPrintStream()
	{
		return new PrintStream( defaultStream );
	}
	
	public OutputStream getOutputStream( RGB color )
	{
		return getStream( color );
	}
	public PrintStream getPrintStream( RGB color )
	{
		return new PrintStream( getStream(color) );
	}
	
	
	public Object getSynchronizer()
	{
		return console;
	}
	
	
	public void addClearListener( Runnable runnable )
	{
		synchronized( clearedListeners )
		{
			removeClearListener( runnable );
			clearedListeners.add( runnable );
		}
	}
	public void removeClearListener( Runnable runnable )
	{
		synchronized( clearedListeners )
		{
			clearedListeners.remove( runnable );
		}
	}
}
