import java.util.Scanner;
import java.util.ArrayList;

class CartItem{
	private String itemName;
	private double price;
	private int quantity;
	
	public CartItem(String itemName, double price, int quantity){
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getItemName(){
		return itemName;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getQuantity(){
		return quantity;
	}
	
	public double getTotalPrice(){
		return price * quantity;
	}
	
	@Override
	public String toString() {
		return itemName + " - $" + String.format("%.2f", price) + " x " + quantity;
	}
}

class ShoppingCart{
	private ArrayList<CartItem> cartItems;
	
	public ShoppingCart(){
		cartItems = new ArrayList<>();
	}
	
	public void addItem(String itemName, double price, int quantity) {
		for(CartItem item: cartItems){
			if(item.getItemName().equalsIgnoreCase(itemName)) {
				System.out.println("Item already exists in card. Use another name or update its quantity.");
				return;
			}
		}
		cartItems.add(new CartItem(itemName, price, quantity));
		System.out.println("Item added to the cart!");
	}
	
	public void removeItem(String itemName){
		for(CartItem item : cartItems){
			if(item.getItemName().equalsIgnoreCase(itemName)){
				cartItems.remove(item);
				System.out.println("Item removed from the cart!");
				return;
			}
		}
		System.out.println("Item not found in the cart.");
	}
	
	public void displayTotalCost(){
		double totalCost = 0;
		for(CartItem item: cartItems){
			totalCost += item.getTotalPrice();
		}
		System.out.println("Total Cost : $" + String.format("%.2f", totalCost));
	}
	
	public void displayCart(){
		if(cartItems.isEmpty()) {
			System.out.println("Your cart is empty");
		}
		else {
			System.out.println("Items in your cart : ");
			for(CartItem item: cartItems){
				System.out.println(item);
			}
		}
	}
}

public class ShoppingCartSimulation{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		
		 while (true) {
            System.out.println("\nShopping Cart Menu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
			
			switch(choice){
				case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
				
				case 2:
					System.out.print("Enter item to remove: ");
					String itemToRemove = scanner.nextLine();
					cart.removeItem(itemToRemove);
					break;
				
				case 3:
					cart.displayCart();
					break;
					
				case 4:
					cart.displayTotalCost();
                    System.out.println("Thank you for shopping with us!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
			}	
		 }
	}
}