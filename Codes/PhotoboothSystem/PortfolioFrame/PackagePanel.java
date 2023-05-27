package PortfolioFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;


public class PackagePanel extends JPanel { 
	
	// images
	private ImageIcon background = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\package1.png")
					.getImage().getScaledInstance(1280, 607, Image.SCALE_DEFAULT));
	private ImageIcon background2 = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\package3.PNG")
					.getImage().getScaledInstance(1260, 415, Image.SCALE_DEFAULT));
	private JPanel polaroidPanel;
	

	
	/**
	 * Create the panel.
	 */
	public PackagePanel() {
	    setBackground(new Color(255, 255, 255));
	    setBounds(0, 122, 1280, 780); // Update height to 780
	    setLayout(null);

	    JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 0, 1280, 607);		
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(0, 0, 1280, 607);
	    scrollPane.setBackground(new Color(225, 254, 253));
	    mainPanel.add(scrollPane);
	    

	    JPanel scrollContent = new JPanel();
	    scrollContent.setBackground(new Color(255, 255, 255));
	    scrollContent.setLayout(null);
	    scrollContent.setPreferredSize(new Dimension(1001, 1300)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);
	    
	    scrollPane.setPreferredSize(new Dimension(1271, 500)); // set the size of the scroll pane to fit the labels
	    
	    	    
	    	    JPanel standardPanel = new JPanel() {
	    	    	@Override
	    	    	protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                Graphics2D g2 = (Graphics2D) g.create();
	                int shadowGap = 5;
	                int shadowOffset = 4;
	                g2.setPaint(new Color(0, 0, 0, 50));
	                g2.fillRoundRect(shadowOffset, shadowOffset, getWidth() - shadowGap - shadowOffset,
	                        getHeight() - shadowGap - shadowOffset, 10, 10);
	                g2.dispose();
	    		        }
	    		    };
	        
	    		    standardPanel.addMouseListener(new MouseAdapter() {
	    	        private Standard layout;
	    	
	    	        @Override
	    	        public void mouseEntered(MouseEvent e) {
	    	            if (layout == null) {
	    	                layout = new Standard();
	    	                layout.setVisible(true);
	    		            }
	    		        }
	    	
	    	        @Override
	    	        public void mouseExited(MouseEvent e) {
	    	            if (layout != null) {
	    	                Point p = e.getPoint();
	    	                if (!standardPanel.contains(p)) {
	    	                    layout.dispose();
	    	                    layout = null;
	    			                }
	    			            }
	    			        }
	    			    });
	    		    
	    		JLabel backgroundlbl = new JLabel("");
	    		backgroundlbl.setIcon(background);
	    		backgroundlbl.setBounds(0, 0, 1280, 607);
	    		scrollContent.add(backgroundlbl);
	    		 
	    		JLabel ourlbl = new JLabel("Our");
	    		ourlbl.setFont(new Font("Anton", Font.PLAIN, 120));
	    	    ourlbl.setForeground(new Color(0, 0, 0));
	    	    ourlbl.setBounds(774, 63, 354, 224);
	    	    backgroundlbl.add(ourlbl);
	    	    
	    	    JLabel lblServices = new JLabel("Services");
	    	    lblServices.setForeground(Color.BLACK);
	    	    lblServices.setFont(new Font("Anton", Font.PLAIN, 120));
	    	    lblServices.setBounds(709, 236, 434, 224);
	    	    backgroundlbl.add(lblServices);
	    	    
	    	    standardPanel.setBounds(22, 643, 268, 139);
	    	    scrollContent.add(standardPanel);
	    	    standardPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
	    	    standardPanel.setBackground(new Color(243, 115, 222));
	    	    standardPanel.setLayout(null);
	    	    
	    	    JLabel standardlbl = new JLabel("Standard 4r");
	    	    standardlbl.setBounds(46, 689, 46, 14);
	    	    standardPanel.add(standardlbl);
	    	    
	    	    JLabel lblrStandard = new JLabel("4r Standard");
	    	    lblrStandard.setForeground(Color.WHITE);
	    	    lblrStandard.setFont(new Font("Anton", Font.BOLD | Font.ITALIC, 39));
	    	    lblrStandard.setBackground(Color.WHITE);
	    	    lblrStandard.setBounds(33, 32, 211, 70);
	    	    standardPanel.add(lblrStandard);
	    	    
	    	  JPanel dedicationPanel = new JPanel() {
	    		  @Override
	  	    	protected void paintComponent(Graphics g) {
	              super.paintComponent(g);
	              Graphics2D g2 = (Graphics2D) g.create();
	              int shadowGap = 5;
	              int shadowOffset = 4;
	              g2.setPaint(new Color(0, 0, 0, 50));
	              g2.fillRoundRect(shadowOffset, shadowOffset, getWidth() - shadowGap - shadowOffset,
	                      getHeight() - shadowGap - shadowOffset, 10, 10);
	              g2.dispose();
	  		        }
	  		    };
	      
	  		  dedicationPanel.addMouseListener(new MouseAdapter() {
	  	        private  Dedication layout;
	  	
	  	        @Override
	  	        public void mouseEntered(MouseEvent e) {
	  	            if (layout == null) {
	  	                layout = new Dedication();
	  	                layout.setVisible(true);
	  		            }
	  		        }
	  	
	  	        @Override
	  	        public void mouseExited(MouseEvent e) {
	  	            if (layout != null) {
	  	                Point p = e.getPoint();
	  	                if (!dedicationPanel.contains(p)) {
	  	                    layout.dispose();
	  	                    layout = null;
	  			                }
	  			            }
	  			        }
	  			    });
	    	    
	    	  dedicationPanel.setBounds(349, 643, 268, 139);
	    	  scrollContent.add(dedicationPanel);
	    	  dedicationPanel.setBackground(new Color(249, 245, 109));
	    	  dedicationPanel.setLayout(null);
	    	    
	    	 JLabel lblDedication = new JLabel("Dedication");
	    	 lblDedication.setForeground(Color.WHITE);
	    	 lblDedication.setFont(new Font("Anton", Font.BOLD | Font.ITALIC, 39));
	    	 lblDedication.setBackground(Color.WHITE);
	    	 lblDedication.setBounds(32, 33, 197, 70);
	    	 dedicationPanel.add(lblDedication);
	    	    
	    	JPanel twinstripPanel = new JPanel() {
	    	 @Override
	    	protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g.create();
            int shadowGap = 5;
            int shadowOffset = 4;
            g2.setPaint(new Color(0, 0, 0, 50));
            g2.fillRoundRect(shadowOffset, shadowOffset, getWidth() - shadowGap - shadowOffset,
                    getHeight() - shadowGap - shadowOffset, 10, 10);
            g2.dispose();
		        }
		    };
    
	    twinstripPanel.addMouseListener(new MouseAdapter() {
	        private TwinStrip layout;
	
	        @Override
	        public void mouseEntered(MouseEvent e) {
	            if (layout == null) {
	                layout = new TwinStrip();
	                layout.setVisible(true);
		            }
		        }
	
	        @Override
	        public void mouseExited(MouseEvent e) {
	            if (layout != null) {
	                Point p = e.getPoint();
	                if (!twinstripPanel.contains(p)) {
	                    layout.dispose();
	                    layout = null;
			                }
			            }
			        }
			    });
		    
	    	    twinstripPanel.setBounds(671, 643, 268, 139);
	    	    scrollContent.add(twinstripPanel);
	    	    
	    	    twinstripPanel.setBackground(new Color(171, 249, 249));
	    	    twinstripPanel.setLayout(null);
	    	    
	    	    JLabel lblNewLabel = new JLabel("Twin Strip");
	    	    lblNewLabel.setForeground(new Color(255, 255, 255));
	    	    lblNewLabel.setBackground(new Color(255, 255, 255));
	    	    lblNewLabel.setFont(new Font("Anton", Font.BOLD | Font.ITALIC, 39));
	    	    lblNewLabel.setBounds(45, 34, 197, 70);
	    	    twinstripPanel.add(lblNewLabel);

	    	    
	    	    JPanel polaroidPanel = new JPanel() {
	    	    @Override
		    	protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            Graphics2D g2 = (Graphics2D) g.create();
	            int shadowGap = 5;
	            int shadowOffset = 4;
	            g2.setPaint(new Color(0, 0, 0, 50));
	            g2.fillRoundRect(shadowOffset, shadowOffset, getWidth() - shadowGap - shadowOffset,
	                    getHeight() - shadowGap - shadowOffset, 10, 10);
	            g2.dispose();
			        }
			    };
	    
			    polaroidPanel.addMouseListener(new MouseAdapter() {
		        private Polaroid layout;
		
		        @Override
		        public void mouseEntered(MouseEvent e) {
		            if (layout == null) {
		                layout = new Polaroid();
		                layout.setVisible(true);
			            }
			        }
		
		        @Override
		        public void mouseExited(MouseEvent e) {
		            if (layout != null) {
		                Point p = e.getPoint();
		                if (!polaroidPanel.contains(p)) {
		                    layout.dispose();
		                    layout = null;
				                }
				            }
				        }
				    });
	    	    
	    	    polaroidPanel.setBounds(973, 643, 268, 139);
	    	    scrollContent.add(polaroidPanel);
	    	    polaroidPanel.setBackground(new Color(182, 243, 113));
	    	    polaroidPanel.setLayout(null);
	    	    
	    	    JLabel polaroidlbl = new JLabel("Polaroid");
	    	    polaroidlbl.setForeground(Color.WHITE);
	    	    polaroidlbl.setFont(new Font("Anton", Font.BOLD | Font.ITALIC, 39));
	    	    polaroidlbl.setBackground(Color.WHITE);
	    	    polaroidlbl.setBounds(47, 34, 197, 70);
	    	    polaroidPanel.add(polaroidlbl);
	    	    
	    	    JPanel lastPanel = new JPanel();
	    	    lastPanel.setBounds(0, 900, 1280, 415);
	    	    scrollContent.add(lastPanel);
	    	    lastPanel.setLayout(null);
	    	    
	    	    JLabel lowbackgroundlbl = new JLabel("");
	    	    lowbackgroundlbl.setIcon(background2);
	    	    lowbackgroundlbl.setBounds(0, 0, 1280, 415);
	    	    lastPanel.add(lowbackgroundlbl);
	    	    
	    	    JLabel customizelbl = new JLabel("Customize Your Own Design");
	    	    lowbackgroundlbl.add(customizelbl);
	    	    customizelbl.setFont(new Font("Anton", Font.PLAIN, 60));
	    	    customizelbl.setBounds(276, 53, 1127, 132);
	    	    
	    	    JPanel panel = new JPanel();
	    	    panel.setBackground(new Color(100, 238, 238));
	    	    panel.setBounds(355, 247, 494, 101);
	    	    lowbackgroundlbl.add(panel);
	    	    panel.setLayout(null);
	    	    
	    	    JLabel lblHere = new JLabel("Here");
	    	    lblHere.setFont(new Font("Anton", Font.BOLD | Font.ITALIC, 55));
	    	    lblHere.setForeground(new Color(255, 255, 255));
	    	    lblHere.setBounds(173, 0, 142, 101);
	    	    panel.add(lblHere);
	    	    
	    	   

	}
}
