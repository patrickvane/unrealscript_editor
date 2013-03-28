package com.patrick_vane.unrealscript.editor;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.PlatformUI;


public class UnrealScriptStartup implements IStartup
{
	@Override
	public void earlyStartup()
	{
		new Thread()
		{
			@Override
			public void run()
			{
				Display.getDefault().syncExec
				(
					new Runnable()
					{
						@Override
						public void run()
						{
							try
							{
								if( UnrealScriptEditor.getRoot().getPersistentProperty(UnrealScriptID.PROPERTY_FIRST_RUN) != null )
									return;
								UnrealScriptEditor.getRoot().setPersistentProperty( UnrealScriptID.PROPERTY_FIRST_RUN, "true" );
							}
							catch( Exception e )
							{
							}
							
							try
							{
								String perspective = PlatformUI.getWorkbench().getPerspectiveRegistry().getDefaultPerspective();
								try
								{
									perspective = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getPerspective().getId();
								}
								catch( Exception e )
								{
								}
								
								try
								{
									PlatformUI.getWorkbench().showPerspective( UnrealScriptID.PERSPECTIVE, PlatformUI.getWorkbench().getActiveWorkbenchWindow() );
								}
								catch( Exception e )
								{
								}
								
								PlatformUI.getWorkbench().showPerspective( perspective, PlatformUI.getWorkbench().getActiveWorkbenchWindow() );
							}
							catch( Exception e )
							{
							}
						}
					}
				);
			}
		}.start();
	}
}
