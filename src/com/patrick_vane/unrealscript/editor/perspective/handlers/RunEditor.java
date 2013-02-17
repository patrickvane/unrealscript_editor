package com.patrick_vane.unrealscript.editor.perspective.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import com.patrick_vane.unrealscript.editor.executable.UDKEditor;


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
