package LibraryManagementSystem;

public class DVD extends LibraryItem implements Reservable{

    private boolean isReserved;
    private static int borrowDuration = 3;

    public DVD(String itemID, String title, String author){
        super(itemID, title, author);
        this.isReserved = false;
    }

    @Override
    public void reserveItem(String borrowerName){
        if(!isReserved){
            isReserved = true;
            System.out.print("\nDVD reserved successfully for " + borrowerName);
        } else {
            System.out.print("\nDVD is already reserved! Wait for some days.");
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
