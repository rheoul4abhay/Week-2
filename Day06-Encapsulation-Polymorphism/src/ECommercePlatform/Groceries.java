package ECommercePlatform;

public class Groceries extends Product {

    private double discountPercentage = 5.0;
    private double generatedTotalBill;

    public Groceries(String groceryProductID, String groceryProductName, double groceryProductPrice){
        super(groceryProductID, groceryProductName, groceryProductPrice);
    }

    @Override
    public double calculateDiscount(){
        return (discountPercentage/(double)(100) * getProductPrice());
    }

    //This method is specific to non-tax applicable product classes like grocery(in some cases)
    public void calculateTotalBill(){
        generatedTotalBill = getProductPrice() - calculateDiscount();
    }

    public double getGeneratedTotalBill(){
        return generatedTotalBill;
    }

    @Override
    public void displayProductDetails(){
        System.out.print("\nDisplaying grocery product " + getProductName() + "'s details");
        System.out.print("\nProduct ID: " + getProductID());
        System.out.print("\nProduct Name: " + getProductName());
        System.out.print("\nProduct Price: " + getProductPrice());
        System.out.print("\nDiscount applied: " + calculateDiscount());
        System.out.print("\nTotal Bill: $" + getGeneratedTotalBill());
        System.out.println();
    }
}
