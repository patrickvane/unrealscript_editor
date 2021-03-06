package com.patrick_vane.unrealscript.editor.class_hierarchy;

import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;


public class TypeHierarchyLabelProvider extends LabelProvider implements IFontProvider
{
	private static final Image FILE 			= UnrealScriptEditor.getImage( "icons/uc.png" );
	private static final Image FILE_NOT_FOUND 	= UnrealScriptEditor.getImage( "icons/uc_unknown.png" );
	
	
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
}