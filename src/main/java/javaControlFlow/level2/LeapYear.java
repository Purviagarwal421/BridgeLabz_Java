package ControlFlow.level1;
import java.util.Scanner;

/*
Write a LeapYear program that takes a year as input
and outputs whether it is a Leap Year or not.

Hint =>
1. The program works only for year >= 1582.
2. A leap year is divisible by 4 and not by 100,
   unless it is divisible by 400.

I/P => year

O/P =>
The year ___ is a Leap Year.
OR
The year ___ is not a Leap Year.
*/

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        // To check if the year is valid
        if (year >= 1582) {

            // To check if the year is a leap year
            if (year % 400 == 0) {
                System.out.println("The year " + year
                        + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println("The year " + year
                        + " is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println("The year " + year
                        + " is a Leap Year.");
            } else {
                System.out.println("The year " + year
                        + " is not a Leap Year.");
            }

        } else {
            System.out.println("The year " + year
                    + " is invalid.");
        }

        sc.close();
    }
}
