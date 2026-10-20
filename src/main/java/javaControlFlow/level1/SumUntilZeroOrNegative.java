package ControlFlow.level1;
import java.util.Scanner;

/*
Rewrite the program to find the sum until the user enters
0 or a negative number using while loop and break statement.

Hint =>
1. Use an infinite while loop as in while (true).
2. Take the user entry and check if the user entered 0
   or a negative number to break the loop using break.

I/P => numbers until 0 or a negative number is entered

O/P => The total sum is ___
*/

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        // To calculate the sum until 0 or a negative number is entered
        while (true) {
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            total = total + number;
        }

        System.out.println("The total sum is " + total);

        sc.close();
    }
}
