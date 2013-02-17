package com.patrick_vane.unrealscript.editor.My_File_Listener;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import net.contentobjects.jnotify.JNotify;
import net.contentobjects.jnotify.JNotifyListener;


public class MyFileListener
{
	private final File root;
	private final JNotifyListener jnotifyListener;
	
	private final HashMap<Integer,String> watchIDs = new HashMap<Integer,String>();
	
	private boolean listening = false;
	
	
	private static File fixRoot( File root )
	{
		if( root.exists() && !root.isDirectory() )
			root.delete();
		if( !root.exists() )
			root.mkdirs();
		root.setReadable( true, false );
		root.setWritable( true, false );
		root.setExecutable( true, false );
		return root;
	}
	
	public MyFileListener( final File root, final MyFileListenerSpecificInterface listener )
	{
		this.root = fixRoot( root );
		this.jnotifyListener = new JNotifyListener()
		{
			@Override
			public void fileCreated( int watchID, String rootPath, String name )
			{
				listener.fileCreated( watchIDs.get(watchID)+name );
			}
			@Override
			public void fileDeleted( int watchID, String rootPath, String name )
			{
				listener.fileDeleted( watchIDs.get(watchID)+name );
			}
			@Override
			public void fileModified( int watchID, String rootPath, String name )
			{
				File file = new File( rootPath, name );
				if( file.exists() && !file.isDirectory() )
					listener.fileModified( watchIDs.get(watchID)+name );
			}
			@Override
			public void fileRenamed( int watchID, String rootPath, String oldName, String newName )
			{
				listener.fileRenamed( watchIDs.get(watchID)+oldName, watchIDs.get(watchID)+newName );
			}
		};
	}
	
	public MyFileListener( final File root, final MyFileListenerInterface listener )
	{
		this.root = fixRoot( root );
		this.jnotifyListener = new JNotifyListener()
		{
			@Override
			public void fileCreated( int watchID, String rootPath, String name )
			{
				listener.fileChanged( watchIDs.get(watchID)+name );
			}
			@Override
			public void fileDeleted( int watchID, String rootPath, String name )
			{
				listener.fileChanged( watchIDs.get(watchID)+name );
			}
			@Override
			public void fileModified( int watchID, String rootPath, String name )
			{
				File file = new File( rootPath, name );
				if( file.exists() && !file.isDirectory() )
					listener.fileChanged( watchIDs.get(watchID)+name );
			}
			@Override
			public void fileRenamed( int watchID, String rootPath, String oldName, String newName )
			{
				listener.fileChanged( watchIDs.get(watchID)+newName );
			}
		};
	}
	
	
	/** If you call this method when this listener is already listening, nothing will happen. */
	public void start()
	{
		synchronized( watchIDs )
		{
			if( !isListening() )
			{
				try
				{
					startListeningFolders( "", root );
				}
				catch( Exception e )
				{
					stop();
					throw e;
				}
				listening = true;
			}
		}
	}
	private void startListeningFolders( String relativePath, File folder )
	{
		if( folder.isDirectory() )
		{
			try
			{
				watchIDs.put( JNotify.addWatch(folder.getAbsolutePath(), JNotify.FILE_ANY, false, jnotifyListener), relativePath );
			}
			catch( IOException e )
			{
				e.printStackTrace();
			}
			
			File[] files = folder.listFiles();
			if( files != null )
			{
				for( File file : files )
				{
					startListeningFolders( relativePath+file.getName()+"/", file );
				}
			}
		}
	}
	
	/** If you call this method when this listener isn't listening, nothing will happen. */
	public void stop()
	{
		synchronized( watchIDs )
		{
			if( isListening() )
			{
				for( int watchID : watchIDs.keySet() )
				{
					try
					{
						JNotify.removeWatch( watchID );
					}
					catch( IOException e )
					{
					}
				}
				watchIDs.clear();
				listening = false;
			}
		}
	}
	
	
	public File getRoot()
	{
		return root;
	}
	
	public boolean isListening()
	{
		synchronized( watchIDs )
		{
			return listening;
		}
	}
}
