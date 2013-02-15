package patrick_vane_unrealscript_editor.editors.default_classes;

import java.io.File;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import My_File_Listener.MyFileListener;
import My_File_Listener.MyFileListenerInterface;


public abstract class AbstractResourcesChangedListener implements MyFileListenerInterface
{
	protected final MyFileListener listener;
	
	
	public AbstractResourcesChangedListener( File root )
	{
		listener = new MyFileListener( root, this );
	}
	
	
	public void start()
	{
		listener.start();
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