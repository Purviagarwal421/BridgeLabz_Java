package ControlFlow.level2;
import java.util.Scanner;

/*
Write a program FizzBuzz that takes a number as user input.
If it is a positive integer, loop from 0 to the number and
print the number, but:
For multiples of 3 print "Fizz".
For multiples of 5 print "Buzz".
For multiples of both print "FizzBuzz".

Hint =>
Use while  loop.

I/P => number

O/P =>
Print numbers from 0 to number, replacing multiples of
3 with Fizz, multiples of 5 with Buzz, and multiples
of both with FizzBuzz.
*/

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        // To check if the number is a positive integer
        if (number > 0) {

            // To print FizzBuzz using while loop
            int i=0;
            while(i<=number){
                if(i%3==0 && i%5==0){
                    System.out.println("FizzBuzz");
                }
                else if(i%3==0){
                    System.out.println("Fizz");
                }
                else if(i%5==0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
                i++;
            }

        }
        else {
            System.out.println("Please enter a positive integer.");
        }

        sc.close();
    }
}