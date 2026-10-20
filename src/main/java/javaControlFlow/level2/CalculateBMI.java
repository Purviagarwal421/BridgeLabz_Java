package ControlFlow.level2;
import java.util.Scanner;

/*
Create a program to find the BMI of a person.

Hint =>
1. Take weight in kg and height in cm as input.
2. Convert height from cm to meters.
3. Calculate BMI = weight / (height * height).
4. Determine the weight status using the BMI value.

I/P => weight, height

O/P =>
BMI: ___
Weight Status: ___
*/

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        // To convert height from cm to meters
        height = height / 100;

        // To calculate BMI
        double bmi = weight / (height * height);

        // To determine the weight status
        if (bmi <= 18.4) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Weight Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }

        System.out.println("BMI: " + bmi);

        sc.close();
    }
}
