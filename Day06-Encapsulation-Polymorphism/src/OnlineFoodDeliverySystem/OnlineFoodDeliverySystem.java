package OnlineFoodDeliverySystem;

import java.util.ArrayList;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args){
        ArrayList<FoodItem> foodItems = new ArrayList<>();

        VegItem dosa = new VegItem("Masala Dosa", 5.0, 3);
        NonVegItem butterChicken = new NonVegItem("Butter Chicken", 10.0, 2);

        foodItems.add(dosa);
        foodItems.add(butterChicken);

        for(FoodItem foodItem: foodItems){
            foodItem.displayItemDetails();

            // Applying polymorphism and handling discounts
            if(foodItem instanceof Discountable){
                Discountable discountableItem = (Discountable) foodItem;
                discountableItem.applyDiscount(10.0);
                System.out.print(discountableItem.getDiscountDetails());
            }
            if(foodItem instanceof NonVegItem){
                NonVegItem nonVegItem = (NonVegItem) foodItem;
                System.out.print("\nApplied Non-Veg Charges: $" + nonVegItem.getNonVegCharge());
            }
            System.out.print("\nTotal Price: $" + foodItem.calculateTotalPrice());
            System.out.println();
        }
    }
}
