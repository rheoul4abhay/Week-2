package LibraryManagementSystem;

public class Book extends LibraryItem implements Reservable{

    private boolean isReserved;
    private static int borrowDuration = 14;

    public Book(String itemID, String title, String author){
        super(itemID, title, author);
        this.isReserved = false;
    }

    @Override
    public void reserveItem(String borrowerName){
        if(!isReserved){
            isReserved = true;
            System.out.print("\nBook reserved successfully for " + borrowerName);
        } else{
            System.out.print("\nBook is already reserved! Wait for some days!");
        }
    }

    @Override
    public boolean checkAvailability(){
        return !isReserved;
    }

    @Override
    public int getLoanDuration(){
        return borrowDuration;
    }
}
