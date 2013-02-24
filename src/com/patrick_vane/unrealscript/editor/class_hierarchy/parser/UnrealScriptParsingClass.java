package com.patrick_vane.unrealscript.editor.class_hierarchy.parser;

import java.io.File;


class UnrealScriptParsingClass
{
	private final String 	name;
	private final String 	parentName;
	private final File 		file;
	
	
	public UnrealScriptParsingClass( String name, String parentName, File file )
	{
		this.name 		= name;
		this.parentName = parentName;
		this.file 		= file;
	}
	
	
	public String getName()
	{
		return name;
	}
	public String getParentName()
	{
		return parentName;
	}
	public File getFile()
	{
		return file;
	}
	
	
	@Override
	public boolean equals( Object obj )
	{
		if( obj instanceof UnrealScriptParsingClass )
			return getName().equals( ((UnrealScriptParsingClass)obj).getName() );
		return false;
	}
	@Override
	public int hashCode()
	{
		return getName().hashCode();
	}
}
