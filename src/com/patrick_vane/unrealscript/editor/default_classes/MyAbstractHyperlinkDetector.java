package com.patrick_vane.unrealscript.editor.default_classes;

import java.util.ArrayList;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.hyperlink.AbstractHyperlinkDetector;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import com.patrick_vane.unrealscript.editor.parser.CodeWord;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptParser;


public abstract class MyAbstractHyperlinkDetector extends AbstractHyperlinkDetector
{
	protected abstract IHyperlink getHyperlink( CodeWord word, int inLineArrayPos, CodeWord[] line, String before, String after ) throws Exception;
	
	
	@Override
	public IHyperlink[] detectHyperlinks( ITextViewer textViewer, IRegion region, boolean canShowMultipleHyperlinks )
	{
		try
		{
			ArrayList<IHyperlink> links = new ArrayList<IHyperlink>();
			
			int min = 0;
			int max = textViewer.getDocument().getLength();
			
			int start  = clamp( region.getOffset()-40, min, max );
			int length = clamp( 80, min, max-start );
			CodeWord[] words = UnrealScriptParser.parsePartWords( textViewer.getDocument().get(start, length), start );
			CodeWord[] line  = UnrealScriptParser.parseLine( textViewer.getDocument().get(), region.getOffset() );
			
			int pos = region.getOffset();
			
			for( int i=0; i<words.length; i++ )
			{
				CodeWord word = words[i];
				if( isBetween(pos, word.getFirstCharacterPosition(), word.getLastCharacterPosition()) )
				{
					String before = "";
					String after  = "";
					
					int inLineArrayPos = -1;
					for( int j=0; j<line.length; j++ )
					{
						if( line[j].equals(word) )
						{
							inLineArrayPos = j;
							break;
						}
					}
					
					if( inLineArrayPos-1 >= 0 )
						before = line[inLineArrayPos-1].getWord();
					if( inLineArrayPos+1 < line.length )
						after = line[inLineArrayPos+1].getWord();
					
					IHyperlink link = getHyperlink( word, inLineArrayPos, line, before, after );
					if( link != null )
					{
						links.add( link );
					}
				}
			}
			
			if( links.size() <= 0 )
				return null;
			return links.toArray( new IHyperlink[0] );
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		return null;
	}
	
	
	private static int clamp( int x, int min, int max )
	{
		return Math.max( min, Math.min(max, x) );
	}
	private static boolean isBetween( int x, int min, int max )
	{
		return ((x >= min) && (x <= max));
	}
}
