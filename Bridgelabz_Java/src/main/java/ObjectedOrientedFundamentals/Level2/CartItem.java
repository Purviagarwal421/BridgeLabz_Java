package ObjectedOrientedFundamentals.Level2;
/*
Program to Simulate a Shopping Cart
Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
Add an item to the cart.
Remove an item from the cart.
Display the total cost.
Explanation: The CartItem class models a shopping cart item.
The methods handle cart operations like adding or removing items and calculating the total cost.

 */

import java.util.Scanner;

public class CartItem {
    private String itemName;
    private double price;
    private int quantity;


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than zero.");
        }
    }
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public void addItem(int quantityToAdd) {
        if (quantityToAdd > 0) {
            quantity = quantity + quantityToAdd;
            System.out.println("Item quantity updated successfully.");
        } else {
            System.out.println("Quantity to add must be greater than zero.");
        }
    }
    public void removeItem(int quantityToRemove) {
        if (quantityToRemove <= 0) {
            System.out.println("Quantity to remove must be greater than zero.");
        } else if (quantityToRemove > quantity) {
            System.out.println("Cannot remove more items than available.");
        } else {
            quantity = quantity - quantityToRemove;
            System.out.println("Item removed successfully.");
        }
    }
    public double calculateTotalCost() {
        return price * quantity;
    }

    public void showDetails() {
        System.out.println("\n----- Shopping Cart -----");
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CartItem item = new CartItem();

        System.out.print("Enter item name: ");
        item.setItemName(input.nextLine());

        System.out.print("Enter price per item: ");
        item.setPrice(input.nextDouble());

        System.out.print("Enter initial quantity: ");
        item.setQuantity(input.nextInt());

        int choice;

        do {
            System.out.println("\n----- Shopping Cart Menu -----");
            System.out.println("1. Add item quantity");
            System.out.println("2. Remove item quantity");
            System.out.println("3. Display total cost");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity to add: ");
                    int quantityToAdd = input.nextInt();
                    item.addItem(quantityToAdd);
                    break;

                case 2:
                    System.out.print("Enter quantity to remove: ");
                    int quantityToRemove = input.nextInt();
                    item.removeItem(quantityToRemove);
                    break;

                case 3:
                    item.showDetails();
                    break;

                case 4:
                    System.out.println("Exiting shopping cart.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        input.close();
    }







}
