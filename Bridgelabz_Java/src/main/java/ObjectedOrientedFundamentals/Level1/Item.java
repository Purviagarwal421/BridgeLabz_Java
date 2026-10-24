package ObjectedOrientedFundamentals.Level1;
/*
Problem Statement: Create an Item class with attributes itemCode, itemName, and price.
Add a method to display item details and calculate the total cost for a given quantity.
 */

import java.util.Scanner;

public class Item {
    private int itemCode;
    private String itemName;
    private double price;
    // method for getters and setters
    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public int getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }
    public double totalCost(int quantity){
        return quantity*price;
    }
    public void display(){
        System.out.println("Item Code: " + getItemCode());
        System.out.println("Item Name: " + getItemName());
        System.out.println("Price: " + getPrice());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // create an object
        Item item=new Item();

        // to get inputs
        System.out.print("Enter itemCode: ");
        int itemCode=sc.nextInt();
        item.setItemCode(itemCode);

        System.out.print("Enter itemName: ");
        String name=sc.next();
        item.setItemName(name);

        System.out.print("Enter price: ");
        double price=sc.nextDouble();
        item.setPrice(price);

        //  to display item details and calculate the total cost
        System.out.print("Enter quantity: ");
        int quantity=sc.nextInt();
        item.display();
        double totalCost=item.totalCost(quantity);
        System.out.println("Total cost of "+quantity+"  "+item.getItemName()+" is "+totalCost);


    }




}
