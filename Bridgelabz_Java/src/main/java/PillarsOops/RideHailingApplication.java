package PillarsOops;

/*
Description: Develop a ride-hailing application:
- Define an abstract class Vehicle with fields like vehicleId, driverName, and ratePerKm.
- Add abstract methods calculateFare(double distance) and a concrete method getVehicleDetails().
- Create subclasses Car, Bike, and Auto, overriding calculateFare() based on type-specific rates.
- Use an interface GPS with methods getCurrentLocation() and updateLocation().
- Secure driver and vehicle details using encapsulation.
- Demonstrate polymorphism by calculating fares for different vehicle types dynamically.
*/

import java.util.ArrayList;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicles {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicles(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm > 0) {
            this.ratePerKm = ratePerKm;
        }
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per Km: " + ratePerKm);
    }
}

class Cars extends Vehicles implements GPS {
    private String currentLocation;

    public Cars(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class Bikes extends Vehicles implements GPS {
    private String currentLocation;

    public Bikes(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 10;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

class Auto extends Vehicles implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String location) {
        currentLocation = location;
    }
}

public class RideHailingApplication {

    public static void calculateFares(ArrayList<Vehicles> vehicles,
                                      double distance) {
        for (Vehicles vehicle : vehicles) {
            vehicle.getVehicleDetails();

            System.out.println("Distance: " + distance + " km");
            System.out.println("Total Fare: "
                    + vehicle.calculateFare(distance));

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: "
                        + gps.getCurrentLocation());
            }

            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        ArrayList<Vehicles> vehicles = new ArrayList<>();

        Cars car = new Cars("CAR101", "Aarav", 20);
        Bikes bike = new Bikes("BIKE202", "Priya", 8);
        Auto auto = new Auto("AUTO303", "Rahul", 12);

        car.updateLocation("Chennai Central");
        bike.updateLocation("T. Nagar");
        auto.updateLocation("Anna Nagar");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        calculateFares(vehicles, 10);
    }
}