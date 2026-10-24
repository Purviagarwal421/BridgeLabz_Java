
package StaticThisFinal.Level1;

import java.util.Scanner;

/*
Design an Employee class with the following features:

Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show
the total number of employees.

This:
Use this to initialize name, id, and designation in the constructor.

Final:
Use a final variable id for the employee ID,
which cannot be modified after assignment.

Instanceof:
Check if a given object is an instance of the Employee class
before printing employee details.
*/

public class Employee {
    private String name;
    private final int id;
    private String designation;

    // Static variables
    private static String companyName = "ABC Technologies";
    private static int totalEmployees = 0;

    // Parameterized constructor
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Static method to display company name
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    // Instance method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for first employee
        System.out.print("Enter first employee name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter first employee ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter first employee designation: ");
        String designation1 = sc.nextLine();

        // Input for second employee
        System.out.print("\nEnter second employee name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter second employee ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter second employee designation: ");
        String designation2 = sc.nextLine();

        // Create employee objects
        Employee employee1 = new Employee(name1, id1, designation1);
        Employee employee2 = new Employee(name2, id2, designation2);

        // Display company name
        Employee.displayCompanyName();

        // Check instanceof before displaying details
        Object obj = employee1;

        if (obj instanceof Employee) {
            System.out.println("\nFirst Employee Details:");
            ((Employee) obj).displayEmployeeDetails();
        } else {
            System.out.println("Object is not an Employee.");
        }

        System.out.println("\nSecond Employee Details:");
        employee2.displayEmployeeDetails();

        // Display total number of employees
        Employee.displayTotalEmployees();

        sc.close();
    }
}
