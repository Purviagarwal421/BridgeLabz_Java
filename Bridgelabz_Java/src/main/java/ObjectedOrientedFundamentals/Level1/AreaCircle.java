package ObjectedOrientedFundamentals.Level1;
/*
Program to Compute Area of a Circle
Problem Statement: Write a program to create a Circle class with an attribute radius.
Add methods to calculate and display the area and circumference of the circle.

 */

import java.util.Scanner;

public class AreaCircle {
    private double radius;
    // methods for getters and setters
    public void setRadius(double radius){
        if(radius<0){
            this.radius=0.0d;
            return;
        }
        this.radius=radius;
    }
    public double getRadius( ){
        return radius;
    }
    // Methods to calculate area and circumference
    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display details
    public void showDetails() {
        System.out.println("Radius: " + getRadius());
        System.out.printf("Area: %.4f\n" , area());
        System.out.printf("Circumference: %.4f" , circumference());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // to take user input of radius
        double radius=sc.nextDouble();
        // to create an object
        AreaCircle circle = new AreaCircle();

        circle.setRadius(radius);
        circle.showDetails();
    }

}
