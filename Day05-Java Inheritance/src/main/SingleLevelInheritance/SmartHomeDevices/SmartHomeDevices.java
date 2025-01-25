package main.SingleLevelInheritance.SmartHomeDevices;

public class SmartHomeDevices {
    public static void main(String[] args) {
        Device device = new Device(112, "on");
        Thermostat thermostat = new Thermostat(123, "off", "medium");

        device.displayStatus();
        thermostat.displayStatus();
    }
}
