package main.AssistedProblems.VehicleTransportSystem;;

public class Vehicle {
    double maxSpeed;
    String fuelType;

    public Vehicle(double maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo(){
        System.out.println("\nVehicle details: ");
        System.out.println("Max Speed -> " + maxSpeed);
        System.out.println("Type -> " + fuelType);
    }
}
