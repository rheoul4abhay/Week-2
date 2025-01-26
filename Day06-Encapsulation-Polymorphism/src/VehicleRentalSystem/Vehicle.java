package VehicleRentalSystem;

public abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;
    private double vehicleRentalRate;

    public Vehicle(String vehicleNumber, String vehicleType, double vehicleRentalRate){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.vehicleRentalRate = vehicleRentalRate;
    }

    public String getVehicleNumber(){
        return vehicleNumber;
    }

    public String getVehcileType(){
        return vehicleType;
    }

    public double getVehicleRentalRate(){
        return vehicleRentalRate;
    }
    
    abstract double calculateRentalCost(int days);
}
