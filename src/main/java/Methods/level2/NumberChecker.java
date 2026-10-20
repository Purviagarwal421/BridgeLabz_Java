package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less
Hint =>
Write a Method to Check whether the number is positive or negative
Write a Method to check whether the number is even or odd
Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both are equal or -1 if number1 < number2
In the main program, Loop through the array using the length call the method isPositive() and if positive call method isEven() and print accordingly
If the number is negative, print negative.
Finally compare the first and last element of the array by calling the method compare() and display if they are equal, greater, or less

 */

public class NumberChecker {
    // method to check whether the number is positive
    public boolean isPositive(int number) {
        if (number > 0) {
            return true;
        }
        return false;
    }
    // method to check whether the number is even
    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
    // method to compare two numbers
    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // to create an array of 5 numbers
        int[] numbers = new int[5];

        // to take input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        // to create object
        NumberChecker obj = new NumberChecker();

        for(int i=0;i<numbers.length;i++){
            boolean isPositive=obj.isPositive(numbers[i]);
            if(isPositive){
                boolean isEven=obj.isEven(numbers[i]);
                if(isEven){
                    System.out.println(numbers[i] + " is positive and even.");
                }
                else{
                    System.out.println(numbers[i] + " is positive and odd.");
                }

            }
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            }
            else {
                System.out.println("The number is zero.");
            }
        }
        // to compare the first and last elements
        int result = obj.compare(numbers[0], numbers[numbers.length - 1]);
        // to print the comparison result
        if (result == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (result == 0) {
            System.out.println("First and last elements are equal.");
        } else {
            System.out.println("First element is less than the last element.");
        }

    }
}
