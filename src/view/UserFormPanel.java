package view;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import model.User;


/*
 * User Form Panel
 * 
 * Will handle the display of the user form panel with all it's elements (being constructed on creating) :
 */
public class UserFormPanel extends JPanel{
	private JTextField textFieldLastName;
	private JTextField textFieldFirstName;
	private JTextField textFieldEmail;
	
	private JLabel lblLastName;
	private JLabel lblFirstName;
	private JLabel lblEmail;
	private JLabel lblAddress;
	private JTextField textFieldAddress;
	private JLabel lblPhone;
	private JTextField textFieldPhone;
	private JLabel lblBirthday;
	private JTextField textFieldBirthday;
	private JButton btnValidate;
	private JButton btnCancel;
	
	private User user = null;
	
	/*
	 * Constructor :
	 */
	public UserFormPanel() {
		this.setSize(850, 500);
		setLayout(null);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textFieldLastName.setBounds(328, 71, 231, 31);
		add(textFieldLastName);
		textFieldLastName.setColumns(10);
		
		lblLastName = new JLabel("Nom");
		lblLastName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblLastName.setBounds(135, 71, 183, 31);
		add(lblLastName);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textFieldFirstName.setColumns(10);
		textFieldFirstName.setBounds(328, 113, 231, 31);
		add(textFieldFirstName);
		
		lblFirstName = new JLabel("Pr\u00E9nom");
		lblFirstName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblFirstName.setBounds(135, 113, 183, 31);
		add(lblFirstName);
		
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textFieldEmail.setColumns(10);
		textFieldEmail.setBounds(328, 155, 231, 31);
		add(textFieldEmail);
		
		lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEmail.setBounds(135, 155, 183, 31);
		add(lblEmail);
		
		lblAddress = new JLabel("Addresse");
		lblAddress.setHorizontalAlignment(SwingConstants.TRAILING);
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAddress.setBounds(135, 197, 183, 31);
		add(lblAddress);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(328, 197, 231, 31);
		add(textFieldAddress);
		
		lblPhone = new JLabel("Telephone");
		lblPhone.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPhone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPhone.setBounds(135, 239, 183, 31);
		add(lblPhone);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(328, 239, 231, 31);
		add(textFieldPhone);
		
		lblBirthday = new JLabel("Date De Naissance");
		lblBirthday.setHorizontalAlignment(SwingConstants.TRAILING);
		lblBirthday.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblBirthday.setBounds(135, 281, 183, 31);
		add(lblBirthday);
		
		textFieldBirthday = new JTextField();
		textFieldBirthday.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		textFieldBirthday.setColumns(10);
		textFieldBirthday.setBounds(328, 281, 231, 31);
		add(textFieldBirthday);
		
		btnValidate = new JButton("Valider");
		btnValidate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnValidate.setBounds(410, 354, 149, 50);
		add(btnValidate);
		
		btnCancel = new JButton("Annuler");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCancel.setBounds(214, 354, 149, 50);
		add(btnCancel);
	}


	/*
	 * Getters & Setters :
	 */
	public JTextField getTextFieldLastName() {
		return textFieldLastName;
	}


	public void setTextFieldLastName(JTextField textFieldLastName) {
		this.textFieldLastName = textFieldLastName;
	}


	public JTextField getTextFieldFirstName() {
		return textFieldFirstName;
	}


	public void setTextFieldFirstName(JTextField textFieldFirstName) {
		this.textFieldFirstName = textFieldFirstName;
	}


	public JTextField getTextFieldEmail() {
		return textFieldEmail;
	}


	public void setTextFieldEmail(JTextField textFieldEmail) {
		this.textFieldEmail = textFieldEmail;
	}


	public JLabel getLblLastName() {
		return lblLastName;
	}


	public void setLblLastName(JLabel lblLastName) {
		this.lblLastName = lblLastName;
	}


	public JLabel getLblFirstName() {
		return lblFirstName;
	}


	public void setLblFirstName(JLabel lblFirstName) {
		this.lblFirstName = lblFirstName;
	}


	public JLabel getLblEmail() {
		return lblEmail;
	}


	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}


	public JLabel getLblAddress() {
		return lblAddress;
	}


	public void setLblAddress(JLabel lblAddress) {
		this.lblAddress = lblAddress;
	}


	public JTextField getTextFieldAddress() {
		return textFieldAddress;
	}


	public void setTextFieldAddress(JTextField textFieldAddress) {
		this.textFieldAddress = textFieldAddress;
	}


	public JLabel getLblPhone() {
		return lblPhone;
	}


	public void setLblPhone(JLabel lblPhone) {
		this.lblPhone = lblPhone;
	}


	public JTextField getTextFieldPhone() {
		return textFieldPhone;
	}


	public void setTextFieldPhone(JTextField textFieldPhone) {
		this.textFieldPhone = textFieldPhone;
	}


	public JLabel getLblBirthday() {
		return lblBirthday;
	}


	public void setLblBirthday(JLabel lblBirthday) {
		this.lblBirthday = lblBirthday;
	}


	public JTextField getTextFieldBirthday() {
		return textFieldBirthday;
	}


	public void setTextFieldBirthday(JTextField textFieldBirthday) {
		this.textFieldBirthday = textFieldBirthday;
	}


	public JButton getBtnValidate() {
		return btnValidate;
	}


	public void setBtnValidate(JButton buttonValidate) {
		this.btnValidate = buttonValidate;
	}

	
	
	

	public JButton getBtnCancel() {
		return btnCancel;
	}


	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}


	public User getUser() {
		return user;
	}


	//We apply the graphic modification inside this setter :
	public void setUser(User user) {
		if(user == null){
			textFieldAddress.setText("");
			textFieldBirthday.setText("");
			textFieldEmail.setText("");
			textFieldFirstName.setText("");
			textFieldLastName.setText("");
			textFieldPhone.setText("");
			
			btnValidate.setText("Ajouter");
		}else{
			textFieldAddress.setText(user.getAddress());
			textFieldBirthday.setText(user.getBirthdayDate());
			textFieldEmail.setText(user.getEmail());
			textFieldFirstName.setText(user.getFirstName());
			textFieldLastName.setText(user.getLastName());
			textFieldPhone.setText(user.getPhone());
			
			btnValidate.setText("Editer");
		}
		
		this.user = user;
	}
}
