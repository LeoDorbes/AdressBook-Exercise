package view;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JScrollPane;

import model.AddressBook;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;


/*
 * Menu Panel
 * 
 * Will handle the display of the main panel with all it's elements (being constructed on creating) :
 */
public class MenuPanel extends JPanel{
	
	private JButton btnAdd;
	private JButton btnExit;
	private JButton btnSave;
	private JPanel panelList;
	private JButton btnLeft;
	private JButton btnRight;
	private JLabel lblPosition;
	
	
	/*
	 * Constructor :
	 */
	public MenuPanel() {
		
		setLayout(null);
		this.setSize(1000, 470);
		
		btnAdd = new JButton("Ajouter");
		btnAdd.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnAdd.setBounds(82, 392, 149, 50);
		add(btnAdd);
		
		btnExit = new JButton("Quitter");
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnExit.setBounds(775, 392, 149, 50);
		add(btnExit);
		
		btnSave = new JButton("Sauvegarder");
		btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSave.setBounds(430, 392, 149, 50);
		add(btnSave);
		
		panelList = new JPanel();
		panelList.setBounds(82, 72, 842, 295);
		add(panelList);
		panelList.setLayout(null);
		
		btnLeft = new JButton("<");
		btnLeft.setBounds(82, 29, 48, 32);
		add(btnLeft);
		
		btnRight = new JButton(">");
		btnRight.setBounds(876, 29, 48, 32);
		add(btnRight);
		
		lblPosition = new JLabel("Page 1/1");
		lblPosition.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPosition.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosition.setBounds(140, 16, 726, 50);
		add(lblPosition);
	}
	
	/*
	 * Getters & Setters :
	 */
	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JButton getBtnExit() {
		return btnExit;
	}
	
	public void setBtnExit(JButton btnLeave) {
		this.btnExit = btnLeave;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}

	public JPanel getPanelList() {
		return panelList;
	}

	public void setPanelList(JPanel panelList) {
		this.panelList = panelList;
	}

	public JButton getBtnLeft() {
		return btnLeft;
	}

	public void setBtnLeft(JButton btnLeft) {
		this.btnLeft = btnLeft;
	}

	public JButton getBtnRight() {
		return btnRight;
	}

	public void setBtnRight(JButton btnRight) {
		this.btnRight = btnRight;
	}

	public JLabel getLblPosition() {
		return lblPosition;
	}

	public void setLblPosition(JLabel lblPosition) {
		this.lblPosition = lblPosition;
	}
	
}
