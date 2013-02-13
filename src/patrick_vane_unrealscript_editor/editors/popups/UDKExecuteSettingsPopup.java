package patrick_vane_unrealscript_editor.editors.popups;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;


public class UDKExecuteSettingsPopup extends ExtendablePopup
{
	private static final long	serialVersionUID	= 2238284413436L;
	
	private JComboBox 			dropdownMap;
	private JComboBox 			dropdownMode;
	private JCheckBox 			checkboxDisableSound;
	private JCheckBox 			checkboxDisableStartupVideos;
	private JButton 			buttonRun;
	private JButton 			buttonCancel;
	
	
	public UDKExecuteSettingsPopup()
	{
		super( "UDK Execute Settings", 250, 240 );
		
		
		JLabel labelMap = new JLabel( "Map:" );
		labelMap.setBounds( 25, 26, 38, 14 );
		getContentPane().add( labelMap );
		
		dropdownMap = new JComboBox();
		dropdownMap.setModel( new DefaultComboBoxModel(new String[]{"", "ExampleMap", "EpicCitadel", "DM-Deck"}) );
		dropdownMap.setEditable( true );
		dropdownMap.setToolTipText( "A map from the UDKGame/Content/Maps/ folder" );
		dropdownMap.setBounds( 67, 24, 160, 20 );
		getContentPane().add( dropdownMap );
		
		
		JLabel labelMode = new JLabel( "Mode:" );
		labelMode.setBounds( 25, 60, 36, 14 );
		getContentPane().add( labelMode );
		
		dropdownMode = new JComboBox();
		dropdownMode.setFont( new Font("Tahoma", Font.PLAIN, 11) );
		dropdownMode.setModel( new DefaultComboBoxModel(new String[]{"UTGame.UTDeathmatch", "UTGame.UTTeamGame", "UTGameContent.UTCTFGame_Content", "UTGameContent.UTVehicleCTFGame_Content"}) );
		dropdownMode.setToolTipText( "A game mode" );
		dropdownMode.setEditable( true );
		dropdownMode.setBounds( 67, 58, 160, 20 );
		getContentPane().add( dropdownMode );
		
		
		checkboxDisableSound = new JCheckBox( "disable sound" );
		checkboxDisableSound.setToolTipText( "Disables the ingame sound" );
		checkboxDisableSound.setBounds( 61, 98, 114, 21 );
		getContentPane().add( checkboxDisableSound );
		
		checkboxDisableStartupVideos = new JCheckBox( "disable startup videos" );
		checkboxDisableStartupVideos.setToolTipText( "Disables the startup videos" );
		checkboxDisableStartupVideos.setBounds( 61, 123, 156, 21 );
		getContentPane().add( checkboxDisableStartupVideos );
		
		
		buttonRun = new JButton( "Run" );
		buttonRun.setToolTipText( "Run, Save and Close" );
		buttonRun.setBounds( 87, 168, 89, 23 );
		getContentPane().add( buttonRun );
		
		buttonCancel = new JButton( "Cancel" );
		buttonCancel.setToolTipText( "Close without Saving" );
		buttonCancel.setBounds( 87, 198, 89, 23 );
		getContentPane().add( buttonCancel );
	}
}
