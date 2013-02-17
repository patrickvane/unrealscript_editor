package patrick_vane_unrealscript_editor.editors.perspective.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import patrick_vane_unrealscript_editor.editors.executable.UDKGame;


public class RunGame extends AbstractHandler
{
	public RunGame()
	{
	}
	
	
	@Override
	public Object execute( ExecutionEvent event ) throws ExecutionException
	{
		UDKGame.run();
		return null;
	}
}
