import java.util.Scanner;

class Book{
	String title;
	String author;
	int price;
	
	Book(){
		this.title = "";
		this.author = "";
		this.price = 0;
	}
	
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayDetails(){
		System.out.print("\nTitle : " + title);
		System.out.print("\nAuthor : " + author);
		System.out.print("\nPrice : " + price);
	}
}

public class BookManagement{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter title : ");
		String title = scanner.nextLine();
		System.out.print("\nEnter Author : ");
		String author = scanner.nextLine();
		System.out.print("\nEnter price : ");
		int price = scanner.nextInt();
		
		Book book1 = new Book(title, author, price);
		Book book2 = new Book();
		
		book1.displayDetails();
		System.out.print("\nDisplaying book 2 : ")
		book2.displayDetails();
		scanner.close();
	}
}