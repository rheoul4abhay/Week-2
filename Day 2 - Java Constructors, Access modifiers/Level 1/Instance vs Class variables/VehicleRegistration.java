class Vehicle{
	private String ownerName;
	private String vehicleType;
	
	private static double registrationFee = 500.00;
	
	Vehicle(String ownerName, String vehicleType){
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	public void displayVehicleDetails(){
		System.out.print("\nOwner name : " + ownerName);
		System.out.print("\nVehicle type : " + vehicleType);
		System.out.print("\nRegistration fee : " + registrationFee);
	}
	
	public static void updateRegistrationFee(double newFees){
		registrationFee = newFees;
	}
}

public class VehicleRegistration{
	
	public static void main(String[] args){
		Vehicle mercedes = new Vehicle("Abhay", "Luxury car");
		System.out.print("\nBefore update : ");
		mercedes.displayVehicleDetails();
		
		//updating fee using class method
		Vehicle.updateRegistrationFee(1000.00);
		System.out.println();
		System.out.print("\nAfter update : ");
		mercedes.displayVehicleDetails();
	}
}