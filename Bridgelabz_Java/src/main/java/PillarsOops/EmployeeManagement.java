package PillarsOops;

import java.util.ArrayList;

/*
Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.

 */
interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}
abstract class Employee{
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }


}
class FullTimeEmployee extends Employee implements Department{
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Type: Full-Time");
    }
}
class PartTimeEmployee extends Employee implements Department{
    private int workHours;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
    }

    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + getDepartmentDetails());
        System.out.println("Type: Part-Time");
        System.out.println("Work Hours: " + workHours);
    }

}
public class EmployeeManagement {
    public static void main(String[] args) {

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Aarav", 50000);

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Priya", 0, 80, 300);

        e1.assignDepartment("Engineering");
        e2.assignDepartment("Design");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(e1);
        employees.add(e2);

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("----------------");
        }
    }
}
