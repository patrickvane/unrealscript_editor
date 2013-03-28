package com.patrick_vane.unrealscript.editor.class_hierarchy;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;


public class TypeHierarchySorter extends ViewerSorter
{
	@Override
	public int compare( Viewer viewer, Object e1, Object e2 )
	{
		if( (e1 instanceof UnrealScriptClass) && (e2 instanceof UnrealScriptClass) )
		{
			return ((UnrealScriptClass)e1).getName().compareTo( ((UnrealScriptClass)e2).getName() );
		}
		
		if( e1 == null )
			return 1;
		if( e2 == null )
			return -1;
		
		return e1.toString().compareTo( e2.toString() );
	}
}
