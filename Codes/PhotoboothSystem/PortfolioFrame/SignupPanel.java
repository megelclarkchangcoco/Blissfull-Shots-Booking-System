package PortfolioFrame;

import java.awt.CardLayout;
import PhotoboothBookingSystem.BookingBoardFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;




public class SignupPanel extends JPanel {
	
	private ImageIcon logosignupb= new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\Blissful Shots\\New folder\\blissful shots logo.png")
					.getImage().getScaledInstance(429, 419, Image.SCALE_DEFAULT));
	
	private ImageIcon signupbackground = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\background2.jpg")
					.getImage().getScaledInstance(1305, 633, Image.SCALE_DEFAULT));
	
	private ImageIcon appLogo = new ImageIcon(new  ImageIcon(
			"C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\HomePage.jpg")
			.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)); 
	
	private ImageIcon registerLogo =new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\Logo.jpg")
			.getImage().getScaledInstance(258, 78, Image.SCALE_DEFAULT));
	private ImageIcon xIcon =new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\close.png")
			.getImage().getScaledInstance(35, 35, Image.SCALE_DEFAULT)); 
	private ImageIcon EmailIcon =new ImageIcon(
			new ImageIcon("CC:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\email.png")
			.getImage().getScaledInstance(34, 40, Image.SCALE_DEFAULT));
	private ImageIcon PasswordIcon =new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\user.png")
			.getImage().getScaledInstance(34, 40, Image.SCALE_DEFAULT));
	private ImageIcon nameIcon =new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\id-card.png")
			.getImage().getScaledInstance(34, 40, Image.SCALE_DEFAULT));
	private ImageIcon ageIcon =new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\age.png")
			.getImage().getScaledInstance(34, 40, Image.SCALE_DEFAULT));
	private ImageIcon phoneIcon =new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\smartphone.png")
			.getImage().getScaledInstance(34, 40, Image.SCALE_DEFAULT));
	private ImageIcon LoginIcon =new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\login.png")
			.getImage().getScaledInstance(159, 78, Image.SCALE_DEFAULT));
	private ImageIcon RegisterIcon =new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\website (1).png")
			.getImage().getScaledInstance(159, 78, Image.SCALE_DEFAULT));
	private ImageIcon CameraIcon =new ImageIcon(
			new ImageIcon("C:\\Users\\Windows 10\\OneDrive - National University\\OOPproject\\DashboardIcon\\camera (1).png")
			.getImage().getScaledInstance(190, 112, Image.SCALE_DEFAULT));
	
	private JPanel backgroundlbl;
	private JTextField firstnameField;
	private JTextField lastnameField;
	private JTextField phonenumberField;
	private JTextField ageField;
	private JTextField emailaddressField;
	private JPasswordField passwordField;
	private JTextField emailladdressField1;
	private JPasswordField passwordField_1;
	
	
	
	// create an ArrayList to hold instances of the userData class
	private static ArrayList<UserData> loginList = new ArrayList<>(); 


	protected Component frame;
	
	
	
	// create three instances of the userData class and add them to the loginList
	static {
	    UserData login = new UserData("Miguel", "Polison", "1234567890", "20", "user1@bs-photobooth.com", "password1", "Male");
	    UserData login2 = new UserData("Raine", "Briones", "1234567890", "19", "user2@bs-photobooth.com", "password2", "Female");
	    UserData login3 = new UserData("Nicole", "nocumm", "1234567890", "19", "user3@bs-photobooth.com", "password3", "Female");
	    loginList.add(login);
	    loginList.add(login2);
	    loginList.add(login3);
	}
	
	/**
	 * Create the panel.
	 */
	public SignupPanel() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 122, 1280, 780); // Update height to 780
		setLayout(null);
		
		JLabel backgroundlbl = new JLabel();
		backgroundlbl.setBackground(new Color(255, 255, 255));
		backgroundlbl.setIcon(signupbackground); // add to 
		backgroundlbl.setBounds(0, 0, 1372, 633);
		add(backgroundlbl);
    	    
    	    JPanel RegisterPanel = new JPanel();
    	    add(RegisterPanel);
    	    RegisterPanel.setBackground(new Color(255, 255, 255));
    	    RegisterPanel.setBounds(783, 11, 476, 575);
    	    CardLayout cardLayout = new CardLayout();
    	    RegisterPanel.setLayout(cardLayout);
    	    
    	    JPanel LoginPanel = new JPanel();
    	    LoginPanel.setBackground(new Color(106, 241, 236, 250));
    	    RegisterPanel.add(LoginPanel, "login");
    	    LoginPanel.setLayout(null);
    	    
	    JLabel lblNewLabel_1_1_1 = new JLabel("_______");
	    lblNewLabel_1_1_1.setForeground(Color.ORANGE);
	    lblNewLabel_1_1_1.setBounds(159, 115, 86, 14);
	    LoginPanel.add(lblNewLabel_1_1_1);
	    
	    JButton loginFormButton_1 = new JButton("LOGIN");
	    loginFormButton_1.setOpaque(false);
	    loginFormButton_1.setForeground(Color.ORANGE);
	    loginFormButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    loginFormButton_1.setContentAreaFilled(false);
	    loginFormButton_1.setBorderPainted(false);
	    loginFormButton_1.setBounds(140, 101, 86, 22);
	    LoginPanel.add(loginFormButton_1);
	    
	    JButton registerFormButton_1 = new JButton("REGISTER");
	    registerFormButton_1.setOpaque(false);
	    registerFormButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    registerFormButton_1.setContentAreaFilled(false);
	    registerFormButton_1.setBorderPainted(false);
	    registerFormButton_1.setBounds(206, 101, 110, 22);
	    LoginPanel.add(registerFormButton_1);
	    
	    JLabel lblNewLabel_2_1 = new JLabel("___________");
	    lblNewLabel_2_1.setForeground(Color.BLACK);
	    lblNewLabel_2_1.setBounds(226, 115, 86, 14);
	    LoginPanel.add(lblNewLabel_2_1);
	    
	    JPanel RegisterFormPanel = new JPanel();
	    RegisterFormPanel.setBackground(new Color(106, 241, 236, 250));
	    RegisterPanel.add(RegisterFormPanel, "register");
	    RegisterFormPanel.setLayout(null);
	    
	  JButton registerFormButton = new JButton("REGISTER");
	  registerFormButton.setOpaque(false);
	  registerFormButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	  registerFormButton.setContentAreaFilled(false);
	  registerFormButton.setBorderPainted(false);
	  registerFormButton.setBounds(203, 100, 110, 22);
	  RegisterFormPanel.add(registerFormButton);
	  
	  JLabel lblNewLabel_2 = new JLabel("___________");
	  lblNewLabel_2.setForeground(Color.BLACK);
	  lblNewLabel_2.setBounds(223, 114, 86, 14);
	  RegisterFormPanel.add(lblNewLabel_2);
	  
	  JLabel lblNewLabel_1_1 = new JLabel("_______");
	  lblNewLabel_1_1.setForeground(Color.ORANGE);
	  lblNewLabel_1_1.setBounds(156, 114, 86, 14);
	  RegisterFormPanel.add(lblNewLabel_1_1);
	  
	   JButton loginFormButton = new JButton("LOGIN");
	   loginFormButton.setOpaque(false);
	   loginFormButton.setForeground(Color.ORANGE);
	   loginFormButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	   loginFormButton.setContentAreaFilled(false);
	   loginFormButton.setBorderPainted(false);
	   loginFormButton.setBounds(137, 100, 86, 22);
	   RegisterFormPanel.add(loginFormButton);
	   
	   JPanel fullNamePanelReg = new JPanel();
	   fullNamePanelReg.setLayout(null);
	   fullNamePanelReg.setBackground(Color.WHITE);
	   fullNamePanelReg.setBounds(73, 156, 320, 40);
	   RegisterFormPanel.add(fullNamePanelReg);
	   
	   firstnameField = new JTextField();
	   firstnameField.setText("First Name");
	   firstnameField.addFocusListener(new FocusAdapter() {    	    	    	    	    	    	    	    	    	    	  
			@Override
			public void focusLost(FocusEvent e) {
				if (firstnameField.getText().equals("")) {
					firstnameField.setForeground(new Color(96, 96, 96));
					firstnameField.setText("First Name");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (firstnameField.getText().equals("First Name")) {
					firstnameField.setForeground(Color.BLACK);
					firstnameField.setText("");
				}
			}
		});
	   
	   	    firstnameField.setForeground(new Color(96, 96, 96));
	   	    firstnameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
	   	    firstnameField.setColumns(10);
	   	    firstnameField.setBorder(null);
	   	    firstnameField.setBounds(35, 6, 275, 29);
	   	    fullNamePanelReg.add(firstnameField);
	   	    
	   	    JLabel iconOfUser_1 = new JLabel("");
	   	    iconOfUser_1.setBounds(7, 0, 34, 40);
	   	    fullNamePanelReg.add(iconOfUser_1);
	   	    
	   	    JPanel fullNamePanelReg_1 = new JPanel();
	   	    fullNamePanelReg_1.setLayout(null);
	   	    fullNamePanelReg_1.setBackground(Color.WHITE);
	   	    fullNamePanelReg_1.setBounds(73, 207, 320, 40);
	   	    RegisterFormPanel.add(fullNamePanelReg_1);
	   	    
	   	    lastnameField = new JTextField();
	   	    lastnameField.setText("Last Name");
	   	    lastnameField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (lastnameField.getText().equals("")) {
					lastnameField.setForeground(new Color(96, 96, 96));
					lastnameField.setText("Last Name");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (lastnameField.getText().equals("Last Name")) {
					lastnameField.setForeground(Color.BLACK);
					lastnameField.setText("");
				}
			}
		});
	   	    
	   	    	    lastnameField.setForeground(new Color(96, 96, 96));
	   	    	    lastnameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
	   	    	    lastnameField.setColumns(10);
	   	    	    lastnameField.setBorder(null);
	   	    	    lastnameField.setBounds(35, 6, 275, 29);
	   	    	    fullNamePanelReg_1.add(lastnameField);
	   	    	    
	   	    	    JLabel iconOfUser_1_1 = new JLabel("");
	   	    	    iconOfUser_1_1.setBounds(7, 0, 34, 40);
	   	    	    fullNamePanelReg_1.add(iconOfUser_1_1);
	   	    	    
	   	    	    JPanel PhoneNumber = new JPanel();
	   	    	    PhoneNumber.setLayout(null);
	   	    	    PhoneNumber.setBackground(Color.WHITE);
	   	    	    PhoneNumber.setBounds(73, 258, 320, 40);
	   	    	    RegisterFormPanel.add(PhoneNumber);
	   	    	    
	   	    	    phonenumberField = new JTextField();
	   	    	    phonenumberField.setText("Phone");
	   	    	    phonenumberField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (phonenumberField.getText().equals("Phone")) {
					phonenumberField.setForeground(new Color(96, 96, 96));
					phonenumberField.setText("Phone");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (phonenumberField.getText().equals("Phone")) {
					phonenumberField.setForeground(Color.BLACK);
					phonenumberField.setText("");
				}
			}
		});
	   	    	    
	   	    	    phonenumberField.setForeground(new Color(96, 96, 96));
	   	    	    phonenumberField.setFont(new Font("Tahoma", Font.PLAIN, 14));
	   	    	    phonenumberField.setColumns(10);
	   	    	    phonenumberField.setBorder(null);
	   	    	    phonenumberField.setBounds(35, 6, 275, 29);
	   	    	    PhoneNumber.add(phonenumberField);
	   	    	    
	   	    	    JLabel iconOfID = new JLabel("");
	   	    	    iconOfID.setBounds(7, 0, 34, 40);
	   	    	    PhoneNumber.add(iconOfID);
	   	    	    
	   	    	    JPanel Age = new JPanel();
	   	    	    Age.setLayout(null);
	   	    	    Age.setBackground(Color.WHITE);
	   	    	    Age.setBounds(73, 309, 320, 40);
	   	    	    RegisterFormPanel.add(Age);
	   	    	    
	   	    	    ageField = new JTextField();
	   	    	    ageField.setText("Age");
	   	    	    ageField.addFocusListener(new FocusAdapter() {    	    	    	    	    	    	    	    	    	  
			@Override
			public void focusLost(FocusEvent e) {
				if (ageField.getText().equals("")) {
					ageField.setForeground(new Color(96, 96, 96));
					ageField.setText("Age");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (ageField.getText().equals("Age")) {
					ageField.setForeground(Color.BLACK);
					ageField.setText("");
				}
			}
		});
	   	    	    ageField.setForeground(new Color(96, 96, 96));
	   	    	    ageField.setFont(new Font("Tahoma", Font.PLAIN, 14));
	   	    	    ageField.setColumns(10);
	   	    	    ageField.setBorder(null);
	   	    	    ageField.setBounds(35, 6, 275, 29);
	   	    	    Age.add(ageField);
	   	    	    
	   	    	    JLabel iconOfID_1 = new JLabel("");
	   	    	    iconOfID_1.setBounds(7, 0, 34, 40);
	   	    	    Age.add(iconOfID_1);
	   	    	    
	   	    	    JPanel emailAddPanelReg = new JPanel();
	   	    	    emailAddPanelReg.setLayout(null);
	   	    	    emailAddPanelReg.setBackground(Color.WHITE);
	   	    	    emailAddPanelReg.setBounds(73, 360, 320, 40);
	   	    	    RegisterFormPanel.add(emailAddPanelReg);
	   	    	    
	   	    	    emailaddressField = new JTextField();
	   	    	    emailaddressField.setText("Email Address");
	   	    	    emailaddressField.addFocusListener(new FocusAdapter() {
	   	    	    	@Override    	    	    	    	    	    	    	    	    	    
			public void focusLost(FocusEvent e) {
				if (emailaddressField.getText().equals("")) {
					emailaddressField.setForeground(new Color(96, 96, 96));
					emailaddressField.setText("Email Address");
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (emailaddressField.getText().equals("Email Address")) {
					emailaddressField.setForeground(Color.BLACK);
					emailaddressField.setText("");
				}
			}
		});
	   	    	    emailaddressField.setForeground(new Color(96, 96, 96));
	   	    	    emailaddressField.setFont(new Font("Tahoma", Font.PLAIN, 14));
	   	    	    emailaddressField.setColumns(10);
	   	    	    emailaddressField.setBorder(null);
	   	    	    emailaddressField.setBounds(35, 6, 275, 29);
	   	    	    emailAddPanelReg.add(emailaddressField);
	   	    	    
	   	    	    JLabel iconOfEmail = new JLabel("");
	   	    	    iconOfEmail.setBounds(7, 0, 34, 40);
	   	    	    emailAddPanelReg.add(iconOfEmail);
	   	    	    
	   	    	    JPanel passwordPanel = new JPanel();
	   	    	    passwordPanel.setLayout(null);
	   	    	    passwordPanel.setBackground(Color.WHITE);
	   	    	    passwordPanel.setBounds(73, 412, 320, 40);
	   	    	    RegisterFormPanel.add(passwordPanel);
	   	    	    
	   	    	    passwordField = new JPasswordField();
	   	    	    passwordField.setText("Password");
	   	    	    passwordField.addFocusListener(new FocusAdapter(){   	    	    	    	    	    	    	    	    	 
			@Override
			public void focusLost(FocusEvent e) {
				if (passwordField.getText().equals("")) {
					passwordField.setForeground(new Color(96, 96, 96));
					passwordField.setText("Password");
					passwordField.setEchoChar((char) 0);
				}
			}

			@Override
			public void focusGained(FocusEvent e) {
				if (passwordField.getText().equals("Password")) {
					passwordField.setEchoChar('●');
					passwordField.setForeground(Color.BLACK);
					passwordField.setText("");
				}
			}
 
		});
	   	    	    passwordField.setForeground(new Color(96, 96, 96));
	   	    	    passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
	   	    	    passwordField.setEchoChar('●');
	   	    	    passwordField.setBorder(null);
	   	    	    passwordField.setBounds(35, 6, 275, 29);
	   	    	    passwordPanel.add(passwordField);
	   	    	    
	   	    	    JLabel iconOfLock_1 = new JLabel("");
	   	    	    iconOfLock_1.setBounds(7, 0, 34, 40);
	   	    	    passwordPanel.add(iconOfLock_1);
	   	    	    
	   	    	    JLabel Caption3_1_1_2 = new JLabel("Gender :");
	   	    	    Caption3_1_1_2.setForeground(new Color(96, 96, 96));
	   	    	    Caption3_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	   	    	    Caption3_1_1_2.setBounds(73, 463, 272, 24);
	   	    	    RegisterFormPanel.add(Caption3_1_1_2);
	   	    	    
	   	    	    JRadioButton maleButton = new JRadioButton("Male");
	   	    	    maleButton.setBounds(156, 464, 109, 23);
	   	    	    RegisterFormPanel.add(maleButton);
	   	    	    
	   	    	    JRadioButton femaleButton = new JRadioButton("Female");
	   	    	    femaleButton.setBounds(284, 464, 109, 23);
	   	    	    RegisterFormPanel.add(femaleButton);
	   	    	    
	 // for registration button
	   	    	    JButton registerButton = new JButton("Register");
	   	    	    registerButton.addActionListener(new ActionListener() {
	   	    	        public void actionPerformed(ActionEvent e) {
	   	    	            String firstName = firstnameField.getText();
	   	    	            String lastName = lastnameField.getText();
	   	    	            String age = ageField.getText();
	   	    	            String phoneNumber = phonenumberField.getText();
	   	    	            String emailAddress = emailaddressField.getText();
	   	    	            String password = new String(passwordField.getPassword());
	   	    	            String gender = "";
	   	    	            boolean isRegister = false;
	   	    	            if (maleButton.isSelected()) {
	   	    	                gender = "Male";
	   	    	            } else if (femaleButton.isSelected()) {
	   	    	                gender = "Female";
	   	    	            }

	   	    	            // Validate form fields
	   	    	            if (firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() || phoneNumber.isEmpty() || emailAddress.isEmpty() || password.isEmpty() || gender.isEmpty()) {
	   	    	                // Show error message if any required field is empty
	   	    	                JOptionPane.showMessageDialog((Component) frame, "Please fill up all required fields!");
	   	    	            } else {
	   	    	                for(UserData _userData: loginList) {
	   	    	                    // check if the email and password entered in the JTextFields match those in the current instance
	   	    	                    if(firstName.equals(_userData.getFirstName()) && lastName.equals(_userData.getLastName())&& age.equals(_userData.getAge())&& 
	   	    	                        phoneNumber.equals(_userData.getPhoneNumber()) && emailAddress.equals(_userData.getEmailAddress()) && 
	   	    	                        password.equals(_userData.getPassword())&& gender.equals(_userData.getGender())) {
	   	    	                        // if there is a match, set the flag to true
	   	    	                        isRegister = true;
	   	    	                    }
	   	    	                }

	   	    	                if(isRegister) {
	   	    	                    // Show success message
	   	    	                    JOptionPane.showMessageDialog((Component) frame, "Registration successful!");

	   	    	                    // Clear all fields
	   	    	                    firstnameField.setText("");
	   	    	                    lastnameField.setText("");
	   	    	                    ageField.setText("");
	   	    	                    phonenumberField.setText("");
	   	    	                    emailaddressField.setText("");
	   	    	                    passwordField.setText("");
	   	    	                    maleButton.setSelected(false);
	   	    	                    femaleButton.setSelected(false); 

	   	    	                    // Switch to the login panel
	   	    	                    cardLayout.show(RegisterPanel, "login");
	   	    	                } else {
	   	    	                    JOptionPane.showMessageDialog((Component) frame, "Registration failed");
	   	    	                }
	   	    	            }
	   	    	        }
	   	    	    });
	   	    	    
	   	    	    	    registerButton.setForeground(Color.WHITE);
	   	    	    	    registerButton.setFont(new Font("Tahoma", Font.BOLD, 12));
	   	    	    	    registerButton.setBorderPainted(false);
	   	    	    	    registerButton.setBorder(null);
	   	    	    	    registerButton.setBackground(new Color(92, 184, 92));
	   	    	    	    registerButton.setBounds(203, 498, 63, 23);
	   	    	    	    RegisterFormPanel.add(registerButton);
	   	    	    	    
	   	    	    	    
	 // login button
		 // create a JButton with the label "Login" and add an ActionListener to handle events
		    JButton loginButton = new JButton("Login");
		    loginButton.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            
		            // set a flag to indicate whether the email and password match
		            boolean isOkay = false;
		            
		            // iterate over each instance of the userData class in the loginList
		            for(UserData _userData: loginList) {
		                // check if the email and password entered in the JTextFields match those in the current instance
		                if(emailladdressField1.getText().equals(_userData.getEmailAddress()) && passwordField_1.getText().equals(_userData.getPassword())) {
		                    // if there is a match, set the flag to true
		                    isOkay = true;
		                }
		            }
		            
		            // display a message dialog indicating whether the login was successful
		            if(isOkay) {
		                JOptionPane.showMessageDialog(null, "Login Successfully");
		                BookingBoardFrame frame = new BookingBoardFrame();
		                frame.setVisible(true);
		                
		                
		            }
		            else {
		                JOptionPane.showMessageDialog(null, "Incorrect Email or Password");
		            }
		        }
		    });
		    
		    		    	  loginButton.setForeground(Color.WHITE);
		    		    	  loginButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		    		    	  loginButton.setBorderPainted(false);
		    		    	  loginButton.setBorder(null);
		    		    	  loginButton.setBackground(new Color(240, 173, 78));
		    		    	  loginButton.setBounds(71, 266, 63, 23);
		    		    	  LoginPanel.add(loginButton);
		    		    	  
		    		    	  JLabel lineDivider = new JLabel("_______________________________________________");
		    		    	  lineDivider.setForeground(Color.WHITE);
		    		    	  lineDivider.setBounds(80, 311, 334, 14);
		    		    	  LoginPanel.add(lineDivider);
		    		    	  
		    		    	  JLabel lblNewLabel_1 = new JLabel("Capture your moments with");
		    		    	  lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		    		    	  lblNewLabel_1.setBounds(52, 321, 383, 84);
		    		    	  LoginPanel.add(lblNewLabel_1);
		    		    	  
		    		    	  JLabel lblNewLabel_1_2 = new JLabel("Blissful Shots Photobooth.");
		    		    	  lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		    		    	  lblNewLabel_1_2.setBounds(130, 346, 383, 84);
		    		    	  LoginPanel.add(lblNewLabel_1_2);
		    		    	  
		    		    	  JLabel lblNewLabel_4 = new JLabel("");
		    		    	  lblNewLabel_4.setIcon(CameraIcon);
		    		    	  lblNewLabel_4.setBounds(126, 416, 190, 112);
		    		    	  LoginPanel.add(lblNewLabel_4);
		    		    	  
		    		    	  JPanel emailPanel = new JPanel();
		    		    	  emailPanel.setLayout(null);
		    		    	  emailPanel.setBackground(Color.WHITE);
		    		    	  emailPanel.setBounds(71, 140, 320, 40);
		    		    	  LoginPanel.add(emailPanel); 
		    		    	  
		    		    	  emailladdressField1 = new JTextField();
		    		    	  emailladdressField1.setText("Email Address");
		    		    	  emailladdressField1.addFocusListener(new FocusAdapter() {
		    		    	  	@Override    	    	    	    	    	    	    	    	    	    
		    			public void focusLost(FocusEvent e) {
		    				if (emailladdressField1.getText().equals("")) {
		    					emailladdressField1.setForeground(new Color(96, 96, 96));
		    					emailladdressField1.setText("Email Address");
		    				}
		    			}

		    			@Override
		    			public void focusGained(FocusEvent e) {
		    				if (emailladdressField1.getText().equals("Email Address")) {
		    					emailladdressField1.setForeground(Color.BLACK);
		    					emailladdressField1.setText("");
		    				}
		    			}
		    		});
		    		    	  emailladdressField1.setForeground(new Color(96, 96, 96));
		    		    	  emailladdressField1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		    		    	  emailladdressField1.setColumns(10);
		    		    	  emailladdressField1.setBorder(null);
		    		    	  emailladdressField1.setBounds(35, 6, 275, 29);
		    		    	  emailPanel.add(emailladdressField1);
		    		    	  
		    		    	  JLabel iconOfUser = new JLabel("");
		    		    	  iconOfUser.setBounds(7, 0, 34, 40);
		    		    	  emailPanel.add(iconOfUser);
		    		    	  
		    		    	  JPanel passwordPanel_1 = new JPanel();
		    		    	  passwordPanel_1.setLayout(null);
		    		    	  passwordPanel_1.setBackground(Color.WHITE);
		    		    	  passwordPanel_1.setBounds(71, 191, 320, 40);
		    		    	  LoginPanel.add(passwordPanel_1); 
		    		    	  
		    		    	  passwordField_1 = new JPasswordField();
		    		    	  passwordField_1.setText("Password");
		    		    	  passwordField_1.addFocusListener(new FocusAdapter(){   	    	    	    	    	    	    	    	    	 
		    			@Override
		    			public void focusLost(FocusEvent e) {
		    				if (passwordField_1.getText().equals("")) {
		    					passwordField_1.setForeground(new Color(96, 96, 96));
		    					passwordField_1.setText("Password");
		    					passwordField_1.setEchoChar((char) 0);
		    				}
		    			}
		    			@Override
		    			public void focusGained(FocusEvent e) {
		    				if (passwordField_1.getText().equals("Password")) {
		    					passwordField_1.setEchoChar('●');
		    					passwordField_1.setForeground(Color.BLACK);
		    					passwordField_1.setText("");
		    				}
		    			}
		     
		    		});
		    		    	  
		    		    	  			passwordField_1.setForeground(new Color(96, 96, 96));
		    		    	  			passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		    		    	  			passwordField_1.setEchoChar('●');
		    		    	  			passwordField_1.setBorder(null);
		    		    	  			passwordField_1.setBounds(35, 6, 275, 29);
		    		    	  			passwordPanel_1.add(passwordField_1);
		    		    	  			
		    		    	  			JLabel iconOfLock_1_1 = new JLabel("");
		    		    	  			iconOfLock_1_1.setBounds(7, 0, 34, 40);
		    		    	  			passwordPanel_1.add(iconOfLock_1_1);
		    		    	  			
		    		    	  			JPanel panel = new JPanel();
		    		    	  			panel.setBackground(new Color(255, 255, 255));
		    		    	  			panel.setBounds(239, 77, 429, 419);
		    		    	  			add(panel);
		    		    	  			panel.setLayout(null);
		    		    	  			
		    		    	  			JLabel logolbl = new JLabel("");
		    		    	  			logolbl.setIcon(logosignupb);
		    		    	  			logolbl.setBounds(0, 0, 429, 419);
		    		    	  			panel.add(logolbl);
	
    	 // button for cardlayout addActionListener!
    	    loginFormButton_1.addActionListener(new ActionListener() {
    	        public void actionPerformed(ActionEvent e) {
    	            cardLayout.show(RegisterPanel, "login");
    	        }
    	    });

    	    registerFormButton_1.addActionListener(new ActionListener() {
    	        public void actionPerformed(ActionEvent e) {
    	            cardLayout.show(RegisterPanel, "register");
    	        }
    	    });

    	    loginFormButton.addActionListener(new ActionListener() {
    	        public void actionPerformed(ActionEvent e) {
    	        	cardLayout.show(RegisterPanel, "login");
    	            // code for login
    	        }
    	    });

    	    registerFormButton.addActionListener(new ActionListener() {
    	        public void actionPerformed(ActionEvent e) {
    	            // code for register
    	        	 cardLayout.show(RegisterPanel, "register"); 
    	       }
    	    });
    
	
	 	}
}
