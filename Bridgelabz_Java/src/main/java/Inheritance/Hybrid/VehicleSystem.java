
package Inheritance.Hybrid;
/*
Description:
Model a vehicle system where Vehicle is the superclass
and ElectricVehicle and PetrolVehicle are subclasses.

Tasks:
1. Define Vehicle with maxSpeed and model.
2. Create a Refuelable interface with refuel().
3. PetrolVehicle extends Vehicle and implements Refuelable.
4. ElectricVehicle extends Vehicle and provides charge().

Goal:
Demonstrate hybrid inheritance using class inheritance
and interfaces.
*/

// Superclass containing common vehicle attributes
class Vehicle {
    protected int maxSpeed;
    protected String model;

    // Constructor to initialize common vehicle details
    Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Displays common vehicle information
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
    }
}

// Interface defining the refueling behavior
interface Refuelable {
    void refuel();
}

// ElectricVehicle inherits from Vehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    // Constructor initializes parent and electric vehicle attributes
    ElectricVehicle(int maxSpeed, String model, int batteryCapacity) {
        super(maxSpeed, model);
        this.batteryCapacity = batteryCapacity;
    }

    // Charges the electric vehicle
    void charge() {
        System.out.println("Charging the electric vehicle...");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    void displayElectricDetails() {
        displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// PetrolVehicle inherits from Vehicle and implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelCapacity;

    // Constructor initializes parent and petrol vehicle attributes
    PetrolVehicle(int maxSpeed, String model, double fuelCapacity) {
        super(maxSpeed, model);
        this.fuelCapacity = fuelCapacity;
    }

    // Implements the abstract method from Refuelable
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
        System.out.println("Fuel Capacity: " + fuelCapacity + " litres");
    }

    void displayPetrolDetails() {
        displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " litres");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {

        // Create an ElectricVehicle object
        ElectricVehicle electric = new ElectricVehicle(180, "Tata Nexon EV", 40);

        // Create a PetrolVehicle object
        PetrolVehicle petrol = new PetrolVehicle(200, "Honda City", 40);

        // Display electric vehicle details and charge it
        System.out.println("--- Electric Vehicle ---");
        electric.displayElectricDetails();
        electric.charge();

        System.out.println();

        // Display petrol vehicle details and refuel it
        System.out.println("--- Petrol Vehicle ---");
        petrol.displayPetrolDetails();
        petrol.refuel();
    }
}
