package com.patrick_vane.unrealscript.editor.class_hierarchy;

import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;


public class TypeHierarchyViewTree extends TreeViewer
{
	public TypeHierarchyViewTree( Composite parent, int style )
	{
		super( parent, style );
	}
	
	
	public void setSelection( Object item )
	{
		setSelection( new StructuredSelection(item), false );
		reveal( item );
	}
}
