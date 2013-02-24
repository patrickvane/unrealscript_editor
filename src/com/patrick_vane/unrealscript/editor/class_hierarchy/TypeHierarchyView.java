package com.patrick_vane.unrealscript.editor.class_hierarchy;

import java.io.File;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.part.ViewPart;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClass;
import com.patrick_vane.unrealscript.editor.class_hierarchy.parser.UnrealScriptClassHierarchyParser;
import com.patrick_vane.unrealscript.editor.constants.ProjectConstant;


public class TypeHierarchyView extends ViewPart
{
	private static TreeViewer			classHierarchyViewer;
	
	private static Thread				updateThread;
	
	private static UnrealScriptClass	lastRoot;
	private static File					lastSourceFolder;
	private static boolean				fileChanged	= false;
	
	
	static
	{
		updateThread = new Thread()
		{
			@Override
			public void run()
			{
				while( true )
				{
					if( classHierarchyViewer != null )
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
							if( fileChanged || (lastRoot == null) || (lastSourceFolder == null) || !lastSourceFolder.equals(sourceFolder) )
							{
								lastSourceFolder = sourceFolder;
								fileChanged = false;
								
								final UnrealScriptClass root = UnrealScriptClassHierarchyParser.parse( sourceFolder );
								if( (lastRoot == null) || !lastRoot.equalsCompletely(root) )
								{
									lastRoot = root;
									
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
		classHierarchyViewer.setAutoExpandLevel( 2 );
	}
	
	
	@Override
	public void setFocus()
	{
	}
	
	
	public static void fileChanged()
	{
		fileChanged = true;
	}
}
