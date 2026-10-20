package ControlFlow.level1;
import java.util.Scanner;

/*
Write a program to find the sum of numbers until the user enters 0.

Hint =>
1. Create a variable total of type double initialized to 0.0.
2. Create a variable to store the double value entered by the user.
3. Use the while loop to check if the user entered value is 0.
4. If the value is not 0, add it to total and ask the user to input again.
5. Continue until the user enters zero.
6. Outside the loop, display the total value.

I/P => numbers until 0 is entered

O/P => The total sum is ___
*/

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double number = sc.nextDouble();

        // To calculate the sum until the user enters 0
        while (number != 0) {
            total = total + number;
            number = sc.nextDouble();
        }

        System.out.println("The total sum is " + total);

        sc.close();
    }
}