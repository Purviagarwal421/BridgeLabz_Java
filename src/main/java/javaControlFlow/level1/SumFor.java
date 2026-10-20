package ControlFlow.level1;
import java.util.Scanner;

/*
Rewrite program number 12 using the for loop instead of a while loop
to find the sum of n Natural Numbers.

Hint =>
1. Take the user input number and check whether it's a Natural number.
2. If it's a natural number, compute using formula and for loop.
3. Compare the two results and print the result.

I/P => number

O/P =>
The sum using for loop is ___
The sum using formula is ___
Both computations are correct: ___
*/

public class SumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // To check if the number is a natural number
        if (number > 0) {

            // To calculate the sum using for loop
            int sum = 0;

            for (int i = 1; i <= number; i++) {
                sum = sum + i;
            }

            // To calculate the sum using formula
            int formulaSum = number * (number + 1) / 2;

            // To display both results
            System.out.println("The sum using for loop is " + sum);
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
