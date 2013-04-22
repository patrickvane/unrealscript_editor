package com.patrick_vane.unrealscript.editor.default_classes;


public class DoneNotifier
{
	private boolean done = false;
	
	
	public void done()
	{
		done = true;
	}
	
	public boolean isDone()
	{
		return done;
	}
}
