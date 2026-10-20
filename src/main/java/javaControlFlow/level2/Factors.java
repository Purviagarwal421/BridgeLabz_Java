package ControlFlow.level2;
import java.util.Scanner;
/*
Create a program to find the factors of a number taken as user input.
Hint =>
Get the input value for a variable named number.
Run a for loop from i = 1 to i < number.
In each iteration of the loop, check if number is perfectly divisible by i.
If true, print the value of i.

 */

public class Factors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        if(number<=0){
            System.out.println("Invalid Number");
            return;
        }
        // to print all numbers divisible by 'number'
        for(int i=1;i<number;i++){
            if(number%i==0){
                System.out.println(i+" is a factor of "+number);
            }
        }
    }
}
