package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint =>
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] findRemainderAndQuotient(int number, int divisor)

 */

public class ChocolateDistribution {
    // method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient=0,remainder=0;
        if(divisor!=0){
            quotient = number / divisor;
            remainder = number % divisor;
        }
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // to take input
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        // to call method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // to print the result
        System.out.println("Each child will get " + result[0] + " chocolates");
        System.out.println("The remaining chocolates are " + result[1]);

    }
}
