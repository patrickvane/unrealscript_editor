package com.patrick_vane.unrealscript.editor.perspective.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.executable.UDKCompiler;


public class Compile extends AbstractHandler
{
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked( event );
		IProject project = null;
		try
		{
			project = UnrealScriptEditor.getSelectedOrActiveUDKProject( window );
		}
		catch( Exception e )
		{
			MessageDialog.openError( window.getShell(), "Error", e.getMessage() );
			return null;
		}
		
		UDKCompiler.compile( project );
		
		return null;
	}
}
