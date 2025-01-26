package ECommercePlatform;

import java.util.ArrayList;

public class ECommercePlatform {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();

        Electronics laptop = new Electronics("@123", "Laptop", 750.0);
        Clothing blazer = new Clothing("@456", "Blazer", 100.0);
        Groceries flour = new Groceries("@789", "Flour", 10.0);

        products.add(laptop);
        products.add(blazer);
        products.add(flour);

        for(Product product: products){
            product.calculateTotalBill();
            product.displayProductDetails();
        }
    }
}
