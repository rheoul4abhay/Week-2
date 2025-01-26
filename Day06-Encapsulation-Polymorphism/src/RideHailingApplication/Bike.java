package RideHailingApplication;

public class Bike extends Vehicle {

    public Bike(String vehicleID, String driverName, double ratePerKm){
        super(vehicleID, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distanceTravelled){
        return distanceTravelled * getRatePerKm();
    }
}
