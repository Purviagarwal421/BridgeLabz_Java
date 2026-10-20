package ControlFlow.level2;
import java.util.Scanner;
/*
Write a Program to check if the given number is a prime number or not
Hint =>
A number that can be divided exactly only by itself and 1 are Prime Numbers,
Prime Numbers checks are done for numbers greater than 1
Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number.
Use isPrime boolean variable to store the result

 */

public class PrimeNumber {
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        if(number<2){
            System.out.println(number+" is not a prime Number.");
            System.exit(0);
        }
        // to check if it a prime number or not
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(number+" is a prime Number.");
        }
        else{
            System.out.println(number+" is not a prime Number.");
        }

    }
}
