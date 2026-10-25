package Inheritance.Multilevel;
/*
Sample Problem 1: Online Retail Order Management
Description:
Create a multilevel hierarchy to manage orders, where Order is the
base class, ShippedOrder is a subclass, and DeliveredOrder extends
ShippedOrder.
Tasks:
1. Define a base class Order with attributes orderId and orderDate.
2. Create a subclass ShippedOrder with an additional attribute
   trackingNumber.
3. Create another subclass DeliveredOrder extending ShippedOrder,
   adding a deliveryDate attribute.
4. Implement a method getOrderStatus() to return the current order
   status based on the class level.
Goal:
Explore multilevel inheritance, showing how attributes and methods
can be added across a chain of classes.
*/

class Order {

    // Common attributes shared by all orders
    protected int orderId;
    protected String orderDate;

    // Constructor to initialize common order details
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Return the current order status
    public String getOrderStatus() {
        return "Order Placed";
    }

    // Method to display general order information
    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Order Status: " + getOrderStatus());
    }
}

// ShippedOrder inherits common attributes and methods from Order
class ShippedOrder extends Order {

    // Additional attribute for shipped orders
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate,String trackingNumber) {

        // Initialize the parent class attributes
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Override the method to return the shipped status
    @Override
    public String getOrderStatus() {
        return "Shipped";
    }

    // Display order and shipping information
    @Override
    public void displayDetails() {
        System.out.println("\n--- Shipped Order Details ---");
        super.displayDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// DeliveredOrder inherits from ShippedOrder, which inherits from Order
class DeliveredOrder extends ShippedOrder {

    // Additional attribute for delivered orders
    private String deliveryDate;

    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        // Initialize Order and ShippedOrder attributes
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Override the method to return the delivered status
    @Override
    public String getOrderStatus() {
        return "Delivered";
    }

    // Display order, shipping, and delivery information
    @Override
    public void displayDetails() {
        System.out.println("\n--- Delivered Order Details ---");
        super.displayDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OnlineRetailOrderManagement {

    public static void main(String[] args) {

        // Create an order that has only been placed
        Order order = new Order(101, "2026-10-20");

        // Create an order that has been shipped
        ShippedOrder shippedOrder = new ShippedOrder(102, "2026-10-21", "TRK12345");

        // Create an order that has been delivered
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2026-10-22", "TRK67890", "2026-10-24");

        // Display details and status for each order
        order.displayDetails();
        shippedOrder.displayDetails();
        deliveredOrder.displayDetails();
    }
}

