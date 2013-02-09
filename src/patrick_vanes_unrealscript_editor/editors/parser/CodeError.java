package patrick_vanes_unrealscript_editor.editors.parser;


public class CodeError
{
	private int firstLineNumber;
	private int lastLineNumber;
	private String message;
	private boolean error; // or warning
	
	protected CodeError( int firstLineNumber, int lastLineNumber, boolean error, String message )
	{
		this.firstLineNumber = firstLineNumber;
		this.lastLineNumber = lastLineNumber;
		this.error = error;
		this.message = message;
	}
	
	public int getfFirstLineNumber()
	{
		return firstLineNumber;
	}
	public int getLastLineNumber()
	{
		return lastLineNumber;
	}
	public String getMessage()
	{
		return message;
	}
	/** Error or warning? */
	public boolean isError()
	{
		return error;
	}
}
