package Day3.level1;

class Vehicle {
  static double registrationFee = 100.0;

  final String registrationNumber;
  String ownerName;
  String vehicleType;

  Vehicle(String ownerName, String vehicleType, String registrationNumber) {
    this.ownerName = ownerName;
    this.vehicleType = vehicleType;
    this.registrationNumber = registrationNumber;
  }

  static void updateRegistrationFee(double newFee) {
    registrationFee = newFee;
  }

  void displayVehicleInfo() {
    if (this instanceof Vehicle) {
      System.out.println("Owner Name: " + ownerName);
      System.out.println("Vehicle Type: " + vehicleType);
      System.out.println("Registration Number: " + registrationNumber);
      System.out.println("Registration Fee: " + registrationFee);
    }
  }
}

public class VehicleRegistrationSystem {

  public static void main(String[] args) {

    Vehicle v1 = new Vehicle("John", "Car", "V1234");
    Vehicle v2 = new Vehicle("Sara", "Truck", "V5678");

    v1.displayVehicleInfo();
    v2.displayVehicleInfo();

    Vehicle.updateRegistrationFee(150.0);
    System.out.println("Updated Registration Fee: " + Vehicle.registrationFee);

  }

}
