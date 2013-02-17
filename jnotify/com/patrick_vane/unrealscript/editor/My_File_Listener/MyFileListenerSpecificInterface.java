package com.patrick_vane.unrealscript.editor.My_File_Listener;


public interface MyFileListenerSpecificInterface
{
	public void fileCreated( String name );
	public void fileDeleted( String name );
	public void fileModified( String name );
	public void fileRenamed( String oldName, String newName );
}
