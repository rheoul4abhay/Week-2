package main.AssistedProblems.VehicleTransportSystem;;

public class Motorcycle extends Vehicle{
    String brand;
    public Motorcycle(double maxSpeed, String fuelType, String brand){
        super(maxSpeed, fuelType);
        this.brand = brand;
    }

    @Override
    public void displayInfo(){
        System.out.println("\nMotorcycle details: ");
        System.out.println("Max Speed -> " + maxSpeed);
        System.out.println("Type -> " + fuelType);
        System.out.println("Brand -> " + brand);
    }
}
