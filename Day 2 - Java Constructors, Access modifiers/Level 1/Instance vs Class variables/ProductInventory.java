import java.util.Scanner;

class Product{
	//Instance variables
	private String productName;
	private double price;
	
	//Class variables
	private static int totalProducts = 0;
	
	public Product(){
		this.productName = "Unknown";
		this.price = 0.00;
	}
	
	public Product(String productName, double price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	public void displayDetails(){
		System.out.println();
		System.out.print("\nProduct name : " + this.productName);
		System.out.print("\nPrice of product: $" + this.price);
	}
	
	public static void displayTotalProducts(){
		System.out.println();
		System.out.print("\nTotal number of products : " + totalProducts);
	}
}

public class ProductInventory{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the name of produt: ");
		String productName = scanner.nextLine();
		System.out.print("Enter the price of product: ");
		double price = scanner.nextDouble();
		
		//Creating product object
		Product product1 = new Product(productName, price);
		Product product2 = new Product("SmartPhone", 200.00);
		Product product3 = new Product();
		
		product1.displayDetails();
		product2.displayDetails();
		product3.displayDetails();
		
		//Using class method below
		Product.displayTotalProducts();
		scanner.close();
	}
	
}