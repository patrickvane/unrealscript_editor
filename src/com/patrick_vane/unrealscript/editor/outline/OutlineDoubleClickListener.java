package com.patrick_vane.unrealscript.editor.outline;

import java.util.List;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;


public class OutlineDoubleClickListener implements IDoubleClickListener
{
	@Override
	public void doubleClick( final DoubleClickEvent event )
	{
		if( (event != null) && (event.getSelection() != null) && !event.getSelection().isEmpty() )
		{
			if( event.getSelection() instanceof IStructuredSelection )
			{
				IStructuredSelection eventSelection = (IStructuredSelection) event.getSelection();
				List selections = eventSelection.toList();
				for( Object selection : selections )
				{
					if( selection instanceof CodeAttribute )
					{
						CodeAttribute attribute = (CodeAttribute) selection;
						UnrealScriptClass unrealscriptClass = UnrealScriptEditor.getUnrealScriptClass( attribute.getClassName() );
						UnrealScriptEditor.openFile( unrealscriptClass.getFile(), attribute.getFirstCharacterPosition(), attribute.getLastCharacterPosition() );
					}
				}
			}
		}
	}
}
