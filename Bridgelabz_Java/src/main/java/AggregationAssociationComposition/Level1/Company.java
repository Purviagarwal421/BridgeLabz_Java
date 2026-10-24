
package AggregationAssociationComposition.Level1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Problem 3: Company, Department, and Employee (Composition)

Description:
A Company has several Department objects, and each department
contains Employee objects. Model this using composition, where
deleting a company should also delete all departments and employees.

Tasks:
1. Define a Company class that contains multiple Department objects.
2. Define an Employee class within each Department.
3. Show the composition relationship by ensuring that when a
   Company object is deleted, all associated Department and
   Employee objects are also removed.

Goal:
Understand composition by implementing a relationship where
Department and Employee objects cannot exist without a Company.
*/

// Employee class
class Employee {

    private String employeeName;
    private int employeeID;

    // Constructor
    public Employee(String employeeName, int employeeID) {
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
    }
}

// Department class
class Department {

    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Create employees inside the department
    public void addEmployee(String employeeName, int employeeID) {
        Employee employee = new Employee(employeeName, employeeID);
        employees.add(employee);
    }

    // Method to display department and employee details
    public void displayDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);

        if (employees.isEmpty()) {
            System.out.println("No employees in this department.");
            return;
        }

        for (Employee employee : employees) {
            System.out.println();
            employee.displayEmployeeDetails();
        }
    }
}

// Company class
public class Company {

    private String companyName;
    private ArrayList<Department> departments;

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Create departments inside the company
    public void addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
    }

    // Add an employee to a department
    public void addEmployeeToDepartment(
            int departmentIndex, String employeeName, int employeeID) {

        if (departmentIndex >= 0 && departmentIndex < departments.size()) {
            departments.get(departmentIndex)
                    .addEmployee(employeeName, employeeID);
        } else {
            System.out.println("Invalid department index.");
        }
    }

    // Display company details
    public void displayCompanyDetails() {
        System.out.println("\nCompany Name: " + companyName);

        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Clear all departments and their employees
    public void deleteCompany() {
        departments.clear();
        companyName = null;

        System.out.println(
                "\nCompany deleted. All departments and employees removed.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create company
        System.out.print("Enter company name: ");
        String companyName = sc.nextLine();

        Company company = new Company(companyName);

        // Create departments
        System.out.print("Enter number of departments: ");
        int departmentCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < departmentCount; i++) {
            System.out.print("Enter department " + (i + 1) + " name: ");
            String departmentName = sc.nextLine();

            company.addDepartment(departmentName);

            // Add employees to this department
            System.out.print("Enter number of employees: ");
            int employeeCount = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < employeeCount; j++) {
                System.out.print("Enter employee name: ");
                String employeeName = sc.nextLine();

                System.out.print("Enter employee ID: ");
                int employeeID = sc.nextInt();
                sc.nextLine();

                company.addEmployeeToDepartment(
                        i, employeeName, employeeID);
            }
        }

        // Display company details
        System.out.println("\n===== Company Details =====");
        company.displayCompanyDetails();

        // Demonstrate company deletion
        System.out.print("\nDo you want to delete the company? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            company.deleteCompany();
            company.displayCompanyDetails();
        }

        sc.close();
    }
}
