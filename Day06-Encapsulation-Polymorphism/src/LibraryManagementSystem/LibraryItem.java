package LibraryManagementSystem;

public abstract class LibraryItem {
    private String itemID;
    private String title;
    private String author;

    public LibraryItem(String itemID, String title, String author){
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    //getter methods

    public String getItemID(){
        return itemID;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public void getItemDetails(){
        System.out.print("\n------Displaying item details ------");
        System.out.print("\nItem ID: " + getItemID());
        System.out.print("\nItem Title: " + getTitle());
        System.out.print("\nItem Author: " + getAuthor());
    }

    abstract int getLoanDuration();
}
