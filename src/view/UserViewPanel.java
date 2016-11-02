package view;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

import model.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/*
 * User Form Panel
 * 
 * Will handle the display of the user form panel with all it's elements (being constructed on creating) :
 */
public class UserViewPanel extends JPanel{
	
	private JLabel lblInfoLastName;
	private JLabel lblInfoFirstName;
	private JLabel lblInfoEmail;
	private JLabel lblInfoAddress;
	private JLabel lblInfoPhone;
	private JLabel lblInfoBirthday;
	private JButton btnReturn;
	private JLabel lblLastName;
	private JLabel lblFirstName;
	private JLabel lblEmail;
	private JLabel lblAddress;
	private JLabel lblPhone;
	private JLabel lblBirthday;
	
	
	/*
	 * Constructor :
	 */
	public UserViewPanel() {
		this.setSize(850, 500);
		setLayout(null);
		
		lblInfoLastName = new JLabel("<html><b>Nom : </b> </html>");
		lblInfoLastName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInfoLastName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblInfoLastName.setBounds(50, 50, 200, 50);
		add(lblInfoLastName);
		
		lblInfoFirstName = new JLabel("<html><b>Pr\u00E9nom : </b> </html>");
		lblInfoFirstName.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInfoFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblInfoFirstName.setBounds(50, 100, 200, 50);
		add(lblInfoFirstName);
		
		lblInfoEmail = new JLabel("<html><b>Email : </b> </html>");
		lblInfoEmail.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInfoEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblInfoEmail.setBounds(50, 150, 200, 50);
		add(lblInfoEmail);
		
		lblInfoAddress = new JLabel("<html><b>Addresse : </b> </html>");
		lblInfoAddress.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInfoAddress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblInfoAddress.setBounds(50, 200, 200, 50);
		add(lblInfoAddress);
		
		lblInfoPhone = new JLabel("<html><b>T\u00E9l\u00E9phone :  </b> </html>");
		lblInfoPhone.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInfoPhone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblInfoPhone.setBounds(50, 250, 200, 50);
		add(lblInfoPhone);
		
		lblInfoBirthday = new JLabel("<html><b>Date de naissance :   </b> </html>");
		lblInfoBirthday.setHorizontalAlignment(SwingConstants.TRAILING);
		lblInfoBirthday.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblInfoBirthday.setBounds(50, 300, 200, 50);
		add(lblInfoBirthday);
		
		btnReturn = new JButton("Retour");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnReturn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnReturn.setBounds(621, 50, 149, 50);
		add(btnReturn);
		
		lblLastName = new JLabel("Name");
		lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblLastName.setBounds(255, 50, 200, 50);
		add(lblLastName);
		
		lblFirstName = new JLabel("Prenom");
		lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblFirstName.setBounds(255, 100, 200, 50);
		add(lblFirstName);
		
		lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEmail.setBounds(255, 150, 200, 50);
		add(lblEmail);
		
		lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAddress.setBounds(255, 200, 200, 50);
		add(lblAddress);
		
		lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPhone.setBounds(255, 250, 200, 50);
		add(lblPhone);
		
		lblBirthday = new JLabel("Birthday");
		lblBirthday.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblBirthday.setBounds(255, 300, 200, 50);
		add(lblBirthday);
	}
	
	public void setUserData(User user)
	{
		lblLastName.setText(user.getLastName());
		lblFirstName.setText(user.getFirstName());
		lblEmail.setText(user.getEmail());
		lblAddress.setText(user.getAddress());
		lblPhone.setText(user.getPhone());
		lblBirthday.setText(user.getBirthdayDate());
		
	}

	public JLabel getLblInfoLastName() {
		return lblInfoLastName;
	}

	public void setLblInfoLastName(JLabel lblInfoLastName) {
		this.lblInfoLastName = lblInfoLastName;
	}

	public JLabel getLblInfoFirstName() {
		return lblInfoFirstName;
	}

	public void setLblInfoFirstName(JLabel lblInfoFirstName) {
		this.lblInfoFirstName = lblInfoFirstName;
	}

	public JLabel getLblInfoEmail() {
		return lblInfoEmail;
	}

	public void setLblInfoEmail(JLabel lblInfoEmail) {
		this.lblInfoEmail = lblInfoEmail;
	}

	public JLabel getLblInfoAddress() {
		return lblInfoAddress;
	}

	public void setLblInfoAddress(JLabel lblInfoAddress) {
		this.lblInfoAddress = lblInfoAddress;
	}

	public JLabel getLblInfoPhone() {
		return lblInfoPhone;
	}

	public void setLblInfoPhone(JLabel lblInfoPhone) {
		this.lblInfoPhone = lblInfoPhone;
	}

	public JLabel getLblInfoBirthday() {
		return lblInfoBirthday;
	}

	public void setLblInfoBirthday(JLabel lblInfoBirthday) {
		this.lblInfoBirthday = lblInfoBirthday;
	}

	public JButton getBtnReturn() {
		return btnReturn;
	}

	public void setBtnReturn(JButton btnReturn) {
		this.btnReturn = btnReturn;
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

	public JLabel getLblPhone() {
		return lblPhone;
	}

	public void setLblPhone(JLabel lblPhone) {
		this.lblPhone = lblPhone;
	}

	public JLabel getLblBirthday() {
		return lblBirthday;
	}

	public void setLblBirthday(JLabel lblBirthday) {
		this.lblBirthday = lblBirthday;
	}
	


	/*
	 * Getters & Setters :
	 */
	
	
}
