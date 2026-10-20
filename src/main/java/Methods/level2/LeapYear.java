package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
Write a program that takes a year as input and outputs the Year is a Leap Year or not
Hint =>
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b

 */

public class LeapYear {
    boolean isLeapYear(int year){
        if(year%400==0){
            return true;
        } else if (year%4==0 && year%100!=0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // to take input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // to check whether the year is valid
        if (year < 1582) {
            System.out.println("Invalid year. Enter a year greater than or equal to 1582.");
            sc.close();
            return;
        }
        // to create object
        LeapYear obj = new LeapYear();

        // to call method
        boolean result = obj.isLeapYear(year);

        // to print the result
        if (result) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
