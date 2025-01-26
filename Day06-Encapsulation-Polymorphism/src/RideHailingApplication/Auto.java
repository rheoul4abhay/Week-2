package RideHailingApplication;

public class Auto extends Vehicle {

    public Auto(String vehicleID, String driverName, double ratePerKm){
        super(vehicleID, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distanceTravelled){
        return distanceTravelled * getRatePerKm();
    }
}
