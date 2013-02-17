package patrick_vane_unrealscript_editor.editors.popups;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import patrick_vane_unrealscript_editor.editors.UnrealScriptID;


public class UDKExecuteSettingsPopup extends ExtendablePopup
{
	private static final long	serialVersionUID	= 2238284413436L;
	
	private IProject 			project;
	
	private JComboBox 			dropdownMap;
	private JComboBox 			dropdownMode;
	private JCheckBox 			checkboxDisableSound;
	private JCheckBox 			checkboxDisableStartupVideos;
	private JButton 			buttonSave;
	private JButton 			buttonCancel;
	
	
	public UDKExecuteSettingsPopup( IProject project )
	{
		super( "UDK Execute Settings", 305, 245 );
		
		this.project = project;
		
		String map;
		String mode;
		boolean disableSound;
		boolean disableStartupVideos;
		try
		{
			map  = project.getPersistentProperty( UnrealScriptID.PROPERTY_GAME_MAP );
			mode = project.getPersistentProperty( UnrealScriptID.PROPERTY_GAME_MODE );
			disableSound = Boolean.parseBoolean( project.getPersistentProperty(UnrealScriptID.PROPERTY_DISABLE_SOUND) );
			disableStartupVideos = Boolean.parseBoolean( project.getPersistentProperty(UnrealScriptID.PROPERTY_DISABLE_STARTUP_VIDEOS) );
		}
		catch( CoreException e )
		{
			map = null;
			mode = null;
			disableSound = false;
			disableStartupVideos = false;
			
			JOptionPane.showMessageDialog
			( 
				this, 
				"Failed to load settings: "+e.getMessage()+"\nDefault settings have been load.", 
				"Warning",
				JOptionPane.WARNING_MESSAGE
			);
		}
		if( map == null )
			map = "ExampleMap";
		if( mode == null )
			mode = "UTGame.UTDeathmatch";
		
		
		JLabel labelMap = new JLabel( "Map:" );
		labelMap.setBounds( 23, 26, 38, 14 );
		getContentPane().add( labelMap );
		
		dropdownMap = new JComboBox();
		dropdownMap.setModel( new DefaultComboBoxModel(new String[]{"ExampleMap", "EpicCitadel", "DM-Deck"}) );
		dropdownMap.setEditable( true );
		dropdownMap.setToolTipText( "A map from the UDKGame/Content/Maps/ folder" );
		dropdownMap.setBounds( 67, 24, 217, 20 );
		dropdownMap.setSelectedItem( map );
		getContentPane().add( dropdownMap );
		
		
		JLabel labelMode = new JLabel( "Mode:" );
		labelMode.setBounds( 23, 60, 36, 14 );
		getContentPane().add( labelMode );
		
		dropdownMode = new JComboBox();
		dropdownMode.setModel( new DefaultComboBoxModel(new String[]{"UTGame.UTDeathmatch", "UTGame.UTTeamGame", "UTGameContent.UTCTFGame_Content", "UTGameContent.UTVehicleCTFGame_Content"}) );
		dropdownMode.setToolTipText( "A game mode" );
		dropdownMode.setEditable( true );
		dropdownMode.setBounds( 67, 58, 217, 20 );
		dropdownMode.setSelectedItem( mode );
		dropdownMode.setFont( new Font(dropdownMode.getFont().getFontName(), dropdownMode.getFont().getStyle(), (int) Math.round(dropdownMode.getFont().getSize()*0.75)) );
		getContentPane().add( dropdownMode );
		
		
		checkboxDisableSound = new JCheckBox( "disable sound" );
		checkboxDisableSound.setToolTipText( "Disables the ingame sound" );
		checkboxDisableSound.setBounds( 86, 98, 114, 21 );
		checkboxDisableSound.setSelected( disableSound );
		getContentPane().add( checkboxDisableSound );
		
		checkboxDisableStartupVideos = new JCheckBox( "disable startup videos" );
		checkboxDisableStartupVideos.setToolTipText( "Disables the startup videos" );
		checkboxDisableStartupVideos.setBounds( 86, 123, 156, 21 );
		checkboxDisableStartupVideos.setSelected( disableStartupVideos );
		getContentPane().add( checkboxDisableStartupVideos );
		
		buttonSave = new JButton( "Save" );
		buttonSave.setToolTipText( "Save and Close" );
		buttonSave.setBounds( 112, 173, 89, 23 );
		buttonSave.addActionListener( listenerSave );
		getContentPane().add( buttonSave );
		
		buttonCancel = new JButton( "Cancel" );
		buttonCancel.setToolTipText( "Close without Saving" );
		buttonCancel.setBounds( 112, 202, 89, 23 );
		buttonCancel.addActionListener( listenerCancel );
		getContentPane().add( buttonCancel );
	}
	
	
	private boolean save()
	{
		try
		{
			project.setPersistentProperty( UnrealScriptID.PROPERTY_GAME_MAP, (String) dropdownMap.getSelectedItem() );
			project.setPersistentProperty( UnrealScriptID.PROPERTY_GAME_MODE, (String) dropdownMode.getSelectedItem() );
			project.setPersistentProperty( UnrealScriptID.PROPERTY_DISABLE_SOUND, Boolean.toString(checkboxDisableSound.isSelected()) );
			project.setPersistentProperty( UnrealScriptID.PROPERTY_DISABLE_STARTUP_VIDEOS, Boolean.toString(checkboxDisableStartupVideos.isSelected()) );
			return true;
		}
		catch( CoreException e )
		{
			JOptionPane.showMessageDialog
			( 
				this, 
				"Failed to save settings: "+e.getMessage(), 
				"Error",
				JOptionPane.ERROR_MESSAGE
			);
			return false;
		}
	}
	
	
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
