package bookstore;

public class Employee {

	int employeeID;
	String firstName;
	String lastName;
	String employeePin;

	public Employee(int employeeID, String firstName, String lastName, String employeePin) {

		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeePin = employeePin;

	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmployeePin() {
		return employeePin;
	}

	public void setEmployeePin(String employeePin) {
		this.employeePin = employeePin;
	}

	public String toString() {
		return "Employee ID: " + employeeID + ", Name: " + firstName + " " + lastName + ", Pin Number: " + employeePin;
	}

}
