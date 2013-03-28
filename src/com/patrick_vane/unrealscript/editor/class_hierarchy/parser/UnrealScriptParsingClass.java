package com.patrick_vane.unrealscript.editor.class_hierarchy.parser;

import java.io.File;
import java.util.ArrayList;


class UnrealScriptParsingClass
{
	private final String			name;
	private final String			parentName;
	private final ArrayList<String>	keywords;
	private final File				file;
	
	
	public UnrealScriptParsingClass( String name, String parentName, ArrayList<String> keywords, File file )
	{
		this.name 		= name;
		this.parentName = parentName;
		this.keywords 	= keywords;
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
	public ArrayList<String> getKeywords()
	{
		return keywords;
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
