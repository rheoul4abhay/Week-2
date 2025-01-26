package OnlineFoodDeliverySystem;

public class VegItem extends FoodItem implements Discountable {

    private double discount;

    public VegItem(String itemName, double itemPrice, int itemQuantity){
        super(itemName, itemPrice, itemQuantity);
        this.discount = 0.0;
    }

    @Override
    public void applyDiscount(double discountPercentage){
        discount = (discountPercentage/100) * (getItemPrice() * getItemQuantity());
    }

    @Override
    public String getDiscountDetails(){
        return "\nDiscount applied : $" + discount;
    }

    @Override
    public double calculateTotalPrice(){
        return getItemPrice() * getItemQuantity() - discount;
    }
}
