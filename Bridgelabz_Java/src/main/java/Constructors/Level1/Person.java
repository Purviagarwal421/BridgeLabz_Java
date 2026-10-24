package Constructors.Level1;
/*
Create a Person class with a copy constructor that clones another person's attributes.
 */

import java.util.Scanner;

public class Person {
    private String name;
    private double weight;
    private double height;

    //constructors
    public Person(){
        name="";
        weight=0.0;
        height=0.0;
    }
    public Person(String name,double weight,double height){
        this.name =name;
        this.weight=weight;
        this.height=height;
    }
    public Person(Person other){
        this.height=other.height;
        this.weight=other.weight;
        this.name=other.name;
    }
    // to show all details
    public  void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Take input for the original person
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        // Create original object
        Person person1 = new Person(name, weight, height);

        // Create a copy of person1
        Person person2 = new Person(person1);

        System.out.println("\nOriginal Person:");
        person1.showDetails();

        System.out.println("\nCopied Person:");
        person2.showDetails();

        sc.close();

    }

}
