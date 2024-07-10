package com.patrick_vane.unrealscript.editor.default_classes;

import java.io.File;
import java.util.HashMap;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.patrick_vane.unrealscript.editor.My_File_Listener.MyFileListener;
import com.patrick_vane.unrealscript.editor.My_File_Listener.MyFileListenerInterface;


public abstract class AbstractResourcesChangedListener implements MyFileListenerInterface
{
	protected final MyFileListener			listener;
	
	protected final HashMap<String,Long>	filter			= new HashMap<String,Long>();
	protected int							filterMillis	= 2000;
	
	
	public AbstractResourcesChangedListener( File root )
	{
		listener = new MyFileListener( root, this );
	}
	
	
	public abstract void onFileChanged( final String name );
	
	
	public void start()
	{
		try {
			listener.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void stop()
	{
		listener.stop();
	}
	
	public File getRoot()
	{
		return listener.getRoot();
	}
	public boolean isListening()
	{
		return listener.isListening();
	}
	
	
	@Override
	protected void finalize() throws Throwable
	{
		stop();
		super.finalize();
	}
	
	
	@Override
	public final void fileChanged( final String name )
	{
		boolean callFileChanged = false;
		synchronized( filter )
		{
			Long lastTime = filter.get( name );
			if( (lastTime == null) || (System.currentTimeMillis()-lastTime >= filterMillis) )
			{
				filter.put( name, System.currentTimeMillis() );
				callFileChanged = true;
			}
		}
		
		if( callFileChanged )
		{
			onFileChanged( name );
		}
	}
	
	
	protected void runSynchronized( IWorkspaceRunnable runnable ) throws CoreException
	{
		IProgressMonitor monitor = new NullProgressMonitor();
		try
		{
			ResourcesPlugin.getWorkspace().run( runnable, monitor );
		}
		catch( CoreException e )
		{
			try
			{
				runnable.run( monitor );
			}
			catch( CoreException e2 )
			{
				throw e;
			}
		}
	}
}