package bookstore;

public class Book {
	
	public String title;
	public String author;
	public String genre;
	public String year;
	public int numCopies;
	public double price;
	
	public Book(String title, String author, String genre, String year, int numCopies, double price) {
		this.title = title;
		this.author = author;
		this.genre = author;
		this.year = year;
		this.numCopies = numCopies;
		this.price = price;
	}
	
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Year: " + year + ", Number of Copies: " + numCopies + ", Price: " + price;
	}
	
	

}
