package PillarsOops;
/*

Description: Design a system to manage vehicle rentals:
 Define an abstract class `Vehicle` with fields like `vehicleNumber`, `type`, and `rentalRate`.
 Add an abstract method `calculateRentalCost(int days)`.
  - Create subclasses `Car`, `Bike`, and `Truck` with specific implementations of `calculateRentalCost()`.
  - Use an interface `Insurable` with methods `calculateInsurance()` and `getInsuranceDetails()`.
  - Apply encapsulation to restrict access to sensitive details like insurance policy numbers.
  - Demonstrate polymorphism by iterating over a list of vehicles and calculating rental and insurance costs for each.
 */

import java.util.ArrayList;

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
abstract class Vehicle{
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    abstract double calculateRentalCost(int days);
    public void displayDetails(int days) {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
        System.out.println("Rental Days: " + days);
        System.out.println("Rental Cost: " + calculateRentalCost(days));
    }
}
class Car extends Vehicle implements Insurable {
    private String policyNumber;

    public Car(String vehicleNumber, double rentalRate,
               String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car insurance policy: " + policyNumber;
    }
}
class Bike extends Vehicle implements Insurable {
    private String policyNumber;

    public Bike(String vehicleNumber, double rentalRate,
                String policyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 150;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike insurance policy: " + policyNumber;
    }
}
class Truck extends Vehicle implements Insurable {
    private String policyNumber;

    public Truck(String vehicleNumber, double rentalRate,
                 String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.policyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck insurance policy: " + policyNumber;
    }
}

public class VehicleRent {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("TN01AB1234", 2000, "CAR101"));
        vehicles.add(new Bike("TN02CD5678", 500, "BIKE202"));
        vehicles.add(new Truck("TN03EF9012", 4000, "TRUCK303"));

        int days = 3;

        for (Vehicle vehicle : vehicles) {
            vehicle.displayDetails(days);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;

                double insurance = insurable.calculateInsurance();

                System.out.println("Insurance: " + insurance);
                System.out.println("Total Cost: "
                        + (vehicle.calculateRentalCost(days)
                        + insurance));

                System.out.println(
                        insurable.getInsuranceDetails());
            }

            System.out.println("----------------------");
        }
    }

}
