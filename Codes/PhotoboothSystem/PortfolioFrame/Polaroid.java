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

public class Polaroid extends JFrame {

	private JPanel contentPane;
	private ImageIcon twinstrippicture = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\packagepanelImga\\4r - 10.png")
					.getImage().getScaledInstance(387, 420, Image.SCALE_DEFAULT));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Polaroid frame = new Polaroid();
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
	public Polaroid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(341, 203, 569, 478);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel polaroidPanel = new JPanel();
		polaroidPanel.setBackground(new Color(224, 255, 118));
		polaroidPanel.setBounds(0, 0, 568, 489);
		contentPane.add(polaroidPanel);
		polaroidPanel.setLayout(null);
		
		JLabel polaroidlbl = new JLabel("");
		polaroidlbl.setIcon(twinstrippicture);
		polaroidlbl.setBounds(10, 11, 584, 478);
		polaroidPanel.add(polaroidlbl);
		
		JLabel standardlbl = new JLabel("Standard");
		standardlbl.setFont(new Font("Garamond", Font.BOLD, 37));
		standardlbl.setBackground(new Color(0, 255, 255));
		standardlbl.setBounds(407, 86, 147, 41);
		polaroidPanel.add(standardlbl);
		
		JLabel pricelbl = new JLabel("2800");
		pricelbl.setFont(new Font("Garamond", Font.BOLD, 37));
		pricelbl.setBackground(Color.CYAN);
		pricelbl.setBounds(407, 138, 147, 41);
		polaroidPanel.add(pricelbl);
		
		JLabel magneticlbl = new JLabel("Magnetic");
		magneticlbl.setFont(new Font("Garamond", Font.BOLD, 30));
		magneticlbl.setBackground(Color.CYAN);
		magneticlbl.setBounds(407, 208, 147, 41);
		polaroidPanel.add(magneticlbl);
		
		JLabel magneticpricelbl = new JLabel("3800");
		magneticpricelbl.setFont(new Font("Garamond", Font.BOLD, 37));
		magneticpricelbl.setBackground(Color.CYAN);
		magneticpricelbl.setBounds(407, 270, 147, 41);
		polaroidPanel.add(magneticpricelbl);
	}

}
