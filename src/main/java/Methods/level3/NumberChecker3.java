package CorePrograms.Methods.Level3;
import java.util.Scanner;
/*
Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
Hint =>
Method to find the count of digits in the number and a Method to Store the digits of the number in a digits array
Method to reverse the digits array
Method to compare two arrays and check if they are equal
Method to check if a number is a palindrome using the Digits. A palindrome number is a number that remains the same when its digits are reversed.
Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
 */

public class NumberChecker3 {
    // method to find the count of digits
    public static int countDigits(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }
    // method to store digits in an array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }
    // method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reverse = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }
        return reverse;
    }
    // method to compare two arrays
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    // method to check whether the number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reverse = reverseArray(digits);
        return areArraysEqual(digits, reverse);
    }
    // method to check whether the number is a Duck number
    public static boolean isDuckNumber(int[] digits) {
        boolean isDuckNumber=true;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                isDuckNumber=false;
                break;
            }
        }
        return isDuckNumber;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take input
        System.out.print("Enter a non-negative number: ");
        int number = sc.nextInt();

        // to validate input
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            sc.close();
            return;
        }
        // to find the count of digits
        int count=countDigits(number);

        // to store digits in an array
        int[] digits = getDigits(number);

        // to reverse the digits array
        int[] reverse = reverseArray(digits);

        // to compare the arrays
        boolean equal = areArraysEqual(digits, reverse);

        // to check palindrome and Duck number
        boolean palindrome = isPalindrome(digits);
        boolean duck = isDuckNumber(digits);

        // to print the digits
        System.out.println("Count of digits: " + count);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // to print the reversed digits
        System.out.print("Reversed digits: ");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
        System.out.println();

        // to print the results
        System.out.println("Are the arrays equal? " + equal);
        System.out.println("Is palindrome? " + palindrome);
        System.out.println("Is Duck number? " + duck);







    }

}
