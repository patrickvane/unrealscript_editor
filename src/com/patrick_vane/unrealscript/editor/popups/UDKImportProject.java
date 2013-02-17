package com.patrick_vane.unrealscript.editor.popups;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class UDKImportProject extends ExtendablePopup
{
	private static final long	serialVersionUID	= 52325323552556L;
	
	private JTextField			inputNewProjectName;
	private JTextField			inputInstallationPath;
	private JButton				buttonInstallationPathBrowse;
	private JButton				buttonImport;
	private JButton				buttonCancel;
	
	
	public UDKImportProject( String name, String path )
	{
		super( "Import UDK Project", 340, 135 );
		
		
		if( name == null )
			name = "My UDK Project";
		if( path == null )
			path = "C:/UDK/";
		
		
		inputNewProjectName = new JTextField();
		inputNewProjectName.setBounds( 20, 20, 221, 23 );
		inputNewProjectName.setToolTipText( "Name of the new UDK Project (in Eclipse)" );
		inputNewProjectName.setText( name );
		getContentPane().add( inputNewProjectName );
		
		inputInstallationPath = new JTextField();
		inputInstallationPath.setToolTipText( "Path of UDK Installation" );
		inputInstallationPath.setText( path );
		inputInstallationPath.setBounds( 20, 49, 221, 23 );
		getContentPane().add( inputInstallationPath );
		
		buttonInstallationPathBrowse = new JButton( "Browse" );
		buttonInstallationPathBrowse.setToolTipText( "Browse for the UDK Installation Path" );
		buttonInstallationPathBrowse.setBounds( 242, 49, 78, 22 );
		buttonInstallationPathBrowse.addActionListener( listenerInstallationPathBrowse );
		getContentPane().add( buttonInstallationPathBrowse );
		
		
		buttonImport = new JButton( "Import" );
		buttonImport.setToolTipText( "Import Project" );
		buttonImport.setBounds( 34, 97, 99, 23 );
		buttonImport.addActionListener( listenerImport );
		getContentPane().add( buttonImport );
		
		buttonCancel = new JButton( "Cancel" );
		buttonCancel.setToolTipText( "Cancel" );
		buttonCancel.setBounds( 208, 96, 99, 23 );
		buttonCancel.addActionListener( listenerCancel );
		getContentPane().add( buttonCancel );
	}
	
	
	private ActionListener listenerInstallationPathBrowse = new ActionListener()
	{
		@Override
		public void actionPerformed( ActionEvent e )
		{
			JFileChooser dialog = new JFileChooser();
			dialog.setDialogTitle( "UDK Installation Path" );
			dialog.setDialogType( JFileChooser.OPEN_DIALOG );
			dialog.setMultiSelectionEnabled( false );
			dialog.setFileSelectionMode( JFileChooser.DIRECTORIES_ONLY );
			
			File file = new File( inputInstallationPath.getText() );
			while( file != null )
			{
				if( file.exists() )
				{
					if( file.isDirectory() )
						dialog.setCurrentDirectory( file );
					else
						dialog.setSelectedFile( file );
					break;
				}
				file = file.getParentFile();
			}
			
			dialog.showOpenDialog( UDKImportProject.this );
			if( dialog.getSelectedFile() != null )
			{
				inputInstallationPath.setText( dialog.getSelectedFile().getAbsolutePath() );
			}
		}
	};
	
	private ActionListener listenerImport = new ActionListener()
	{
		@Override
		public void actionPerformed( ActionEvent e )
		{
			success();
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
	
	
	public String getNewProjectName()
	{
		return inputNewProjectName.getText();
	}
	public String getInstallationPath()
	{
		return inputInstallationPath.getText();
	}
}
