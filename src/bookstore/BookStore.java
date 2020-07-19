package bookstore;

import java.util.ArrayList;
import java.util.Date;

public class BookStore {
	
	ArrayList<Employee> employees = new ArrayList<Employee>();
	ArrayList<Customer> customers = new ArrayList<Customer>();
	ArrayList<Checkout> checkout = new ArrayList<Checkout>();
	ArrayList<Book> books = new ArrayList<Book>();
	
	public BookStore() {
		
		//Employee data1
		employees.add(new Employee(115, "John", "Smith", "2212"));
		employees.add(new Employee(258, "Cameron", "Landreth", "1557"));
		employees.add(new Employee(312, "Sam", "Jones", "1998"));
		employees.add(new Employee(278, "Kevin", "Stone", "1234"));
		employees.add(new Employee(546, "Brian", "Butler", "5564"));
		employees.add(new Employee(784, "Danielle", "Diamond", "1245"));	
		
		//Customer Data
		customers.add(new Customer(2346, "Walter", "White", "555-254-2536", "124 Parkway DR"));
		customers.add(new Customer(2278, "Jesse", "Pinkmen", "555-254-2536", "124 Orlando Ave"));
		customers.add(new Customer(2141, "Saul", "Goodmen", "555-254-2536", "124 Park ST"));
		
		//Inventory Data
		books.add(new Book(1223, "A Game of Thrones", "George R. R. Martin", "Fantasy", "1996", 10, 9.99));
		books.add(new Book(1224, "A Clash of Kings", "George R. R. Martin", "Fantasy", "1998", 6, 9.99));
		books.add(new Book(1225, "A Storm of Swords", "George R. R. Martin", "Fantasy", "2000", 8, 9.99));	
		books.add(new Book(1226, "A Feast of Crows", "George R. R. Martin", "Fantasy", "2005", 3, 9.99));	
		books.add(new Book(1227, "A Dance with Dragons", "George R. R. Martin", "Fantasy", "2011", 9, 9.99));
		books.add(new Book(1546, "The Hobbit", "J. R. R. Tolkien", "Fantasy", "1937", 5, 7.99));
		books.add(new Book(1547, "The Lord of The Rings - The Fellowship of the Ring", "J. R. R. Tolkien", "Fantasy", "1954", 5, 19.99));
		books.add(new Book(1548, "The Lord of The Rings - The Two Towers", "J. R. R. Tolkien", "Fantasy", "1954", 5, 19.99));
		books.add(new Book(1549, "The Lord of The Rings - The Return of the King", "J. R. R. Tolkien", "Fantasy", "1955", 5, 19.99));
		
		books.add(new Book(2147, "The Shinning", "Stephen King", "Horror", "1977", 6, 8.99));
		books.add(new Book(2148, "IT", "Stephen King", "Horror", "1986", 3, 9.99));
		books.add(new Book(2149, "Dracula", "Bram Stoker", "Horror", "1897", 3, 11.99));
		books.add(new Book(2150, "The Exorcist", "Peter Blatty", "Horror", "1971", 5, 7.99));
		books.add(new Book(2156, "Interview with the Vampire", "Anne Rice", "Horror", "1976", 4, 8.99));
		books.add(new Book(2157, "The Vampire Lestat", "Anne Rice", "Horror", "1985", 4, 8.99));
		books.add(new Book(2158, "The Queen of the Damned", "Anne Rice", "Horror", "1988", 4, 8.99));
		
		books.add(new Book(3021, "The Raven", "Edgar Allan Poe", "Poetry", "1845", 3, 4.99));
		
		checkout.add(new Checkout(2344, 1223, now(), 2, 9.99));
		checkout.add(new Checkout(2278, 1223, now(), 1, 9.99));
		checkout.add(new Checkout(2141, 1223, now(), 3, 9.99));
		
		
		
	}

	private Date now() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
