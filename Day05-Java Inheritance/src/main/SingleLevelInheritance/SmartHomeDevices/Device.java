package main.SingleLevelInheritance.SmartHomeDevices;

public class Device {
    int deviceID;
    String status;

    public Device(int deviceID, String status){
        this.deviceID = deviceID;
        this.status = status;
    }

    public void displayStatus(){
        System.out.println("\nDisplaying Device info : ");
        System.out.println("Device ID -> " + deviceID);
        System.out.println("Status -> " + status);
    }
}
