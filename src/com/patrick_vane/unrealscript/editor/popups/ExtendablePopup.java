package com.patrick_vane.unrealscript.editor.popups;

import javax.swing.JDialog;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.IWorkbenchWindow;


public class ExtendablePopup extends JDialog
{
	private static final long		serialVersionUID	= 4665137732519823141L;
	
	private static ExtendablePopup	runningPopup		= null;
	private static final Object 	runningPopupSyncer 	= new Object();
	
	private boolean					done;
	private boolean					canceled;
	
	private IProgressMonitor		progressionMonitor;
	
	
	public ExtendablePopup( String title, int width, int height )
	{
		setTitle( title );
		setType( Type.NORMAL );
		setAlwaysOnTop( true );
		getContentPane().setLayout( null );
		getContentPane().setPreferredSize( new Dimension(width, height) );
		pack();
		setLocationRelativeTo( null );
		setAutoRequestFocus( true );
		
		addWindowListener
		(
			new WindowAdapter()
			{
				@Override
				public void windowClosing( WindowEvent e )
				{
					cancel();
				}
			}
		);
	}
	
	
	public void showAndBlock( final IWorkbenchWindow window )
	{
		synchronized( runningPopupSyncer )
		{
			if( runningPopup != null )
			{
				cancel();
				return;
			}
			runningPopup = this;
		}
		
		done = false;
		canceled = false;
		
		IWorkspaceRunnable runnable = new IWorkspaceRunnable()
		{
			@Override
			public void run( IProgressMonitor monitor )
			{
				ExtendablePopup.this.progressionMonitor = monitor;
				
				monitor.beginTask( "Handling Popup", IProgressMonitor.UNKNOWN );
				ExtendablePopup.super.setVisible( true );
				while( !isDone() )
				{
					try
					{
						Thread.sleep( 200 );
					}
					catch( Exception e )
					{
					}
				}
				monitor.setCanceled( isCanceled() );
				monitor.done();
			}
		};
		
		NullProgressMonitor monitor = new NullProgressMonitor();
		try
		{
			ResourcesPlugin.getWorkspace().run( runnable, monitor );
		}
		catch( CoreException e )
		{
			cancel();
			monitor.setCanceled( isCanceled() );
			monitor.done();
		}
		
		synchronized( runningPopupSyncer )
		{
			runningPopup = null;
		}
		
		super.setVisible( false );
	}
	
	
	public boolean isDone()
	{
		return done;
	}
	public boolean isCanceled()
	{
		return canceled;
	}
	public IProgressMonitor getProgressionMonitor()
	{
		return progressionMonitor;
	}
	
	
	protected void success()
	{
		done = true;
		canceled = false;
	}
	protected void cancel()
	{
		done = true;
		canceled = true;
	}
}
