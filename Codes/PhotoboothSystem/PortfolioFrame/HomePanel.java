package PortfolioFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

public class HomePanel extends JPanel {
	private ImageIcon logodashboard = new ImageIcon(
	        new ImageIcon(getClass().getResource("/backgroundFrame/background2.jpg"))
	                .getImage().getScaledInstance(1372, 633, Image.SCALE_DEFAULT));
	private ImageIcon pic1 = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\homepanelIcon\\picture1.PNG")
					.getImage().getScaledInstance(385, 305, Image.SCALE_DEFAULT));
	private ImageIcon pic2 = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\homepanelIcon\\picture2.PNG")
					.getImage().getScaledInstance(385, 305, Image.SCALE_DEFAULT));
	private ImageIcon pic3 = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\homepanelIcon\\picture3.PNG")
					.getImage().getScaledInstance(385, 305, Image.SCALE_DEFAULT));
	
	
	// FONTS
		Font Goku, Goku1;
		Font Goku_Stencil;
	
	/**
	 * Create the panel.
	 */
	public HomePanel() {
		
		try {
		    // Load the font file and set its size to 17
		    Goku = Font.createFont(Font.TRUETYPE_FONT, new File("Goku_Stencil.ttf")).deriveFont(55f);
		    Goku1 = Font.createFont(Font.TRUETYPE_FONT, new File("Goku_Stencil.ttf")).deriveFont(34f);
		    
		

		    // Create a bold version of the font
		    Font GokuBold = Goku.deriveFont(Font.BOLD);

		    // Register the font with the graphics environment
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Goku_Stencil")));

		} catch(IOException | FontFormatException e) {
		    // Handle exception
		}
		
		
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1372, 633);
		setLayout(null);
		
		JLabel backgroundlbl = new JLabel();
		//backgroundlbl.setIcon(logodashboard);
		backgroundlbl.setBackground(new Color(255, 255, 255));
		backgroundlbl.setBounds(0, 0, 1372, 633);
		add(backgroundlbl);
		
		JPanel sloganPanel = new JPanel();
		backgroundlbl.add(sloganPanel);
		sloganPanel.setBounds(240, 25, 857, 154);
		sloganPanel.setOpaque(false);
		sloganPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Blissfull Shots Photobooth.");
		lblNewLabel.setFont(Goku);
		lblNewLabel.setBounds(109, 0, 748, 108);
		sloganPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\"Capturing your moments of joy, one snapshot at a time\"");
		lblNewLabel_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_1.setFont(Goku1);
		lblNewLabel_1.setBounds(27, 101, 830, 53);
		sloganPanel.add(lblNewLabel_1);
		
		
								
		JPanel qrcodePanel = new JPanel();
		backgroundlbl.add(qrcodePanel);
		qrcodePanel.setBounds(1141, 0, 96, 113);
		qrcodePanel.setOpaque(false);
		qrcodePanel.setLayout(null);
		

		
		JPanel picpanel = new JPanel();
		add(picpanel);
		picpanel.setBounds(75, 240, 1154, 305);
		picpanel.setLayout(null);
		picpanel.setOpaque(false);
		
		JLabel pic1lbl = new JLabel("");
		pic1lbl.setBounds(0, 0, 393, 305);
		pic1lbl.setIcon(pic1);
		picpanel.add(pic1lbl);
		
		JLabel pic2lbl = new JLabel("");
		pic2lbl.setIcon(pic2);
		pic2lbl.setBounds(385, 0, 393, 305);
		picpanel.add(pic2lbl);
		
		JLabel pic3lbl = new JLabel("");
		pic3lbl.setIcon(pic3);
		pic3lbl.setBounds(769, 0, 385, 305);
		picpanel.add(pic3lbl);

		
		
	}

}
