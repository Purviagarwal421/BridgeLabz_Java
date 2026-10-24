
package Constructors.Level3;

import java.util.Scanner;

/*
Problem 4: Employee Records

Develop an Employee class with:
employeeID (public).
department (protected).
salary (private).

Write methods to:
Modify salary using a public method.
Create a subclass Manager to access employeeID and department.
*/

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Parameterized constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;

        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
            System.out.println("Invalid salary. Setting salary to zero.");
        }
    }

    // Getter to access private salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs. " + getSalary());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        // Create Employee object
        Employee employee = new Employee(employeeID, department, salary);

        System.out.println("\nEmployee Details:");
        employee.displayEmployeeDetails();

        // Modify salary
        System.out.print("\nEnter updated salary: ");
        double updatedSalary = sc.nextDouble();

        employee.setSalary(updatedSalary);

        System.out.println("\nUpdated Employee Details:");
        employee.displayEmployeeDetails();

        // Create Manager object
        Manager manager = new Manager(102, "IT", 75000.0);

        System.out.println("\nManager Details:");
        manager.displayManagerDetails();

        sc.close();
    }
}

// Subclass to demonstrate access modifiers
class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        // Public member: directly accessible
        System.out.println("Employee ID: " + employeeID);

        // Protected member: accessible through inheritance
        System.out.println("Department: " + department);

        // Private member: accessed through public getter
        System.out.println("Salary: Rs. " + getSalary());
    }
}
