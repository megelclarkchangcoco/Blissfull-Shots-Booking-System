package PortfolioFrame;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Standard extends JFrame {

	private JPanel contentPane;
	private ImageIcon twinstrippicture = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\4r - 9.png")
					.getImage().getScaledInstance(558, 338, Image.SCALE_DEFAULT));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Standard frame = new Standard();
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
	public Standard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(341, 203, 742, 418);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel standardPanel = new JPanel();
		standardPanel.setBackground(new Color(243, 115, 222));
		standardPanel.setBounds(0, 0, 742, 418);
		contentPane.add(standardPanel);
		standardPanel.setLayout(null);
		
		JLabel standardlbl = new JLabel("Standard");
		standardlbl.setFont(new Font("Garamond", Font.BOLD, 37));
		standardlbl.setBackground(new Color(0, 255, 255));
		standardlbl.setBounds(585, 80, 147, 41);
		standardPanel.add(standardlbl);
		
		JLabel pricelbl = new JLabel("2500");
		pricelbl.setFont(new Font("Garamond", Font.BOLD, 37));
		pricelbl.setBackground(Color.CYAN);
		pricelbl.setBounds(585, 132, 147, 41);
		standardPanel.add(pricelbl);
		
		JLabel magneticlbl = new JLabel("Magnetic");
		magneticlbl.setFont(new Font("Garamond", Font.BOLD, 30));
		magneticlbl.setBackground(Color.CYAN);
		magneticlbl.setBounds(585, 184, 147, 41);
		standardPanel.add(magneticlbl);
		
		JLabel magneticpricelbl = new JLabel("3500");
		magneticpricelbl.setFont(new Font("Garamond", Font.BOLD, 37));
		magneticpricelbl.setBackground(Color.CYAN);
		magneticpricelbl.setBounds(585, 246, 147, 41);
		standardPanel.add(magneticpricelbl);
		
		JLabel Standard4r = new JLabel("");
		Standard4r.setBounds(10, 32, 558, 338);
		standardPanel.add(Standard4r);
		Standard4r.setIcon(twinstrippicture);
	}

}
