package ControlFlow.level1;
import java.util.Scanner;

/*
Write a program to check for the natural number and
write the sum of n natural numbers.

Hint =>
A Natural Number is a positive integer (1, 2, 3, etc.).
Sum of n natural numbers = n * (n + 1) / 2

I/P => number

O/P =>
The sum of ___ natural numbers is ___

Otherwise =>
The number ___ is not a natural number
*/

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // To check if the number is a natural number
        if (number > 0) {
            // To calculate the sum of natural numbers
            int sum = number * (number + 1) / 2;

            System.out.println("The sum of " + number
                    + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number
                    + " is not a natural number");
        }

        sc.close();
    }
}
