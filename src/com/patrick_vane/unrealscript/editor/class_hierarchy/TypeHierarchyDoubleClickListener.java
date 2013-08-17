package com.patrick_vane.unrealscript.editor.class_hierarchy;

import java.io.File;
import java.util.List;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;


public class TypeHierarchyDoubleClickListener implements IDoubleClickListener
{
	@Override
	public void doubleClick( final DoubleClickEvent event )
	{
		if( (event != null) && (event.getSelection() != null) && !event.getSelection().isEmpty() )
		{
			if( event.getSelection() instanceof IStructuredSelection )
			{
				IStructuredSelection eventSelection = (IStructuredSelection) event.getSelection();
				List<?> selections = eventSelection.toList();
				for( Object selection : selections )
				{
					if( selection instanceof UnrealScriptClass )
					{
						UnrealScriptClass selectedClass = (UnrealScriptClass) selection;
						File file = selectedClass.getFile();
						if( (file != null) && file.exists() )
						{
							UnrealScriptEditor.openFile( file );
						}
					}
				}
			}
		}
	}
}
