package CorePrograms.Arrays.level2;
import java.util.Scanner;
/*
Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
Hint =>
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees

 */

public class Bonus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double [][]employee=new double[10][2];
        double []bonus=new double[10];
        double []newSalary=new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for(int i=0;i<10;i++){
            System.out.println("Employee " + (i + 1));

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double years = sc.nextDouble();

            if (salary <= 0 || years < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }
            employee[i][0] = salary;
            employee[i][1] = years;
        }

        for(int i=0;i<10;i++){
            double salary = employee[i][0];
            double years = employee[i][1];
            if(years>5){
                bonus[i]=salary*0.05;
            }
            else{
                bonus[i]=salary*0.02;
            }
            newSalary[i] = salary + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary;
            totalNewSalary += newSalary[i];
        }

        // To display employee details
        System.out.println("\nEmployee Details");

        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.println("Old Salary: " + employee[i][0]);
            System.out.println("Years of Service: " + employee[i][1]);
            System.out.println("Bonus: " + bonus[i]);
            System.out.println("New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
