package addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Address Book Program.");
		ContactFunction contact = new ContactFunction();
		int input = 1;
		while (input != 0) {
			System.out.println("Select your choice:");
			System.out.println("1 - Add Contact");
			System.out.println("2 - Edit Contact");
			System.out.println("3 - Display Contact");
			System.out.println("0 - Exit");
			int choice = scan.nextInt();

			switch (choice) {

			case 1:
				contact.addDetails();
				break;
			case 2:
				contact.editDetails();
				break;
			case 3:
				contact.displayDetails();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Enter Valid Input");
				break;
			}
		}

	}
}