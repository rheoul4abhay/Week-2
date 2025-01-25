package main.HybridInheitance.VehicleManagement;

public class PetrolVehicle extends Vehicle implements Refulable{
    
    double fuelCapacity;
    public PetrolVehicle(double maxSpeed, String model, double fuelCapacity){
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel(){
        System.out.println("\n" + model + " is refueling with petrol!");
    }

    @Override
    public void displayVehicleInfo(){
        System.out.println("\nDisplaying Petrol vehicle info");
        System.out.println("Model -> " + model);
        System.out.println("MaxSpeed -> " + maxSpeed + " km/h");
        System.out.println("Fuel Capacity -> " + fuelCapacity + " Litres");
    }
}
