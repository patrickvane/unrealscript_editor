package com.patrick_vane.unrealscript.editor.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsoleConstants;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.constants.UnrealScriptID;


public class UDKPerspective implements IPerspectiveFactory
{
	@Override
	public void createInitialLayout( IPageLayout layout )
	{
		UnrealScriptEditor.initStaticClasses();
		
		IFolderLayout left = layout.createFolder( "left", IPageLayout.LEFT, 0.25f, layout.getEditorArea() );
		left.addView( UnrealScriptID.VIEW_NAVIGATOR );
		left.addView( UnrealScriptID.VIEW_TYPE_HIERARCHY );
		
		IFolderLayout right = layout.createFolder( "right", IPageLayout.RIGHT, 0.75f, layout.getEditorArea() );
		right.addView( IPageLayout.ID_OUTLINE );
		
		IFolderLayout bottom = layout.createFolder( "bottom", IPageLayout.BOTTOM, 0.70f, layout.getEditorArea() );
		bottom.addView( IPageLayout.ID_PROBLEM_VIEW );
		bottom.addView( IConsoleConstants.ID_CONSOLE_VIEW );
		bottom.addView( IPageLayout.ID_PROGRESS_VIEW );
	}
	
	
	public static boolean isActive()
	{
		UnrealScriptEditor.initStaticClasses();
		
		try
		{
			IPerspectiveDescriptor perspective = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getPerspective();
			String perspectiveId = perspective.getId();
			return perspectiveId.equalsIgnoreCase( UnrealScriptID.PERSPECTIVE );
		}
		catch( Exception e ) // NullPointers, RuntimeExceptions
		{
			return false;
		}
	}
}