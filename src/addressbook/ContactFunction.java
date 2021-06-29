package addressbook;

import java.util.Scanner;

public class ContactFunction {
	Scanner scan = new Scanner(System.in);
	ContactDetails contact;

	void details() {
		contact = new ContactDetails();

		System.out.println("Enter first name : ");
		String FirstName = scan.next();

		System.out.println("Enter last name : ");
		String LastName = scan.next();

		System.out.println("Enter address : ");
		String Address = scan.next();

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
		System.out.println(contact);
	}
}