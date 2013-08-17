package com.patrick_vane.unrealscript.editor.outline;

import java.util.List;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.parser.CodeAttribute;


public class OutlineSelectionChangedListener implements ISelectionChangedListener
{
	@Override
	public void selectionChanged( SelectionChangedEvent event )
	{
		if( (event != null) && (event.getSelection() != null) && !event.getSelection().isEmpty() )
		{
			if( event.getSelection() instanceof IStructuredSelection )
			{
				IStructuredSelection eventSelection = (IStructuredSelection) event.getSelection();
				List<?> selections = eventSelection.toList();
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
