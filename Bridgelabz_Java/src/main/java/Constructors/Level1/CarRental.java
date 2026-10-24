
package Constructors.Level1;

import java.util.Scanner;

/*
Car Rental System:
Create a CarRental class with attributes customerName,
carModel, and rentalDays.
Add constructors to initialize the rental details
and calculate total cost.
*/

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default constructor
    public CarRental() {
        customerName = "";
        carModel = "";
        rentalDays = 0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost(double pricePerDay) {
        return rentalDays * pricePerDay;
    }
    // to get

    // Method to display rental details
    public void showDetails(double pricePerDay) {
        System.out.println("\n----- Car Rental Details -----");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Rental Cost: Rs. " + calculateTotalCost(pricePerDay));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter car model: ");
        String carModel = sc.nextLine();

        System.out.print("Enter rental days: ");
        int rentalDays = sc.nextInt();

        // Create object using parameterized constructor
        CarRental rental = new CarRental(customerName, carModel, rentalDays);

        // to get pricePerDay
        double pricePerDay=sc.nextDouble();

        // Display details and total cost
        rental.showDetails(pricePerDay);

        sc.close();
    }
}
