package com.patrick_vane.unrealscript.editor.default_classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class MyStream
{
	public static void copy( InputStream in, PrintStream out )
	{
		MyStreamCopy copy = new MyStreamCopy( in, out );
		copy.start();
	}
}


class MyStreamCopy extends Thread
{
	private final InputStream in;
	private final PrintStream out;
	
	protected MyStreamCopy( InputStream in, PrintStream out )
	{
		this.in  = in;
		this.out = out;
	}
	
	@Override
	public void run()
	{
		try
		{
			BufferedReader buffer = new BufferedReader( new InputStreamReader(in) );
			String line = null;
			while( (line = buffer.readLine()) != null )
			{
				out.println( line );
			}
		}
		catch( IOException e )
		{
			e.printStackTrace();
		}
	}
}