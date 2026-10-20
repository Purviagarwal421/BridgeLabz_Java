package ControlFlow.level1;
import java.util.Scanner;

/*
Create a program to find the bonus of employees based on their years of service.

Hint =>
1. Zara gives a bonus of 5% to employees whose years of service are more than 5 years.
2. Take salary and years of service as input.
3. Print the bonus amount.

I/P => salary, yearsOfService

O/P =>
The bonus amount is ___
*/

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();
        int yearsOfService = sc.nextInt();

        double bonus = 0.0;

        // To calculate the bonus based on years of service
        if (yearsOfService > 5) {
            bonus = salary * 5 / 100;
        }

        System.out.println("The bonus amount is " + bonus);

        sc.close();
    }
}