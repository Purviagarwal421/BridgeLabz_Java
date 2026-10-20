package ControlFlow.level1;
import java.util.Scanner;

/*
Write a program to count down the number from the user input
value to 1 using a while loop for a rocket launch.

Hint =>
1. Create a variable counter to take user inputted value.
2. Use the while loop to check if the counter is 1.
3. Inside the while loop, print the value of the counter
   and decrement the counter.

I/P => counter

O/P =>
___
___
...
1
*/

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        // To count down from the given number to 1
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        sc.close();
    }
}
