package CorePrograms.Methods.Level3;

import java.util.Scanner;

public class NumberChecker2 {
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
    // method to find the sum of digits
    public static int findSum(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }
    // method to find the sum of squares of digits
    public static double findSumOfSquares(int[] digits) {
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }
    // method to check whether the number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findSum(digits);
        if (sum == 0) {
            return false;
        }
        return number % sum == 0;
    }
    // method to find the frequency of each digit
    public static int[][] findFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        // to store digits from 0 to 9 in the first column
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        // to count the frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            int digit = digits[i];
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
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
        int count = countDigits(number);

        // to store digits in an array
        int[] digits = getDigits(number);

        // to find the sum and sum of squares
        int sum = findSum(digits);
        double sumOfSquares = findSumOfSquares(digits);

        // to check Harshad number
        boolean harshad = isHarshadNumber(number, digits);

        // to find frequency of digits
        int[][] frequency = findFrequency(digits);

        // to print the digits
        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // to print the results
        System.out.println("Count of digits: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        if (harshad) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        // to print digit frequencies
        System.out.println("Digit\tFrequency");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
            }
        }

    }

}
