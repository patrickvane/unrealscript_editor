package com.patrick_vane.unrealscript.editor.class_hierarchy;

import java.io.File;
import java.util.List;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.ide.IDE;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;


public class TypeHierarchyDoubleClickListener implements IDoubleClickListener
{
	@Override
	public void doubleClick( DoubleClickEvent event )
	{
		if( (event != null) && (event.getSelection() != null) && !event.getSelection().isEmpty() )
		{
			if( event.getSelection() instanceof IStructuredSelection )
			{
				IWorkbenchPage page = null;
				try
				{
					page = UnrealScriptEditor.getActiveWorkbenchWindow().getActivePage();
				}
				catch( Exception e )
				{
				}
				
				if( page != null )
				{
					IStructuredSelection eventSelection = (IStructuredSelection) event.getSelection();
					List selections = eventSelection.toList();
					for( Object selection : selections )
					{
						if( selection instanceof UnrealScriptClass )
						{
							UnrealScriptClass selectedClass = (UnrealScriptClass) selection;
							File file = selectedClass.getFile();
							if( (file != null) && file.exists() )
							{
								try
								{
									IFileStore fileStore = EFS.getLocalFileSystem().getStore( file.toURI() );
									IEditorPart openedFile = IDE.openEditorOnFileStore( page, fileStore );
									if( openedFile != null )
									{
										page.activate( openedFile );
									}
								}
								catch( Exception e )
								{
								}
							}
						}
					}
				}
			}
		}
	}
}
