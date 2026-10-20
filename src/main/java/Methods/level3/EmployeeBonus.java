package CorePrograms.Methods.Level3;
import java.util.Scanner;
/*
Create a program to find the bonus of 10 employees based on
their years of service, along with the old salary, new salary,
and total bonus amount.

Hint =>
1. Bonus is 5% if service is more than 5 years, otherwise 2%.
2. Generate a 5-digit salary and random years of service.
3. Store salary and years of service in a 2D array.
4. Calculate the new salary and bonus in another 2D array.
5. Calculate the total old salary, new salary, and bonus.
*/

public class EmployeeBonus {
    // Method to generate salary and years of service
    // Column 0 = Old Salary, Column 1 = Years of Service
    public static int[][] generateEmployeeData() {
        int[][] employees = new int[10][2];

        for (int i = 0; i < employees.length; i++) {
            employees[i][0] = (int) (Math.random() * 90000) + 10000;
            employees[i][1] = (int) (Math.random() * 11);
        }

        return employees;
    }
    // Method to calculate new salary and bonus
    // Column 0 = New Salary, Column 1 = Bonus
    public static double[][] calculateBonus(int[][] employees) {
        double[][] result = new double[10][2];

        for (int i = 0; i < employees.length; i++) {
            int oldSalary = employees[i][0];
            int years = employees[i][1];

            double bonusRate;

            if (years > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }

            double bonus = oldSalary * bonusRate;
            double newSalary = oldSalary + bonus;

            result[i][0] = newSalary;
            result[i][1] = bonus;
        }

        return result;
    }

    // Method to display employee details and calculate totals
    public static void displayReport(int[][] employees, double[][] result) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-12s %-15s %-15s%n", "Employee", "Old Salary", "Service", "Bonus", "New Salary");

        System.out.println("-----------------------------------------------------------------------");

        for (int i = 0; i < employees.length; i++) {
            int oldSalary = employees[i][0];
            int years = employees[i][1];
            double newSalary = result[i][0];
            double bonus = result[i][1];

            System.out.printf("%-10d %-15d %-12d %-15.2f %-15.2f%n", i + 1, oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

        System.out.println("-----------------------------------------------------------------------");

        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        System.out.printf("Total Bonus:      %.2f%n", totalBonus);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData();

        double[][] result = calculateBonus(employees);

        displayReport(employees, result);
    }

}
