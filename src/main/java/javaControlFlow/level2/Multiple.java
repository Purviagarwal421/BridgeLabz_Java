package ControlFlow.level2;
import java.util.Scanner;

/*
Create a program to find all the multiples of a number
taken as user input below 100.

Hint =>
1. Get input value for a variable named number.
2. Run a for loop backward from i = 100 to i = 1.
3. Inside the loop, check if i is perfectly divisible by number.
4. If true, print i and continue the loop.

I/P => number

O/P => Multiples of the number below 100
*/

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // To check if the number is valid
        if (number <= 0) {
            System.out.println("Invalid Number");
            sc.close();
            return;
        }

        // To print multiples below 100 in descending order
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
                continue;
            }
        }

        sc.close();
    }
}
