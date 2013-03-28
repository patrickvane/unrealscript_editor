package com.patrick_vane.unrealscript.editor.class_hierarchy;

import java.net.URL;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;


public class TypeHierarchyLabelProvider extends LabelProvider implements IFontProvider
{
	private static final Image FILE 			= getImage( "uc.png" );
	private static final Image FILE_NOT_FOUND 	= getImage( "uc_unknown.png" );
	
	
	@Override
	public String getText( Object element )
	{
		if( element != null )
		{
			if( element instanceof UnrealScriptClass )
			{
				UnrealScriptClass unrealscriptClass = (UnrealScriptClass) element;
				return unrealscriptClass.getName();
			}
		}
		return null;
	}
	
	@Override
	public Font getFont( Object element )
	{
		if( element != null )
		{
			if( element instanceof UnrealScriptClass )
			{
				UnrealScriptClass unrealscriptClass = (UnrealScriptClass) element;
				
				boolean bold = unrealscriptClass.isPlaceable();
				boolean italic = unrealscriptClass.isAbstract();
				int style = (bold ? SWT.BOLD : 0) | (italic ? SWT.ITALIC : 0);
				
				Font font = Display.getCurrent().getSystemFont();
				FontData fontData = font.getFontData()[0];
				fontData.setStyle( style );
				
				return new Font( font.getDevice(), fontData );
			}
		}
		return Display.getCurrent().getSystemFont();
	}
	
	@Override
	public Image getImage( Object element )
	{
		if( element != null )
		{
			if( element instanceof UnrealScriptClass )
			{
				if( ((UnrealScriptClass) element).exists() )
					return FILE;
				else
					return FILE_NOT_FOUND;
			}
		}
		return FILE_NOT_FOUND;
	}
	
	
	private static Image getImage( String file )
	{
		Bundle bundle = FrameworkUtil.getBundle( TypeHierarchyLabelProvider.class );
		URL url = FileLocator.find( bundle, new Path("icons/" + file), null );
		ImageDescriptor image = ImageDescriptor.createFromURL( url );
		return image.createImage();
	}
}