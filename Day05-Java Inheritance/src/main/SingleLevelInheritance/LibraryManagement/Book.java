package main.SingleLevelInheritance.LibraryManagement;

public class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear){
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo(){
        System.out.println("\nBook info");
        System.out.println("Book Title -> " + title);
        System.out.println("Book Publication Year -> " + publicationYear);
    }
}
