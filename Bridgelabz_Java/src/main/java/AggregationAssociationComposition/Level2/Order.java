
package AggregationAssociationComposition.Level2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Problem: E-Commerce Platform (Association and Aggregation)

Description:
Design an e-commerce platform with Order, Customer, and Product
classes. A Customer places an Order, and each Order contains
multiple Product objects.

Goal:
Show communication and object relationships by designing a
system where customers communicate through orders, and orders
aggregate products.
*/

// Product class
class Product {

    private String productName;
    private double price;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.printf("Price: Rs. %.2f%n", price);
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

// Customer class
class Customer {

    private String customerName;
    private int customerID;
    private ArrayList<Order> orders;

    // Constructor
    public Customer(String customerName, int customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.orders = new ArrayList<>();
    }

    // Place an order
    public void placeOrder(Order order) {
        if (!orders.contains(order)) {
            orders.add(order);
            order.setCustomer(this);
        }

        System.out.println(customerName + " placed an order successfully.");
    }

    // Display customer details and orders
    public void displayCustomerDetails() {
        System.out.println("\nCustomer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Orders: " + orders.size());

        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }

    public String getCustomerName() {
        return customerName;
    }
}

// Order class
public class Order {

    private int orderID;
    private Customer customer;
    private ArrayList<Product> products;

    // Constructor
    public Order(int orderID) {
        this.orderID = orderID;
        this.products = new ArrayList<>();
    }

    // Add an existing Product object to the order (Aggregation)
    public void addProduct(Product product) {
        if (!products.contains(product)) {
            products.add(product);
        }
    }

    // Associate order with customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Calculate total order cost
    public double calculateTotal() {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        return total;
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("\n----- Order Details -----");
        System.out.println("Order ID: " + orderID);

        if (customer != null) {
            System.out.println("Customer: " + customer.getCustomerName());
        }

        System.out.println("\nProducts:");

        if (products.isEmpty()) {
            System.out.println("No products in this order.");
        } else {
            for (Product product : products) {
                product.displayProductDetails();
                System.out.println();
            }
        }

        System.out.printf("Total Order Amount: Rs. %.2f%n",
                calculateTotal());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create customer
        System.out.print("Enter customer ID: ");
        int customerID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        Customer customer = new Customer(customerName, customerID);

        // Create products independently
        System.out.println("\nEnter Product 1 details:");

        System.out.print("Product name: ");
        String productName1 = sc.nextLine();

        System.out.print("Product price: Rs. ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        Product product1 = new Product(productName1, price1);

        System.out.println("\nEnter Product 2 details:");

        System.out.print("Product name: ");
        String productName2 = sc.nextLine();

        System.out.print("Product price: Rs. ");
        double price2 = sc.nextDouble();
        sc.nextLine();

        Product product2 = new Product(productName2, price2);

        // Create order
        System.out.print("\nEnter order ID: ");
        int orderID = sc.nextInt();

        Order order = new Order(orderID);

        // Add products to the order
        order.addProduct(product1);
        order.addProduct(product2);

        // Customer places the order
        customer.placeOrder(order);

        // Display customer and order details
        customer.displayCustomerDetails();

        // Demonstrate that products exist independently
        System.out.println("\n===== Independent Product =====");
        product1.displayProductDetails();

        sc.close();
    }
}
