package com.patrick_vane.unrealscript.editor.default_classes;



public abstract class MyRunnable implements Runnable
{
	private boolean	done	= false;
	private Object	result	= null;
	
	
	public void done( Object result )
	{
		this.done = true;
		this.result = result;
	}
	
	public void restart()
	{
		done 	= false;
		result 	= null;
	}
	
	
	public boolean isDone()
	{
		return done;
	}
	public Object getResult()
	{
		return result;
	}
}