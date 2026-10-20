package ControlFlow.level3;
import java.util.Scanner;

/*
Write a program to check if a number is an Armstrong number.

Hint =>
1. An Armstrong number is a number whose sum of digits
   raised to the power of the number of digits equals
   the original number.

2. Count the number of digits.
3. Extract each digit using modulus.
4. Calculate each digit raised to the power of count.
5. Add the powers and compare the sum with the original number.

I/P => number

O/P =>
___ is an Armstrong Number.
OR
___ is not an Armstrong Number.
*/

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int originalNumber = number;
        int count = 0;

        // To check if the number is negative
        if (number < 0) {
            System.out.println(number + " is not an Armstrong Number.");
            sc.close();
            return;
        }

        // To count the number of digits
        while (originalNumber != 0) {
            count++;
            originalNumber = originalNumber / 10;
        }

        // Reset originalNumber
        originalNumber = number;

        int sum = 0;

        // To calculate the sum of digits raised to the power count
        while (originalNumber != 0) {
            int digit = originalNumber % 10;

            // To calculate the power of each digit
            int power=(int)Math.pow(number,count);

            sum = sum + power;
            originalNumber = originalNumber / 10;
        }

        // To check if the number is an Armstrong number
        if (number == sum) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        sc.close();
    }
}
