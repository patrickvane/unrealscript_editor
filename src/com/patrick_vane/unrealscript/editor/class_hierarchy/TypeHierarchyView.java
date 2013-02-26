package com.patrick_vane.unrealscript.editor.class_hierarchy;

import java.io.File;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClassHierarchyParser;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptRootClass;
import com.patrick_vane.unrealscript.editor.constants.ProjectConstant;


public class TypeHierarchyView extends ViewPart
{
	private static TreeViewer				classHierarchyViewer;
	
	private static Thread					updateThread;
	
	private static UnrealScriptRootClass	lastRoot;
	private static File						lastSourceFolder;
	private static boolean					firstRunAfterStart = false;
	private static boolean					fileChanged	= false;
	
	
	static
	{
		updateThread = new Thread()
		{
			@Override
			public void run()
			{
				while( true )
				{
					File sourceFolder = null;
					try
					{
						sourceFolder = new File( UnrealScriptEditor.getActiveProjectFile().getAbsolutePath()+"/"+ProjectConstant.subfolders.get("UnrealScript") );
					}
					catch( Exception e )
					{
					}
					
					if( (sourceFolder != null) && sourceFolder.exists() )
					{
						if( firstRunAfterStart || fileChanged || (lastRoot == null) || (lastRoot.getChilds().size() == 0) || (lastSourceFolder == null) || !lastSourceFolder.equals(sourceFolder) )
						{
							final UnrealScriptRootClass root = UnrealScriptClassHierarchyParser.parse( sourceFolder );
							
							lastSourceFolder = sourceFolder;
							fileChanged = false;
							
							if( firstRunAfterStart || (lastRoot == null) || !lastRoot.equalsCompletely(root) )
							{
								lastRoot = root;
								firstRunAfterStart = false;
								
								Display.getDefault().syncExec
								(
									new Runnable()
									{
										@Override
										public void run()
										{
											if( classHierarchyViewer != null )
											{
												classHierarchyViewer.setInput( root );
												classHierarchyViewer.collapseAll();
											}
										}
									}
								);
							}
						}
					}
					
					try
					{
						Thread.sleep( 1000 );
					}
					catch( Exception e )
					{
					}
				}
			}
		};
		updateThread.setDaemon( true );
		updateThread.start();
	}
	
	
	@Override
	public void createPartControl( Composite parent )
	{
		classHierarchyViewer = new TreeViewer( parent, SWT.MULTI|SWT.H_SCROLL|SWT.V_SCROLL );
		classHierarchyViewer.setContentProvider( new TypeHierarchyContentProvider() );
		classHierarchyViewer.setLabelProvider( new TypeHierarchyLabelProvider() );
		classHierarchyViewer.setSorter( new TypeHierarchySorter() );
		classHierarchyViewer.addDoubleClickListener( new TypeHierarchyDoubleClickListener() );
		classHierarchyViewer.setAutoExpandLevel( 2 );
		firstRunAfterStart = true;
	}
	
	
	@Override
	public void setFocus()
	{
	}
	
	
	public static void fileChanged()
	{
		fileChanged = true;
	}
	
	public static UnrealScriptRootClass getRoot()
	{
		return lastRoot;
	}
	public static File getRootSourceFolder()
	{
		return lastSourceFolder;
	}
	public static boolean isRootFromThisProject()
	{
		try
		{
			File projectFolder = new File( UnrealScriptEditor.getActiveProjectFile().getAbsolutePath()+"/"+ProjectConstant.subfolders.get("UnrealScript") );
			return projectFolder.equals( lastSourceFolder );
		}
		catch( Exception e )
		{
			return false;
		}
	}
}
