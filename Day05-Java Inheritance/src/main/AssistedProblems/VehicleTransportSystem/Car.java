package main.AssistedProblems.VehicleTransportSystem;

public class Car extends Vehicle {

    int seatCapacity;

    public Car(double maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("\nCar details: ");
        System.out.println("Max Speed -> " + maxSpeed);
        System.out.println("Type -> " + fuelType);
        System.out.println("Seat capacity -> " + seatCapacity);
    }
}

