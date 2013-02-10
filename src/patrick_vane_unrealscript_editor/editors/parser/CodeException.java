package patrick_vane_unrealscript_editor.editors.parser;


public class CodeException extends Exception
{
	private static final long	serialVersionUID	= -3066611880047954513L;
	
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
