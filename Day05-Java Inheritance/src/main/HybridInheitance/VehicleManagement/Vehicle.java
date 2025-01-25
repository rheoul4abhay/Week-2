package main.HybridInheitance.VehicleManagement;

public class Vehicle {

    double maxSpeed;
    String model;
    
    public Vehicle(double maxSpeed, String model){
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayVehicleInfo(){
        System.out.println("\nDisplaying vehicle info");
        System.out.println("Model -> " + model);
        System.out.println("MaxSpeed -> " + maxSpeed + " km/h");
    }
}
