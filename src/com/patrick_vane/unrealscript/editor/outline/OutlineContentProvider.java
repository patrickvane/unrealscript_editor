package com.patrick_vane.unrealscript.editor.outline;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAttributes;


public class OutlineContentProvider implements ITreeContentProvider
{
	@Override
	public void inputChanged( Viewer viewer, Object oldInput, Object newInput )
	{
	}
	
	
	@Override
	public Object[] getElements( Object inputElement )
	{
		Object[] children = getChildren( inputElement );
		if( children == null )
			return new Object[0];
		return children;
	}
	
	@Override
	public boolean hasChildren( Object element )
	{
		if( element instanceof UnrealScriptAttributes )
		{
			return (((UnrealScriptAttributes)element).getAttributes().size() > 0);
		}
		return false;
	}
	
	@Override
	public Object[] getChildren( Object element )
	{
		if( element instanceof UnrealScriptAttributes )
		{
			return ((UnrealScriptAttributes)element).getAttributes().toArray( new CodeAttribute[0] );
		}
		return new Object[0];
	}
	
	@Override
	public Object getParent( Object element )
	{
		return null;
	}
	
	
	@Override
	public void dispose()
	{
	}
}