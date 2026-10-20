package CorePrograms.Methods.Level3;
import java.util.Scanner;

/*
Write a program to calculate the Euclidean distance between
two points and find the equation of the line using those points.

Hint =>
1. Take inputs for x1, y1, x2, y2.
2. Write a method to find the Euclidean distance.
3. Write a method to find the slope and y-intercept.
4. Return an array containing slope and y-intercept.
*/


public class EuclideanDistance {
    // Method to calculate Euclidean distance
    public static double getDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }
    // Method to calculate slope and y-intercept
    // Returns an array: [slope, y-intercept]
    public static double[] getLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = getDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        if (x1 == x2) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            double[] equation = getLineEquation(x1, y1, x2, y2);

            System.out.println("Slope: " + equation[0]);
            System.out.println("Y-intercept: " + equation[1]);
            System.out.println("Equation of the line: y = "
                    + equation[0] + "x + " + equation[1]);
        }
        sc.close();
    }

}
