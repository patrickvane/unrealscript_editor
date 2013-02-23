package com.patrick_vane.unrealscript.editor.class_hierarchy;


class UnrealScriptParsingClass
{
	private final String name;
	private final String parentNname;
	
	
	public UnrealScriptParsingClass( String name, String parentNname )
	{
		this.name 			= name;
		this.parentNname 	= parentNname;
	}
	
	
	public String getName()
	{
		return name;
	}
	public String getParentName()
	{
		return parentNname;
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
