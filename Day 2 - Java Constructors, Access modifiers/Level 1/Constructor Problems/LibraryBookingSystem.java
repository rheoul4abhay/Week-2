import java.util.Scanner;

class Book{
	String title;
	String author;
	double price;
	boolean isAvailable = true;
	
	Book(){
		this("Unknown", "Unknown", 0.00, false);
	}
	
	Book(String title, String author, double price, boolean isAvailable){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//Method to borrow a book
	public boolean borrowBook(){
		if(isAvailable){
			isAvailable = false;
			System.out.print("\nBook successfully borrowed!");
			return true;
		} else{
			System.out.print("\nSorry, the book \"" + title + "\" is not available.");
			return false;
		}
	}
	
	//Method to return a book
	public void returnBook(){
		if(!isAvailable) {
			isAvailable = true;
			System.out.print("\nThe book \"" + title + "\" has been returned.");
		}
		else {
		System.out.print("\nThe book \"" + title + "\" was not borrowed.");
		}
	}
	
	public void displayDetails(){
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: $" + price);
		System.out.println("Availabilty: " + (isAvailable ? "Available" : "Not Available"));
	}
}

public class LibraryBookingSystem{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter title of book : ");
		String title = scanner.nextLine();
		
		System.out.print("Enter author of book : ");
		String author = scanner.nextLine();
		
		System.out.print("Enter price of book : ");
		double price = scanner.nextDouble();
		
		Book book1 = new Book(title, author, price, true);
		book1.displayDetails();
		//Borrowing book
		book1.borrowBook();
		
		//Returning book
		book1.returnBook();
		scanner.close();
	}
}