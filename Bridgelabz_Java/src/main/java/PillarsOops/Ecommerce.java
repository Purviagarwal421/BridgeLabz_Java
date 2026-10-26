package PillarsOops;

import java.util.ArrayList;
/*
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and prints the final price (price + tax - discount) for a list of Product.

 */

interface Taxable {
double calculateTax();
String getTaxDetails();
}
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public abstract double calculateDiscount();
    public abstract double calculateAmount();

    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Price: " + (price - calculateDiscount()));
    }
}
class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return (getPrice() - calculateDiscount()) * 0.18;
    }
    @Override
    public double calculateAmount() {
        return getPrice()+calculateTax()-calculateDiscount();
    }
    @Override
    public String getTaxDetails() {
        return "Electronics tax rate: 18%";
    }
}
class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    @Override
    public double calculateTax() {
        return (getPrice() - calculateDiscount()) * 0.05;
    }
    @Override
    public String getTaxDetails() {
        return "Clothing tax rate: 5%";
    }
    @Override
    public double calculateAmount() {
        return getPrice()+calculateTax()-calculateDiscount();
    }
}
class Groceries extends Product {

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
    @Override
    public double calculateAmount() {
        return getPrice()-calculateDiscount();
    }
}


public class Ecommerce {
    public static void main(String[] args) {

        Electronics laptop =
                new Electronics(101, "Laptop", 60000);

        Clothing shirt =
                new Clothing(102, "Shirt", 2000);

        Groceries rice =
                new Groceries(103, "Rice", 1000);

        // Updating values using setters
        laptop.setPrice(65000);
        shirt.setName("Cotton Shirt");

        ArrayList<Product> products = new ArrayList<>();

        products.add(laptop);
        products.add(shirt);
        products.add(rice);

        for (Product product : products) {
            product.displayDetails();

            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;

                System.out.println(taxable.getTaxDetails());

                System.out.println("Tax: " + taxable.calculateTax());
            }

            System.out.println("------------------");
        }
    }
}