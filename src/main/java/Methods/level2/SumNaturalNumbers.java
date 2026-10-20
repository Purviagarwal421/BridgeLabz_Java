package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
Write a program to find the sum of n natural numbers using recursive method and compare the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
Hint =>
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
Compare the two results and print the result
 */

public class SumNaturalNumbers {
    int findSumUsingRecursion(int n){
        if(n==0){
            return 0;
        }
        return n+findSumUsingRecursion(n-1);
    }
    int findSumUsingFormula(int n){
        int sum=(n*(n+1))/2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // to take input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // to check whether the number is natural
        if (n < 1) {
            System.out.println("Invalid input. Please enter a natural number.");
            sc.close();
            return;
        }
        // to create object
        SumNaturalNumbers obj = new SumNaturalNumbers();

        // to call methods
        int recursiveSum = obj.findSumUsingRecursion(n);
        int formulaSum = obj.findSumUsingFormula(n);

        // to print the results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // to compare the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("Both computations are not matching.");
        }



    }
}
