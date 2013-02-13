package patrick_vane_unrealscript_editor.editors.perspective.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import patrick_vane_unrealscript_editor.editors.UnrealScriptEditor;
import patrick_vane_unrealscript_editor.editors.popups.UDKCompilerSettingsPopup;


public class CompilerSettings extends AbstractHandler
{
	public CompilerSettings()
	{
	}
	
	
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked( event );
		IProject project = null;
		try
		{
			project = UnrealScriptEditor.getSelectedProject( window );
		}
		catch( Exception e )
		{
			MessageDialog.openError( window.getShell(), "Error", e.getMessage() );
			return null;
		}
		
		UDKCompilerSettingsPopup dialog = new UDKCompilerSettingsPopup( project );
		dialog.showAndBlock( window );
		
		return null;
	}
}
