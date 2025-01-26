package RideHailingApplication;

import java.util.ArrayList;

public class RideHailingApplication {

    //Method to calculate Fares dynamically
    public static void calculateFareForVehicles(ArrayList<Vehicle> vehicles, double distance){
        for(Vehicle vehicle: vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("\nFare for " + distance + " km: $" + vehicle.calculateFare(distance));
        }
    }

    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new Car("CAR@123", "Larry", 60.0);
        Vehicle bike = new Bike("BIKE@456", "Wilson", 25.0);
        Vehicle auto = new Auto("AUTO@789", "Glenn", 40.0);

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        double distance = 15.0;
        calculateFareForVehicles(vehicles,15.0);

        //GPS implementation
        GPSImpl gps = new GPSImpl("Navi Mumbai");
        gps.updateLocation("Andheri East");
        System.out.println(gps.getCurrentLocation());
    }
}
