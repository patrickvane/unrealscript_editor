package com.patrick_vane.unrealscript.editor.class_hierarchy;

import java.util.ArrayList;


public class UnrealScriptClass
{
	private final UnrealScriptClass 			parent;
	private final ArrayList<UnrealScriptClass> 	childs 	= new ArrayList<UnrealScriptClass>();
	private final String 						name;
	private final int 							depth;
	
	
	public UnrealScriptClass( UnrealScriptClass parent, String name )
	{
		this.parent = parent;
		this.name 	= name;
		
		if( parent == null )
		{
			this.depth = 0;
		}
		else
		{
			this.depth = parent.getDepth() + 1;
			parent.addChild( this );
		}
	}
	
	
	public void addChild( UnrealScriptClass child )
	{
		childs.add( child );
	}
	
	public String getName()
	{
		return name;
	}
	public UnrealScriptClass getParent()
	{
		return parent;
	}
	public ArrayList<UnrealScriptClass> getChilds()
	{
		return childs;
	}
	public int getDepth()
	{
		return depth;
	}
	
	
	@Override
	public boolean equals( Object obj )
	{
		if( obj instanceof UnrealScriptClass )
			return getName().equals( ((UnrealScriptClass)obj).getName() );
		return false;
	}
	@Override
	public int hashCode()
	{
		return getName().hashCode();
	}
}
