package patrick_vane_unrealscript_editor.editors.perspective.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import patrick_vane_unrealscript_editor.editors.executable.UDKEditor;


public class RunEditor extends AbstractHandler
{
	public RunEditor()
	{
	}
	
	
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		UDKEditor.run();
		return null;
	}
}
