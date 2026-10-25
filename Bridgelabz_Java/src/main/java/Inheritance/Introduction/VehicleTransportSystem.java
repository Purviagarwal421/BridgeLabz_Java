
package Inheritance.Introduction;
/*
Problem: Vehicle and Transport System
Description:
Design a vehicle hierarchy where Vehicle is the superclass,
and Car, Truck, and Motorcycle are subclasses with unique attributes.

Tasks:
1. Define a superclass Vehicle with maxSpeed and fuelType attributes
   and a method displayInfo().
2. Define subclasses Car, Truck, and Motorcycle with additional attributes.
3. Store objects of different subclasses in a Vehicle array and call
   displayInfo() on each.

Goal:
Understand inheritance, method overriding, and polymorphism.
*/

class Vehicle {

    // Common attributes shared by all vehicles
    protected int maxSpeed;
    protected String fuelType;

    // Constructor to initialize common vehicle details
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display general vehicle information
    public void displayInfo() {
        System.out.println("Maximum Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Car inherits common properties from Vehicle
class Car extends Vehicle {

    // Unique attribute for Car
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        // Initialize common attributes using the parent constructor
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Override the parent method to display car-specific information
    @Override
    public void displayInfo() {
        System.out.println("\n--- Car Details ---");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Truck inherits common properties from Vehicle
class Truck extends Vehicle {

    // Unique attribute for Truck
    private double loadCapacity;

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Override the parent method to display truck-specific information
    @Override
    public void displayInfo() {
        System.out.println("\n--- Truck Details ---");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Motorcycle inherits common properties from Vehicle
class Motorcycle extends Vehicle {

    // Unique attribute for Motorcycle
    private boolean hasSidecar;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    // Override the parent method to display motorcycle-specific information
    @Override
    public void displayInfo() {
        System.out.println("\n--- Motorcycle Details ---");
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}

public class VehicleTransportSystem {

    public static void main(String[] args) {

        // Create an array that can store different Vehicle subclass objects
        Vehicle[] vehicles = new Vehicle[3];

        // Store subclass objects using the parent-class reference type
        vehicles[0] = new Car(220, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15.5);
        vehicles[2] = new Motorcycle(180, "Petrol", false);

        // Iterate through the array and display each vehicle's information
        for (Vehicle vehicle : vehicles) {

            // Runtime polymorphism calls the appropriate overridden method
            vehicle.displayInfo();
        }
    }
}
