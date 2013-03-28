package com.patrick_vane.unrealscript.editor.outline;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.outline.actions.ToggleSortAction;
import com.patrick_vane.unrealscript.editor.outline.actions.ToggleVariablesAction;
import com.patrick_vane.unrealscript.editor.parser.UnrealScriptAttributes;


public class OutlineContentPage extends ContentOutlinePage
{
	private final IEditorInput input;
	
	private TreeViewer overviewViewer;
	private IFile file;
	
	private boolean runThread = false;
	private Thread thread = new Thread()
	{
		@Override
		public void run()
		{
			while( runThread )
			{
				try
				{
					if( runThread && file.equals(UnrealScriptEditor.getActiveIFile()) )
					{
						update();
					}
				}
				catch( Exception e )
				{
				}
				
				try
				{
					Thread.sleep( 2000 );
				}
				catch( Exception e )
				{
				}
			}
		}
	};
	
	
	public OutlineContentPage( IFile file, IEditorInput input )
	{
		this.input = input;
		this.file  = file;
		
		thread.setDaemon( true );
	}
	
	
	public void update()
	{
		try
		{
			final UnrealScriptAttributes attributes = UnrealScriptEditor.getUnrealScriptAttributes( UnrealScriptEditor.getClassName(file) );
			Display.getDefault().syncExec
			(
				new Runnable()
				{
					@Override
					public void run()
					{
						try
						{
							overviewViewer.setInput( attributes );
							overviewViewer.collapseAll();
							overviewViewer.refresh( true );
						}
						catch( Exception e )
						{
						}
					}
				}
			);
		}
		catch( Exception e )
		{
		}
	}
	
	
	@Override
	public void createControl( Composite parent )
	{
		super.createControl( parent );
		overviewViewer = getTreeViewer();
		overviewViewer.setContentProvider( new OutlineContentProvider() );
		overviewViewer.setLabelProvider( new OutlineLabelProvider() );
		overviewViewer.setSorter( new OutlineSorter() );
		overviewViewer.addSelectionChangedListener( new OutlineSelectionChangedListener() );
		overviewViewer.addDoubleClickListener( new OutlineDoubleClickListener() );
		overviewViewer.setAutoExpandLevel( 0 );
		overviewViewer.setInput( input );
		
		runThread = true;
		thread.start();
	}
	
	@Override
	public void setActionBars( IActionBars actionBars )
	{
	    actionBars.getToolBarManager().add( new ToggleSortAction(this) );
	    actionBars.getToolBarManager().add( new ToggleVariablesAction(this) );
	    actionBars.getToolBarManager().update( false );       
	    actionBars.updateActionBars();      
	}
	
	
	@Override
	public void dispose()
	{
		runThread = false;
		super.dispose();
	}
}
