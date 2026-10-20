package ControlFlow.level1;
import java.util.Scanner;

/*
Write a program to find the factorial of an integer entered by the user.

Hint =>
1. The factorial of 4 is 1 * 2 * 3 * 4 = 24.
2. Take an integer input and check whether it is a positive integer.
3. Using a while loop, compute the factorial.
4. Print the factorial at the end.

I/P => number

O/P =>
The factorial of ___ is ___
*/

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // To check if the number is a positive integer
        if (number > 0) {
            int factorial = 1;
            int i = 1;

            // To calculate the factorial using while loop
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("The factorial of " + number
                    + " is " + factorial);
        } else {
            System.out.println("The number " + number
                    + " is not a positive integer");
        }

        sc.close();
    }
}
