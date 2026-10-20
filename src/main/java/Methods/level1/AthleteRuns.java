package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
Hint =>
Take user input for 3 sides of a triangle
The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
Write a Method to compute the number of rounds user needs to do to complete 5km run

 */

public class AthleteRuns {
    double calculateRounds(double side1, double side2, double side3){
        double perimeter = side1 + side2 + side3;
        double rounds = Math.ceil(5000 / perimeter);
        return rounds;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take input
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        // to call method
        AthleteRuns athlete = new AthleteRuns();
        double rounds = athlete.calculateRounds(side1, side2, side3);

        // to print the result
        System.out.println("The number of rounds to complete a 5 km run is " + rounds);




    }

}
