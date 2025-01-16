import java.util.Scanner;

class MobilePhone{
	private String brand;
	private String model;
	private double price;
	
	public MobilePhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	public void displayDetails(){
		System.out.print("\nBrand -> " + brand);
		System.out.print("\nModel -> " + model);
		System.out.print("\nPrice -> " + String.valueOf(price));
	}
}

public class HandleMobilePhone{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\n----- Enter the details of phone ----");
		System.out.print("\nEnter mobile brand -> ");
		String brand = scanner.nextLine();
		
		System.out.print("\nEnter mobile model -> ");
		String model = scanner.nextLine();
		
		System.out.print("\nEnter mobile price -> ");
		double price = scanner.nextDouble();
		
		MobilePhone mobile = new MobilePhone(brand, model, price);
		mobile.displayDetails();
		scanner.close();
	}
}