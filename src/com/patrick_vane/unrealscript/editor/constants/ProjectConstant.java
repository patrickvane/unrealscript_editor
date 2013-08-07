package com.patrick_vane.unrealscript.editor.constants;

import java.util.HashMap;


public class ProjectConstant
{
	public static final HashMap<String,String>		subfolders			= new HashMap<String,String>();
	public static final HashMap<String,String>		neededSubfolders	= new HashMap<String,String>();
	public static final HashMap<String,String[]>	hiddensubfolders	= new HashMap<String,String[]>();
	
	
	static
	{
		addFolder( false, "BaseConfig", "Engine/Config" );
		addFolder( false, "Config", "UDKGame/Config" );
		addFolder( false, "Content", "UDKGame/Content", new String[]{"Maps"} );
		addFolder( false, "DLLs", "Binaries/Win32/UserCode" );
		addFolder( false, "Logs", "UDKGame/Logs" );
		addFolder( false, "Flash", "UDKGame/Flash" );
		addFolder( false, "Maps", "UDKGame/Content/Maps" );
		addFolder( false, "Movies", "UDKGame/Movies" );
		addFolder( true,  "UnrealScript", "Development/Src" );
	}
	
	private static void addFolder( boolean needed, String name, String path )
	{
		subfolders.put( name, path );
		if( needed )
			neededSubfolders.put( name, path );
	}
	private static void addFolder( boolean needed, String name, String path, String[] hide )
	{
		subfolders.put( name, path );
		hiddensubfolders.put( path, hide );
		if( needed )
			neededSubfolders.put( name, path );
	}
}
