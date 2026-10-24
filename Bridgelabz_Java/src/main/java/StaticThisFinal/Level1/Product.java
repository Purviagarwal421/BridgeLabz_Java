
package StaticThisFinal.Level1;

import java.util.Scanner;

/*
Create a Product class to manage shopping cart items.

Static:
A static variable discount shared by all products.
A static method updateDiscount() to modify the discount percentage.

This:
Use this to initialize productName, price, and quantity.

Final:
Use a final variable productID that cannot be changed.

Instanceof:
Validate whether an object is an instance of Product
before processing its details.
*/

public class Product {
    private String productName;
    private double price;
    private int quantity;

    // Final variable
    private final int productID;

    // Static variable shared by all products
    private static double discount = 0.0;

    // Parameterized constructor
    public Product(String productName, double price,
                   int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
            System.out.println("Discount updated successfully.");
        } else {
            System.out.println("Discount must be between 0 and 100.");
        }
    }

    // Calculate total cost after discount
    public double calculateTotalCost() {
        double total = price * quantity;
        double discountAmount = total * discount / 100;
        return total - discountAmount;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("\n----- Product Details -----");
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.printf("Total Cost After Discount: Rs. %.2f%n",
                calculateTotalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first product
        System.out.print("Enter first product ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter first product name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter price: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity1 = sc.nextInt();
        sc.nextLine();

        // Input for second product
        System.out.print("\nEnter second product ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter second product name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter price: ");
        double price2 = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity2 = sc.nextInt();

        // Create product objects
        Product product1 = new Product(name1, price1, quantity1, id1);
        Product product2 = new Product(name2, price2, quantity2, id2);

        // Update shared discount
        System.out.print("\nEnter discount percentage: ");
        double newDiscount = sc.nextDouble();

        Product.updateDiscount(newDiscount);

        // Check instanceof before processing product details
        Object obj = product1;

        if (obj instanceof Product) {
            System.out.println("\nFirst Product:");
            ((Product) obj).displayProductDetails();
        } else {
            System.out.println("Object is not a Product.");
        }

        System.out.println("\nSecond Product:");
        product2.displayProductDetails();

        sc.close();
    }
}
