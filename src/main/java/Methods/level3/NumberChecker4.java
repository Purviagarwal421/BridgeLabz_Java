package CorePrograms.Methods.Level3;
import java.util.Scanner;
/*
Extend or Create a NumberChecker utility class and perform the following tasks.

1. Check whether a number is prime.
2. Check whether a number is a neon number.
3. Check whether a number is a spy number.
4. Check whether a number is an automorphic number.
5. Check whether a number is a buzz number.
*/

public class NumberChecker4 {
    // method to check whether the number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    // method to check whether the number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square = square / 10;
        }

        return sum == number;
    }
    // method to check whether the number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        if (number == 0) {
            return true;
        }
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number = number / 10;
        }
        return sum == product;
    }
    // method to check whether the number is an automorphic number
    public static boolean isAutomorphicNumber(int number){
        int square = number * number;
        int temp = number;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp = temp / 10;
            square = square / 10;
        }
        return true;
    }
    // method to check whether the number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
    public static void main(String[] args) {
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
        // to call methods
        boolean prime = isPrime(number);
        boolean neon = isNeonNumber(number);
        boolean spy = isSpyNumber(number);
        boolean automorphic = isAutomorphicNumber(number);
        boolean buzz = isBuzzNumber(number);

        // to print the results
        System.out.println("Is Prime Number: " + prime);
        System.out.println("Is Neon Number: " + neon);
        System.out.println("Is Spy Number: " + spy);
        System.out.println("Is Automorphic Number: " + automorphic);
        System.out.println("Is Buzz Number: " + buzz);
    }
}
