package ControlFlow.level2;
import java.util.Scanner;

/*
Create a program to find the power of a number.

Hint =>
1. Get integer input for two variables named number and power.
2. Create a result variable with an initial value of 1.
3. Run a for loop from i = 1 to i <= power.
4. In each iteration, multiply result with number.
5. Finally, print the result.

I/P => number, power

O/P => The power of ___ is ___
*/

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;

        // To calculate the power of a number
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println("The power of " + number + " is " + result);

        sc.close();
    }
}
