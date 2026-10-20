package CorePrograms.Methods.Level3;

import java.util.Scanner;

public class NumberChecker1 {
    // method to find the count of digits
    public static int countDigits(int number){
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
    public static int []getDigits(int number){
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
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
    // method to check whether the number is an Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int count = digits.length;
        for (int i = 0; i < digits.length; i++) {
            sum += (int) Math.pow(digits[i], count);
        }
        return sum == number;
    }
    // method to find largest and second largest digits
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        return new int[]{largest, secondLargest};
    }
    //method to find smallest and second smallest digits
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }
        return new int[]{smallest, secondSmallest};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take input
        System.out.print("Enter a non-negative number: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
            sc.close();
            return;
        }
        // to find digit count and store digits
        int count = countDigits(number);
        int[] digits = getDigits(number);
        // to print the digits
        System.out.println("Count of digits: " + count);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // to check Duck number
        System.out.println("Duck number: " + isDuckNumber(digits));
        // to check Armstrong number
        System.out.println("Armstrong number: " + isArmstrongNumber(number, digits));

        // to find largest and second largest digits
        int[] largestResults = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestResults[0]);
        if (largestResults[1] == Integer.MIN_VALUE) {
            System.out.println("Second largest distinct digit: Not available");
        } else {
            System.out.println("Second largest distinct digit: " + largestResults[1]);
        }

        // to find smallest and second smallest digits
        int[] smallestResults = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestResults[0]);
        if (smallestResults[1] == Integer.MAX_VALUE) {
            System.out.println("Second smallest distinct digit: Not available");
        } else {
            System.out.println("Second smallest distinct digit: " + smallestResults[1]);
        }
    }

}
