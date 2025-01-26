package RideHailingApplication;

public class Car extends Vehicle {

    public Car(String vehicleID, String driverName, double ratePerKm){
        super(vehicleID, driverName, ratePerKm);
    }

    @Override
    public double calculateFare(double distanceTravelled){
        return distanceTravelled * getRatePerKm();
    }

}
