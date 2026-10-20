package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint =>
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status.

 */

public class BMICalculator {
    // method to calculate BMI and populate the array
    public void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100;

            data[i][2] = weight / (height * height);
        }
    }

    //method to calculate BMI status
    public String findBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    //method to find the BMI status of all people
    public String[] findAllBMIStatus(double[][] data){
        String []status =new String[data.length];
        for(int i=0;i< data.length;i++){
            status[i]=findBMIStatus(data[i][2]);
        }
        return status;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [][] data=new double[10][3];
        //to take inputs
        for(int i=0;i<10;i++){
            System.out.println("Enter details for person " + (i + 1));
            for(int j=0;j<3;j++){
                System.out.print("Enter weight in kg: ");
                data[i][j] = sc.nextDouble();

                System.out.print("Enter height in cm: ");
                data[i][j] = sc.nextDouble();

            }
        }
        // to create object
        BMICalculator obj = new BMICalculator();
        // to calculate BMI
        obj.calculateBMI(data);
        //to find BMI status of all people
        String [] status=obj.findAllBMIStatus(data);
        // to print the results
        System.out.println("\nBMI Report");
        System.out.printf("%-10s %-15s %-15s %-15s%n",
                "Person", "Weight (kg)", "Height (cm)", "BMI");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10d %-15.2f %-15.2f %-15.2f%n",
                    (i + 1), data[i][0], data[i][1], data[i][2]);

            System.out.println("BMI Status: " + status[i]);
            System.out.println();
        }

    }
}
