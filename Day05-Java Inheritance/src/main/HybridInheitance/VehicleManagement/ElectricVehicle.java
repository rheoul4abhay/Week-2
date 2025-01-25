package main.HybridInheitance.VehicleManagement;

public class ElectricVehicle extends Vehicle {

    String batteryType; //eg. lithium-ion, lead-acid
    ElectricVehicle(double maxSpeed, String model, String batteryType){
        super(maxSpeed, model);
        this.batteryType = batteryType;
    }

    public void charge(){
        System.out.println("\n" + model + " is charging!");
    }

    @Override
    public void displayVehicleInfo(){
        System.out.println("\nDisplaying Electric vehicle info");
        System.out.println("Model -> " + model);
        System.out.println("MaxSpeed -> " + maxSpeed + " km/h");
        System.out.println("Battery type -> " + batteryType);
    }
}
