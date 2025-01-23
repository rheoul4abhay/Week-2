import java.util.ArrayList;

class Books{
	private String title;
	private String author;
	private double price;
	
	Books(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void displayBookDetails(){
		System.out.print("\nDisplaying book details : ");
		System.out.print("Title : " + title);
		System.out.print("Author : " + author);
		System.out.print("Price : $" + price);
	}
}

class Library{
	ArrayList<Books> books = new ArrayList<>();
	private static int numberOfBooks = 0;
	private String libraryName;
	
	Library(String libraryName){
		this.libraryName = libraryName;
	}
	
	public void addBook(Books book){
		books.add(book);
		numberOfBooks++;
		System.out.print("\nBook added successfully! ");
	}
	
	public void removeBook(String name){
		if(books.size() == 0){	
			System.out.print("\nAdd a book in the libray first! ");
			return;
		}
		boolean bookRemoved = false;
		for(Books book: books){
			if(book.getTitle().equalsIgnoreCase(name)){
				books.remove(book);
				System.out.print("\nBook removed from library! ");
				bookRemoved = true;
				return;
			}
		}
		if(!bookRemoved){
			System.out.print("\nBook not found with this name");
			return;
		}
	}
	
	public void displayLibraryDetails(){
		System.out.print("\nDisplaying library details : ");
		System.out.print("Name of library : " + libraryName);
		System.out.print("Number of books : " + numberOfBooks);
	}
}

public class LibraryManagement{
	public static void main(String[] args){
		Books book1 = new Books("Harry Potter", "JK Rowling", 10.0);
		Books book2 = new Books("Jungle Book", "Rudyard Kipling", 7.5);
		
		Library rangmahal = new Library("Rangmahal");
		rangmahal.addBook(book1);
		rangmahal.addBook(book2);
		System.out.println();
		rangmahal.removeBook("Jungle book");
 	}
}
