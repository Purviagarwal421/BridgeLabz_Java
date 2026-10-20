package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
Write a program to take 2 numbers and print their quotient and reminder
Hint =>
Take user input as integer
Use division operator (/) for quotient and moduli operator (%) for reminder
Write Method to find the reminder and the quotient of a number
public static int[] findRemainderAndQuotient(int number, int divisor)

 */

public class Division {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int []result=new int[2];
        if(divisor!=0){
            result[0]=number/divisor;
            result[1]=number%divisor;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take input
        int number = sc.nextInt();
        int divisor = sc.nextInt();

        // to call method
        int[] result = findRemainderAndQuotient(number, divisor);

        // to print the result
        System.out.println("The quotient is " + result[1]);
        System.out.println("The remainder is " + result[0]);


    }
}
