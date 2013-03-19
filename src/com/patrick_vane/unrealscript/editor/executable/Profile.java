package com.patrick_vane.unrealscript.editor.executable;

import java.io.Serializable;


public class Profile implements Serializable
{
	private static final long		serialVersionUID				= 4812543818142677292L;
	
	public static final String		DEFAULT_MAP						= "ExampleMap";
	public static final String		DEFAULT_MODE					= "UTGame.UTDeathmatch";
	public static final String		DEFAULT_EXTRA_ARGS				= "";
	public static final boolean 	DEFAULT_DISABLE_SOUND			= false;
	public static final boolean 	DEFAULT_DISABLE_STARTUP_VIDEOS	= true;
	
	public String					map;
	public String					mode;
	public String					extraArgs;
	public boolean					disableSound;
	public boolean					disableStartupVideos;
	
	
	public Profile()
	{
		map 						= DEFAULT_MAP;
		mode 						= DEFAULT_MODE;
		extraArgs 					= DEFAULT_EXTRA_ARGS;
		disableSound 				= DEFAULT_DISABLE_SOUND;
		disableStartupVideos 		= DEFAULT_DISABLE_STARTUP_VIDEOS;
	}
	public Profile( String map, String mode, String extraArgs, boolean disableSound, boolean disableStartupVideos )
	{
		this.map 					= map;
		this.mode 					= mode;
		this.extraArgs 				= extraArgs;
		this.disableSound 			= disableSound;
		this.disableStartupVideos 	= disableStartupVideos;
	}
}