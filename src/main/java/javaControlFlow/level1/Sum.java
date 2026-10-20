package ControlFlow.level1;
import java.util.Scanner;

/*
Write a program to find the sum of n natural numbers using
while loop, compare the result with the formula n*(n+1)/2,
and show whether both computations are correct.

Hint =>
1. Take the user input number and check whether it's a natural number.
2. If it's a natural number, compute using the formula and while loop.
3. Compare the two results and print the result.

I/P => number

O/P =>
The sum using while loop is ___
The sum using formula is ___
Both computations are correct: ___
*/

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // To check if the number is a natural number
        if (number > 0) {

            // To calculate the sum using while loop
            int sum = 0;
            int i = 1;

            while (i <= number) {
                sum = sum + i;
                i++;
            }

            // To calculate the sum using formula
            int formulaSum = number * (number + 1) / 2;

            // To display both results
            System.out.println("The sum using while loop is " + sum);
            System.out.println("The sum using formula is " + formulaSum);

            // To compare both results
            if (sum == formulaSum) {
                System.out.println("Both computations are correct: true");
            } else {
                System.out.println("Both computations are correct: false");
            }

        } else {
            System.out.println("The number " + number
                    + " is not a natural number");
        }

        sc.close();
    }
}
