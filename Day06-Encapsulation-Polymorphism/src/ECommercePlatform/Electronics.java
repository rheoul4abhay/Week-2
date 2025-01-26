package ECommercePlatform;

public class Electronics extends Product implements Taxable{

    private double payableTaxPercentage = 20.0;
    private double discountPercentage = 10.0;
    private double generatedTotalBill;

    public Electronics(String electronicsProductID, String electronicsProductName, double ElectronicsProductPrice){
        super(electronicsProductID, electronicsProductName, ElectronicsProductPrice);
    }

    public void setPayableTaxPercentage(double newTax){
        payableTaxPercentage = newTax;
    }

    public double getPayableTaxPercentage(){
        return payableTaxPercentage;
    }

    @Override
    public String getTaxDetails(){
        return String.valueOf(payableTaxPercentage) + "% tax applied to electronics.";
    }

    @Override
    public double calculateTax(){
        return getProductPrice() * (payableTaxPercentage/(double)(100));
    }

    @Override
    public double calculateDiscount(){
        return (discountPercentage/(double)(100) * getProductPrice());
    }

    public void calculateTotalBill(){
        generatedTotalBill = getProductPrice()  + calculateTax() - calculateDiscount();
    }

    public double getGeneratedTotalBill(){
        return generatedTotalBill;
    }

    @Override
    public void displayProductDetails(){
        System.out.print("\nDisplaying electronics product " + getProductName() + "'s details");
        System.out.print("\nProduct ID: " + getProductID());
        System.out.print("\nProduct Name: " + getProductName());
        System.out.print("\nProduct Price: " + getProductPrice());
        System.out.print("\nDiscount applied: " + calculateDiscount());
        System.out.print("\nTax details : " + getTaxDetails());
        System.out.print("\nTotal Bill: $" + getGeneratedTotalBill());
        System.out.println();
    }
}
