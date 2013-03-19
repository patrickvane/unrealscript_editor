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
	protected abstract IHyperlink getHyperlink( CodeWord word, String before, String after ) throws Exception;
	
	
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
			
			int pos = region.getOffset();
			
			for( int i=0; i<words.length; i++ )
			{
				CodeWord word = words[i];
				if( isBetween(pos, word.getFirstCharacterPosition(), word.getLastCharacterPosition()) )
				{
					String before = "";
					String after  = "";
					if( i >= 1 )
						before = words[i-1].getWord();
					if( i < words.length-1 )
						after = words[i+1].getWord();
					
					IHyperlink link = getHyperlink( word, before, after );
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
