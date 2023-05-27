package Dashboard;

import java.awt.EventQueue; 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
 
public class DashboardFrame extends JFrame { 
	private ImageIcon homeIcon = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\home.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon dashboardIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\settings.png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon signoutIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\logout (1).png")
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
	private ImageIcon xIcon = new ImageIcon( 
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\close.png")
					.getImage().getScaledInstance(27, 28, Image.SCALE_DEFAULT));
	private ImageIcon userIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\user.png")
					.getImage().getScaledInstance(166, 111, Image.SCALE_DEFAULT));
	private ImageIcon windowIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\Logo.jpg")
			.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT));
//=========== JPANEL CLASS ===========================
	private JPanel contentPane;
	public static PanelHome panelHome;
	public static PanelDashboard panelDashBoard;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardFrame frame = new DashboardFrame();
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
	
	
	public DashboardFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		setIconImage(windowIcon.getImage());
		setLocationRelativeTo(null);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	//==================Create an instance PANEL CLASS ============================
		
		panelHome = new PanelHome();
		panelDashBoard = new PanelDashboard();
		
	 // Add the panelHome instance to the content pane of the DashboardFrame
	    contentPane.add(panelHome);
	    contentPane.add(panelDashBoard);
	    
	 // Call revalidate() and repaint() to update the frame
	    contentPane.revalidate();
	    contentPane.repaint();
		
	  // set the bounds of the panels
        panelHome.setBounds(196, 90, 1084, 628);
        panelDashBoard.setBounds(196, 90, 1084, 628);

		
	//========== Header Panel ================================	
		JPanel HeaderPanel = new JPanel();
		HeaderPanel.setBackground(new Color(188, 233, 227));
		HeaderPanel.setBounds(0, 0, 1280, 91);
		contentPane.add(HeaderPanel);
		HeaderPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(188, 233, 227));
		panel.setBounds(1243, 11, 27, 28);
		HeaderPanel.add(panel);
		panel.setLayout(null);
		
		JLabel xLbl = new JLabel("");
		xLbl.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?", "Confirm", JOptionPane.YES_NO_OPTION)== 0 ) {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
					DashboardFrame.this.dispose();
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
		panel.add(xLbl);
	//==========End  Header Panel =============================
		
		
		
		
	//========== leftSide Panell================================
		
		
		JPanel LeftsidePanel = new JPanel();
		LeftsidePanel.setBackground(new Color(188, 233, 227));
		LeftsidePanel.setBounds(0, 90, 197, 673);
		contentPane.add(LeftsidePanel);
		LeftsidePanel.setLayout(null);
		
		JPanel UserIconPanel = new JPanel();
		UserIconPanel.addMouseListener(new PanelButtonMouseAdapter(UserIconPanel) {
		    public void mouseClicked(MouseEvent e) {
		    }
		});
		UserIconPanel.setBackground(new Color(188, 233, 227));
		UserIconPanel.setBounds(10, 21, 166, 147);
		LeftsidePanel.add(UserIconPanel);
		UserIconPanel.setLayout(null);
		
		JLabel UserIconLbl = 	new JLabel("");
		UserIconLbl.setIcon(userIcon);
		UserIconLbl.setBounds(0, 0, 166, 111);
		UserIconPanel.add(UserIconLbl);
		
		
		JPanel HomePanel = new JPanel();
		HomePanel.addMouseListener(new PanelButtonMouseAdapter(HomePanel){
		    public void mouseClicked(MouseEvent e) {
		        menuClicked(HomePanel);
		        panelHome.setVisible(true);// for home panel
	            panelDashBoard.setVisible(false);

		    }
		});
		HomePanel.setBackground(new Color(188, 233, 227));
		HomePanel.setBounds(0, 228, 197, 58);
		LeftsidePanel.add(HomePanel);
		HomePanel.setLayout(null);
		
		JLabel homeLbl = new JLabel("HOME");
		homeLbl.setFont(new Font("Dialog", Font.BOLD, 14));
		homeLbl.setIcon(homeIcon);
		homeLbl.setBounds(22, 0, 197, 58);
		HomePanel.add(homeLbl);
		
		JPanel bookPanel = new JPanel();
		bookPanel.addMouseListener(new PanelButtonMouseAdapter(bookPanel){
			public void mouseClicked(MouseEvent e) {
				menuClicked(bookPanel);
				panelHome.setVisible(false);
	            panelDashBoard.setVisible(true);// for dashboard panel
			}
			});
		bookPanel.setBackground(new Color(188, 233, 227));
		bookPanel.setBounds(0, 286, 197, 58);
		LeftsidePanel.add(bookPanel);
		bookPanel.setLayout(null);
		
		JLabel lblBook = new JLabel("Dashboard");
		lblBook.setFont(new Font("Dialog", Font.BOLD, 14));
		lblBook.setIcon(dashboardIcon);
		lblBook.setBounds(23, 0, 197, 58);
		bookPanel.add(lblBook);
		
		JPanel signoutPanel = new JPanel();
		signoutPanel.addMouseListener(new PanelButtonMouseAdapter(signoutPanel) {
			public void mouseClicked(MouseEvent arg0) {
				if(JOptionPane.showConfirmDialog(null, "Are you Really Signing Off?", "Confirm", JOptionPane.YES_NO_OPTION)== 0 ) {
					DashboardFrame.this.dispose();
				}	
			}
		});
		signoutPanel.setLayout(null);
		signoutPanel.setBackground(new Color(188, 233, 227));
		signoutPanel.setBounds(0, 344, 197, 58);
		LeftsidePanel.add(signoutPanel);
		
		JLabel signoutLbl = new JLabel("Sign Out");
		signoutLbl.setFont(new Font("Dialog", Font.BOLD, 14));
		signoutLbl.setIcon(signoutIcon);
		signoutLbl.setBounds(22, 0, 197, 58);
		signoutPanel.add(signoutLbl);

    //=================End  leftSide Panell================================
		
		JPanel mainPanelcontentpane = new JPanel();
		mainPanelcontentpane.setBounds(196, 90, 1084, 628);
		contentPane.add(mainPanelcontentpane);
		mainPanelcontentpane.setLayout(null);

	}
	
	// create new method for JPanel class
	public void menuClicked(JPanel selectedPanel){
	    panelHome.setVisible(false);
	    panelDashBoard.setVisible(false);
	    selectedPanel.setVisible(true);
	}
	
	
	
	 // ================== JPANEL NAMING ACTION LISTENER ===================== 
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		public void mouseEntered(MouseEvent e){
			
			panel.setBackground(new Color(250,  246, 110));
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(188, 233, 227));
		}
		
		@Override
		public void mousePressed(MouseEvent e){
			panel.setBackground(new Color(250,  246, 110));
		} 
		
		@Override
		public void mouseReleased(MouseEvent e){
			panel.setBackground(new Color(250,  246, 110));
		}
	}	

}