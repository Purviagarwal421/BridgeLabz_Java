package ControlFlow.level3;
import java.util.Scanner;

/*
Create a program to count the number of digits in an integer.

Hint =>
1. Get an integer input for the number variable.
2. Create an integer variable count with value 0.
3. Use a loop to iterate until number is not equal to 0.
4. Remove the last digit from number in each iteration.
5. Increase count by 1 in each iteration.
6. Finally display the count.

I/P => number

O/P => The number of digits is ___
*/

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count = 0;

        // To count the number of digits
        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("The number of digits is " + count);

        sc.close();
    }
}
