package Inheritance.Introduction;

/*
Problem: Employee Management System

Description:
Create an Employee hierarchy for different employee types such as
Manager, Developer, and Intern.
Tasks:
1. Define a base class Employee with attributes name, id, and salary,
   and a method displayDetails().
2. Define subclasses Manager, Developer, and Intern with unique
   attributes for each employee type.
3. Override the displayDetails() method in each subclass.

Goal:
Practice inheritance, method overriding, and polymorphism.
*/

class Employee {

    // Common attributes shared by all employee types
    protected String name;
    protected int id;
    protected double salary;

    // Constructor to initialize common employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display general employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Manager inherits the common properties of Employee
class Manager extends Employee {

    // Unique attribute for Manager
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        // Initialize common attributes using the parent constructor
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    // Override the parent method to display manager-specific details
    @Override
    public void displayDetails() {
        System.out.println("\n--- Manager Details ---");
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Developer inherits the common properties of Employee
class Developer extends Employee {

    // Unique attribute for Developer
    private String programmingLanguage;

    public Developer(String name, int id, double salary,
                     String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Override the parent method to display developer-specific details
    @Override
    public void displayDetails() {
        System.out.println("\n--- Developer Details ---");
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Intern inherits the common properties of Employee
class Intern extends Employee {

    // Unique attribute for Intern
    private int durationMonths;

    public Intern(String name, int id, double salary, int durationMonths) {
        super(name, id, salary);
        this.durationMonths = durationMonths;
    }

    // Override the parent method to display intern-specific details
    @Override
    public void displayDetails() {
        System.out.println("\n--- Intern Details ---");
        super.displayDetails();
        System.out.println("Internship Duration: " + durationMonths + " months");
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {
        // Parent references hold different subclass objects
        Employee manager = new Manager("Priya", 101, 80000, 8);
        Employee developer = new Developer("Rahul", 102, 60000, "Java");
        Employee intern = new Intern("Nikku", 103, 15000, 6);

        // Call the same method for different employee types
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();

    }
}

