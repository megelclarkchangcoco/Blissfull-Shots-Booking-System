package Dashboard;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;



public class PanelDashboard extends JPanel {
	private ImageIcon homeImage = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\clipboard.png")
					.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
		
	private ImageIcon pesosIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\peso.png")
			.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
	
	private ImageIcon atmIcon = new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\atm-machine.png")
			.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
	private JPanel contentPane;
	private JTable table;
	private JPanel viewPanel;
	private JPanel mainPanel;
	private JPanel incomePanel;
	private JScrollPane scrollPane;
	public static JLabel incomeLbl;
	public static JPanel IncomePanel ;
	
	    

	 
	
	public static void main(String[] args) {
	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(100, 100, 1084, 628);
	    PanelDashboard panelDashboard = new PanelDashboard();
	    frame.getContentPane().add(panelDashboard);
	    frame.setVisible(true);
	}

   
	
	public PanelDashboard() {

		setBounds(196, 90, 1084, 628);
		setLayout(null);
		mainPanel = new JPanel();
		mainPanel.setBounds(-20, 0, 1150, 628);  
		add(mainPanel);
		mainPanel.setLayout(null);
		
		viewPanel  = new JPanel();
		viewPanel.setBackground(new Color(188, 233, 227));
		viewPanel.setLayout(null);
		viewPanel.addMouseListener(new PanelButtonMouseAdapter(viewPanel));
		viewPanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(2, 4, 5), null));
		viewPanel.setBounds(482, 69, 235, 83);
		mainPanel.add(viewPanel);	

		viewPanel.setBounds(122, 69, 235, 83);
		mainPanel.add(viewPanel);
		viewPanel.setLayout(null);
		
		JLabel homeLbl = new JLabel("View Book");
		homeLbl.setBackground(new Color(188, 233, 227));
		homeLbl.setFont(new Font("Dialog", Font.BOLD, 14));
		homeLbl.setIcon(homeImage);
		homeLbl.setBounds(53, 27, 150, 25);
		viewPanel.add(homeLbl);
		
		incomePanel = new JPanel();
		incomePanel.setBackground(new Color(188, 233, 227));
		incomePanel.setLayout(null);
		incomePanel.addMouseListener(new PanelButtonMouseAdapter(incomePanel));
		incomePanel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, new Color(2, 4, 5), null));
		incomePanel.setBounds(482, 69, 235, 83);
		mainPanel.add(incomePanel);
		
		incomeLbl = new JLabel("Income");
		incomeLbl.setIcon(pesosIcon);
		incomeLbl.setFont(new Font("Dialog", Font.BOLD, 14));
		incomeLbl.setBounds(53, 27, 150, 25);
		incomePanel.add(incomeLbl);
		
		
	}

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
		public void mousePressed(MouseEvent e) {
		    panel.setBackground(new Color(250, 246, 110));

		    // Read and populate the JTable with data from the text file
		    String filepath = "C:\\data.txt";
		    File file = new File(filepath);

		    DefaultTableModel model = new DefaultTableModel();
		    model.addColumn("First Name");
		    model.addColumn("Phone Number");
		    model.addColumn("Event Place");
		    model.addColumn("Amount");
		    model.addColumn("Layout");
		    model.addColumn("Design");
		    model.addColumn("FileName");
		    model.addColumn("Date");

		    try {
		        BufferedReader br = new BufferedReader(new FileReader(file));
		        String firstLine = br.readLine().trim();
		        String[] columnsName = firstLine.split(",");
		        model.setColumnIdentifiers(columnsName);

		        Object[] tableLines = br.lines().toArray();

		        for (int i = 0; i < tableLines.length; i++) {
		            String line = tableLines[i].toString().trim();
		            String[] dataRow = line.split("/");
		            model.addRow(dataRow);
		        }

		        br.close();
		    }  catch (IOException e1) {
		        e1.printStackTrace();
		    }

		    JTable table = new JTable(model);
		    table.setDefaultEditor(Object.class, null);

		    JScrollPane scrollPane = new JScrollPane(table);
		    scrollPane.setBounds(122, 180, 955, 391);
		    mainPanel.add(scrollPane);

		    JButton confirmbtn = new JButton("Confirm");
		    confirmbtn.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            // Get the selected rows
		            int[] selectedRows = table.getSelectedRows();
		            double totalIncome = 0.0;

		            // Calculate the total income from the selected rows
		            for (int row : selectedRows) {
		                double amount = Double.parseDouble(table.getValueAt(row, 3).toString());
		                totalIncome += amount;
		            }

		            // Set the text of incomeLbl to show the total income
		            incomeLbl.setText("Income: " + totalIncome);

		            // Display confirmation dialog
		            int confirmOption = JOptionPane.showConfirmDialog(null, "Book confirmed?", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
		            if (confirmOption == JOptionPane.OK_OPTION) {
		                // User clicked OK
		                // Perform additional actions here
		            }
		        }
		    });
		    confirmbtn.setBounds(988, 583, 89, 23);
		    mainPanel.add(confirmbtn);




		    
		   
		}
		
		@Override
		public void mouseReleased(MouseEvent e){
			panel.setBackground(new Color(250,  246, 110));
		}
	
	
	}
}
