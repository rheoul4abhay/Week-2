package main.HybridInheitance.VehicleManagement;

import java.util.ArrayList;

public class VehicleManagement {
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle = new Vehicle(0.0, null);
        vehicles.add(vehicle);

        PetrolVehicle bugatti = new PetrolVehicle(250.0, "Bugatti", 100);
        vehicles.add(bugatti);

        ElectricVehicle tesla = new ElectricVehicle(400.0, "Tesla", "Lithium-Ion");
        vehicles.add(tesla);

        for(Vehicle v: vehicles){
            v.displayVehicleInfo();
        }
        bugatti.refuel();
        tesla.charge();
    }

}
