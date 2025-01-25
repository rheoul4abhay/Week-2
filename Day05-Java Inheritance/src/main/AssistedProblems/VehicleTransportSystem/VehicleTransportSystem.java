package main.AssistedProblems.VehicleTransportSystem;
import java.util.ArrayList;

public class VehicleTransportSystem{
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle(100.0, "Vehicle");
        Car car = new Car(300.0, "Diesal", 4);
        Motorcycle motorcycle = new Motorcycle(200.0, "Petrol", "BMW");
        Truck truck = new Truck(250.0, "Petrol", 10);

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(vehicle);
        vehicles.add(motorcycle);
        vehicles.add(car);
        vehicles.add(truck);

        for(Vehicle v: vehicles){
            v.displayInfo();
        }
    }
}
