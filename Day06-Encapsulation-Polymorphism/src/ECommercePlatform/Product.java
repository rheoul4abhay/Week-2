package ECommercePlatform;

abstract public class Product {

    private String productID;
    private String productName;
    private double productPrice;
    private double discountPercentage = 5.0; //By default discount is 5%

    Product(String productID, String productName, double productPrice){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductID(){
        return productID;
    }

    public void setProductID(String newProductID){
        productID = newProductID;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String newProductName){
        productName = newProductName;
    }

    public double getProductPrice(){
        return productPrice;
    }

    public void setProductPrice(double newPrice){
        productPrice = newPrice;
    }

    public void setDiscountPercentage(double newDiscount){
        discountPercentage = newDiscount;
    }

    public double getDiscountPercentage(){
        return discountPercentage;
    }

    public abstract void calculateTotalBill();

    public void displayProductDetails(){
        System.out.print("\nDisplaying product " + getProductName() + "'s details");
        System.out.print("\nProduct ID: " + getProductID());
        System.out.print("\nProduct Name: " + getProductName());
        System.out.print("\nProduct Price: $" + getProductPrice());
        System.out.println();
    }

    public abstract double calculateDiscount();
}
