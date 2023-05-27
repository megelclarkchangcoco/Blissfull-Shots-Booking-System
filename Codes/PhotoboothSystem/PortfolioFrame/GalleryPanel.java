package PortfolioFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class GalleryPanel extends JPanel {
	
	private ImageIcon pic1 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\picture1.jpg")
					.getImage().getScaledInstance(402,  233, Image.SCALE_DEFAULT));
	private ImageIcon pic2 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\try.jpg")
					.getImage().getScaledInstance(475,  314, Image.SCALE_DEFAULT));
	private ImageIcon pic3 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\picture10.jpg")
					.getImage().getScaledInstance(402, 233, Image.SCALE_DEFAULT));
	private ImageIcon pic4 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\Picture3.PNG")
					.getImage().getScaledInstance(402, 455, Image.SCALE_DEFAULT));
	private ImageIcon pic5 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\picture12.jpg")
					.getImage().getScaledInstance(475, 330, Image.SCALE_DEFAULT));
	private ImageIcon pic6 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\picture11.jpg")
					.getImage().getScaledInstance(402, 445, Image.SCALE_DEFAULT));
	private ImageIcon pic7 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\picture17.PNG")
					.getImage().getScaledInstance(402, 445, Image.SCALE_DEFAULT));
	private ImageIcon pic8 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\picture16.PNG")
					.getImage().getScaledInstance(475, 478, Image.SCALE_DEFAULT));
	private ImageIcon pic9 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\GalleryImage\\picture18.PNG")
					.getImage().getScaledInstance(402, 445, Image.SCALE_DEFAULT));

	/**
	 * Create the panel.
	 */
	public GalleryPanel() { 
		setBackground(new Color(255, 255, 255));
		setBounds(0, 100, 1280, 618);
		setLayout(null);
		
		JLabel backgroundlbl = new JLabel("");
	    backgroundlbl.setEnabled(false);
	    backgroundlbl.setBackground(new Color(102, 244, 222));
	    backgroundlbl.setBounds(0, 0, 1280, 607);
	    add(backgroundlbl);
	    
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(0, 0, 1280, 607);
	    scrollPane.setBackground(new Color(225, 254, 253));
	    backgroundlbl.add(scrollPane);

	    JPanel scrollContent = new JPanel();
	    scrollContent.setBackground(new Color(255, 255, 255));
	    scrollContent.setLayout(null);
	    scrollContent.setPreferredSize(new Dimension(1271, 1126)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);

	    JLabel pic1lbl = new JLabel("");
	    pic1lbl.setIcon(pic1);
	    pic1lbl.setBounds(0, 0, 402, 233);
	    scrollContent.add(pic1lbl);

	    JLabel pic2lbl = new JLabel("");
	    pic2lbl.setBounds(401, 0, 475, 314);
	    pic2lbl.setIcon(pic2);
	    scrollContent.add(pic2lbl);

	    JLabel pic3lbl = new JLabel("");
	    pic3lbl.setIcon(pic3);
	    pic3lbl.setBounds(869, 0, 402, 233);
	    scrollContent.add(pic3lbl);

	    JLabel pic4lbl = new JLabel("");
	    pic4lbl.setIcon(pic4);
	    pic4lbl.setBounds(0, 233, 402, 445);
	    scrollContent.add(pic4lbl);

	    JLabel pic5lbl = new JLabel("");
	    pic5lbl.setIcon(pic5);
	    pic5lbl.setBounds(401, 314, 475, 330);
	    scrollContent.add(pic5lbl);

	    JLabel pic6lbl = new JLabel("");
	    pic6lbl.setIcon(pic6);
	    pic6lbl.setBounds(869, 221, 402, 445);
	    scrollContent.add(pic6lbl);

	    JLabel pic7lbl = new JLabel("");
	    pic7lbl.setIcon(pic7);
	    pic7lbl.setBounds(0, 678, 402, 445);
	    scrollContent.add(pic7lbl);

	    JLabel pic8lbl = new JLabel("");
	    pic8lbl.setIcon(pic8);
	    pic8lbl.setBounds(401, 645, 475, 478);
	    scrollContent.add(pic8lbl);

	    JLabel pic9lbl = new JLabel("");
	    pic9lbl.setIcon(pic9);
	    pic9lbl.setBounds(869, 678, 402, 445);
	    scrollContent.add(pic9lbl);

	    scrollPane.setPreferredSize(new Dimension(1271, 500)); // set the size of the scroll pane to fit the labels
		
	}
}
