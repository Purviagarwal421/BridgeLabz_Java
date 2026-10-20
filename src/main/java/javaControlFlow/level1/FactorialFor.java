package ControlFlow.level1;
import java.util.Scanner;

/*
Rewrite program 14 using for loop.

Hint =>
1. Take the integer input and check for a natural number.
2. Determine the factorial using for loop.
3. Finally, print the result.

I/P => number

O/P =>
The factorial of ___ is ___
*/

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // To check if the number is a natural number
        if (number > 0) {
            int factorial = 1;

            // To calculate the factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

            System.out.println("The factorial of " + number
                    + " is " + factorial);
        } else {
            System.out.println("The number " + number
                    + " is not a natural number");
        }

        sc.close();
    }
}
