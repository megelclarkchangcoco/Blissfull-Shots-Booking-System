package Dashboard;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelHome extends JPanel {
	
	public ImageIcon homeImage = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\viewFramepic\\Logo.jpg")
					.getImage().getScaledInstance(1150, 628, Image.SCALE_DEFAULT));
	private JLabel forLogo;
	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBackground(new Color(192, 192, 192));
		setBounds(196, 90, 1084, 628);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(-20, 0, 1150, 628);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel imageLbl = new JLabel();
		imageLbl.setBounds(-20, 0, 1150, 628);
		imageLbl.setIcon(homeImage);
		mainPanel.add(imageLbl);	
		
	}

}
