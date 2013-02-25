package com.patrick_vane.unrealscript.editor.console;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;


public class UDKLaunchLogConsolePrintStream extends PrintStream
{
	private static final String		LAUNCH_LOG_TAG					= "ScriptLog: ";
	private static final int		LAUNCH_LOG_TAG_LENGTH			= LAUNCH_LOG_TAG.length();
	private static final String		LAUNCH_WARNING_TAG				= "ScriptWarning: ";
	private static final int		LAUNCH_WARNING_TAG_LENGTH		= LAUNCH_WARNING_TAG.length();
	private static final String		LAUNCH_ERROR_TAG				= "Error: ";
	private static final int		LAUNCH_ERROR_TAG_LENGTH			= LAUNCH_ERROR_TAG.length();
	
	private int						logMode							= 0;
	
	
	public UDKLaunchLogConsolePrintStream()
	{
		super
		(
			new OutputStream()
			{
				@Override
				public void write( int b ) throws IOException
				{
				}
			}
		);
	}
	
	
	@Override
	public void println( String line )
	{
		synchronized( UDKLaunchLogConsole.getSynchronizer() )
		{
			if( line.startsWith("Running: ") )
			{
				UDKLaunchLogConsole.out.println( line );
				return;
			}
			
			int logCharAt 		= line.indexOf( LAUNCH_LOG_TAG );
			int warningCharAt 	= line.indexOf( LAUNCH_WARNING_TAG );
			int errorCharAt 	= line.indexOf( LAUNCH_ERROR_TAG );
			
			String prefix = "";
			if( logCharAt >= 0 )
			{
				logMode = 1;
				if( logCharAt > 0 )
					prefix = line.substring( 0, logCharAt ) + " ";
				UDKLaunchLogConsole.out.println( prefix + "[INFO] " + line.substring(logCharAt+LAUNCH_LOG_TAG_LENGTH) );
			}
			else if( warningCharAt >= 0 )
			{
				logMode = 2;
				if( warningCharAt > 0 )
					prefix = line.substring( 0, warningCharAt ) + " ";
				UDKLaunchLogConsole.warn.println( prefix + "[WARNING] " + line.substring(warningCharAt+LAUNCH_WARNING_TAG_LENGTH) );
			}
			else if( errorCharAt >= 0 )
			{
				logMode = 3;
				if( errorCharAt > 0 )
					prefix = line.substring( 0, errorCharAt ) + " ";
				UDKLaunchLogConsole.err.println( prefix + "[ERROR] " + line.substring(errorCharAt+LAUNCH_ERROR_TAG_LENGTH) );
			}
			else
			{
				if( logMode > 0 )
				{
					if( line.startsWith("\t") )
					{
						if( logMode == 1 )
							UDKLaunchLogConsole.out.println( line );
						else if( logMode == 2 )
							UDKLaunchLogConsole.warn.println( line );
						else if( logMode == 3 )
							UDKLaunchLogConsole.err.println( line );
					}
					else
					{
						logMode = 0;
					}
				}
			}
		}
	}
}
