// Program to create a book class by passing bookID, title, author, category and price 

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class InvalidBookException extends Exception{
	public InvalidBookException(String s) {
		super(s);
	}
}
class Book {
	String bookID;
	String title;
	String author;
	String category;
	float price;
	
	public Book() {
		
	}
	
	public Book(String bookID, String title, String author, String category, float price) throws InvalidBookException {
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	
	if(!(category == "Science" || category == "Fiction" || category == "Technology" || category == "Others")) {
		throw new InvalidBookException("No Such Category");
	}
	if(price < 0) {
		throw new InvalidBookException("Price Cannot Be In Negative");
	}
	if(!(bookID.startsWith("B") && bookID.length() == 4)){
		throw new InvalidBookException("BookID must start with B and must be of length 4");
	}
	}
	
	public String searchByTitle(String title) {
		if(this.title == title) {
			System.out.println(this.toString());
		}
		else {
			System.out.println("There is no such book my this title");
		}
		return title;
	}
	
	public String searchByAuthor(String author) {
		if(this.author == author) {
			System.out.println(this.toString());
		}
		else {
			System.out.println("There is no such book my this author");
		}
		return author;
	}
	
	void displayAll() {
		System.out.println(" The Title of the Book: "+title);
        System.out.println(" The Author of the Book: "+author);
        System.out.println(" The BookID is: "+bookID);
        System.out.println(" The Category of the Book is: "+ category);
        System.out.println(" The Price of the Book is: "+ price);
	}
	public String toString()
    {
        return "The Details of the Book are: " + title + ", " + author + ", " + bookID + ", " + category + ", " + price ;
    }
	
}
public class BookStore{
	

	public static void main(String[] args) throws InvalidBookException {
		Book b1 = new Book("B123", "The Nature of Nature", "Enric Sala", "Science", 500f);
		Book b2 = new Book("B234", "Web Technology", "N.P. Gopalan", "Technology", 200f);
		Book b3 = new Book("B676", "The Ministry For The Future", "Kim Stanley Robinson", "Others", 1000f);
		
		b1.displayAll();
		b2.displayAll();
		b3.displayAll();
		
		List<Book> list = new ArrayList<Book>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
	
//		b1.searchByTitle("Web Technology");  // This will print the details if the title name is correct
//		b1.searchByAuthor("Arshad");  // This will print the details if the author name is correct
		
		list.forEach(p -> System.out.println(p));
		
		
		
		List<String> searchByTitle = list.stream().map(p -> p.title).collect(Collectors.toList());
		System.out.println(searchByTitle);
		
		List<String> searchByAuthor = list.stream().map(p -> p.author).collect(Collectors.toList());
		System.out.println(searchByAuthor);
		
//		Book b4 = new Book("B676", "C++", "Bjarne Stroustrup", "Computer Science", 1000f);  // This line will throw exception as there is no such catgory as computer science
//		Book b5 = new Book("B676", "Java", "James Gosling", "Information Technology", -300f); // This line will throw exception as its price is negative
//		Book b5 = new Book("R67656", "Java", "James Gosling", "Science", 400f);  // This line will throw exception as its BookID starts with R and not B and its length is more than 4
//		b5.displayAll();
		
	}

}



