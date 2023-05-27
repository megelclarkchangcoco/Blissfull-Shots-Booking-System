package PortfolioFrame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

public class FeebackPanel extends JPanel {

	// images
		private ImageIcon stars = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\star.png")
						.getImage().getScaledInstance(30, 33, Image.SCALE_DEFAULT));
		private ImageIcon Circle = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\s.PNG")
						.getImage().getScaledInstance(204, 209, Image.SCALE_DEFAULT));
		private ImageIcon panels = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\panels.png")
						.getImage().getScaledInstance(533, 68, Image.SCALE_DEFAULT));
		private ImageIcon profile1 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile1.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile2 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile2.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile3 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile3.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile4 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile4.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile5 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile5.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
		private ImageIcon profile6 = new ImageIcon(
				new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\feedbackpanelimga\\profile6.PNG")
						.getImage().getScaledInstance(109, 94, Image.SCALE_DEFAULT));
	/**
	 * Create the panel.
	 */
	public FeebackPanel() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 100, 1280, 618);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1280, 718);		
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(new Color(102, 244, 222));
		leftPanel.setBounds(0, 0, 224, 607);
		mainPanel.add(leftPanel);
		leftPanel.setLayout(null);
		
		JLabel ratingslbl = new JLabel("Ratings 5.0");
		ratingslbl.setForeground(new Color(255, 255, 255));
		ratingslbl.setFont(new Font("Anton", Font.PLAIN, 20));
		ratingslbl.setBounds(10, 65, 106, 33);
		leftPanel.add(ratingslbl);
		
		JLabel startlbl = new JLabel("");
		startlbl.setIcon(stars);
		startlbl.setFont(new Font("Anton", Font.PLAIN, 20));
		startlbl.setBounds(105, 65, 30, 33);
		leftPanel.add(startlbl);
		
		JLabel ratinglbl = new JLabel("");
		ratinglbl.setIcon(Circle);
		ratinglbl.setBounds(10, 109, 204, 209);
		leftPanel.add(ratinglbl);
		
		JLabel lblNewLabel = new JLabel("95%");
		lblNewLabel.setFont(new Font("Anton", Font.PLAIN, 38));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(70, 179, 81, 76);
		leftPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Show Data");
		lblNewLabel_1.setFont(new Font("Anton", Font.PLAIN, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 316, 99, 45);
		leftPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("2018-2023");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Anton", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(105, 316, 99, 45);
		leftPanel.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(223, 0, 1057, 607);
	    scrollPane.setBackground(new Color(225, 254, 253));
	    mainPanel.add(scrollPane);
	    
	    JPanel scrollContent = new JPanel();
	    scrollContent.setBackground(new Color(255, 255, 255));
	    scrollContent.setLayout(null);
	    scrollContent.setPreferredSize(new Dimension(1001, 1129)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);
	    
	    JPanel feedbackpanel1 = new JPanel();
	    feedbackpanel1.setOpaque(false);
	    feedbackpanel1.setBounds(35, 43, 982, 120);
	    scrollContent.add(feedbackpanel1);
	    feedbackpanel1.setLayout(null);
	    
	    JLabel profile1lbl = new JLabel("");
	    profile1lbl.setIcon(profile1);
	    profile1lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel1.add(profile1lbl);
	    
	    JLabel profilename1lbl = new JLabel("Lea Aleria");
	    profilename1lbl.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename1lbl.setBounds(135, 11, 131, 34);
	    feedbackpanel1.add(profilename1lbl);

	    JPanel panel = new JPanel();
	    panel.setBounds(121, 56, 366, 53);
	    feedbackpanel1.add(panel);
	    panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel.setLayout(null);

	    
	    JLabel feedbacktextlbl = new JLabel("Value for money. Courteos staff.");
	    feedbacktextlbl.setBounds(10, 11, 232, 28);
	    panel.add(feedbacktextlbl);
	    feedbacktextlbl.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl.setForeground(new Color(0, 0, 0));
	    
	    JPanel feedbackpanel2 = new JPanel();
	    feedbackpanel2.setLayout(null);
	    feedbackpanel2.setOpaque(false);
	    feedbackpanel2.setBounds(35, 189, 708, 172);
	    scrollContent.add(feedbackpanel2);
	    
	    JLabel profile2lbl = new JLabel("");
	    profile2lbl.setIcon(profile2);
	    profile2lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel2.add(profile2lbl);
	    
	    JLabel profilename1lbl_1 = new JLabel("Angelyne Yu-Cheng");
	    profilename1lbl_1.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename1lbl_1.setBounds(135, 11, 214, 34);
	    feedbackpanel2.add(profilename1lbl_1);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setLayout(null);
	    panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel_1.setBounds(121, 56, 369, 94);
	    feedbackpanel2.add(panel_1);
	    
	    JLabel feedbacktextlbl_1 = new JLabel("Great quality in affordable price!,");
	    feedbacktextlbl_1.setForeground(Color.BLACK);
	    feedbacktextlbl_1.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl_1.setBounds(10, 11, 349, 28);
	    panel_1.add(feedbacktextlbl_1);
	    
	    JLabel feedbacktextlbl_1_1 = new JLabel("Thankyou you Blissful Shots");
	    feedbacktextlbl_1_1.setForeground(Color.BLACK);
	    feedbacktextlbl_1_1.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl_1_1.setBounds(10, 50, 349, 28);
	    panel_1.add(feedbacktextlbl_1_1);
	    
	    JPanel feedbackpanel2_1 = new JPanel();
	    feedbackpanel2_1.setLayout(null);
	    feedbackpanel2_1.setOpaque(false);
	    feedbackpanel2_1.setBounds(35, 388, 708, 172);
	    scrollContent.add(feedbackpanel2_1);
	    
	    JLabel profile3lbl = new JLabel("");
	    profile3lbl.setIcon(profile3);
	    profile3lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel2_1.add(profile3lbl);
	    
	    JLabel profilename1lbl_1_1 = new JLabel("Roselle Castillo");
	    profilename1lbl_1_1.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename1lbl_1_1.setBounds(135, 11, 214, 34);
	    feedbackpanel2_1.add(profilename1lbl_1_1);
	    
	    JPanel panel_1_1 = new JPanel();
	    panel_1_1.setLayout(null);
	    panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel_1_1.setBounds(121, 56, 369, 94);
	    feedbackpanel2_1.add(panel_1_1);
	    
	    JLabel feedbacktextlbl_1_2 = new JLabel("Replies to inquiries very timely. Easy to deal \r\n");
	    feedbacktextlbl_1_2.setForeground(Color.BLACK);
	    feedbacktextlbl_1_2.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl_1_2.setBounds(10, 11, 349, 28);
	    panel_1_1.add(feedbacktextlbl_1_2);
	    
	    JLabel feedbacktextlbl_1_1_1 = new JLabel("with, very nice staff. Highly recommended!");
	    feedbacktextlbl_1_1_1.setForeground(Color.BLACK);
	    feedbacktextlbl_1_1_1.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl_1_1_1.setBounds(10, 50, 349, 28);
	    panel_1_1.add(feedbacktextlbl_1_1_1);
	    
	    JPanel feedbackpane6 = new JPanel();
	    feedbackpane6.setLayout(null);
	    feedbackpane6.setOpaque(false);
	    feedbackpane6.setBounds(35, 939, 708, 289);
	    scrollContent.add(feedbackpane6);
	    
	    JLabel profile6lbl = new JLabel("");
	    profile6lbl.setIcon(profile6);
	    profile6lbl.setBounds(10, 11, 101, 94);
	    feedbackpane6.add(profile6lbl);
	    
	    JLabel profilename6lbl = new JLabel("Erike Bea Ambion");
	    profilename6lbl.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename6lbl.setBounds(135, 11, 214, 34);
	    feedbackpane6.add(profilename6lbl);
	    
	    JPanel panel6 = new JPanel();
	    panel6.setLayout(null);
	    panel6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel6.setBounds(121, 56, 369, 206);
	    feedbackpane6.add(panel6);
	    
	    JLabel feedbacktextlbl6 = new JLabel("Thank you so much for making our wedding day");
	    feedbacktextlbl6.setForeground(Color.BLACK);
	    feedbacktextlbl6.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl6.setBounds(10, 11, 349, 28);
	    panel6.add(feedbacktextlbl6);
	    
	    JLabel feedbacktextlbl61 = new JLabel("memorable and for always being available");
	    feedbacktextlbl61.setForeground(Color.BLACK);
	    feedbacktextlbl61.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl61.setBounds(10, 50, 349, 28);
	    panel6.add(feedbacktextlbl61);
	    
	    JLabel lblToContactI = new JLabel("to contact. I also liked the different pen colors");
	    lblToContactI.setForeground(Color.BLACK);
	    lblToContactI.setFont(new Font("Anton", Font.PLAIN, 18));
	    lblToContactI.setBounds(10, 90, 349, 28);
	    panel6.add(lblToContactI);
	    
	    JLabel lblUsedToWrite = new JLabel(" used to write messages from our guests.");
	    lblUsedToWrite.setForeground(Color.BLACK);
	    lblUsedToWrite.setFont(new Font("Anton", Font.PLAIN, 18));
	    lblUsedToWrite.setBounds(10, 129, 349, 28);
	    panel6.add(lblUsedToWrite);
	    
	    JLabel lblWeWillKeep = new JLabel("We will keep them forever. VERY HIGHLY RECOMMENDED");
	    lblWeWillKeep.setBounds(10, 168, 349, 28);
	    panel6.add(lblWeWillKeep);
	    lblWeWillKeep.setForeground(Color.BLACK);
	    lblWeWillKeep.setFont(new Font("Anton", Font.PLAIN, 18));
	    
	    JPanel feedbackpanel5 = new JPanel();
	    feedbackpanel5.setLayout(null);
	    feedbackpanel5.setOpaque(false);
	    feedbackpanel5.setBounds(35, 740, 708, 172);
	    scrollContent.add(feedbackpanel5);
	    
	    JLabel profile5lbl = new JLabel("");
	    profile5lbl.setIcon(profile5);
	    profile5lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel5.add(profile5lbl);
	    
	    JLabel profilename5lbl = new JLabel("Ayies RB");
	    profilename5lbl.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename5lbl.setBounds(135, 11, 214, 34);
	    feedbackpanel5.add(profilename5lbl);
	    
	    JPanel panel5 = new JPanel();
	    panel5.setLayout(null);
	    panel5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel5.setBounds(121, 56, 369, 94);
	    feedbackpanel5.add(panel5);
	    
	    JLabel feedbacktextlbl5 = new JLabel("highly recommended. great service ");
	    feedbacktextlbl5.setForeground(Color.BLACK);
	    feedbacktextlbl5.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl5.setBounds(10, 11, 349, 28);
	    panel5.add(feedbacktextlbl5);
	    
	    JLabel feedbacktextlbl00 = new JLabel("and corteous staff");
	    feedbacktextlbl00.setForeground(Color.BLACK);
	    feedbacktextlbl00.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktextlbl00.setBounds(10, 50, 349, 28);
	    panel5.add(feedbacktextlbl00);
	    
	    JPanel feedbackpanel4 = new JPanel();
	    feedbackpanel4.setLayout(null);
	    feedbackpanel4.setOpaque(false);
	    feedbackpanel4.setBounds(35, 594, 708, 120);
	    scrollContent.add(feedbackpanel4);
	    
	    JLabel profile4lbl = new JLabel("");
	    profile4lbl.setIcon(profile4);
	    profile4lbl.setBounds(10, 11, 101, 94);
	    feedbackpanel4.add(profile4lbl);
	    
	    JLabel profilename4lbl = new JLabel("Ann D Dequinab");
	    profilename4lbl.setFont(new Font("Anton", Font.PLAIN, 20));
	    profilename4lbl.setBounds(135, 11, 131, 34);
	    feedbackpanel4.add(profilename4lbl);
	    
	    JPanel panel4 = new JPanel();
	    panel4.setLayout(null);
	    panel4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
	    panel4.setBounds(121, 56, 367, 53);
	    feedbackpanel4.add(panel4);
	    
	    JLabel feedbacktext4lbl = new JLabel("great service, easy to deal with.");
	    feedbacktext4lbl.setForeground(Color.BLACK);
	    feedbacktext4lbl.setFont(new Font("Anton", Font.PLAIN, 18));
	    feedbacktext4lbl.setBounds(10, 11, 316, 28);
	    panel4.add(feedbacktext4lbl);
	    

	    
	    scrollPane.setPreferredSize(new Dimension(1271, 500)); // set the size of the scroll pane to fit the labels
		
		
	}
}
