import model.AddressBook;
import model.User;
import view.MenuFrame;


public class Main {
	
	public static void main(String[] args) {
		
		AddressBook addressBook = new AddressBook();
		
		MenuFrame menu = new MenuFrame(addressBook);
		menu.run();
	}

}
