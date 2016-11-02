package model;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class AddressBook {

	private ArrayList<User> userList;
	
	
	/*
	 * Constructor : 
	 */
	public AddressBook(){
		
		this.load();
	}

	/*
	 * Action Methods :
	 */
	
	public int size()
	{
		if(userList != null)
		return userList.size();
		else return 0;
	}
	
	public int getIndex(User user)
	{
		return userList.indexOf(user);
	}
	
	//Used for the view & editing :
	public User getUser(int index){
		if(userList != null)
			return userList.get(index);
		else return null;
	}

	public void deleteUser(int index){
		userList.remove(index);
	}
	
	public void addUser(User user){
		userList.add(user);
	}
	
	public void editUser(User newUser, User previousUser){
		System.out.println(newUser.getLastName()+" and  "+previousUser.getLastName());
		int index = getIndex(previousUser);
		if(index > -1) userList.set(index, newUser);
		//else userList.add(user);
		else System.out.println("error on update");
	}
	
	private void load(){
		userList = new ArrayList<User>();
		String[] userString;
		
		File file = new File("save.csv");
		try{
			int i =0;
			Scanner scanner = new Scanner(file);
			
			while(scanner.hasNextLine()) {
				i++;
				User user;
				userString = scanner.nextLine().split(";");
				if(userString.length != 6){
					System.out.println("Ligne "+i+" du fichier non lisible");
				}else{
					user = new User(userString[0], userString[1], userString[2], userString[3], userString[4], userString[5]);
					userList.add(user);
				}
				
			}
			scanner.close();
		}catch (FileNotFoundException e){
			System.out.println("Aucun fichier de sauvegarde trouvé");
			//e.printStackTrace();
			
		} 
	}
	
	public void save(){
		
		File file = new File("save.csv");
		
		try {
			BufferedWriter output = new BufferedWriter(new FileWriter(file));
			
			for (User user : userList) {
				output.write(user.toCsvFile());
				output.write(System.getProperty("line.separator"));
			}
			
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erreur : Sauvegarde impossible");
		}
		
	}
	

	
	
	
	
	
}
