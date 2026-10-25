package Inheritance.SingleInheritance;

/*
Sample Problem 2: Smart Home Devices

Description:
Create a hierarchy for a smart home system where Device is the
superclass and Thermostat is a subclass.

Tasks:
1. Define a superclass Device with attributes deviceId and status.
2. Create a subclass Thermostat with an additional attribute
   temperatureSetting.
3. Implement a method displayStatus() to show the device's settings.

Goal:
Understand single inheritance by adding specific attributes to a
subclass while keeping the superclass general.
*/

class Device {

    // Common attributes shared by smart home devices
    protected String deviceId;
    protected String status;

    // Constructor to initialize device details
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display general device information
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Thermostat inherits common properties from Device
class Thermostat extends Device {

    // Unique attribute for Thermostat
    private double temperatureSetting;

    // Constructor to initialize device and thermostat details
    public Thermostat(String deviceId, String status,
                      double temperatureSetting) {

        // Call the parent class constructor
        super(deviceId, status);

        this.temperatureSetting = temperatureSetting;
    }

    // Override the parent method to display thermostat-specific details
    @Override
    public void displayStatus() {
        System.out.println("\n--- Thermostat Status ---");

        // Display inherited device details
        super.displayStatus();

        // to display thermostat-specific setting
        System.out.println("Temperature Setting: "
                + temperatureSetting + " °C");
    }
}

public class SmartHomeDevices {
    public static void main(String[] args) {

        // to create a Thermostat object with its device details
        Thermostat thermostat =
                new Thermostat("TH101", "ON", 24.5);

        // to display the thermostat's current settings
        thermostat.displayStatus();
    }
}

