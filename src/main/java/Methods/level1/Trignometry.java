package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
Write a program to calculate various trigonometric functions using Math class given an angle in degrees
Hint =>
Method to calculate various trigonometric functions, Firstly convert to radians and then use Math function to find sine, cosine and tangent.
public double[] calculateTrigonometricFunctions(double angle)

 */

public class Trignometry {
    // method to calculate trigonometric functions
    public double[] calculateTrigonometricFunctions(double angle){
        double angleInRadians=Math.toRadians(angle);
        double sine=Math.sin(angleInRadians);
        double cosine=Math.cos(angleInRadians);
        double tangent=Math.tan(angleInRadians);
        return new double[]{sine,cosine,tangent};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take input
        double angleInDegree=sc.nextDouble();

        // to call method
        Trignometry obj = new Trignometry();
        double[] result = obj.calculateTrigonometricFunctions(angleInDegree);

        // to print the result
        System.out.println("Sine of " + angleInDegree + " degrees is " + result[0]);
        System.out.println("Cosine of " + angleInDegree + " degrees is " + result[1]);
        System.out.println("Tangent of " + angleInDegree + " degrees is " + result[2]);




    }
}
