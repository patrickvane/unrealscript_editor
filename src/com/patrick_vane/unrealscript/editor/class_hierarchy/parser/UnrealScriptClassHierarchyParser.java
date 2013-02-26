package com.patrick_vane.unrealscript.editor.class_hierarchy.parser;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashMap;


public class UnrealScriptClassHierarchyParser
{
	public static UnrealScriptRootClass parse( File sourceDir )
	{
		HashMap<String,UnrealScriptParsingClass> parsingClasses = new HashMap<String,UnrealScriptParsingClass>();
		parse( parsingClasses, sourceDir );
		
		UnrealScriptRootClass root = new UnrealScriptRootClass( null, "root", sourceDir );
		for( UnrealScriptParsingClass parsedClass : parsingClasses.values() )
		{
			parse( root, parsingClasses, parsedClass );
		}
		
		return root;
	}
	
	private static UnrealScriptClass parse( UnrealScriptRootClass root, HashMap<String,UnrealScriptParsingClass> parsingClasses, UnrealScriptParsingClass parsedClass )
	{
		String name = parsedClass.getName().toLowerCase();
		UnrealScriptClass thisClass = root.getClass( name );
		if( thisClass != null )
			return thisClass;
		
		UnrealScriptClass parent = null;
		
		String parentName = parsedClass.getParentName();
		if( parentName != null )
		{
			parent = root.getClass( parentName );
			if( parent == null )
			{
				UnrealScriptParsingClass parentClass = parsingClasses.get( parentName.toLowerCase() );
				if( parentClass != null )
				{
					parent = parse( root, parsingClasses, parentClass );
				}
				else
				{
					parent = new UnrealScriptClass( root, parentName, null );
					root.addClass( parent );
				}
			}
		}
		if( parent == null )
		{
			parent = root;
		}
		
		thisClass = new UnrealScriptClass( parent, parsedClass.getName(), parsedClass.getFile() );
		root.addClass( thisClass );
		return thisClass;
	}
	
	private static void parse( HashMap<String,UnrealScriptParsingClass> classes, File file )
	{
		if( file.exists() )
		{
			if( !file.isDirectory() )
			{
				if( file.getName().toLowerCase().endsWith(".uc") )
				{
					UnrealScriptParsingClass parsedClass = parseClass( file );
					if( parsedClass != null )
					{
						classes.put( parsedClass.getName().toLowerCase(), parsedClass );
					}
				}
			}
			else
			{
				File[] files = file.listFiles();
				for( File subfile : files )
				{
					parse( classes, subfile );
				}
			}
		}
	}
	
	public static UnrealScriptParsingClass parseClass( File file )
	{
		DataInputStream in = null;
		try
		{
			in = new DataInputStream( new FileInputStream(file) );
			BufferedReader buffer = new BufferedReader( new InputStreamReader(in) );
			String line;
			String name   = null;
			String parent = null;
			boolean hasClass 	= false;
			boolean hasExtends 	= false;
			boolean hasClassLineEnded = false;
			boolean inBlockCommend = false;
			while( (line = buffer.readLine()) != null )
			{
				line = line.trim();
				
				StringBuilder builder = new StringBuilder();
				for( int charI=0; charI<line.length(); charI++ )
				{
					char char1 = line.charAt( charI );
					char char2 = ' ';
					if( charI+1 < line.length() )
						char2 = line.charAt( charI+1 );
					
					if( (char1 == '/') && (char2 == '*') )
						inBlockCommend = true;
					else if( (char1 == '*') && (char2 == '/') )
						inBlockCommend = false;
					
					if( !inBlockCommend )
					{
						if( (char1 == '/') && (char2 == '/') )
							break;
						builder.append( char1 );
					}
				}
				line = builder.toString();
				
				String[] data = line.split( " " );
				if( !hasClass )
				{
					if( (data.length > 0) && data[0].toLowerCase().equals("class") )
					{
						hasClass = true;
					}
				}
				if( hasClass )
				{
					for( int i=0; i<data.length; i++ )
					{
						String dataPart = data[i];
						dataPart = dataPart.trim();
						hasClassLineEnded = dataPart.contains( ";" );
						if( hasClassLineEnded )
							dataPart = dataPart.substring( 0, dataPart.indexOf(";") );
						dataPart = dataPart.trim();
						String dataPartLowerCase = dataPart.toLowerCase();
						if( !dataPart.isEmpty() )
						{
							if( !dataPartLowerCase.equals("class") )
							{
								if( name == null )
								{
									name = dataPart;
								}
								else if( !hasExtends )
								{
									if( dataPartLowerCase.equals("extends") || dataPartLowerCase.equals("expands") )
										hasExtends = true;
									else
										hasClassLineEnded = true;
								}
								else
								{
									parent = dataPart;
									hasClassLineEnded = true;
								}
							}
						}
						if( hasClassLineEnded )
							break;
					}
					if( hasClassLineEnded )
						break;
				}
			}
			if( name != null )
			{
				return new UnrealScriptParsingClass( name, parent, file );
			}
			return null;
		}
		catch( Exception e )
		{
			return null;
		}
		finally
		{
			try
			{
				if( in != null )
				{
					in.close();
				}
			}
			catch( Exception e )
			{
			}
		}
	}
	
	
	public static String getClassName( String classContent )
	{
		try
		{
			BufferedReader buffer = new BufferedReader( new StringReader(classContent) );
			String line;
			String name   = null;
			boolean hasClass 	= false;
			boolean hasClassLineEnded = false;
			boolean inBlockCommend = false;
			while( (line = buffer.readLine()) != null )
			{
				line = line.trim();
				
				StringBuilder builder = new StringBuilder();
				for( int charI=0; charI<line.length(); charI++ )
				{
					char char1 = line.charAt( charI );
					char char2 = ' ';
					if( charI+1 < line.length() )
						char2 = line.charAt( charI+1 );
					
					if( (char1 == '/') && (char2 == '*') )
						inBlockCommend = true;
					else if( (char1 == '*') && (char2 == '/') )
						inBlockCommend = false;
					
					if( !inBlockCommend )
					{
						if( (char1 == '/') && (char2 == '/') )
							break;
						builder.append( char1 );
					}
				}
				line = builder.toString();
				
				String[] data = line.split( " " );
				if( !hasClass )
				{
					if( (data.length > 0) && data[0].toLowerCase().equals("class") )
					{
						hasClass = true;
					}
				}
				if( hasClass )
				{
					for( int i=0; i<data.length; i++ )
					{
						String dataPart = data[i];
						dataPart = dataPart.trim();
						hasClassLineEnded = dataPart.contains( ";" );
						if( hasClassLineEnded )
							dataPart = dataPart.substring( 0, dataPart.indexOf(";") );
						dataPart = dataPart.trim();
						String dataPartLowerCase = dataPart.toLowerCase();
						if( !dataPart.isEmpty() )
						{
							if( !dataPartLowerCase.equals("class") )
							{
								return dataPart;
							}
						}
						if( hasClassLineEnded )
							break;
					}
					if( hasClassLineEnded )
						break;
				}
			}
			return name;
		}
		catch( Exception e )
		{
			return null;
		}
	}
}
