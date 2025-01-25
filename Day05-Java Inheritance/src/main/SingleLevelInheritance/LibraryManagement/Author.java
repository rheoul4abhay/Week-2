package main.SingleLevelInheritance.LibraryManagement;

public class Author extends Book{
    String name, bio;

    public Author(String title, int publicationYear, String name, String bio){
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo(){
        System.out.println("\nAuthor info : ");
        System.out.println("Book Title -> " + title);
        System.out.println("Book Publication Year -> " + publicationYear);
        System.out.println("Author Name -> " + name);
        System.out.println("Author bio -> " + bio);
    }
}
