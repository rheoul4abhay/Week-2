package OnlineFoodDeliverySystem;

public abstract class FoodItem {

    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public FoodItem(String itemName, double itemPrice, int itemQuantity){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    //getter methods
    public String getItemName(){
        return itemName;
    }

    public double getItemPrice(){
        return itemPrice;
    }

    public int getItemQuantity(){
        return itemQuantity;
    }

    public void setItemQuantity(int newQuantity){
        if(newQuantity > 0){
            this.itemQuantity = newQuantity;
        } else {
            System.out.print("\nItem Quantity must be positive!");
        }
    }

    public void displayItemDetails(){
        System.out.print("\n------Displaying item details------");
        System.out.print("\nItem Name: " + getItemName());
        System.out.print("\nItem Price: $" + getItemPrice());
        System.out.print("\nItem Quantity: " + getItemQuantity());
    }
    abstract double calculateTotalPrice();
}
