package main.SingleLevelInheritance.LibraryManagement;

public class LibraryManagement {
    public static void main(String[] args){
        Book book = new Book("Harry Potter", 1995);
        Author author = new Author("Harry Potter", 1995, "JK Rowling", "I am a woman who loves magic!");
    
        book.displayInfo();
        author.displayInfo();
    }
}
