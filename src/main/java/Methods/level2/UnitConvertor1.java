package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
1. Extend or Create a ***UnitConvertor*** utility class similar to the one shown in the notes to do the following.  Please define ***static*** methods for all the UnitConvertor class methods. E.g. 

_**public static double convertKmToMiles(double km)**_**&#x20;=>&#xA0;**

1. Method To convert kilometers to miles and return the value. Use the following code `double km2miles = 0.621371;`
2. Method to convert miles to kilometers and return the value. Use the following code `double miles2km = 1.60934;`
3. Method to convert meters to feet and return the value. Use the following code to convert `double meters2feet = 3.28084;`
4. Method to convert feet to meters and return the value. Use the following code to convert `double feet2meters = 0.3048;`
 */

public class UnitConvertor1 {
    // method to convert kilometers to miles
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371;
        return km * km2miles;
    }
    // method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }
    // method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
    // method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take input
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();

        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();

        System.out.print("Enter feet: ");
        double feet = sc.nextDouble();

        // to call static methods
        double milesResult = UnitConvertor1.convertKmToMiles(km);
        double kmResult = UnitConvertor1.convertMilesToKm(miles);
        double feetResult = UnitConvertor1.convertMetersToFeet(meters);
        double metersResult = UnitConvertor1.convertFeetToMeters(feet);

        // to print the results
        System.out.println(km + " kilometers = " + milesResult + " miles");
        System.out.println(miles + " miles = " + kmResult + " kilometers");
        System.out.println(meters + " meters = " + feetResult + " feet");
        System.out.println(feet + " feet = " + metersResult + " meters");


    }


}
