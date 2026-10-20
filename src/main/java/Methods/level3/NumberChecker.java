package CorePrograms.Methods.Level3;
import java.util.Scanner;

/*
Extend or Create a NumberChecker utility class and perform the following tasks.
1. Find factors of a number and return them as an array.
2. Find the greatest factor using the factors array.
3. Find the sum of factors.
4. Find the product of factors.
5. Find the product of cubes of factors using Math.pow().
6. Check whether a number is perfect.
7. Check whether a number is abundant.
8. Check whether a number is deficient.
9. Check whether a number is strong.
*/

public class NumberChecker {
    public static int[] findFactors(int number) {
        int count = 0;
        // to count the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;

        // to store the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    // method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }
        return greatest;
    }
    // method to find the sum of proper factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != factors[factors.length - 1]) {
                sum += factors[i];
            }
        }
        return sum;
    }
    // method to find the product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }
    // method to find the product of cubes of factors
    public static double findProductOfCubes(int[] factors) {
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }
    // method to check whether the number is perfect
    public static boolean isPerfectNumber(int number, int[] factors) {
        return number > 0 && findSumOfFactors(factors) == number;
    }
    // method to check whether the number is abundant
    public static boolean isAbundantNumber(int number, int[] factors) {
        return number > 0 && findSumOfFactors(factors) > number;
    }
    // method to check whether the number is deficient
    public static boolean isDeficientNumber(int number, int[] factors) {
        return number > 0 && findSumOfFactors(factors) < number;
    }
    // method to find factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
    // method to check whether the number is strong
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return number >= 0 && sum == number;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to take input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // to validate input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        // to find factors
        int[] factors = findFactors(number);

        // to print factors
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // to call methods
        int greatestFactor = findGreatestFactor(factors);
        int sum = findSumOfFactors(factors);
        long product = findProductOfFactors(factors);
        double productOfCubes = findProductOfCubes(factors);

        boolean perfect = isPerfectNumber(number, factors);
        boolean abundant = isAbundantNumber(number, factors);
        boolean deficient = isDeficientNumber(number, factors);
        boolean strong = isStrongNumber(number);

        // to print the results
        System.out.println("Greatest factor: " + greatestFactor);
        System.out.println("Sum of proper factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Product of cubes of factors: " + productOfCubes);
        System.out.println("Is perfect number: " + perfect);
        System.out.println("Is abundant number: " + abundant);
        System.out.println("Is deficient number: " + deficient);
        System.out.println("Is strong number: " + strong);

        sc.close();
    }










}
