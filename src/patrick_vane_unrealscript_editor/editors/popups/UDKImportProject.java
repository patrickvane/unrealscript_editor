package patrick_vane_unrealscript_editor.editors.popups;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;


public class UDKImportProject extends JDialog
{
	private static final long	serialVersionUID	= 52325323552556L;
	
	private JTextField			inputNewProjectName;
	private JTextField			inputInstallationPath;
	private JButton				buttonInstallationPathBrowse;
	private JButton				buttonImport;
	private JButton				buttonCancel;
	
	private boolean 			done;
	private boolean 			canceled;
	
	
	public UDKImportProject( String name, String path )
	{
		setTitle( "Import UDK Project" );
		setType( Type.NORMAL );
		setAlwaysOnTop( true );
		getContentPane().setLayout( null );
		getContentPane().setPreferredSize( new Dimension(340, 135) );
		pack();
		setLocationRelativeTo( null );
		setAutoRequestFocus( true );
		
		addWindowListener
		(
			new WindowAdapter()
			{
				@Override
				public void windowClosing( WindowEvent e )
				{
					done = true;
					canceled = true;
				}
			}
		);
		
		
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
	
	
	@Override
	public void setVisible( boolean visible )
	{
		if( visible == false )
		{
			super.setVisible( false );
			return;
		}
		
		done = false;
		canceled = false;
		
		new Thread()
		{
			@Override
			public void run()
			{
				UDKImportProject.super.setVisible( true );
			}
		}.start();
		
		while( !isDone() )
		{
			try
			{
				Thread.sleep( 200 );
			}
			catch( Exception e )
			{
			}
		}
		super.setVisible( false );
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
			done = true;
			canceled = false;
		}
	};
	
	private ActionListener listenerCancel = new ActionListener()
	{
		@Override
		public void actionPerformed( ActionEvent e )
		{
			done = true;
			canceled = true;
		}
	};
	
	
	public boolean isDone()
	{
		return done;
	}
	public boolean isCanceled()
	{
		return canceled;
	}
	
	public String getNewProjectName()
	{
		return inputNewProjectName.getText();
	}
	public String getInstallationPath()
	{
		return inputInstallationPath.getText();
	}
}
