package PhotoboothBookingSystem;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import javax.swing.border.MatteBorder;

import com.toedter.calendar.JCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import Dashboard.PanelDashboard;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;

public class StandardPanel extends JPanel {
	
	/// == layout Standard / 4r picture==
		private ImageIcon four1 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\1.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four2 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\2.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four3 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\3.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four4 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\4.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four5 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\5.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four6 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\6.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four7 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\7.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four8 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\8.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four9 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\9.png")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four10 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\10.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four11 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\11.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four12 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\12.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four13 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\13.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four14 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\14.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four15 = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\15.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four16 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\16.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four17 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\17.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four18 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\18.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four19 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\19.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four20 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\20.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		private ImageIcon four21 = new ImageIcon(
					new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\21.jpg")
					.getImage().getScaledInstance(790, 361, Image.SCALE_DEFAULT));
		
		private ImageIcon atm = new ImageIcon(
				new ImageIcon("C:\\Users\\Windows 10\\eclipse-workspace\\BlissfulShotPhotoBooth\\SourceImage\\BookingSystemStandardImage\\credit.png")
				.getImage().getScaledInstance(426, 221, Image.SCALE_DEFAULT));
		
		
		public static String[] layoutStandardChoose = { "Choose 4R/Standard Layout Design", "1. Disney Princess (Arial)", "2. Butterfly", "3. Wreck it ralph (Vanellope)",
				"4. Flower Roses" , "5. BTS" , "6. Barbie" , "7. Frozen" , "8. Encanto", "9. Jungle", "10. Flower (2)","11. Racing", "12. Disney Princess (Arial2)",
				"13. SuperDad", "14. Ligthing Mcqueen", "15. Mickey Mouse", "16. Disney Princess (Cinderella)", 
				"17. Umbrella","18. 80's","19. Unicorn","20. Smurf","21. Babyshark"};	
	
		private JComboBox standardComboBox;
		private JPanel buttonStandardPanel;
		private JPanel buttonInsertDesignPanel;
		private  JPanel buttonBooknowPanel;
		private JPanel  paymentPanel;
		private JLabel showStandardPictureLbl;
		private JLabel  standardlayoutlbl;
		public static String filename;
	    public static String fileName; // for jchooser file
	    private JTextField eventplaceField;
	    private JTextField confirmationNameField;
	    private JTextField PhoneNumberField;
	    private JButton fileButton;
	    private JTextField TotaltextField;
	    private JTextField EnterName;
	    private JTextField Amount;
	    private JPasswordField enterPINfield;
	    private JPanel  buttoncheckoutpanel;
	    private JCheckBox magneticchckbox;
	    private  JPanel buttonpurchase;
	    private JDateChooser dateChooser;
	    private java.util.Date selectedDate;
	    
	    public static String magneticPrice;
	    public static String designPrice;
	    public static String layoutName;
	    public static String ownlayoutPrice;
	    public static String ownlayoutDesign;
	    public static Double totalPrice;
	    public static String totalprices;
	    public static String firstName;
	    public static String phoneNumber;
	    public static String eventPlaces;
	    public static String designLayout;
	    public static String formattedDate;
	    public static String amounts;
	/**
	 * Create the panel.
	 */
	public StandardPanel() {
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
	    scrollContent.setPreferredSize(new Dimension(1001, 1990)); // increase the size of the panel to fit all 9 labels
	    scrollPane.setViewportView(scrollContent);
	       
	    
	    JPanel showstandardPanel = new JPanel();
	    showstandardPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    showstandardPanel.setBackground(new Color(255, 255, 255));
	    showstandardPanel.setBounds(186, 11, 885, 417);
	    scrollContent.add(showstandardPanel);
	    showstandardPanel.setLayout(null);
	    
	    JLabel standardbookingsystemlbl = new JLabel("Standard Booking System");
	    standardbookingsystemlbl.setFont(new Font("Anton", Font.PLAIN, 25));
	    standardbookingsystemlbl.setBounds(315, 0, 317, 48);
	    showstandardPanel.add(standardbookingsystemlbl);
	    
	    // this is why reason why you select design on combo box will show
	    showStandardPictureLbl = new JLabel("");
	    showStandardPictureLbl.setBounds(58, 45, 790, 361);
	    showstandardPanel.add(showStandardPictureLbl);
	    
	    
	    JPanel step1Panel = new JPanel();
	    step1Panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    step1Panel.setBackground(new Color(255, 255, 255));
	    step1Panel.setBounds(186, 430, 885, 83);
	    scrollContent.add(step1Panel);
	    step1Panel.setLayout(null);
	    
	    JLabel step1text = new JLabel("Step 1: Click on \" Standard Photo Layout\" to display the layout options for choosing a design.");
	    step1text.setFont(new Font("Anton", Font.PLAIN, 15));
	    step1text.setBounds(173, 0, 586, 23);
	    step1Panel.add(step1text);
	    
	    buttonStandardPanel = new JPanel();
	    buttonStandardPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    buttonStandardPanel.setBackground(new Color(255, 255, 255));
	    buttonStandardPanel.setBounds(293, 31, 291, 41);
	    buttonStandardPanel.addMouseListener(new PanelButtonMouseAdapter(buttonStandardPanel));
	    step1Panel.add(buttonStandardPanel);
	    buttonStandardPanel.setLayout(null);
	    
	    standardlayoutlbl = new JLabel("Standard Layout");
	    standardlayoutlbl.setFont(new Font("Anton", Font.PLAIN, 16));
	    standardlayoutlbl.setBounds(90, 0, 122, 41);
	    buttonStandardPanel.add(standardlayoutlbl);
	    
	    JPanel step2Panel = new JPanel();
	    step2Panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    step2Panel.setBackground(new Color(255, 255, 255));
	    step2Panel.setBounds(186, 524, 885, 75);
	    scrollContent.add(step2Panel);
	    step2Panel.setLayout(null);
	    
	    JLabel lblStepSelect = new JLabel("Step 2: Select the desired design for the photo layout.");
	    lblStepSelect.setFont(new Font("Anton", Font.PLAIN, 15));
	    lblStepSelect.setBounds(173, 0, 358, 23);
	    step2Panel.add(lblStepSelect);
	    // combo box standard
	    standardComboBox = new JComboBox(layoutStandardChoose);
	    standardComboBox.setFont(new Font("Anton", Font.PLAIN, 15));
	    standardComboBox.setBounds(263, 36, 391, 28);
	    standardComboBox.setVisible(false); // Initially hide the standardComboBox
	    step2Panel.add(standardComboBox);
	    standardComboBox.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		        if (e.getStateChange() == ItemEvent.SELECTED) {
		            String selectedlayout = standardComboBox.getSelectedItem().toString();
		            switch (selectedlayout) {
		            case "Choose 4R/Standard Layout Design":
		            	showStandardPictureLbl.setIcon(null);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "1. Disney Princess (Arial)":
		            	showStandardPictureLbl.setIcon(four1);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "2. Butterfly":
		            	showStandardPictureLbl.setIcon(four2);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "3. Wreck it ralph (Vanellope)":
		            	showStandardPictureLbl.setIcon(four3);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "4. Flower Roses":
		            	showStandardPictureLbl.setIcon(four4);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "5. BTS":
		            	showStandardPictureLbl.setIcon(four5);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "6. Barbie":
		            	showStandardPictureLbl.setIcon(four6);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "7. Frozen":
		            	showStandardPictureLbl.setIcon(four7);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "8. Encanto":
		            	showStandardPictureLbl.setIcon(four8);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "9. Jungle":
		            	showStandardPictureLbl.setIcon(four9);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "10. Flower (2)":
		            	showStandardPictureLbl.setIcon(four10);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "11. Racing":
		            	showStandardPictureLbl.setIcon(four11);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "12. Disney Princess (Arial2)":
		            	showStandardPictureLbl.setIcon(four12);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "13. SuperDad":
		            	showStandardPictureLbl.setIcon(four13);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "14. Ligthing Mcqueen":
		            	showStandardPictureLbl.setIcon(four14);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "15. Mickey Mouse":
		            	showStandardPictureLbl.setIcon(four15);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "16. Disney Princess (Cinderella)":
		            	showStandardPictureLbl.setIcon(four16);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "17. Umbrella":
		            	showStandardPictureLbl.setIcon(four17);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "18. 80's":
		            	showStandardPictureLbl.setIcon(four18);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "19. Unicorn":
		            	showStandardPictureLbl.setIcon(four19);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "20. Smurf":
		            	showStandardPictureLbl.setIcon(four20);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            case "21. Babyshark":
		            	showStandardPictureLbl.setIcon(four21);
		            	showStandardPictureLbl.setBounds(58, 45, 790, 361);
		                break;
		            default:
		            	showStandardPictureLbl.setIcon(null);
		                break;
		            }
		        }
		    }
		});
	    
	    JPanel step3panel = new JPanel();
	    step3panel.setLayout(null);
	    step3panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    step3panel.setBackground(Color.WHITE);
	    step3panel.setBounds(186, 605, 885, 577);
	    scrollContent.add(step3panel);
	    
	    JLabel lblStepIf = new JLabel("Step 3: If you have your own design, select any layout style that represents your design.");
	    lblStepIf.setFont(new Font("Anton", Font.PLAIN, 15));
	    lblStepIf.setBounds(173, 0, 549, 48);
	    step3panel.add(lblStepIf);
	    
	    buttonInsertDesignPanel = new JPanel();
	    buttonInsertDesignPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    buttonInsertDesignPanel.setBackground(new Color(255, 255, 255));
	    buttonInsertDesignPanel.setBounds(288, 40, 291, 41);
	    buttonInsertDesignPanel.addMouseListener(new PanelButtonMouseAdapter2(buttonInsertDesignPanel));
	    step3panel.add(buttonInsertDesignPanel);
	    buttonInsertDesignPanel.setLayout(null);
	   
	    JLabel insertyourowndesigntextlbl = new JLabel("Insert your Own Design");
	    insertyourowndesigntextlbl.setFont(new Font("Anton", Font.PLAIN, 15));
	    insertyourowndesigntextlbl.setBounds(69, 0, 181, 41);
	    buttonInsertDesignPanel.add(insertyourowndesigntextlbl);
	    
	    JLabel lblStepSelect2 = new JLabel("Step 4: Select Date of Main Event");
	    lblStepSelect2.setFont(new Font("Anton", Font.PLAIN, 15));
	    lblStepSelect2.setBounds(173, 105, 549, 48);
	    step3panel.add(lblStepSelect2);
	    
	    JPanel calendarPanel = new JPanel();
		calendarPanel.setBounds(911, 24, 322, 228);
		step3panel.add(calendarPanel);
		calendarPanel.setLayout(null);
		
		JLabel lblStepFill = new JLabel("Step 5: Fill out the entire form.");
		lblStepFill.setFont(new Font("Anton", Font.PLAIN, 15));
		lblStepFill.setBounds(173, 317, 549, 48);
		step3panel.add(lblStepFill);
		
		eventplaceField = new JTextField();
		eventplaceField.setFont(new Font("Anton", Font.PLAIN, 15));
		eventplaceField.setText("Enter Event Place");
		eventplaceField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		eventplaceField.setBounds(217, 362, 426, 48);
		eventplaceField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (eventplaceField.getText().equals("")) {
					eventplaceField.setForeground(new Color(96, 96, 96));
					eventplaceField.setText("Enter Event Place");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (eventplaceField.getText().equals("Enter Event Place")) {
					eventplaceField.setForeground(Color.BLACK);
					eventplaceField.setText("");
				}
			}
		});
		step3panel.add(eventplaceField);
		eventplaceField.setColumns(10);
		
		
		confirmationNameField = new JTextField();
		confirmationNameField.setFont(new Font("Anton", Font.PLAIN, 15));
		confirmationNameField.setText("Enter Confirmation Name");
		confirmationNameField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		confirmationNameField.setColumns(10);
		confirmationNameField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (confirmationNameField.getText().equals("")) {
					confirmationNameField.setForeground(new Color(96, 96, 96));
					confirmationNameField.setText("Enter Confirmation Name");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (confirmationNameField.getText().equals("Enter Confirmation Name")) {
					confirmationNameField.setForeground(Color.BLACK);
					confirmationNameField.setText("");
				}
			}
		});
		confirmationNameField.setBounds(217, 441, 426, 48);
		step3panel.add(confirmationNameField);
		
		PhoneNumberField = new JTextField();
		PhoneNumberField.setFont(new Font("Anton", Font.PLAIN, 15));
		PhoneNumberField.setText("Enter Contact Number");
		PhoneNumberField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		PhoneNumberField.setColumns(10);
		PhoneNumberField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (PhoneNumberField.getText().equals("")) {
					PhoneNumberField.setForeground(new Color(96, 96, 96));
					PhoneNumberField.setText("Enter Contact Number");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (PhoneNumberField.getText().equals("Enter Contact Number")) {
					PhoneNumberField.setForeground(Color.BLACK);
					PhoneNumberField.setText("");
				}
			}
		});
		PhoneNumberField.setBounds(217, 506, 426, 48);
		step3panel.add(PhoneNumberField);
		
		dateChooser = new JDateChooser();
		dateChooser.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
		dateChooser.setBounds(288, 164, 281, 41);
		step3panel.add(dateChooser);
		
		
		fileButton = new JButton("Insert File");
		fileButton.setFont(new Font("Anton", Font.PLAIN, 10));
		fileButton.setBounds(365, 27, 120, 37);
		fileButton.setVisible(false); // Set the fileButton initially invisible
		step2Panel.add(fileButton);

		fileButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JFileChooser fileChooser = new JFileChooser();
		        int returnValue = fileChooser.showOpenDialog(null);
		        if (returnValue == JFileChooser.APPROVE_OPTION) {
		            File selectedFile = fileChooser.getSelectedFile();
		            fileName = selectedFile.getName();
		            fileButton.setText(fileName);

		            // Display the selected file in showStandardPictureLbl
		            ImageIcon imageIcon = new ImageIcon(
		                    new ImageIcon(selectedFile.getAbsolutePath())
		                            .getImage()
		                            .getScaledInstance(790, 361, Image.SCALE_DEFAULT)
		            );
		            showStandardPictureLbl.setIcon(imageIcon);
		        }
        // Save the file name in a text file
        
        try {
            FileWriter writer = new FileWriter("C:\\data.txt", true);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        			}
				}
			
		});
		
		JPanel Step6panel = new JPanel();
		Step6panel.setLayout(null);
		Step6panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		Step6panel.setBackground(Color.WHITE);
		Step6panel.setBounds(186, 1186, 885, 301);
		scrollContent.add(Step6panel);
		
		JLabel lblStepDo = new JLabel("Step 6: Do you want your picture to be magnetic? It's up to you if you want it or not. There is");
		lblStepDo.setFont(new Font("Anton", Font.PLAIN, 15));
		lblStepDo.setBounds(173, 11, 579, 48);
		Step6panel.add(lblStepDo);
		
		magneticchckbox = new JCheckBox("             Magnetic");
		magneticchckbox.setFont(new Font("Anton", Font.PLAIN, 15));
		magneticchckbox.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(122, 244, 222)));
		magneticchckbox.setBounds(331, 83, 193, 48);
		Step6panel.add(magneticchckbox);
		
		JLabel lblStepClick = new JLabel("Step 7: Click \"Check Out\" if you want to see the total price.");
		lblStepClick.setFont(new Font("Anton", Font.PLAIN, 15));
		lblStepClick.setBounds(173, 142, 549, 48);
		Step6panel.add(lblStepClick);
		
		JLabel lblAnAdditionalCost = new JLabel("an additional cost of 1000 if you want it to be magnetic.");
		lblAnAdditionalCost.setFont(new Font("Anton", Font.PLAIN, 15));
		lblAnAdditionalCost.setBounds(173, 31, 579, 48);
		Step6panel.add(lblAnAdditionalCost);
		
		buttoncheckoutpanel = new JPanel();
		buttoncheckoutpanel.setLayout(null);
		buttoncheckoutpanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
		buttoncheckoutpanel.setBackground(Color.WHITE);
		buttoncheckoutpanel.setBounds(278, 187, 291, 41);
		buttoncheckoutpanel.addMouseListener(new PanelButtonMouseAdapter3(buttoncheckoutpanel));
		Step6panel.add(buttoncheckoutpanel);
		
		JLabel lblCheckOut = new JLabel("Check Out");
		lblCheckOut.setFont(new Font("Anton", Font.PLAIN, 15));
		lblCheckOut.setBounds(108, 0, 142, 41);
		buttoncheckoutpanel.add(lblCheckOut);
		
		JLabel lblTotal = new JLabel("Total :");
		lblTotal.setFont(new Font("Anton", Font.PLAIN, 15));
		lblTotal.setBounds(217, 239, 51, 48);
		Step6panel.add(lblTotal);
		
		TotaltextField = new JTextField();
		TotaltextField.setFont(new Font("Anton", Font.PLAIN, 15));
		TotaltextField.setBounds(278, 239, 291, 48);
		Step6panel.add(TotaltextField);
		TotaltextField.setEditable(false);
		TotaltextField.setColumns(10);
	    
		JPanel Step8panel = new JPanel();
	    Step8panel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    Step8panel.setBackground(new Color(255, 255, 255));
	    Step8panel.setBounds(186, 1500, 885, 428);
	    scrollContent.add(Step8panel);
	    Step8panel.setLayout(null);
	    
	    JLabel lblStepIs = new JLabel("Step 8: Is the price acceptable to you? If yes, click \"Book Now!\".");
	    lblStepIs.setBounds(173, 11, 549, 48);
	    Step8panel.add(lblStepIs);
	    lblStepIs.setFont(new Font("Anton", Font.PLAIN, 15));
	    
	     buttonBooknowPanel = new JPanel();
	    buttonBooknowPanel.setBounds(278, 57, 291, 41);
	    Step8panel.add(buttonBooknowPanel);
	    buttonBooknowPanel.setLayout(null);
	    buttonBooknowPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    buttonBooknowPanel.setBackground(Color.WHITE);
	    buttonBooknowPanel.addMouseListener(new PanelButtonMouseAdapter4(buttonBooknowPanel));
	 
	    
	    JLabel lblBookNow = new JLabel("Book Now!");
	    lblBookNow.setFont(new Font("Anton", Font.PLAIN, 15));
	    lblBookNow.setBounds(108, 0, 142, 41);
	    buttonBooknowPanel.add(lblBookNow);
	    
	    paymentPanel = new JPanel();
	    paymentPanel.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
	    paymentPanel.setBackground(new Color(255, 255, 255));
	    paymentPanel.setBounds(91, 109, 720, 292);
	    paymentPanel.setVisible(false); // Initially hide the paymentPanel
	    Step8panel.add(paymentPanel);
	    paymentPanel.setLayout(null);
	    
	    JLabel atmlbl = new JLabel("");
	    atmlbl.setFont(new Font("Anton", Font.PLAIN, 15));
	    atmlbl.setIcon(atm);
	    atmlbl.setBounds(10, 11, 426, 221);
	    paymentPanel.add(atmlbl);
	    
	    EnterName = new JTextField();
	    EnterName.setFont(new Font("Anton", Font.PLAIN, 15));
	    EnterName.setBounds(446, 88, 264, 46);
	    EnterName.setText("Enter Name");
	    EnterName.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
	    EnterName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (EnterName.getText().equals("")) {
					EnterName.setForeground(new Color(96, 96, 96));
					EnterName.setText("Enter Name");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (EnterName.getText().equals("Enter Name")) {
					EnterName.setForeground(Color.BLACK);
					EnterName.setText("");
				}
			}
		});
	    paymentPanel.add(EnterName);
	    EnterName.setColumns(10);
	    
	    Amount = new JTextField();
	    Amount.setFont(new Font("Anton", Font.PLAIN, 15));
	    Amount.setColumns(10);
	    Amount.setText("Enter Amount");
	    Amount.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
	    Amount.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (Amount.getText().equals("")) {
					Amount.setForeground(new Color(96, 96, 96));
					Amount.setText("Enter Amount");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (Amount.getText().equals("Enter Amount")) {
					Amount.setForeground(Color.BLACK);
					Amount.setText("");
				}
			}
		});
	    Amount.setBounds(446, 145, 264, 46);
	    paymentPanel.add(Amount);
	    
	    enterPINfield= new JPasswordField();
	    enterPINfield.setText("Enter PIN Number");
	    enterPINfield.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(122, 244, 222)));
	    enterPINfield.addFocusListener(new FocusAdapter(){
			@Override
			public void focusLost(FocusEvent e) {
				if (enterPINfield.getText().equals("")) {
					enterPINfield.setForeground(new Color(96, 96, 96));
					enterPINfield.setText("Enter PIN Number");
					enterPINfield.setEchoChar((char) 0);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (enterPINfield.getText().equals("Enter PIN Number")) {
					enterPINfield.setEchoChar('●');
					enterPINfield.setForeground(Color.BLACK);
					enterPINfield.setText("");
				}
			}

		});
	    enterPINfield.setForeground(new Color(96, 96, 96));
	    enterPINfield.setEchoChar('●');
	    enterPINfield.setBounds(446, 31, 264, 46);
	    paymentPanel.add(enterPINfield);
	    
	    buttonpurchase = new JPanel();
	    buttonpurchase.setLayout(null);
	    buttonpurchase.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(102, 244, 222)));
	    buttonpurchase.setBackground(Color.WHITE);
	    buttonpurchase.setBounds(482, 202, 203, 46);
	    buttonpurchase.addMouseListener(new PanelButtonMouseAdapter5(buttonpurchase));
	    paymentPanel.add(buttonpurchase);
	    
	    JLabel lblPur = new JLabel("Purchase ");
	    lblPur.setFont(new Font("Anton", Font.PLAIN, 15));
	    lblPur.setBounds(67, 0, 126, 41);
	    buttonpurchase.add(lblPur);
	    
	    scrollPane.setPreferredSize(new Dimension(1500, 500)); // set the size of the scroll pane to fit the labels

	}
	private class PanelButtonMouseAdapter extends MouseAdapter{
		
		JPanel panel;
		 boolean isComboBoxVisible = false;
		 
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
	    public void mouseEntered(MouseEvent e){
						
			panel.setBackground(new Color(102, 244, 222));
		}
					
		@Override
		public void mouseExited(MouseEvent e) {
	        if (!isComboBoxVisible) {
	            panel.setBackground(new Color(240, 240, 240));
	        }
	    }
					
		@Override
		public void mousePressed(MouseEvent e) {
	        panel.setBackground(new Color(102, 244, 222));
	        if (isComboBoxVisible) {
	            standardComboBox.setVisible(false);
	            isComboBoxVisible = false;
	        } else {
	            standardComboBox.setVisible(true);
	            isComboBoxVisible = true;
	        }
	        
		}
	    
		@Override
	   public void mouseReleased(MouseEvent e){
		  panel.setBackground(new Color(102, 244, 222));
		   }
		}	
	
	private class PanelButtonMouseAdapter2 extends MouseAdapter{
		
		 JPanel panel2;
		 boolean isButtonVisible = false;
		 
		 public PanelButtonMouseAdapter2(JPanel panel2) {
			    this.panel2 = panel2;
			}

			public void mouseEntered(MouseEvent e){
			    panel2.setBackground(new Color(102, 244, 222));
			}

			@Override
			public void mouseExited(MouseEvent e) {
			    if (!isButtonVisible) {
			        panel2.setBackground(new Color(255, 255, 255));
			    }
			}

			@Override
			public void mousePressed(MouseEvent e) {
			    panel2.setBackground(new Color(102, 244, 222));
			    if (isButtonVisible) {
			        fileButton.setVisible(false);
			        isButtonVisible = false;
			    } else {
			        fileButton.setVisible(true);
			        isButtonVisible = true;
			    }
			}

			@Override
			public void mouseReleased(MouseEvent e){
			    panel2.setBackground(new Color(102, 244, 222));
			}
	}
	

	private class PanelButtonMouseAdapter3 extends MouseAdapter{
	    
	    JPanel panel3;
	    boolean isButtonVisible = false;
	     
	    public PanelButtonMouseAdapter3(JPanel panel3) {
	        this.panel3 = panel3;
	    }

	    public void mouseEntered(MouseEvent e){
	        panel3.setBackground(new Color(102, 244, 222));
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {
	        panel3.setBackground(new Color(240, 240, 240));
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {
	        panel3.setBackground(new Color(102, 244, 222));
	        
	        PhotoboothPricingEncapsulation ppe = new PhotoboothPricingEncapsulation();
	        PanelDashboard pd = new PanelDashboard();

	        layoutName = standardlayoutlbl.getText();
	        ownlayoutPrice = fileButton.getText().toString();

	        designPrice = standardComboBox.getSelectedItem().toString();

	        if (magneticchckbox.isSelected()) {
	            magneticPrice = magneticchckbox.getText();
	        } else {
	            magneticPrice = null; // Set magneticPrice to null if the checkbox is not selected;
	        }

	        if (ownlayoutPrice.isEmpty()) {
	            ownlayoutPrice = null; // Set ownlayoutPrice to null if fileButton.getText() is empty;
	        }

	        if (designPrice.isEmpty()) {
	            designPrice = null; // Set designPrice to null if standardComboBox.getSelectedItem() is empty;
	        }

	        totalPrice = ppe.calculatePackageStandard(designPrice, magneticPrice);
	        totalPrice = ppe.calculatePackageStandard2(ownlayoutPrice, magneticPrice);
	        TotaltextField.setText(Double.toString(totalPrice));

	        
	       
	    }

	    @Override
	    public void mouseReleased(MouseEvent e){
	        panel3.setBackground(new Color(102, 244, 222));
	    }
	}

	
	private class PanelButtonMouseAdapter4 extends MouseAdapter{
		
		JPanel panel4;
		boolean isPaymentButton = false;

		public PanelButtonMouseAdapter4(JPanel panel4) {
		    this.panel4 = panel4;
		}

		public void mouseEntered(MouseEvent e){
		    panel4.setBackground(new Color(102, 244, 222));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!isPaymentButton) {
		        panel4.setBackground(new Color(255, 255, 255));
		    }
		    
		}

		@Override
		public void mousePressed(MouseEvent e) {
		    panel4.setBackground(new Color(102, 244, 222));
		    if (isPaymentButton) {
		    	paymentPanel.setVisible(false);
		        isPaymentButton = false;
		    } else {
		    	paymentPanel.setVisible(true);
		        isPaymentButton = true;
		    }
		
		  
		}

		@Override
		public void mouseReleased(MouseEvent e){
		    panel4.setBackground(new Color(102, 244, 222));
		}
	}
	
	private class PanelButtonMouseAdapter5 extends MouseAdapter{
		
		JPanel panel5;
		boolean isPaymentButton = false;

		public PanelButtonMouseAdapter5(JPanel panel5) {
		    this.panel5 = panel5;
		}

		public void mouseEntered(MouseEvent e){
		    panel5.setBackground(new Color(102, 244, 222));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (!isPaymentButton) {
		        panel5.setBackground(new Color(255, 255, 255));
		    }
		    
		}

		@Override
		public void mousePressed(MouseEvent e) {
		    panel5.setBackground(new Color(102, 244, 222));
		    
		 // ...

		    PanelDashboard pD = new PanelDashboard();

		    ownlayoutDesign = fileButton.getText().toString();
		    designLayout = standardComboBox.getSelectedItem().toString();
		    eventPlaces = eventplaceField.getText().toString();
		    firstName = confirmationNameField.getText().toString();
		    phoneNumber = PhoneNumberField.getText();

		    selectedDate = dateChooser.getDate(); // Get the selected date from dateChooser

		    if (ownlayoutDesign.isEmpty() || designLayout.isEmpty() || eventPlaces.isEmpty() || firstName.isEmpty() || phoneNumber.isEmpty() || selectedDate == null) {
		        // Show fail message (fill out all steps in booking system)
		        JOptionPane.showMessageDialog(null, "Please fill out all steps in the booking system.");
		    } else {
		        double amount1 = 3000.0;
		        double amount2 = 2500.0;
		        double totalAmount;

		        if (enterPINfield.getText().equals("123456")) {
		            try {
		                totalAmount = Double.parseDouble(Amount.getText());

		                if (totalAmount == amount1 || totalAmount == amount2) {
		                    // Format the selected date to your desired format (e.g., yyyy-MM-dd)
		                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		                    String formattedDate = dateFormat.format(selectedDate);

		                    // Write data to the file
		                    FileWriter writer = new FileWriter("C:\\data.txt", true);
		                    writer.write("First Name , Phone Number , Event Place , Amount , Layout , Design , FileName , Date\n" + firstName + "/" + phoneNumber + "/" + eventPlaces + "/" + totalAmount + "/" + "Standard" + "/" + designLayout + "/" + ownlayoutDesign + "/" + formattedDate);
		                    writer.close();

		                    // Update incomeLbl label
		                    pD.incomeLbl.setText("Income: $" + String.format("%.2f", totalAmount));

		                    // Show success message
		                    JOptionPane.showMessageDialog(null, "Booking successful! See you at the event!");
		                } else if (totalAmount < amount1 && totalAmount < amount2) {
		                    // Show fail payment message (insufficient amount)
		                    JOptionPane.showMessageDialog(null, "Payment failed! Insufficient amount.");
		                } else if (totalAmount > amount1 || totalAmount > amount2) {
		                    JOptionPane.showMessageDialog(null, "Payment failed! Overpayment.");
		                }
		            } catch (NumberFormatException | IOException ex) {
		                ex.printStackTrace();
		            }
		        } else {
		            // Show fail PIN message
		            JOptionPane.showMessageDialog(null, "PIN incorrect. Payment failed.");
		        }
		    }
    
		}

		@Override
		public void mouseReleased(MouseEvent e){
		    panel5.setBackground(new Color(102, 244, 222));
		}
	}
}
