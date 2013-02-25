package com.patrick_vane.unrealscript.editor.class_hierarchy.parser;

import java.io.File;
import java.util.ArrayList;


public class UnrealScriptClass
{
	private final UnrealScriptClass 			parent;
	private final ArrayList<UnrealScriptClass> 	childs = new ArrayList<UnrealScriptClass>();
	private final String 						name;
	private final File 							file;
	
	
	public UnrealScriptClass( UnrealScriptClass parent, String name, File file )
	{
		this.parent = parent;
		this.name 	= name;
		this.file 	= file;
		
		if( parent != null )
		{
			parent.addChild( this );
		}
	}
	
	
	/** Don't call your method yourself! (this method is used internally) */
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
	public File getFile()
	{
		return file;
	}
	public int getDepth()
	{
		int depth = 0;
		UnrealScriptClass parent = this.parent;
		while( parent != null )
		{
			depth++;
			parent = parent.getParent();
		}
		return depth;
	}
	public boolean exists()
	{
		return ((file != null) && file.exists());
	}
	
	
	public boolean equalsCompletely( Object obj )
	{
		if( obj != null )
		{
			if( obj instanceof UnrealScriptClass )
			{
				UnrealScriptClass root = (UnrealScriptClass) obj;
				return equalsCompletelyRecursive( root );
			}
		}
		return false;
	}
	private boolean equalsCompletelyRecursive( UnrealScriptClass root )
	{
		if( !getName().equals(root.getName()) )
		{
			return false;
		}
		
		ArrayList<UnrealScriptClass> array1 = getChilds();
		ArrayList<UnrealScriptClass> array2 = root.getChilds();
		if( array1.size() != array2.size() )
		{
			return false;
		}
		
		for( int i=0; i<array1.size(); i++ )
		{
			if( !array1.get(i).equalsCompletelyRecursive(array2.get(i)) )
			{
				return false;
			}
		}
		
		return true;
	}
	
	
	@Override
	public boolean equals( Object obj )
	{
		if( obj != null )
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
