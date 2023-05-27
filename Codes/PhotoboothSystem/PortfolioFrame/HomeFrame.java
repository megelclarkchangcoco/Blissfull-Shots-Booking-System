package PortfolioFrame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class HomeFrame extends JFrame {
	
	private ImageIcon homeIcon = new ImageIcon(
			new ImageIcon( "C:\\\\Users\\\\Windows 10\\\\eclipse-workspace\\\\BlissfulShotPhotoBooth\\\\SourceImage\\\\gif\\\\home.gif")
					.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
	private ImageIcon	packageIcon = new ImageIcon(
			new ImageIcon( "C:\\\\Users\\\\Windows 10\\\\eclipse-workspace\\\\BlissfulShotPhotoBooth\\\\SourceImage\\\\gif\\\\drying.gif")
					.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
	private ImageIcon galleryIcon = new ImageIcon(
			new ImageIcon( "C:\\\\Users\\\\Windows 10\\\\eclipse-workspace\\\\BlissfulShotPhotoBooth\\\\SourceImage\\\\gif\\\\photo-gallery.gif")
					.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
	private ImageIcon feedbaclIcon = new ImageIcon(
			new ImageIcon( "C:\\\\Users\\\\Windows 10\\\\eclipse-workspace\\\\BlissfulShotPhotoBooth\\\\SourceImage\\\\gif\\\\feedback.gif")
					.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
	private ImageIcon infoplIcon = new ImageIcon(
			new ImageIcon( "C:\\\\Users\\\\Windows 10\\\\eclipse-workspace\\\\BlissfulShotPhotoBooth\\\\SourceImage\\\\gif\\\\info.gif")
					.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
	private ImageIcon logodashboard = new ImageIcon(
	        new ImageIcon(getClass().getResource("/backgroundFrame/blissful shots logo.png"))
	                .getImage().getScaledInstance(133, 99, Image.SCALE_DEFAULT)); 
	private ImageIcon xIcon = new ImageIcon(
			new ImageIcon("C:\\\\Users\\\\Windows 10\\\\eclipse-workspace\\\\BlissfulShotPhotoBooth\\\\SourceImage\\\\backgroundFrame\\\\close.png")
					.getImage().getScaledInstance(27, 28, Image.SCALE_DEFAULT));
	private ImageIcon windowlogo = new ImageIcon(
	        new ImageIcon(getClass().getResource("/backgroundFrame/blissful shots logo.png"))
	                .getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
		
	
	// FONTS
	Font Goku;
	Font Goku_Stencil;
	
	//=========== JPANEL CLASS ===========================
		private JPanel contentPane; 
		public static HomePanel HomePanel; 
		public static PackagePanel PackagePanel;
		public static GalleryPanel GalleryPanel;
		public static FeebackPanel FeebackPanel;
		public static InfoPanel InfoPanel;
		public static SignupPanel SignupPanel ;
		public static JLabel homelbl2;
		public static JLabel packagelbl2;
		public static JLabel gallerylbl2;
		public static JLabel feedbacklbl2;
		public static JLabel aboutmelbl;
		public static JLabel loginlbl;
		public static JPanel selectedPanel; // Declare a variable to hold the selected panel

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame frame = new HomeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeFrame()  {
		
		try {
		    // Load the font file and set its size to 17
		    Goku = Font.createFont(Font.TRUETYPE_FONT, new File("Anton-Regular.ttf")).deriveFont(16f);
		

		    // Create a bold version of the font
		    Font GokuBold = Goku.deriveFont(Font.BOLD);

		    // Register the font with the graphics environment
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Anton-Regular")));

		} catch(IOException | FontFormatException e) {
		    // Handle exception
		}

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setIconImage(windowlogo.getImage());
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//==================Create an instance PANEL CLASS ============================
		
		HomePanel = new HomePanel();
		PackagePanel = new PackagePanel();
		GalleryPanel = new GalleryPanel();
		FeebackPanel = new FeebackPanel();
		InfoPanel = new InfoPanel();
		SignupPanel = new SignupPanel();
		
	 // Add the panelHome instance to the content pane of the DashboardFrame
	    contentPane.add(HomePanel);
	    contentPane.add(PackagePanel);
	    contentPane.add(GalleryPanel);
	    contentPane.add(FeebackPanel);
	    contentPane.add(InfoPanel);
	    contentPane.add(SignupPanel);
	    
	    
	 // Call revalidate() and repaint() to update the frame
	    contentPane.revalidate();
	    contentPane.repaint();
		
	  // set the bounds of the panels
        HomePanel.setBounds(0, 122, 1280, 596);
        PackagePanel.setBounds(0, 122, 1280, 596);
        GalleryPanel.setBounds(0, 122, 1280, 596);
        FeebackPanel.setBounds(0, 122, 1280, 596);
        InfoPanel.setBounds(0, 122, 1280, 596);
        SignupPanel.setBounds(0, 122, 1280, 596);

		
	//========== Header Panel ================================	
		JPanel HeaderPanel = new JPanel();
		HeaderPanel.setBackground(new Color(102, 244, 222));
		HeaderPanel.setBounds(0, 0, 1280, 121);
		contentPane.add(HeaderPanel);
		HeaderPanel.setLayout(null);
		
		JPanel closePanel = new JPanel();
		closePanel.setBackground(new Color(102, 244, 222));
		closePanel.setBounds(1243, 11, 27, 28);
		HeaderPanel.add(closePanel);
		closePanel.setLayout(null);
		
		JLabel xLbl = new JLabel("");
		xLbl.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirm", JOptionPane.YES_NO_OPTION)== 0 ) {
					HomeFrame.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent args0) {
				xLbl.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent args0) {
				xLbl.setForeground(Color.WHITE);
			}
		});
		xLbl.setIcon(xIcon);
		xLbl.setBounds(0, 0, 27, 28);
		closePanel.add(xLbl);
		
		JPanel logopanel = new JPanel();
		logopanel.setBackground(new Color(102, 244, 222));
		logopanel.setBounds(10, 11, 113, 99);
		HeaderPanel.add(logopanel);
		logopanel.setLayout(null);
		logopanel.setLayout(null);
		
		  
		JPanel Homepl = new JPanel();
		Homepl.setBounds(121, 33, 91, 52);
		HeaderPanel.add(Homepl);
		Homepl.addMouseListener(new PanelButtonMouseAdapter(Homepl){
		    public void mouseClicked(MouseEvent e) {
		        menuClicked(Homepl);
		        HomePanel.setVisible(true);// for home panel
	            PackagePanel.setVisible(false);
	            GalleryPanel.setVisible(false);
	            FeebackPanel.setVisible(false);
	            SignupPanel.setVisible(false);
	            InfoPanel.setVisible(false);
	            
	            // change color of "Home" lbl
	            aboutmelbl.setForeground(Color.BLACK);
	            gallerylbl2.setForeground(Color.BLACK);
	            feedbacklbl2.setForeground(Color.BLACK);
	            homelbl2.setForeground(new Color(255, 255, 255));
		        packagelbl2.setForeground(Color.BLACK);
		        loginlbl.setForeground(Color.BLACK);
		    }
		});
		Homepl.setBackground(new Color(255, 255, 255));
		Homepl.setLayout(null);
		
		JLabel homelbl = new JLabel("");
		homelbl.setOpaque(false);
		homelbl.setBounds(22, 0, 69, 52);
		Homepl.add(homelbl);
		homelbl.setIcon(homeIcon);
		
		JPanel packagepl = new JPanel();
		packagepl.setBounds(211, 33, 114, 52);
		HeaderPanel.add(packagepl);
		packagepl.addMouseListener(new PanelButtonMouseAdapter(packagepl){
			public void mouseClicked(MouseEvent e) {
				menuClicked(packagepl);
				HomePanel.setVisible(false);
	            PackagePanel.setVisible(true);//for dashboard panel
	            GalleryPanel.setVisible(false);
	            FeebackPanel.setVisible(false);
	            SignupPanel.setVisible(false);
	            InfoPanel.setVisible(false);
	            
	            // Change font color of "Package" label
	            aboutmelbl.setForeground(Color.BLACK);
	            gallerylbl2.setForeground(Color.BLACK);
	            feedbacklbl2.setForeground(Color.BLACK);
	            homelbl2.setForeground(Color.BLACK);
		        packagelbl2.setForeground(new Color(255, 255, 255));
		        loginlbl.setForeground(Color.BLACK);
			}
			});
		packagepl.setBackground(new Color(255, 255, 255));
		packagepl.setLayout(null);
		
		JLabel packagelbl = new JLabel("");
		packagelbl.setOpaque(false);
		packagelbl.setIcon(packageIcon);
		packagelbl.setBounds(22, 0, 69, 52);
		packagepl.add(packagelbl);
		
		JPanel gallerypl = new JPanel();
		gallerypl.setBounds(325, 33, 114, 52);
		HeaderPanel.add(gallerypl);
		gallerypl.addMouseListener(new PanelButtonMouseAdapter(gallerypl){
		    public void mouseClicked(MouseEvent e) {
		        menuClicked(gallerypl);
	            HomePanel.setVisible(false);
	            PackagePanel.setVisible(false);
	            GalleryPanel.setVisible(true);
	            FeebackPanel.setVisible(false);
	            SignupPanel.setVisible(false);
	            InfoPanel.setVisible(false);
	            
	            // Change font color of "About" label
	            aboutmelbl.setForeground(Color.BLACK);
	            gallerylbl2.setForeground(new Color(255, 255, 255));
	            feedbacklbl2.setForeground(Color.BLACK);
	            homelbl2.setForeground(Color.BLACK);
		        packagelbl2.setForeground(Color.BLACK);
		        loginlbl.setForeground(Color.BLACK);
		    }
		});
		gallerypl.setBackground(new Color(255, 255, 255));
		gallerypl.setLayout(null);
		
		JLabel gallerylbl = new JLabel("");
		gallerylbl.setOpaque(false);
		gallerylbl.setIcon(galleryIcon);
		gallerylbl.setBounds(22, 0, 69, 52);
		gallerypl.add(gallerylbl);
		
		JPanel feedbackpl = new JPanel();
		feedbackpl.setBounds(436, 33, 114, 52);
		HeaderPanel.add(feedbackpl);
		feedbackpl.setLayout(null);
		feedbackpl.addMouseListener(new PanelButtonMouseAdapter(feedbackpl){
		    public void mouseClicked(MouseEvent e) {
		        menuClicked(feedbackpl);
	            HomePanel.setVisible(false);
	            PackagePanel.setVisible(false);
	            GalleryPanel.setVisible(false);
	            FeebackPanel.setVisible(true);
	            SignupPanel.setVisible(false);
	            InfoPanel.setVisible(false);
	           
	           
	            // Change font color of "Feedback" label
	            aboutmelbl.setForeground(Color.BLACK);
	            gallerylbl2.setForeground(Color.BLACK);
	            feedbacklbl2.setForeground(new Color(255, 255, 255));
	            homelbl2.setForeground(Color.BLACK);
		        packagelbl2.setForeground(Color.BLACK);
		        loginlbl.setForeground(Color.BLACK);
	            
		    }
		});
		feedbackpl.setBackground(new Color(255, 255, 255));
		
		JLabel feedbacklbl = new JLabel("");
		feedbacklbl.setOpaque(false);
		feedbacklbl.setIcon(feedbaclIcon);
		feedbacklbl.setBounds(22, 0, 69, 52);
		feedbackpl.add(feedbacklbl);
		
		JPanel infopl = new JPanel();
		infopl.setBounds(548, 33, 108, 52);
		HeaderPanel.add(infopl);
		infopl.addMouseListener(new PanelButtonMouseAdapter(infopl){
		    public void mouseClicked(MouseEvent e) {
		        menuClicked(infopl);
		        HomePanel.setVisible(false);
		        PackagePanel.setVisible(false);
		        GalleryPanel.setVisible(false);
		        FeebackPanel.setVisible(false);
		        SignupPanel.setVisible(false);
		        InfoPanel.setVisible(true);
		        
		        // Change font color of "About" label
		        aboutmelbl.setForeground(new Color(255, 255, 255));
		        gallerylbl2.setForeground(Color.BLACK);
		        feedbacklbl2.setForeground(Color.BLACK);
		        packagelbl2.setForeground(Color.BLACK);
		        homelbl2.setForeground(Color.BLACK);
		        loginlbl.setForeground(Color.BLACK);
		    }
		});
		infopl.setBackground(new Color(255, 255, 255));
		infopl.setLayout(null);
		
		JLabel infolbl = new JLabel("");
		infolbl.setOpaque(false);
		infolbl.setIcon(infoplIcon);
		infolbl.setBounds(22, 0, 69, 52);
		infopl.add(infolbl);
		
		JLabel logoLbl = new JLabel(logodashboard);
		logoLbl.setBounds(0, 0, 113, 99);
		logopanel.add(logoLbl);
		
		 homelbl2 = new JLabel("Home");
		homelbl2.setFont(Goku);
		homelbl2.setForeground(Color.BLACK);
		homelbl2.setBounds(156, 86, 56, 36);
		HeaderPanel.add(homelbl2);
		
		 packagelbl2 = new JLabel("Package");
		packagelbl2.setForeground(Color.BLACK);
		packagelbl2.setFont(Goku);
		packagelbl2.setBounds(236, 85, 75, 36);
		HeaderPanel.add(packagelbl2);
		
		 gallerylbl2 = new JLabel("Gallery");
		gallerylbl2.setForeground(Color.BLACK);
		gallerylbl2.setFont(Goku);
		gallerylbl2.setBounds(360, 85, 56, 36);
		HeaderPanel.add(gallerylbl2);
		
		feedbacklbl2 = new JLabel("Feedback");
		feedbacklbl2.setForeground(Color.BLACK);
		feedbacklbl2.setFont(Goku);
		feedbacklbl2.setBounds(460, 85, 75, 36);
		HeaderPanel.add(feedbacklbl2);
		
		aboutmelbl = new JLabel("About");
		aboutmelbl.setBackground(new Color(0, 0, 0));
		aboutmelbl.setForeground(Color.BLACK);
		aboutmelbl.setFont(Goku);
		aboutmelbl.setBounds(581, 85, 56, 36);
		HeaderPanel.add(aboutmelbl);
		
		 loginlbl = new JLabel("Login               Sign In");
		 loginlbl.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 		menuClicked(infopl);
		        HomePanel.setVisible(false);
		        PackagePanel.setVisible(false);
		        GalleryPanel.setVisible(false);
		        FeebackPanel.setVisible(false);
		        SignupPanel.setVisible(true);
		        InfoPanel.setVisible(false);
		 		
		 	// Change font color of "About" label
		        aboutmelbl.setForeground(Color.BLACK);
		        gallerylbl2.setForeground(Color.BLACK);
		        feedbacklbl2.setForeground(Color.BLACK);
		        packagelbl2.setForeground(Color.BLACK);
		        homelbl2.setForeground(Color.BLACK);
		        loginlbl.setForeground(new Color(255, 255, 255));
		 	}
		 });
		loginlbl.setForeground(Color.BLACK);
		loginlbl.setFont(Goku);
		loginlbl.setBounds(1047, 50, 198, 36);
		HeaderPanel.add(loginlbl);
		
		
		

	}
	
	// create new method for JPanel class
	public void menuClicked(JPanel selectedPanel){
	    HomePanel.setVisible(false);
	    PackagePanel.setVisible(false);
	    GalleryPanel.setVisible(false);
	    FeebackPanel.setVisible(false);
	    InfoPanel.setVisible(false);
	    SignupPanel.setVisible(false);
	    selectedPanel.setVisible(true);
	    
	    // Set the selected panel to the variable
	    this.selectedPanel = selectedPanel;
	}
	
	// ================== JPANEL NAMING ACTION LISTENER ===================== 
			private class PanelButtonMouseAdapter extends MouseAdapter{
				
				JPanel panel;
				public PanelButtonMouseAdapter(JPanel panel) {
					this.panel = panel;
				}
				public void mouseEntered(MouseEvent e){
					panel.setBackground(new Color(102, 244, 222));
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					panel.setBackground(new Color(255, 255, 255));
				}
				
				@Override
				public void mousePressed(MouseEvent e){
					panel.setBackground(new Color(102, 244, 222));
					
				} 
				
				@Override
				public void mouseReleased(MouseEvent e){
					 panel.setBackground(new Color(102, 244, 222));
				}
			}	
}
