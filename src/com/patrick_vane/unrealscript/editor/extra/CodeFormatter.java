package com.patrick_vane.unrealscript.editor.extra;

import org.eclipse.jface.text.formatter.ContextBasedFormattingStrategy;


public class CodeFormatter extends ContextBasedFormattingStrategy
{
	@Override
	public String format( String content, boolean start, String indentation, int[] positions )
	{
		System.out.println( "\""+content+"\"" );
		return null;
	}
	
	
	/*if( (sourceViewer != null) && sourceViewer.isEditable() )
	{
		IDocument document = sourceViewer.getDocument();
		if( document != null )
		{
			Point selection = sourceViewer.getSelectedRange();
			IRegion region = null;
			if( selection.y > 0 )
				region = new Region( selection.x, selection.y );
			else
				region = new Region( 0, document.getLength() );
			
			try
			{
				String before = document.get( 0, region.getOffset() );
				String code = document.get( region.getOffset(), region.getLength() );
				String after = document.get( region.getOffset()+region.getLength(), document.getLength()-(region.getOffset()+region.getLength()) );
				
				document.set( before + codeFormatter.format(before, code, after) + after );
			}
			catch( Exception e )
			{
				e.printStackTrace();
			}
		}
	}
	return null;
	
	public String format( String before, String code, String after )
	{
		System.out.println( "\""+code+"\"" );
		return code;
	}*/
}
