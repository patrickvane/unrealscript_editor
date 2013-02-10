package patrick_vane_unrealscript_editor.editors.parser;


public class CodeErrorException extends Exception
{
	private static final long	serialVersionUID	= -3066611880047954513L;
	
	private int firstLineNumber;
	private int lastLineNumber;
	private String message;
	private boolean error; // or warning
	
	
	protected CodeErrorException( int firstLineNumber, int lastLineNumber, boolean isError, String message )
	{
		this.firstLineNumber = firstLineNumber;
		this.lastLineNumber = lastLineNumber;
		this.error = isError;
		this.message = message;
	}
	
	
	public int getFirstLineNumber()
	{
		return firstLineNumber;
	}
	public int getLastLineNumber()
	{
		return lastLineNumber;
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
