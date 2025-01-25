package main.SingleLevelInheritance.SmartHomeDevices;

public class Thermostat extends Device {
    String temperatureSetting;

    public Thermostat(int deviceID, String status, String temperatureSetting){
        super(deviceID, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override  
    public void displayStatus(){
        System.out.println("\nDisplaying thermostat info : ");
        System.out.println("Device ID -> " + deviceID);
        System.out.println("Status -> " + status);
        System.out.println("Device temperature setting -> " + temperatureSetting);
    }
}
