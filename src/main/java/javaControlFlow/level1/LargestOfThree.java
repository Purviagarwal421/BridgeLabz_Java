package ControlFlow.level1;
import java.util.Scanner;

/*
Write a program to check if the first, second, or third number
is the largest of the three.

I/P => number1, number2, number3

O/P =>
Is the first number the largest? ____
Is the second number the largest? ____
Is the third number the largest? ____
*/

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        // To check if the first number is the largest
        if (number1 > number2 && number1 > number3) {
            System.out.println("Is the first number the largest? true");
        } else {
            System.out.println("Is the first number the largest? false");
        }

        // To check if the second number is the largest
        if (number2 > number1 && number2 > number3) {
            System.out.println("Is the second number the largest? true");
        } else {
            System.out.println("Is the second number the largest? false");
        }

        // To check if the third number is the largest
        if (number3 > number1 && number3 > number2) {
            System.out.println("Is the third number the largest? true");
        } else {
            System.out.println("Is the third number the largest? false");
        }

        sc.close();
    }
}
