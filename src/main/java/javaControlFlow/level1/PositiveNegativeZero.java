package ControlFlow.level1;
import java.util.Scanner;

/*
Write a program to check whether a number is positive,
negative, or zero.

Hint =>
1. Get integer input from the user and store it in the number variable.
2. If the number is positive, print positive.
3. If the number is negative, print negative.
4. If the number is zero, print zero.

I/P => number

O/P =>
The number ___ is positive.
OR
The number ___ is negative.
OR
The number is zero.
*/

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // To check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}
