package bookstore;

public class Customer {

	int customerID;
	String firstName;
	String lastName;
	String phoneNumber;
	String address;
	String username;
	String password;

	public Customer(int customerID, String firstName, String lastName, String phoneNumber, String address) {
		
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
	}
	
	public Customer(int customerID, String firstName, String lastName, String phoneNumber, String address, String username, String password) {
		
		this.username = username;
		this.password = password;
		
	}

	public String toString() {
		return "Customer ID: " + customerID + ", Name: " + firstName + " " + lastName + ", Phone Number: " + phoneNumber
				+ ", Adddress: " + address;
	}

}
