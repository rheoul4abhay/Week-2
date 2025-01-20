import java.util.Scanner;

class CarRental{
	String customerName;
	String carModel;
	int rentalDays;
	boolean isRented;
	double rentedPrice;
	double totalCost;
	
	CarRental(){
		this.customerName = "Unknown";
		this.carModel = "N/A";
		this.rentalDays = 0;
		this.rentedPrice = 0.0;
		this.totalCost = 0.0;
		this.isRented = false;
	}
	
	CarRental(String customerName, String carModel, int rentalDays,double rentedPrice){
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.rentedPrice = rentedPrice;
		this.totalCost = findTotalCost();
		this.isRented = false;
	}
	
	public void rentCar(){
		if(!isRented){
			isRented = true;
			System.out.println("Car \"" + carModel + "\" is Rented successfully");
		} else{
			System.out.println("Car \"" + carModel + "\" is already rented.");
		}
	}
	
	public double findTotalCost(){
		return (double)(rentalDays) * rentedPrice;
	}
	
	public void displayDetails(){
		System.out.println("Customer name : " + customerName);
		System.out.println("Car model : " + carModel);
		System.out.println("Rental Days : " + rentalDays);
		System.out.println("Rented daily price : " + rentedPrice);
		System.out.println("Total rented cost : " + totalCost);
		System.out.println("Status : " + (isRented ? "Rented" : "Available"));
	}
}

public class CarRentalSystem{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter customer name : ");
		String name = scanner.nextLine();
		
		System.out.print("Enter car model : ");
		String model = scanner.nextLine();
		
		System.out.print("Enter rental days : ");
		int days = scanner.nextInt();
		
		System.out.print("Enter daily rate: $");
		double rentedPrice = scanner.nextDouble();
		
		System.out.println();
		CarRental car1 = new CarRental(name, model, days, rentedPrice);
		car1.displayDetails();
		
		//Displaying details after the car is rented
		System.out.println();
		car1.rentCar();
		car1.displayDetails();
		scanner.close();
	}
}