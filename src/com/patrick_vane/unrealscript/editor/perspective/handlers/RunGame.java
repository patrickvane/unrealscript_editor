package com.patrick_vane.unrealscript.editor.perspective.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;


public class RunGame extends AbstractHandler
{
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		/*IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked( event );
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
		
		UDKGame.run( project );*/
		return null;
	}
}
