package OnlineFoodDeliverySystem;

public class NonVegItem extends FoodItem implements Discountable{

    private double discount;
    private static final double nonVegCharge = 2.0;

    public NonVegItem(String itemName, double itemPrice, int itemQuantity){
        super(itemName, itemPrice, itemQuantity);
        this.discount = 0.0;
    }

    @Override
    public void applyDiscount(double discountPercentage){
        discount = (discountPercentage/100) * (getItemPrice()*getItemQuantity());
    }

    @Override
    public String getDiscountDetails(){
        return "\nDiscount applied: $" + discount;
    }

    public double getNonVegCharge(){
        return nonVegCharge;
    }
    @Override
    public double calculateTotalPrice(){
        return getItemPrice() * getItemQuantity() - discount + nonVegCharge;
    }
}
