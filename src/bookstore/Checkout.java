package bookstore;

import java.util.Date;

public class Checkout {

	int customerID;
	int bookID;
	int qty;
	double price;
	double total;
	Date purchaseDate;
	
	public Checkout(int customerID, int bookID, Date purchaseDate, int qty, double price){
	this.customerID = customerID;
	this.bookID = bookID;
	this.purchaseDate = purchaseDate;
	this.qty = qty;
	this.price = price;
	this.total = calc();
	}
	
	
	public double calc() {
		return qty * price;
	}
	
	public String toString() {
		return "Customer ID: " + customerID + ", BookID: " + bookID + ", Date: " + purchaseDate + ", QTY: " + qty + ", price: " + price + ", Total: " + total;
 	}
	
	
	
}
