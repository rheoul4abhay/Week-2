class Book{
	final public int ISBN;
	protected String title;
	private String author;
	private static String libraryName = "Rang Mahal Library";
	
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
	
	public static void displayLibraryName(){
		System.out.print("\nLibrary name : " + libraryName);
	}
}

public class LibraryManagementSystem{
	public static void main(String[] args){
		Book book1 = new Book(123, "Lost worlds", "KP Morgan");
		book1.displayBookDetails();
		System.out.println();
		
		book1.setAuthorName("MP Bhaskar");
		book1.displayBookDetails();
		System.out.println();
		boolean result = book1 instanceof Book;
		System.out.print("is instance of class ? " + result);
	}
}