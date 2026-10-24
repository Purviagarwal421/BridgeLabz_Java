package ObjectedOrientedFundamentals.Level1;
/*
Problem Statement: Create a MobilePhone class with attributes brand, model, and price.
Add a method to display all the details of the phone. The MobilePhone class uses attributes to store the phone's characteristics.
The method is used to retrieve and display this information for each object.

 */

import java.util.Scanner;

public class MobilePhone {
    private String brand;
    private String model;
    private double price;
    // methods for getters and setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
    // method to display mobile phone details
    public void showDetails() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Price: " + getPrice());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MobilePhone phone1 = new MobilePhone();

        System.out.print("Enter phone brand: ");
        String brand = sc.nextLine();
        phone1.setBrand(brand);

        System.out.print("Enter phone model: ");
        String model = sc.nextLine();
        phone1.setModel(model);

        System.out.print("Enter phone price: ");
        double price = sc.nextDouble();
        phone1.setPrice(price);

        phone1.showDetails();

        sc.close();
    }




}
