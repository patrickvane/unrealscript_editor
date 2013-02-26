package com.patrick_vane.unrealscript.editor.class_hierarchy.parser;

import java.io.File;
import java.util.HashMap;


public class UnrealScriptRootClass extends UnrealScriptClass
{
	private final HashMap<String,UnrealScriptClass> classes = new HashMap<String,UnrealScriptClass>();
	
	
	public UnrealScriptRootClass( UnrealScriptClass parent, String name, File file )
	{
		super( parent, name, file );
	}
	
	
	public void addClass( UnrealScriptClass ucClass )
	{
		classes.put( ucClass.getName().toLowerCase(), ucClass );
	}
	
	public HashMap<String,UnrealScriptClass> getClasses()
	{
		return classes;
	}
	public UnrealScriptClass getClass( String name )
	{
		return classes.get( name.toLowerCase() );
	}
	public boolean containsClass( String name )
	{
		return classes.containsKey( name.toLowerCase() );
	}
}
