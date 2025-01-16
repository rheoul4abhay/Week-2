import java.util.Scanner;

class Book{
	private String title ;
	private String name;
	private double price;
	
	public Book(String title, String name, double price){
		this.title = title;
		this.name = name;
		this.price = price;
	}		
	
	public void displayDetails(){
		System.out.print("\nBook Title -> " + title);
		System.out.print("\nBook Author -> " + name);
		System.out.print("\nBook Price -> " + "$ " + String.valueOf(price));
	}
}

public class BookHandler{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("--------- Enter Details about the book --------");
		
		System.out.print("\nEnter title of book -> ");
		String title = scanner.nextLine();
		
		System.out.print("\nEnter author of book -> ");
		String author = scanner.nextLine();
		
		System.out.print("\nEnter price of book -> ");
		Double price = scanner.nextDouble();
		
		//Creating new book object
		Book book = new Book(title, author, price);
		book.displayDetails();
		scanner.close();
	}
}
