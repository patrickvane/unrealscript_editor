package com.patrick_vane.unrealscript.editor.popups;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import com.patrick_vane.unrealscript.editor.UnrealScriptEditor;
import com.patrick_vane.unrealscript.editor.constants.UnrealScriptID;
import com.patrick_vane.unrealscript.editor.executable.UDKCompiler;


public class UDKCompilerSettingsPopup extends ExtendablePopup
{
	private static final long	serialVersionUID	= 6238284241701313436L;
	
	private IProject 			project;
	
	private JCheckBox 			checkbox64Bit;
	private JCheckBox 			checkboxStripSource;
	private JCheckBox 			checkboxDebug;
	private JButton 			buttonFullRebuild;
	private JButton 			buttonSave;
	private JButton 			buttonCancel;
	
	
	public UDKCompilerSettingsPopup( IProject project )
	{
		super( "UDK Compiler Settings", 135, 227 );
		
		this.project = project;
		
		boolean bit64;
		boolean stripsource;
		boolean debug;
		try
		{
			bit64 = UnrealScriptEditor.parseBoolean( project, UnrealScriptID.PROPERTY_64BIT, false );
			stripsource = UnrealScriptEditor.parseBoolean( project, UnrealScriptID.PROPERTY_STRIP_SOUCE, false );
			debug = UnrealScriptEditor.parseBoolean( project, UnrealScriptID.PROPERTY_DEBUG, true );
		}
		catch( CoreException e )
		{
			bit64 = false;
			stripsource = false;
			debug = true;
			
			JOptionPane.showMessageDialog
			( 
				this, 
				"Failed to load compiler settings: "+e.getMessage()+"\nDefault compiler settings have been load.", 
				"Warning",
				JOptionPane.WARNING_MESSAGE
			);
		}
		
		checkbox64Bit = new JCheckBox( "64 bit" );
		checkbox64Bit.setToolTipText( "Uses the 64 bit UDK.exe" );
		checkbox64Bit.setBounds( 21, 23, 62, 21 );
		checkbox64Bit.setSelected( bit64 );
		getContentPane().add( checkbox64Bit );
		
		checkboxStripSource = new JCheckBox( "strip source" );
		checkboxStripSource.setToolTipText( "Removes the source from the compiled .u files (it won't remove comments!)" );
		checkboxStripSource.setBounds( 21, 50, 102, 21 );
		checkboxStripSource.setSelected( stripsource );
		getContentPane().add( checkboxStripSource );
		
		checkboxDebug = new JCheckBox( "debug" );
		checkboxDebug.setToolTipText( "Compiles using the -debug command" );
		checkboxDebug.setBounds( 21, 77, 102, 21 );
		checkboxDebug.setSelected( debug );
		getContentPane().add( checkboxDebug );
		
		buttonFullRebuild = new JButton( "Full Rebuild" );
		buttonFullRebuild.setToolTipText( "Save, Close and Full Rebuild" );
		buttonFullRebuild.setBounds( 18, 119, 99, 23 );
		buttonFullRebuild.addActionListener( listenerFullRebuild );
		getContentPane().add( buttonFullRebuild );
		
		buttonSave = new JButton( "Save" );
		buttonSave.setToolTipText( "Save and close" );
		buttonSave.setBounds( 18, 158, 99, 23 );
		buttonSave.addActionListener( listenerSave );
		getContentPane().add( buttonSave );
		
		buttonCancel = new JButton( "Cancel" );
		buttonCancel.setToolTipText( "Close without saving" );
		buttonCancel.setBounds( 18, 188, 99, 23 );
		buttonCancel.addActionListener( listenerCancel );
		getContentPane().add( buttonCancel );
	}
	
	
	private boolean save()
	{
		try
		{
			project.setPersistentProperty( UnrealScriptID.PROPERTY_64BIT, Boolean.toString(checkbox64Bit.isSelected()) );
			project.setPersistentProperty( UnrealScriptID.PROPERTY_STRIP_SOUCE, Boolean.toString(checkboxStripSource.isSelected()) );
			project.setPersistentProperty( UnrealScriptID.PROPERTY_DEBUG, Boolean.toString(checkboxDebug.isSelected()) );
			return true;
		}
		catch( CoreException e )
		{
			JOptionPane.showMessageDialog
			( 
				this, 
				"Failed to save compiled settings: "+e.getMessage(), 
				"Error",
				JOptionPane.ERROR_MESSAGE
			);
			return false;
		}
	}
	
	
	private ActionListener listenerFullRebuild = new ActionListener()
	{
		@Override
		public void actionPerformed( ActionEvent e )
		{
			if( save() )
			{
				success();
				UDKCompiler.compileForced( project, "-full" );
			}
		}
	};
	
	private ActionListener listenerSave = new ActionListener()
	{
		@Override
		public void actionPerformed( ActionEvent e )
		{
			if( save() )
			{
				success();
			}
		}
	};
	
	private ActionListener listenerCancel = new ActionListener()
	{
		@Override
		public void actionPerformed( ActionEvent e )
		{
			cancel();
		}
	};
}
