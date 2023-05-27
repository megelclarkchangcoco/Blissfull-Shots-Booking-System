package PhotoboothBookingSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import PortfolioFrame.HomeFrame;
import java.awt.Font;

public class BookingBoardFrame extends JFrame {
	
	// ==== image 
	private ImageIcon homeIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemHomeImage\\photo-booth.gif")
					.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
	private ImageIcon	standardIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemHomeImage\\standard.gif")
					.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
	private ImageIcon twinstripIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemHomeImage\\twinstrip.gif")
					.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
	private ImageIcon dedicationIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemHomeImage\\dedication.gif")
					.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
	private ImageIcon polaroidIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemHomeImage\\polaroid.gif")
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

	private JPanel contentPane;
	public static Home2Panel home2;
	public static StandardPanel standardpanel;
	public static TwinStripPanel twinstrippanel;
	public static DedicationPanel dedicationpanel;
	public static PolaroidPanel polaroidpanel;
	public static JLabel homelbl2;
	public static JLabel standardlbl2;
	public static JLabel twinstriplbl2;
	public static JLabel dedicationlbl2;
	public static JLabel polaroidlbl2;
	public static JPanel selectedPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingBoardFrame frame = new BookingBoardFrame();
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
	public BookingBoardFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setIconImage(windowlogo.getImage());
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// create an instance panel class 
		home2 = new Home2Panel();
		standardpanel = new StandardPanel();
		twinstrippanel = new TwinStripPanel();
		dedicationpanel = new DedicationPanel();
		polaroidpanel = new PolaroidPanel();
		
		// add the PanelHome instance to the content pane of the BookingBoardFrame
		contentPane.add(home2);
		contentPane.add(standardpanel);
		contentPane.add(twinstrippanel);
		contentPane.add(dedicationpanel);
		contentPane.add(polaroidpanel);
		
		
		// Call revalidate() and repaint to update the frame
		contentPane.revalidate();
		contentPane.repaint();
		
		
		//set the bounds of the panel
		home2.setBounds(0,122,1280, 596);
		standardpanel.setBounds(0,122,1280, 596);
		twinstrippanel.setBounds(0,122,1280, 596);
		dedicationpanel.setBounds(0,122,1280, 596);
		polaroidpanel.setBounds(0,122,1280, 596);
		
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
					BookingBoardFrame.this.dispose();
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
		        menuClicked(home2);
		        
		        home2.setVisible(true);
		        standardpanel.setVisible(false);
		        twinstrippanel.setVisible(false);
		        dedicationpanel.setVisible(false);
		        polaroidpanel.setVisible(false);
		        
