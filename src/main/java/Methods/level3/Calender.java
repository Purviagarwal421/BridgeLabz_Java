package CorePrograms.Methods.Level3;
import java.util.Scanner;
/*
Create a program to display a calendar for a given month and year.

Hint =>
1. Write a method to get the name of the month.
2. Write a method to get the number of days in the month.
3. Write a method to check for a leap year.
4. Write a method to get the first day of the month using
   the Gregorian calendar algorithm.
5. Use two for loops to display the calendar.
*/

public class Calender {
    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };

        return months[month];
    }
    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }
    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month];
    }
    // Method to get the first day of the month
    // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    public static int getFirstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
    // Method to display the calendar
    public static void displayCalendar(int month, int year){
        int firstDay = getFirstDay(month, year);
        int totalDays = getDaysInMonth(month, year);
        System.out.println("\n     " + getMonthName(month) + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        // First loop: print spaces before day 1
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        // Second loop: print all days of the month
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%4d", day);

            // Move to the next line after Saturday
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid month or year.");
        } else {
            displayCalendar(month, year);
        }
        sc.close();
    }



}
