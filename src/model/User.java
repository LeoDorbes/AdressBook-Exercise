package model;

public class User {

	private String lastName;
	private String firstName;
	private String email;
	private String address;
	private String phone;
	private String birthdayDate; //format : dd-mm-yyyy
	
	/*
	 * Constructor : 
	 */
	public User(String lastName, String firstName, String email, String address, String phone, String birthdayDate) {
		super();
	
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.birthdayDate = birthdayDate;
	}

	
	/*
	 * Getters & Setters :
	 */
	public String toCsvFile(){
		String sep = ";";
		return lastName+sep+firstName+sep+email+sep+address+sep+phone+sep+birthdayDate;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(String birthdayDate) {
		this.birthdayDate = birthdayDate;
	}
	
	
	
	
	
}
