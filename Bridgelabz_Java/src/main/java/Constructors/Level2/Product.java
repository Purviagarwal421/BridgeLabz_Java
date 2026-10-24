package Constructors.Level2;
/*
Create a Product class with:
Instance Variables: productName, price.
Class Variable: totalProducts (shared among all products).
Methods:
An instance method displayProductDetails() to display the details of a product.
A class method displayTotalProducts() to show the total number of products created.
 */

import java.util.HashSet;
import java.util.Set;

public class Product {
    private String productName;
    private double price;
    private static Set<String> uniqueProducts = new HashSet<>();

    public Product(String productName,double price){
        this.productName=productName;
        this.price=price;
        uniqueProducts.add(productName);
    }
    public void displayProductDetails(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
    public static void displayTotalProducts(){
        System.out.println("Unique Products: " + uniqueProducts.size());
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mobile", 20000);
        Product p3 = new Product("Laptop", 55000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }

}
