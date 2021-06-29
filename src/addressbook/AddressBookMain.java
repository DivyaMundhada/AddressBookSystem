package addressbook;

import java.util.Scanner;

public class AddressBookMain {
Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program.");
		ContactFunction contact = new ContactFunction();
		contact.details("Divya","Mundhada","Jatharpeth","Akola","Mh",444001,"9999888898","dm@gmail.com");
		
	}
}
