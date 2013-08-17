package com.patrick_vane.unrealscript.editor.parser;


@SuppressWarnings("serial")
public class CodeException extends Exception
{
	private int firstCharacterPosition;
	private int lastCharacterPosition;
	private String message;
	private boolean error; // or warning
	
	
	protected CodeException( int firstCharacterPosition, int lastCharacterPosition, boolean isError, String message )
	{
		this.firstCharacterPosition = firstCharacterPosition;
		this.lastCharacterPosition = lastCharacterPosition;
		this.error = isError;
		this.message = message;
	}
	
	
	public int getFirstCharacterPosition()
	{
		return firstCharacterPosition;
	}
	public int getLastCharacterPosition()
	{
		return lastCharacterPosition;
	}
	@Override
	public String getMessage()
	{
		return message;
	}
	public boolean isError()
	{
		return error;
	}
	public boolean isWarning()
	{
		return !error;
	}
}
