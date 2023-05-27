package PortfolioFrame;

import java.awt.Color;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class InfoPanel extends JPanel {
	
	private ImageIcon maps = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\map.PNG")
					.getImage().getScaledInstance(876, 439, Image.SCALE_DEFAULT));
	private ImageIcon point = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\placeholder.PNG")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	private ImageIcon gmail = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\gmail.PNG")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	private ImageIcon telephone = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\telephone.png")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	private ImageIcon facebook = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\infopanelImga\\facebook.PNG")
					.getImage().getScaledInstance(46, 44, Image.SCALE_DEFAULT));
	
	/**
	 * Create the panel.
	 */
	public InfoPanel() {
		setBackground(new Color(244, 252, 239));
		setBounds(0, 100, 1280, 618);
		setLayout(null);
		
		JPanel mappanel = new JPanel();
		mappanel.setOpaque(false);
		mappanel.setBounds(180, 21, 876, 439);
		add(mappanel);
		mappanel.setLayout(null);
		
		JLabel maplbl = new JLabel("");
		maplbl.setIcon(maps);
		maplbl.setBounds(0, 0, 876, 439);
		mappanel.add(maplbl);
		
		JPanel contactpanel = new JPanel();
		contactpanel.setOpaque(false);
		contactpanel.setBounds(180, 471, 876, 136);
		add(contactpanel);
		contactpanel.setLayout(null);
		
		JLabel icon1lbl = new JLabel("");
		icon1lbl.setIcon(point);
		icon1lbl.setBounds(10, 11, 46, 44);
		contactpanel.add(icon1lbl);
		
		JLabel lblNewLabel = new JLabel("1360 Quiricada St. Manila, Phillipines, 1013");
		lblNewLabel.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel.setBounds(66, 22, 309, 33);
		contactpanel.add(lblNewLabel);
		
		JLabel icon2lbl = new JLabel("");
		icon2lbl.setIcon(gmail);
		icon2lbl.setBounds(10, 69, 46, 44);
		contactpanel.add(icon2lbl);
		
		JLabel lblNewLabel2 = new JLabel("blissfulshotsphotobooth@gmail.com");
		lblNewLabel2.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel2.setBounds(66, 80, 309, 33);
		contactpanel.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("0916-296-0814 |  0947-601-4387");
		lblNewLabel3.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel3.setBounds(535, 80, 309, 33);
		contactpanel.add(lblNewLabel3);
		
		JLabel icon3lbl = new JLabel("");
		icon3lbl.setIcon(telephone);
		icon3lbl.setBounds(479, 69, 46, 44);
		contactpanel.add(icon3lbl);
		
		JLabel icon4lbl = new JLabel("");
		icon4lbl.setIcon(facebook);
		icon4lbl.setBounds(479, 11, 46, 44);
		contactpanel.add(icon4lbl);
		
		JLabel lblNewLabel4 = new JLabel("Blissful Shots Photobooth");
		lblNewLabel4.setFont(new Font("Anton", Font.PLAIN, 18));
		lblNewLabel4.setBounds(535, 22, 309, 33);
		contactpanel.add(lblNewLabel4);
	}

}
