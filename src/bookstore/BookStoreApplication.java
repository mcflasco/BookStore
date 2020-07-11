package bookstore;

import java.util.Scanner;

public class BookStoreApplication {

	static Scanner input;
	static Database db;
	static BookStore bs;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		boolean menu = true;
		bs = new BookStore();
		db = new Database();

//		Database.connection();

		while (menu) {

			System.out.println("Welcome to Book Smart!");
			System.out.println("1: Employee");
			System.out.println("2: Customer");
			System.out.println("3: Books");
			System.out.println("4: Exit");

			String choice = input.nextLine();

			switch (choice) {

			case "1":
				employeeLogin();
				break;

			case "2":
				getCustomer();
				break;
			case "3":
				getBooks();
				break;
				
			case "4":
				System.out.println("Have a good day!");
				menu = false;
				break;
				
			}
		}
	}

// Employee Functionality =======================================================================================

	public static void employeeLogin() {
		// create error message

		System.out.println("Please enter your employee ID:");
		String employeePin = input.nextLine();

		Employee employee = null;
		for (int i = 0; i < bs.employees.size(); i++) {
			employee = bs.employees.get(i);
			if (employee.employeePin.equals(employeePin)) {
				System.out.println("Welcome " + employee.firstName + " " + employee.lastName);
//				System.out.println("test");
				employeeMenu();
			}
		}
	}

	public static void employeeMenu() {
		boolean employeeMenu = true;

		while (employeeMenu) {
			
			System.out.println("==== Employee Data ====");
			System.out.println("1: List employees");
			System.out.println("2: Add employee");
			System.out.println("3: update employee");
			System.out.println("4: Remove employee");
			System.out.println("==== Customer Data ====");
			System.out.println("8: Exit");
			
			String choice = input.nextLine();

			switch (choice) {

			case "1":
				getEmployees();
				break;

			case "2":
				addEmployee();
				break;

			case "3":
				updateEmployee();
				break;

			case "4":
				removeEmployee();
				break;

			case "8":
				employeeMenu = false;	
				break;
			}
		}
	}

	public static void getEmployees() {
		System.out.println("Book Store Employees");
		for (Employee employee : bs.employees) {
			System.out.println(employee);
		}
	}

	public static void addEmployee() {
		System.out.println("Eneter employee ID:");
		int employeeID = input.nextInt();
		input.nextLine();

		System.out.println("Enter employee first name:");
		String firstName = input.nextLine();

		System.out.println("Enter employee last name:");
		String lastName = input.nextLine();

		System.out.println("Enter employee pin number:");
		String employeePin = input.nextLine();

		Employee employee = new Employee(employeeID, firstName, lastName, employeePin);

		bs.employees.add(employee);
	}

	public static void updateEmployee() {
		boolean menu = true;
		while (menu) {
			Employee employee = null;
			System.out.println("Please enter the employee ID");
			int employeeID = input.nextInt();
			input.nextLine();

			while (menu) {
				// take input of employee ID to choose employee and update desired information
				// it displays the data each time you up date a part, fix it!!!
				for (int i = 0; i < bs.employees.size(); i++) {
					employee = bs.employees.get(i);
					if (employee.employeeID == employeeID) {
						System.out.println(employee);
						System.out.println("what would you like to change?");
						System.out.println("1: First Name:");
						System.out.println("2: Last Name:");
						System.out.println("3: Employee Pin:");
						System.out.println("4: Go Back:");

						String choice = input.nextLine();
						switch (choice) {
						case "1":
							System.out.println("Enter new first name:");
							String firstName = input.nextLine();
							employee.setFirstName(firstName);
							break;

						case "2":
							System.out.println("Enter new last name:");
							String lastName = input.nextLine();
							employee.setLastName(lastName);
							break;

						case "3":
							System.out.println("Enter new pin number");
							String employeePin = input.nextLine();
							employee.setEmployeePin(employeePin);
							break;

						case "4":
							menu = false;
							break;
						}
					}
				}
			}
		}
	}

	public static void removeEmployee() {
		// Select employee based off ID
		boolean menu = true;
		Employee employee = null;
		while (menu) {
			System.out.println("Enter Employee ID that you want to delete");
			int employeeID = input.nextInt();
			input.nextLine();

			for (int i = 0; i < bs.employees.size(); i++) {
				employee = bs.employees.get(i);
				if (employee.employeeID == employeeID) {
					// ADD Are you sure you want to delete employee from system
					bs.employees.remove(i);
					System.out.println(employee.firstName + " " + employee.lastName + " has been deleted");
				}
			}
			menu = false;
		}
	}

// Customer Functionality ===========================================================================================

	public static void getCustomer() {
		for (Customer customer : bs.customers) {
			System.out.println(customer);
		}
	}

	public static void addCustomer() {

	}
	
	// Inventory Functionality =======================================================================================
	
	public static void getBooks() {
		for(Book book : bs.books) {
			System.out.println(book);
		}
	}
	
	
	
	
	
	
	
	
}
