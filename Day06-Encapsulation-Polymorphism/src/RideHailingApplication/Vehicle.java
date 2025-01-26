package RideHailingApplication;

public abstract class Vehicle {
    private String vehicleID;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleID, String driverName, double ratePerKm){
        this.vehicleID = vehicleID;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    //getter methods
    public String getVehicleID(){
        return vehicleID;
    }

    public String getDriverName(){
        return driverName;
    }

    public double getRatePerKm(){
        return ratePerKm;
    }

    public void getVehicleDetails(){
        System.out.print("\n------Displaying Vehicle Details------");
        System.out.print("\nVehicle ID: " + getVehicleID());
        System.out.print("\nDriver Name: " + getDriverName());
        System.out.print("\nRate per Kilometers: $" + getRatePerKm());
    }

    abstract double calculateFare(double distanceTravelled);
}
