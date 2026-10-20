package ControlFlow.level1;
import java.util.Scanner;

/*
Rewrite the LeapYear program to determine Leap Year
with a single if condition using logical && and || operators.

I/P => year

O/P =>
The year ___ is a Leap Year.
OR
The year ___ is not a Leap Year.
*/

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        // To check if the year is valid and a leap year
        if (year >= 1582 &&
                (year % 400 == 0 ||
                        (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("The year " + year
                    + " is a Leap Year.");
        } else {
            System.out.println("The year " + year
                    + " is not a Leap Year.");
        }

        sc.close();
    }
}
