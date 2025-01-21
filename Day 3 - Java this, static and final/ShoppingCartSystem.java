import java.util.ArrayList;
import java.util.Scanner;

class Product{
	private String productName;
	private double productPrice;
	private int productQuantity;
	
	static private double discount = 5;
	final private int productID;
	
	Product(String productName, double productPrice, int productQuantity, int productID){
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productID = productID;
	}
	
	public String getProductName(){
		return productName;
	}
	
	public double getPrice(){
		return productPrice;
	}
	
	public int getQuantity(){
		return productQuantity;
	}
	
	public double getDiscount(){
		return discount;
	}
	
	public static void updateDiscount(double newDiscount){
		discount = newDiscount;
	}
		
	public double discountedPrice(){
		return productPrice - ((double)(discount/(double)(100)) * productPrice);
	}
	
	public double totalPrice(){
		return (discountedPrice() * (double)(productQuantity));
	}
	
	public void displayProductDetails(){
		System.out.println();
		System.out.print("\nProduct name : " + productName);
		System.out.print("\nProduct price : $" + getPrice());
		System.out.print("\nProduct quantity : " + getQuantity());
		System.out.print("\nApplicable discount : " + getDiscount() + "%");
		System.out.print("\nTotal price : $" + totalPrice());
	}
	
	@Override
	public String toString() {
		return productName + " - $" + String.format("%.2f", productPrice) + " x " + productQuantity;
	}
}

class ShoppingCart{
	private ArrayList<Product> productCart;
	
	ShoppingCart(){
		productCart = new ArrayList<>();
	}
	
	public void addProduct(Object obj){
		if(obj instanceof Product){
			Product newProduct = (Product) obj;
			for(Product product: productCart){
				if(product.getProductName().equalsIgnoreCase(newProduct.getProductName())) {
					System.out.println("Product already exists in the cart! Consider updating its quantity!");
					return;
				}
			}
			//if no duplicate product is found,
			productCart.add(newProduct);
			System.out.println("Product added to the cart successfully!");
		} else {
			System.out.print("Invalid object! Only products can be added!");
		}
	}
	
	public void removeProduct(String productName){
		for(Product product: productCart){
			if(product.getProductName().equalsIgnoreCase(productName)){
				productCart.remove(product);
				System.out.print("\nProduct removed from the cart !");
				return;
			}
		}
		System.out.println("\nItem not found in the cart. ");
	}
	
	public String checkout(){
		double totalCost = 0;
		for(Product product : productCart){
			totalCost += product.totalPrice();
		}
		return ("\nTotal Bill : $" + String.format("%.2f", totalCost));
	}
	
	public void displayProductCart(){
		if(productCart.isEmpty()){
			System.out.println("Your cart is empty! Add some item. ");
		}
		else {
			System.out.println();
			System.out.println("Items in your cart : ");
			for(Product product: productCart){
				System.out.println(product);
			}
		}
	}
	
}

public class ShoppingCartSystem{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		
		Product.updateDiscount(10);
		boolean continueShopping = true;
		while(continueShopping){
			System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
			
			switch(choice){
				case 1:
					System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int productQuantity = scanner.nextInt();
					System.out.print("Enter product ID: ");
					int productID = scanner.nextInt();
					
					Product product = new Product(productName, productPrice, productQuantity, productID);
                    cart.addProduct(product);
                    break;
				
				case 2:
					System.out.print("Enter product to remove : ");
                    String productToRemove = scanner.nextLine();
					cart.removeProduct(productToRemove);
					break;
					
				case 3:
					cart.displayProductCart();
					break;
				
				case 4:
					System.out.println(cart.checkout());
					break;
				
				case 5:
					System.out.println("Thankyou for shopping with us!");
					continueShopping = false;
					break;
					
				default:
					System.out.println("Enter a valid choice !");
			}
		}
		scanner.close();
	}
}