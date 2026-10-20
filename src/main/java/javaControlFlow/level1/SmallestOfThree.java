package ControlFlow.level1;
import java.util.Scanner;

/*
Write a program to check if the first is the smallest of the 3 numbers.

I/P => number1, number2, number3

O/P => Is the first number the smallest? ____
*/

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        // To check if the first number is the smallest
        if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? true");
        } else {
            System.out.println("Is the first number the smallest? false");
        }
    }
}
