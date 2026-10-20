package ControlFlow.level1;
import java.util.Scanner;

/*
Create a program to print odd and even numbers between 1
and the number entered by the user.

Hint =>
1. Get an integer input and check for a Natural Number.
2. Using a for loop, iterate from 1 to the number.
3. In each iteration, print whether the number is odd or even.

I/P => number

O/P =>
___ is an odd number.
___ is an even number.
*/

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // To check if the number is a natural number
        if (number > 0) {

            // To print odd and even numbers using for loop
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }

        } else {
            System.out.println("The number " + number
                    + " is not a natural number");
        }

        sc.close();
    }
}