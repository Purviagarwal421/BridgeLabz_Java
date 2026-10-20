package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertYardsToFeet(double yards) =>
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;

 */

public class UnitConvertor2 {
    // method to convert yards to feet
    public static double convertYardsToFeet(double yards){
        double yards2feet = 3;
        return yards * yards2feet;
    }
    // method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }
    // method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }
    // method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }
    // method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take input
        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();

        // to call static methods
        double feetResult = UnitConvertor2.convertYardsToFeet(yards);
        double yardsResult = UnitConvertor2.convertFeetToYards(feet);
        double inchesResult = UnitConvertor2.convertMetersToInches(meters);
        double metersResult = UnitConvertor2.convertInchesToMeters(inches);
        double cmResult = UnitConvertor2.convertInchesToCm(inches);

        // to print the results
        System.out.println(yards + " yards = " + feetResult + " feet");
        System.out.println(feet + " feet = " + yardsResult + " yards");
        System.out.println(meters + " meters = " + inchesResult + " inches");
        System.out.println(inches + " inches = " + metersResult + " meters");
        System.out.println(inches + " inches = " + cmResult + " centimeters");

    }
}
