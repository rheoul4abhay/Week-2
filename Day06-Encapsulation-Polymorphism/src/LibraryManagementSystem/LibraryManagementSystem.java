package LibraryManagementSystem;

import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args){
        ArrayList<LibraryItem> items = new ArrayList<>();

        LibraryItem book = new Book("@123", "Harry Potter", "JK Rowling");
        LibraryItem magazine = new Magazine("@456", "Hindustan Times", "Various");
        LibraryItem dvd = new DVD("@789", "Heat Waves", "Glass Animals");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        for(LibraryItem item: items){
            item.getItemDetails();
            System.out.print("\nLoan duration: " + item.getLoanDuration());

            if(item instanceof Reservable){
                Reservable reservableItem = (Reservable) item;

                //checking availability before reserving the item
                System.out.print("\nAvailability of item: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));

                //reserving the item
                reservableItem.reserveItem("Mike");

                //checking availability after reserving the item
                System.out.print("\nAvailability of item: " + (reservableItem.checkAvailability() ? "Available" : "Not Available"));
            }
            System.out.println();
        }
    }
}
