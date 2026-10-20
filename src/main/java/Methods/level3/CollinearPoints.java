package CorePrograms.Methods.Level3;
import java.util.Scanner;
/*
Write a program to find whether three points are collinear
using the slope formula and area of a triangle formula.

Example:
A(2, 4), B(4, 6), C(6, 8)
 */

public class CollinearPoints {
    // Method to check collinearity using slope formula
    public static boolean isCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }
    // Method to check collinearity using triangle area
    public static boolean isCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        if (isCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using slope formula.");
        } else {
            System.out.println("Points are not collinear using slope formula.");
        }

        if (isCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear using area formula.");
        } else {
            System.out.println("Points are not collinear using area formula.");
        }

        sc.close();
    }


}
