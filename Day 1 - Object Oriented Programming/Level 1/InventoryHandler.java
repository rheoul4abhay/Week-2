import java.util.Scanner;

class Item{
	private int itemCode;
	private String itemName;
	private double itemPrice;
	
	public Item(int itemCode, String itemName, double itemPrice){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	public void displayDetails(){
		System.out.print("\n-------Displaying Item details--------");
		System.out.print("\nItem code : " + String.valueOf(itemCode));
		System.out.print("\nItem name : " + itemName);
		System.out.print("\nItem price : " + String.valueOf(itemPrice));
	}
	
	public double getTotal(int quantity){
		double totalPrice = (double)(quantity) * itemPrice;
		return totalPrice;
	}
}

public class InventoryHandler{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter item code -> ");
		int itemCode = scanner.nextInt();
		
		System.out.print("\nEnter item name -> ");
		String name = scanner.next();
		
		System.out.print("\nEnter item price -> ");
		double price = scanner.nextDouble();
		
		Item item = new Item(itemCode, name, price);
		item.displayDetails();
		
		System.out.print("\nEnter quantity of items -> ");
		int quantity = scanner.nextInt();
		
		double totalPrice = item.getTotal(quantity);
		System.out.print("\nTotal Bill -> " + String.valueOf(totalPrice));
		scanner.close();
	}
}