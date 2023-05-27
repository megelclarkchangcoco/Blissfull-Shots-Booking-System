package PortfolioFrame;

//define the userData class
	public class UserData {
	 // declare instance variables for the class
	 String firstName;
	 String lastName;
	 String phoneNumber;
	 String age;
	 String emailAddress;
	 String password;
	 String gender;
	
	 // define a constructor for the class that initializes its instance variables
	 public UserData(String _firstName, String _lastName, String _phoneNumber, String _age, String _emailAddress,
	         String _password, String _gender) {
	     this.firstName = _firstName;
	     this.lastName = _lastName;
	     this.age = _age;
	     this.phoneNumber = _phoneNumber;
	     this.emailAddress = _emailAddress;
	     this.password = _password;
	     this.gender = _gender;
		}
	 
	 // define getters and setters for the instance variables
	 	public String getFirstName() {
	     return firstName;
	 }
	 	public void setFirstName(String firstName) {
	     this.firstName = firstName;
	 }
	
		public String getLastName() {
	     return lastName;
	 }
	
		public void setLastName(String lastName) {
	     this.lastName = lastName;
	 }
		public String getAge() {
	     return age;
	 }
	
		public void setAge(String age) {
	     this.age = age;
	 }
		public String getPhoneNumber() {
	     return phoneNumber;
	 }
	
		public void setPhoneNumber(String phoneNumber) {
	     this.phoneNumber = phoneNumber;
	 }
	
		public String getEmailAddress() {
	     return emailAddress;
	 }
	
		public void setEmailAddress(String emailAddress) {
		 this.emailAddress = emailAddress;
	 }
	
		public String getPassword() {
	     return password;
	 }
	 
		public void setPassword(String password) {
	     this.password = password;
	 }
	 
		public String getGender() {
	     return gender;
	 }
	 
		public void setGender(String gender) {
	     this.gender = gender;
	 }
		
	}

