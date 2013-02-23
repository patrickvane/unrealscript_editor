package com.patrick_vane.unrealscript.editor.class_hierarchy;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;


public class ClassHierarchyParser
{
	public static UnrealScriptClass parse( File sourceDir )
	{
		HashMap<String,UnrealScriptParsingClass> parsingClasses = new HashMap<String,UnrealScriptParsingClass>();
		parse( parsingClasses, sourceDir );
		
		UnrealScriptClass root = new UnrealScriptClass( null, "root" );
		HashMap<String,UnrealScriptClass> classes = new HashMap<String,UnrealScriptClass>();
		for( UnrealScriptParsingClass parsedClass : parsingClasses.values() )
		{
			parse( root, parsingClasses, classes, parsedClass );
		}
		
		return root;
	}
	
	private static UnrealScriptClass parse( UnrealScriptClass root, HashMap<String,UnrealScriptParsingClass> parsingClasses, HashMap<String,UnrealScriptClass> classes, UnrealScriptParsingClass parsedClass )
	{
		String name = parsedClass.getName().toLowerCase();
		UnrealScriptClass thisClass = classes.get( name );
		if( thisClass != null )
			return thisClass;
		
		UnrealScriptClass parent = null;
		
		String parentName = parsedClass.getParentName();
		if( parentName != null )
		{
			parentName = parentName.toLowerCase();
			parent = classes.get( parentName );
			if( parent == null )
			{
				UnrealScriptParsingClass parentClass = parsingClasses.get( parentName );
				if( parentClass != null )
				{
					parent = parse( root, parsingClasses, classes, parentClass );
				}
				else
				{
					parent = new UnrealScriptClass( root, parentName );
					classes.put( parentName, parent );
				}
			}
		}
		if( parent == null )
		{
			parent = root;
		}
		
		thisClass = new UnrealScriptClass( parent, parsedClass.getName() );
		classes.put( name, thisClass );
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
	
	private static UnrealScriptParsingClass parseClass( File file )
	{
		DataInputStream in = null;
		try
		{
			in = new DataInputStream( new FileInputStream(file) );
			BufferedReader buffer = new BufferedReader( new InputStreamReader(in) );
			String line;
			String name   = null;
			String parent = null;
			boolean hasExtends = false;
			while( (line = buffer.readLine()) != null )
			{
				line = line.trim();
				if( line.startsWith("class") )
				{
					String[] data = line.split( " " );
					for( int i=1; i<data.length; i++ )
					{
						String dataPart = data[i];
						dataPart = dataPart.replaceAll( ";", "" );
						dataPart = dataPart.replaceAll( "//", "" );
						dataPart = dataPart.trim();
						if( !dataPart.isEmpty() )
						{
							if( name == null )
							{
								name = dataPart;
							}
							else if( !hasExtends )
							{
								if( dataPart.toLowerCase().equals("extends") )
									hasExtends = true;
							}
							else
							{
								parent = dataPart;
								break;
							}
						}
					}
					break;
				}
			}
			if( name != null )
			{
				return new UnrealScriptParsingClass( name, parent );
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
}
