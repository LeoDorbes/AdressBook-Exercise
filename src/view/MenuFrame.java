package view;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.AddressBook;
import model.User;

/*
 * Graphical Frame
 * 
 * Will handle the display of the application's frame and (for now) will also handle the control over actions in the application
 */
public class MenuFrame extends JFrame{
	
	//Model : 
	private AddressBook addressBook;
	
	//Panels :
	private UserFormPanel userFormPanel;
	private MenuPanel menuPanel;
	private UserViewPanel userViewPanel;
	
	//Display Data :
	private int page = 0;
	private int pagination = 7;
	
	public MenuFrame(AddressBook addressBook) {
		
		this.addressBook = addressBook;
		this.setSize(1000
				, 480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle("Gestion de Contact");
		this.setVisible(true);
	}
	
	/*
	 * This method initialize the frame, it's panel and their listeners :
	 */
	public void run()
	{
		menuPanel = new MenuPanel();
		userFormPanel = new UserFormPanel();
		userViewPanel = new UserViewPanel();
		this.setContentPane(menuPanel);
		this.setListeners();
		this.refreshContent();
		
	}
	
	/*
	 * This method has to be called after each update of the data and will update the view + generate the buttons and their listeners for each displayed User :
	 */
	private void refreshContent()
	{
		//Verify if the page the user is on still exist (after some deletes ) :
		if(page*pagination >= addressBook.size()){
			page--;
		}
		
		MenuFrame myMenu = this;
		int x = 0,y = 0;
		int i = pagination * page; //Count for pagination
		int j = 0; //Always count from 0
		
		
		//Display of the users inside the panel :
		menuPanel.getPanelList().removeAll();
		if( addressBook.size() > i ){
			
			
			JLabel lblFirstNameHeader = new JLabel("<html><b>Prénom</b></html>");
			lblFirstNameHeader.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblFirstNameHeader.setHorizontalAlignment(SwingConstants.LEADING);
			lblFirstNameHeader.setBounds(0, j*30, 100, 50);
			menuPanel.getPanelList().add(lblFirstNameHeader);
			
			JLabel lblLastNameHeader = new JLabel("<html><b>Nom</b></html>");
			lblLastNameHeader.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblLastNameHeader.setHorizontalAlignment(SwingConstants.LEADING);
			lblLastNameHeader.setBounds(125, j*30, 100, 50);
			menuPanel.getPanelList().add(lblLastNameHeader);
			
			JLabel lblEmailHeader = new JLabel("<html><b>Email</b></html>");
			lblEmailHeader.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEmailHeader.setHorizontalAlignment(SwingConstants.LEADING);
			lblEmailHeader.setBounds(250, j*30, 100, 50);
			menuPanel.getPanelList().add(lblEmailHeader);
			
			JLabel lblEditHeader = new JLabel("<html><b>Editer</b></html>");
			lblEditHeader.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblEditHeader.setHorizontalAlignment(SwingConstants.LEADING);
			lblEditHeader.setBounds(530, j*30, 100, 50);
			menuPanel.getPanelList().add(lblEditHeader);
			
			JLabel lblSeeHeader = new JLabel("<html><b>Consulter</b></html>");
			lblSeeHeader.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblSeeHeader.setHorizontalAlignment(SwingConstants.LEADING);
			lblSeeHeader.setBounds(590, j*30, 100, 50);
			menuPanel.getPanelList().add(lblSeeHeader);
			
			JLabel lblDeleteHeader = new JLabel("<html><b>Supprimer</b></html>");
			lblDeleteHeader.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblDeleteHeader.setHorizontalAlignment(SwingConstants.LEADING);
			lblDeleteHeader.setBounds(690, j*30, 100, 50);
			menuPanel.getPanelList().add(lblDeleteHeader);
			
			
			
			while( i < addressBook.size() && j < pagination){
				
				User user = addressBook.getUser(i);
				
				JLabel lblFirstName = new JLabel(user.getFirstName());
				lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblFirstName.setHorizontalAlignment(SwingConstants.LEADING);
				lblFirstName.setBounds(0, j*30+35, 100, 50);
				menuPanel.getPanelList().add(lblFirstName);
				
			
				JLabel lblLastName = new JLabel(user.getLastName());
				lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblLastName.setHorizontalAlignment(SwingConstants.LEADING);
				lblLastName.setBounds(125, j*30+35, 100, 50);
				menuPanel.getPanelList().add(lblLastName);
				
				
				JLabel lblEmail = new JLabel(user.getEmail());
				lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
				lblEmail.setHorizontalAlignment(SwingConstants.LEADING);
				lblEmail.setBounds(250, j*30+35, 200, 50);
				menuPanel.getPanelList().add(lblEmail);
				
				JButton btnEdit = new JButton("...");
				btnEdit.setBounds(530, j*30+45, 50, 25);
				menuPanel.getPanelList().add(btnEdit);
				
				//Add action listener:
				btnEdit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						userFormPanel.setUser(user);
						myMenu.setContentPane(myMenu.userFormPanel);
						myMenu.repaint();
					}
				});
				
				JButton btnSee = new JButton("V");
				btnSee.setBounds(600, j*30+45, 50, 25);
				menuPanel.getPanelList().add(btnSee);
				btnSee.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						userViewPanel.setUserData(user);
						myMenu.setContentPane(userViewPanel);
						myMenu.repaint();
						
						
					}
				});
				
				JButton btnDelete = new JButton("X");
				btnDelete.setBounds(700, j*30+45, 50, 25);
				menuPanel.getPanelList().add(btnDelete);
				btnDelete.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
						addressBook.deleteUser(addressBook.getIndex(user));
						System.out.println("DELETE "+user.getFirstName());
						refreshContent();
						
						
					}
				});
				
				j++;
				i++;
			}
		}
		
		//Set the pagination buttons to active when they should be :
		if(page > 0) menuPanel.getBtnLeft().setEnabled(true);
		else menuPanel.getBtnLeft().setEnabled(false);
		
		if( i < addressBook.size() ) menuPanel.getBtnRight().setEnabled(true);
		else menuPanel.getBtnRight().setEnabled(false);
		
		//Set the pagination text :
		int pageAmount = 0 + addressBook.size()/pagination;
		if(addressBook.size()%pagination > 0)pageAmount++;
		menuPanel.getLblPosition().setText("Page " + (page+1) + "/" + pageAmount);
		
		this.repaint();
		
	}
	
	/*
	 * This method will initialize the listeners of the application
	 */
	private void setListeners()
	{
		//Reference to "this" inside the actionlistener :
		MenuFrame myMenu = this;
		
		/*
		 * Menu Panel Action Listener(s) :
		 */
		
		//Add action listener:
		menuPanel.getBtnAdd().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				userFormPanel.setUser(null);
				myMenu.setContentPane(myMenu.userFormPanel);
				myMenu.repaint();
			}
		});
		
		//Save action listener:
		menuPanel.getBtnSave().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addressBook.save();
			}
		});
		
		//Exit action listener:
		menuPanel.getBtnExit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myMenu.setVisible(false);
				myMenu.dispose();
				
			}
		});
		
		//Save action listener:
		menuPanel.getBtnSave().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		//Paginate Left action listener :
		menuPanel.getBtnLeft().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				page--;
				refreshContent();
			}
		});
		
		//Paginate Right action listener :
		menuPanel.getBtnRight().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				page++;
				refreshContent();
			}
		});
		
		
		/*
		 * User Form Action Listener(s) :
		 */
		
		userFormPanel.getBtnValidate().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				User tempUser = new User(userFormPanel.getTextFieldLastName().getText(), userFormPanel.getTextFieldFirstName().getText(),
						userFormPanel.getTextFieldEmail().getText(), userFormPanel.getTextFieldAddress().getText(),
						userFormPanel.getTextFieldPhone().getText(), userFormPanel.getTextFieldBirthday().getText());
				
				if(userFormPanel.getUser() == null){
					addressBook.addUser(tempUser);
				}else{
					addressBook.editUser(tempUser,userFormPanel.getUser());
				}
				
				refreshContent();
				myMenu.setContentPane(myMenu.menuPanel);
				myMenu.repaint();
			}
		});
		
		userFormPanel.getBtnCancel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				myMenu.setContentPane(myMenu.menuPanel);
				myMenu.repaint();
			}
		});
		
		/*
		 * User View Action Listener(s) :
		 */
		
		userViewPanel.getBtnReturn().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				myMenu.setContentPane(myMenu.menuPanel);
				myMenu.repaint();
			}
		});
	}
	
}
