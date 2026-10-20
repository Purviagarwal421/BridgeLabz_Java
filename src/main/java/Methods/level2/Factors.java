package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
Create a program to find the factors of a number taken as user input, store the factors in an array and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results
Hint =>
Take the input for a number
Write a static Method to find the factors of the number and save them in an array and return the array.
To find factors and save to array will have two loops. The first loop to find the count and initialize the array with the count. And the second loop save the factors into the array
Write a method to find the sum of the factors using factors array
Write a method to find the product of the factors using factors array
Write a method to find the sum of square of the factors using Math.pow() method

 */

public class Factors {
    // method to find factors and store them in an array
    public static int[] findFactors(int number){
        int count=0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                factors[index] = i;
                index++;
            }
        }

        return factors;

    }
    // method to calculate sum of factors
    int findSum(int[] factors){
        int sum = 0;
        for(int i = 0; i < factors.length; i++){
            sum = sum + factors[i];
        }
        return sum;
    }
    // method to calculate product of factors
    long findProduct(int[] factors){
        long product = 1;
        for(int i = 0; i < factors.length; i++){
            product = product * factors[i];
        }
        return product;
    }
    // method to calculate sum of squares of factors
    double findSumOfSquares(int[] factors){
        double sum = 0;

        for(int i = 0; i < factors.length; i++){
            sum = sum + Math.pow(factors[i], 2);
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // to take input
        int number = sc.nextInt();

        // to call method
        int[] factors = findFactors(number);

        Factors obj = new Factors();
        int sum = obj.findSum(factors);
        long product = obj.findProduct(factors);
        double sumOfSquares = obj.findSumOfSquares(factors);

        // to print the result
        System.out.print("The factors are: ");
        for(int i = 0; i < factors.length; i++){
            System.out.print(factors[i] + " ");
        }

        System.out.println();
        System.out.println("The sum of factors is " + sum);
        System.out.println("The product of factors is " + product);
        System.out.println("The sum of squares of factors is " + sumOfSquares);



    }


}
