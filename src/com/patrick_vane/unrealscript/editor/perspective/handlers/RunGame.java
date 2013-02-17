package com.patrick_vane.unrealscript.editor.perspective.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import com.patrick_vane.unrealscript.editor.executable.UDKGame;


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
