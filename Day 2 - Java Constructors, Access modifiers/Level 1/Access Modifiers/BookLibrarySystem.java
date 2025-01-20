class Book{
	public int ISBN;
	protected String title;
	private String author;
	
	Book(int ISBN, String title, String author){
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	public void setAuthorName(String newName){
		author = newName;
	}
	
	public String getAuthorName(){
		return author;
	}
	
	public void displayBookDetails(){
		System.out.print("\nBook ISBN: " + ISBN);
		System.out.print("\nBook title: " + title);
		System.out.print("\nBook author: " + getAuthorName());
	}
}

class EBook extends Book{
	private String bookIssuer;
	
	EBook(int ISBN, String title, String author, String bookIssuer){
		super(ISBN, title, author);
		this.bookIssuer = bookIssuer;
	}
	
	public void displayEBookDetails(){
		System.out.print("\nBook ISBN: " + ISBN);
		System.out.print("\nBook title: " + title);
		System.out.print("\nBook author: " + getAuthorName());
		System.out.print("\nBook issuer: " + bookIssuer);
	}
	
}

public class BookLibrarySystem{
	public static void main(String[] args){
		Book book1 = new Book(123, "Lost worlds", "KP Morgan");
		book1.displayBookDetails();
		System.out.println();
		
		book1.setAuthorName("MP Bhaskar");
		book1.displayBookDetails();
		System.out.println();
		
		EBook eBook1 = new EBook(12345, "Found world", "JP Holland", "Kindle");
		eBook1.displayBookDetails();
		eBook1.setAuthorName("John Wick");
		System.out.println();
		
		eBook1.displayEBookDetails();
	}
}