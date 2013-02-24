package com.patrick_vane.unrealscript.editor.class_hierarchy;

import java.net.URL;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;


public class ClassHierarchyLabelProvider extends LabelProvider
{
	private static final Image IMAGE = getImage( "uc.png" );
	
	
	@Override
	public String getText( Object element )
	{
		if( element instanceof UnrealScriptClass )
		{
			return ((UnrealScriptClass) element).getName();
		}
		return null;
	}
	
	@Override
	public Image getImage( Object element )
	{
		return IMAGE;
	}
	
	
	private static Image getImage( String file )
	{
		Bundle bundle = FrameworkUtil.getBundle( ClassHierarchyLabelProvider.class );
		URL url = FileLocator.find( bundle, new Path("icons/" + file), null );
		ImageDescriptor image = ImageDescriptor.createFromURL( url );
		return image.createImage();
	}
}