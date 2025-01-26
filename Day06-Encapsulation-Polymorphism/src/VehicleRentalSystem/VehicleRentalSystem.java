package VehicleRentalSystem;

import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new Car("CAR123", 1000.0, "CAR_INS_123");
        Vehicle bike = new Bike("BIKE456", 500.0, "BIKE_INS_456");
        Vehicle truck = new Truck("Truck789", 3000.0, "TRUCK_INS_789");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        for(Vehicle vehicle: vehicles){
            System.out.print("\nVehicle type: " + vehicle.getVehcileType());
            System.out.print("\nVehicle Number: " + vehicle.getVehicleNumber());
            System.out.print("\nVehicle Rental Rate: " + vehicle.getVehicleRentalRate());
            int rentalDays = 7;
            System.out.print("\nRental Cost for " + rentalDays + " days is : " + vehicle.calculateRentalCost(rentalDays));
            //To check whether a vehicle is insurable or not
            if(vehicle instanceof Insurable){
                //To avoid repetition of performing casting, we create a insurable variable
                Insurable insurable = (Insurable) vehicle;

                System.out.print("\nInsurance Cost: " + insurable.calculateInsurance());
                System.out.print("\nInsurance Details: " + insurable.getInsuranceDetails());
                System.out.println();
            }
        }
    }
}
