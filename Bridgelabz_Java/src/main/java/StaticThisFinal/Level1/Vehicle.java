
package StaticThisFinal.Level1;

import java.util.Scanner;
/*
Create a `Vehicle` class with the following features:
1. Static:
  -A static variable `registrationFee` common for all vehicles.
  -A static method `updateRegistrationFee()` to modify the fee.
2) This:
   - Use `this` to initialize `ownerName`, `vehicleType`, and `registrationNumber` in the constructor.
3) Final:
   - Use a `final` variable `registrationNumber` to uniquely identify each vehicle.
4) Instanceof:
   - Check if an object belongs to the `Vehicle` class before displaying its registration details.
 */

public class Vehicle {

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    private static double registrationFee = 1500.0;

    // Constructor using this
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
            System.out.println("Registration fee updated successfully.");
        } else {
            System.out.println("Registration fee cannot be negative.");
        }
    }

    // Display vehicle registration details
    public void displayRegistrationDetails() {
        System.out.println("\n----- Vehicle Registration Details -----");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: Rs. " + registrationFee);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vehicle 1 details:");
        System.out.print("Owner Name: ");
        String owner1 = sc.nextLine();

        System.out.print("Vehicle Type: ");
        String type1 = sc.nextLine();

        System.out.print("Registration Number: ");
        String reg1 = sc.nextLine();

        Vehicle vehicle1 = new Vehicle(owner1, type1, reg1);

        System.out.println("\nEnter Vehicle 2 details:");
        System.out.print("Owner Name: ");
        String owner2 = sc.nextLine();

        System.out.print("Vehicle Type: ");
        String type2 = sc.nextLine();

        System.out.print("Registration Number: ");
        String reg2 = sc.nextLine();

        Vehicle vehicle2 = new Vehicle(owner2, type2, reg2);

        // Update common registration fee
        System.out.print("\nEnter new registration fee: Rs. ");
        double newFee = sc.nextDouble();

        Vehicle.updateRegistrationFee(newFee);

        // Check using instanceof before displaying details
        Object obj = vehicle1;

        if (obj instanceof Vehicle) {
            ((Vehicle) obj).displayRegistrationDetails();
        } else {
            System.out.println("Object is not a Vehicle.");
        }

        // Display the second vehicle's details
        Object obj2 = vehicle2;

        if (obj2 instanceof Vehicle) {
            ((Vehicle) obj2).displayRegistrationDetails();
        } else {
            System.out.println("Object is not a Vehicle.");
        }

        sc.close();
    }
}
