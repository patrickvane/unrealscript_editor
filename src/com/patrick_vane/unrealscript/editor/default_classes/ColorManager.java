package com.patrick_vane.unrealscript.editor.default_classes;

import java.util.HashMap;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;


public class ColorManager
{
	protected static HashMap<RGB,Color> fColorTable = new HashMap<RGB,Color>( 10 );
	
	
	public static synchronized Color getColor( int red, int green, int blue )
	{
		return getColor( new RGB(red, green, blue) );
	}
	
	public static synchronized Color getColor( float hue, float saturation, float brightness )
	{
		return getColor( new RGB(hue, saturation, brightness) );
	}
	
	public static synchronized Color getColor( RGB rgb )
	{
		Color color = fColorTable.get( rgb );
		if( color == null )
		{
			color = new Color( Display.getCurrent(), rgb );
			fColorTable.put( rgb, color );
		}
		if( color.isDisposed() )
		{
			color = new Color( Display.getCurrent(), rgb );
			fColorTable.put( rgb, color );
		}
		return color;
	}
	
	public static synchronized TextAttribute getTextAttribute( RGB rgb )
	{
		return new TextAttribute( getColor(rgb) );
	}
	
	public static synchronized IToken getToken( RGB rgb )
	{
		return new Token( getTextAttribute(rgb) );
	}
}
