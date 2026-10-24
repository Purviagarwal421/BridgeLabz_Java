package Constructors.Level1;
/*
Write a Circle class with a radius attribute.
Use constructor chaining to initialize radius with default and user-provided values.


 */

import java.util.Scanner;

public class Circle {
    private double radius;

    public Circle(){
        radius=1.0;
    }
    public Circle(double radius){
        if(radius >0){
            this.radius=radius;
        }
    }

    // methods for getters and setters
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
        System.out.print("Enter radius: ");
        double radius=sc.nextDouble();
        // to create an object
        Circle circle = new Circle(radius);
        circle.showDetails();
    }
}
