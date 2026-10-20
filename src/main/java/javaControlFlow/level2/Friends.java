package ControlFlow.level2;
import java.util.Scanner;

/*
Create a program to find the youngest friend among Amar, Akbar,
and Anthony based on their ages and the tallest friend based
on their heights.

Hint =>
1. Take user input for the age and height of the 3 friends.
2. Find the smallest of the 3 ages to find the youngest friend.
3. Find the largest of the 3 heights to find the tallest friend.

I/P => age and height of Amar, Akbar, and Anthony

O/P =>
The youngest friend is ___
The tallest friend is ___
*/

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amarAge = sc.nextInt();
        double amarHeight = sc.nextDouble();

        int akbarAge = sc.nextInt();
        double akbarHeight = sc.nextDouble();

        int anthonyAge = sc.nextInt();
        double anthonyHeight = sc.nextDouble();

        String youngest;
        String tallest;

        // To find the youngest friend
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            youngest = "Amar";
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            youngest = "Akbar";
        } else if (anthonyAge < amarAge && anthonyAge < akbarAge) {
            youngest = "Anthony";
        } else {
            youngest = "There is a tie in age";
        }

        // To find the tallest friend
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            tallest = "Amar";
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            tallest = "Akbar";
        } else if (anthonyHeight > amarHeight && anthonyHeight > akbarHeight) {
            tallest = "Anthony";
        } else {
            tallest = "There is a tie in height";
        }

        System.out.println("The youngest friend is " + youngest);
        System.out.println("The tallest friend is " + tallest);

        sc.close();
    }
}
