package LibraryManagementSystem;

public class Magazine extends LibraryItem implements Reservable {

    private boolean isReserved;
    private static int borrowDuration = 7;

    public Magazine(String itemID, String title, String author){
        super(itemID, title, author);
        this.isReserved = false;
    }

    @Override
    public void reserveItem(String borrowerName){
        if(!isReserved){
            isReserved = true;
            System.out.print("\nMagazine reserved successfully for " + borrowerName);
        } else {
            System.out.print("\nMagazine is already reserved! Wait for some days.");
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
