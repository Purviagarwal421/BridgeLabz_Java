
package Constructors.Level2;

/*
Create a Vehicle class to manage the details of vehicles:

Instance Variables: ownerName, vehicleType.
Class Variable: registrationFee (fixed for all vehicles).

Methods:
An instance method displayVehicleDetails() to display
owner and vehicle details.
A class method updateRegistrationFee() to change
the registration fee.
*/

import java.util.Scanner;

public class Vehicle {
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 1000.0;

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("\n----- Vehicle Details -----");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs. " + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated successfully.");
        } else {
            System.out.println("Registration fee cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first owner's name: ");
        String ownerName1 = sc.nextLine();

        System.out.print("Enter first vehicle type: ");
        String vehicleType1 = sc.nextLine();

        System.out.print("Enter second owner's name: ");
        String ownerName2 = sc.nextLine();

        System.out.print("Enter second vehicle type: ");
        String vehicleType2 = sc.nextLine();

        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle(ownerName1, vehicleType1);
        Vehicle vehicle2 = new Vehicle(ownerName2, vehicleType2);

        // Display details before updating the fee
        System.out.println("\nBefore updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Update the common registration fee
        System.out.print("\nEnter new registration fee: ");
        double newFee = sc.nextDouble();

        Vehicle.updateRegistrationFee(newFee);

        // Display details after updating the fee
        System.out.println("\nAfter updating registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        sc.close();
    }
}
