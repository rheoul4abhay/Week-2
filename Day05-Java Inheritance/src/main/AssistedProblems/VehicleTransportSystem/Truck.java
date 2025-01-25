package main.AssistedProblems.VehicleTransportSystem;;

public class Truck extends Vehicle{
    
    int numberOfTires;
    public Truck(double maxSpeed, String fuelType, int numberOfTires){
        super(maxSpeed, fuelType);
        this.numberOfTires = numberOfTires;
    }

    @Override
    public void displayInfo(){
        System.out.println("\nTruck details: ");
        System.out.println("Max Speed -> " + maxSpeed);
        System.out.println("Type -> " + fuelType);
        System.out.println("Number of tires -> " + numberOfTires);
    }
}
