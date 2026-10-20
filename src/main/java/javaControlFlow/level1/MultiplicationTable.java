package ControlFlow.level1;
import java.util.Scanner;

/*
Create a program to find the multiplication table of a number
entered by the user from 6 to 9.

Hint =>
1. Take integer input and store it in the variable number.
2. Using a for loop, find the multiplication table from 6 to 9.
3. Print it in the format number * i = ___.

I/P => number

O/P =>
number * 6 = ___
number * 7 = ___
number * 8 = ___
number * 9 = ___
*/

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // To print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = "
                    + (number * i));
        }

        sc.close();
    }
}
