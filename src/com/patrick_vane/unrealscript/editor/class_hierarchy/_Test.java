package com.patrick_vane.unrealscript.editor.class_hierarchy;

import java.io.File;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClassHierarchyParser;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;


public class _Test
{
	public static void main( String[] args )
	{
		UnrealScriptClass root = UnrealScriptClassHierarchyParser.parse( new File("C:/UDK/00_Test/Development/Src/") );
		print( root );
	}
	
	
	public static void printName( UnrealScriptClass ucClass )
	{
		for( int i=0; i<ucClass.getDepth(); i++ )
		{
			System.out.print( "   " );
		}
		System.out.println( " > "+ucClass.getName() );
	}
	
	
	public static void print( UnrealScriptClass ucClass )
	{
		printName( ucClass );
		for( UnrealScriptClass child : ucClass.getChilds() )
		{
			print( child );
		}
	}
}