		     // Change font color of "About" label
		        home2.setForeground(Color.BLACK);
		        standardpanel.setForeground(Color.BLACK);
		        twinstrippanel.setForeground(Color.BLACK);
		        dedicationpanel.setForeground(Color.BLACK);
		        polaroidpanel.setForeground(Color.BLACK);
		    
		    }
		});
		Homepl.setBackground(new Color(255, 255, 255));
		Homepl.setLayout(null);
		JLabel homelbl = new JLabel("");
		homelbl.setOpaque(false);
		homelbl.setBounds(22, 0, 69, 52);
		Homepl.add(homelbl);
		homelbl.setIcon(homeIcon);
		
		JPanel standaradpanels = new JPanel();
		standaradpanels.setBounds(211, 33, 114, 52);
		HeaderPanel.add(standaradpanels);
		standaradpanels.addMouseListener(new PanelButtonMouseAdapter(standaradpanels){
			public void mouseClicked(MouseEvent e) {
				menuClicked(standaradpanels);
				 home2.setVisible(false);
			     standardpanel.setVisible(true);
			     twinstrippanel.setVisible(false);
			     dedicationpanel.setVisible(false);
			     polaroidpanel.setVisible(false);
			        
			     // Change font color of "About" label
			     home2.setForeground(Color.BLACK);
			     standardpanel.setForeground(Color.BLACK);
			     twinstrippanel.setForeground(Color.BLACK);
			     dedicationpanel.setForeground(Color.BLACK);
			     polaroidpanel.setForeground(Color.BLACK);
			}
			});
		standaradpanels.setBackground(new Color(255, 255, 255));
		standaradpanels.setLayout(null);
		
		JLabel standardiconlbl = new JLabel("");
		standardiconlbl.setOpaque(false);
		standardiconlbl.setIcon(standardIcon);
		standardiconlbl.setBounds(22, 0, 69, 52);
		standaradpanels.add(standardiconlbl);
		
		JPanel twinstrippanels = new JPanel();
		twinstrippanels.setBounds(325, 33, 114, 52);
		HeaderPanel.add(twinstrippanels);
		twinstrippanels.addMouseListener(new PanelButtonMouseAdapter(twinstrippanels){
		    public void mouseClicked(MouseEvent e) {
		        menuClicked(twinstrippanels);
		        home2.setVisible(false);
		        standardpanel.setVisible(false);
		        twinstrippanel.setVisible(true);
		        dedicationpanel.setVisible(false);
		        polaroidpanel.setVisible(false);
		        
		     // Change font color of "About" label
		        home2.setForeground(Color.BLACK);
		        standardpanel.setForeground(Color.BLACK);
		        twinstrippanel.setForeground(Color.BLACK);
		        dedicationpanel.setForeground(Color.BLACK);
		        polaroidpanel.setForeground(Color.BLACK);
		    }
		});
		twinstrippanels.setBackground(new Color(255, 255, 255));
		twinstrippanels.setLayout(null);
		
		JLabel twinstriplblicon = new JLabel("");
		twinstriplblicon.setOpaque(false);
		twinstriplblicon.setIcon(twinstripIcon);
		twinstriplblicon.setBounds(22, 0, 69, 52);
		twinstrippanels.add(twinstriplblicon);
		
		JPanel dedicationpanels = new JPanel();
		dedicationpanels.setBounds(436, 33, 114, 52);
		HeaderPanel.add(dedicationpanels);
		dedicationpanels.setLayout(null);
		dedicationpanels.addMouseListener(new PanelButtonMouseAdapter(dedicationpanels){
		    public void mouseClicked(MouseEvent e) {
		        menuClicked(dedicationpanels);
		        home2.setVisible(false);
		        standardpanel.setVisible(false);
		        twinstrippanel.setVisible(false);
		        dedicationpanel.setVisible(true);
		        polaroidpanel.setVisible(false);
		        
		     // Change font color of "About" label
		        home2.setForeground(Color.BLACK);
		        standardpanel.setForeground(Color.BLACK);
		        twinstrippanel.setForeground(Color.BLACK);
		        dedicationpanel.setForeground(Color.BLACK);
		        polaroidpanel.setForeground(Color.BLACK);
	            
		    }
		});
		dedicationpanels.setBackground(new Color(255, 255, 255));
		
		JLabel dedicationlblicon = new JLabel("");
		dedicationlblicon.setOpaque(false);
		dedicationlblicon.setIcon(dedicationIcon);
		dedicationlblicon.setBounds(22, 0, 69, 52);
		dedicationpanels.add(dedicationlblicon);
		
		JPanel polaroidpanels = new JPanel();
		polaroidpanels.setBounds(548, 33, 108, 52);
		HeaderPanel.add(polaroidpanels);
		polaroidpanels.addMouseListener(new PanelButtonMouseAdapter(polaroidpanels){
		    public void mouseClicked(MouseEvent e) {
		        menuClicked(polaroidpanels);
		        home2.setVisible(false);
		        standardpanel.setVisible(false);
		        twinstrippanel.setVisible(false);
		        dedicationpanel.setVisible(false);
		        polaroidpanel.setVisible(true);
		        
		     // Change font color of "About" label
		        home2.setForeground(Color.BLACK);
		        standardpanel.setForeground(Color.BLACK);
		        twinstrippanel.setForeground(Color.BLACK);
		        dedicationpanel.setForeground(Color.BLACK);
		        polaroidpanel.setForeground(Color.BLACK);
		    }
		});
		polaroidpanels.setBackground(new Color(255, 255, 255));
		polaroidpanels.setLayout(null);
		
		JLabel polaroidlblicon = new JLabel("");
		polaroidlblicon.setOpaque(false);
		polaroidlblicon.setIcon(polaroidIcon);
		polaroidlblicon.setBounds(22, 0, 69, 52);
		polaroidpanels.add(polaroidlblicon);
		
		JLabel logoLbl = new JLabel(logodashboard);
		logoLbl.setBounds(0, 0, 113, 99);
		logopanel.add(logoLbl);
		
		homelbl2 = new JLabel("Home");
		homelbl2.setFont(new Font("Goku", Font.PLAIN, 15));
		homelbl2.setForeground(Color.BLACK);
		homelbl2.setBounds(156, 86, 56, 36);
		HeaderPanel.add(homelbl2);
		
		 standardlbl2 = new JLabel("Standard");
		 standardlbl2.setFont(new Font("Goku", Font.PLAIN, 15));
		standardlbl2.setForeground(Color.BLACK);
		
		standardlbl2.setBounds(236, 85, 75, 36);
		HeaderPanel.add(standardlbl2);
		
		 twinstriplbl2 = new JLabel("Twin Strip");
		 twinstriplbl2.setFont(new Font("Goku", Font.PLAIN, 15));
		twinstriplbl2.setForeground(Color.BLACK);
		
		twinstriplbl2.setBounds(335, 85, 81, 36);
		HeaderPanel.add(twinstriplbl2);
		
		dedicationlbl2 = new JLabel("Dedication");
		dedicationlbl2.setFont(new Font("Goku", Font.PLAIN, 15));
		dedicationlbl2.setForeground(Color.BLACK);
		
		dedicationlbl2.setBounds(460, 85, 75, 36);
		HeaderPanel.add(dedicationlbl2);
		
		polaroidlbl2 = new JLabel("Polaroid");
		polaroidlbl2.setFont(new Font("Goku", Font.PLAIN, 15));
		polaroidlbl2.setBackground(new Color(0, 0, 0));
		polaroidlbl2.setForeground(Color.BLACK);
		
		polaroidlbl2.setBounds(581, 85, 56, 36);
		HeaderPanel.add(polaroidlbl2);
		
		
		
	}

	
	// create new method for JPanel class
		public void menuClicked(JPanel selectedPanel){
			home2.setVisible(false);
			standardpanel.setVisible(false);
			twinstrippanel.setVisible(false);
			dedicationpanel.setVisible(false);
			polaroidpanel.setVisible(false);
			
			selectedPanel.setVisible(true);
			// set the selected panel to the variable
			this.selectedPanel = selectedPanel;
		}
		
	// ====== JPanel Naming Actiong Listener =======
		private class PanelButtonMouseAdapter extends MouseAdapter{
			JPanel panel;
			
			public PanelButtonMouseAdapter(JPanel panel) {
				this.panel = panel;
			}
			
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(new Color(102, 244, 222));
			}
			
			public void mouseExited(MouseEvent e) {
				panel.setBackground(new Color(255, 255, 255));
			}
			
			public void mousePressed(MouseEvent e) {
				panel.setBackground(new Color(102, 244, 222));
			}
			
			public void mouseReleased(MouseEvent e) {
				panel.setBackground(new Color(102, 244, 222));
			}
		}
		

}
