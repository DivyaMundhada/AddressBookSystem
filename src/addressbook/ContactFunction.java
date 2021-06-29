package addressbook;

import java.util.Scanner;

public class ContactFunction {
	Scanner scan = new Scanner(System.in);
	ContactDetails contact;

	void addDetails() {
		contact = new ContactDetails();

		System.out.println("Enter first name : ");
		String FirstName = scan.next();

		System.out.println("Enter last name : ");
		String LastName = scan.next();

		System.out.println("Enter address : ");
		String Address = scan.next();
		scan.nextLine();

		System.out.println("Enter city : ");
		String City = scan.next();

		System.out.println("Enter state : ");
		String State = scan.next();

		System.out.println("Enter zip code : ");
		int Zip = scan.nextInt();

		System.out.println("Enter phone number : ");
		String PhoneNumber = scan.next();

		System.out.println("Enter email : ");
		String Email = scan.next();

		contact.setfirstname(FirstName);
		contact.setlastname(LastName);
		contact.setaddress(Address);
		contact.setcity(City);
		contact.setstate(State);
		contact.setzip(Zip);
		contact.setphonenumber(PhoneNumber);
		contact.setEmail(Email);

	}

	void displayDetails() {
		System.out.println(contact);
	}

	void editDetails() {
		System.out.println("Select what you want to edit: ");
		System.out.println("1 - First Name ");
		System.out.println("2 - Last Name ");
		System.out.println("3 - Address ");
		System.out.println("4 - City ");
		System.out.println("5 - State ");
		System.out.println("6 - ZipCode ");
		System.out.println("7 - Phone Number ");
		System.out.println("8 - Email Address ");
		System.out.println("0 - Exit ");
		int option = scan.nextInt();

		switch (option) {
		case 1:
			System.out.println("Enter First Name: ");
			String FirstName = scan.next();
			contact.setfirstname(FirstName);
			break;
		case 2:
			System.out.println("Enter Last Name: ");
			String LastName = scan.next();
			contact.setlastname(LastName);
			break;
		case 3:
			System.out.println("Enter Address: ");
			String Address = scan.next();
			scan.nextLine();
			contact.setaddress(Address);
			break;
		case 4:
			System.out.println("Enter City: ");
			String City = scan.next();
			contact.setcity(City);
			break;
		case 5:
			System.out.println("Enter State: ");
			String State = scan.next();
			contact.setstate(State);
			break;
		case 6:
			System.out.println("Enter ZipCode: ");
			int Zip = scan.nextInt();
			contact.setzip(Zip);
			break;
		case 7:
			System.out.println("Enter Phone Number: ");
			String PhoneNumber = scan.next();
			contact.setphonenumber(PhoneNumber);
			break;
		case 8:
			System.out.println("Enter Email Address: ");
			String Email = scan.next();
			contact.setEmail(Email);
			break;
		case 0:
			break;
		}
	}

}