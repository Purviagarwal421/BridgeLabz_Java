package ObjectedOrientedFundamentals.Level1;
/*
Problem Statement: Write a program to create an Employee class with attributes
name, id, and salary. Add a method to display the details.
 */

import java.util.Scanner;

public class EmployeeDetails {
    private String name;
    private int id;
    private double salary;

    //methods for getters and setters of these attributes
    public void setName(String name){
        this.name=name;
    }
    public void setID(int id){
        this.id=id;
    }
    public void setSalary(double salary){
        if(salary<0){
            this.salary=0;
            return;
        }
        this.salary=salary;
    }
    public double getSalary( ){
        return salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return  name;
    }
    public void showDetails(){
        System.out.println("Name of the employee "+getName());
        System.out.println("Id "+getId());
        System.out.println("Salary "+getSalary());
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EmployeeDetails employee1=new EmployeeDetails();
        System.out.print("Enter name of the employee: ");
        String name= sc.nextLine();
        employee1.setName(name);
        System.out.print("Enter id of the employee:");
        int id=sc.nextInt();
        employee1.setID(id);
        System.out.println("Enter salary of the employee:");
        double salary=sc.nextDouble();
        employee1.setSalary(salary);
        employee1.showDetails();
    }

}
