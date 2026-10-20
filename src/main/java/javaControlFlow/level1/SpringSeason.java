package ControlFlow.level1;
import java.util.Scanner;

/*
Write a program SpringSeason that takes two int values
month and day from the user and prints "Its a Spring Season"
otherwise prints "Not a Spring Season".

Hint =>
Spring Season is from March 20 to June 20.

I/P => month, day

O/P =>
Its a Spring Season
OR
Not a Spring Season
*/

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        // To check if the date falls in the Spring Season
        if ((month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        sc.close();
    }
}
