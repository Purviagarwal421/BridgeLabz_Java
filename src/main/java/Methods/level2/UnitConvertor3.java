package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g.
public static double convertFarhenheitToCelsius(double farhenheit) =>
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462;
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541;
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172;

 */

public class UnitConvertor3 {
    // method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }
    // method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }
    // method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    // method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    // method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    // method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double kilograms = sc.nextDouble();

        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();

        System.out.print("Enter volume in liters: ");
        double liters = sc.nextDouble();

        // to call static methods
        double celsiusResult = UnitConvertor3.convertFahrenheitToCelsius(fahrenheit);
        double fahrenheitResult = UnitConvertor3.convertCelsiusToFahrenheit(celsius);
        double kilogramsResult = UnitConvertor3.convertPoundsToKilograms(pounds);
        double poundsResult = UnitConvertor3.convertKilogramsToPounds(kilograms);
        double litersResult = UnitConvertor3.convertGallonsToLiters(gallons);
        double gallonsResult = UnitConvertor3.convertLitersToGallons(liters);

        // to print the results
        System.out.println(fahrenheit + " Fahrenheit = " + celsiusResult + " Celsius");
        System.out.println(celsius + " Celsius = " + fahrenheitResult + " Fahrenheit");
        System.out.println(pounds + " pounds = " + kilogramsResult + " kilograms");
        System.out.println(kilograms + " kilograms = " + poundsResult + " pounds");
        System.out.println(gallons + " gallons = " + litersResult + " liters");
        System.out.println(liters + " liters = " + gallonsResult + " gallons");



    }
}
