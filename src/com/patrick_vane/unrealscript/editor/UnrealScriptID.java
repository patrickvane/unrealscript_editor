package com.patrick_vane.unrealscript.editor;

import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jdt.ui.JavaUI;


public class UnrealScriptID
{
	public static final String			PROPERTIES						= "patrick_vane_unrealscript_editor.properties";
	public static final String			PERSPECTIVE						= "patrick_vane_unrealscript_editor.editors.perspective.UnrealScriptPerspective";
	public static final String			EDITOR							= "patrick_vane_unrealscript_editor.editors.UnrealScriptEditor";
	
	public static final String			VIEW_NAVIGATOR					= JavaUI.ID_PACKAGES;
	
	public static final String			MARKER_PROBLEM					= "patrick_vane_unrealscript_editor.markers.problem";
	
	public static final String			COMMAND_CATEGORY_UDK			= "patrick_vane_unrealscript_editor.editors.commandcategory.udk";
	public static final String			COMMAND_IMPORT_PROJECT			= "patrick_vane_unrealscript_editor.editors.command.import_project";
	public static final String			COMMAND_COMPILER_SETTINGS		= "patrick_vane_unrealscript_editor.editors.command.compiler_settings";
	public static final String			COMMAND_EXECUTER_SETTINGS		= "patrick_vane_unrealscript_editor.editors.command.executer_settings";
	public static final String			COMMAND_RUN_EDITOR				= "patrick_vane_unrealscript_editor.editors.command.run_editor";
	public static final String			COMMAND_RUN_GAME				= "patrick_vane_unrealscript_editor.editors.command.run_game";
	
	public static final QualifiedName	PROPERTY_FIRST_RUN				= new QualifiedName( PROPERTIES, "first_run" );
	public static final QualifiedName	PROPERTY_IS_UDK_IMPORT			= new QualifiedName( PROPERTIES, "is_udk_import" );
	public static final QualifiedName	PROPERTY_64BIT					= new QualifiedName( PROPERTIES, "64bit" );
	public static final QualifiedName	PROPERTY_STRIP_SOUCE			= new QualifiedName( PROPERTIES, "stip_code" );
	public static final QualifiedName	PROPERTY_GAME_MAP				= new QualifiedName( PROPERTIES, "game_map" );
	public static final QualifiedName	PROPERTY_GAME_MODE				= new QualifiedName( PROPERTIES, "game_mode" );
	public static final QualifiedName	PROPERTY_DISABLE_SOUND			= new QualifiedName( PROPERTIES, "disable_sound" );
	public static final QualifiedName	PROPERTY_DISABLE_STARTUP_VIDEOS	= new QualifiedName( PROPERTIES, "disable_startup_videos" );
}
