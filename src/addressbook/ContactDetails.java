package addressbook;

public class ContactDetails extends AddressBookMain {
	String firstname;
	String lastname;
	String address;
	String city;
	String state;
	int zip;
	String phonenumber;
	String email;

	public ContactDetails() {

	}

	public String getfirstname() {
		return firstname;
	}

	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getlastname() {
		return lastname;
	}

	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getstate() {
		return state;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public int getzip() {
		return zip;
	}

	public void setzip(int zip) {
		this.zip = zip;
	}

	public String getphonenumber() {
		return phonenumber;
	}

	public void setphonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contacts{" + "FirstName='" + firstname + '\'' + ", LastName= '" + lastname + '\'' + ", Address='"
				+ address + '\'' + ", City='" + city + '\'' + ", State='" + state + '\'' + ", ZipCode='" + zip + '\''
				+ ", PhoneNumber='" + phonenumber + '\'' + ", Email='" + email + '\'' + '}';
	}
}
