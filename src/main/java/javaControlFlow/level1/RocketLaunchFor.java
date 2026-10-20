package ControlFlow.level1;
import java.util.Scanner;

/*
Rewrite program 8 to do the countdown using the for-loop.

I/P => counter

O/P =>
___
___
...
1
*/

public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int counter = sc.nextInt();

        // To count down from the given number to 1
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}