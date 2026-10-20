package CorePrograms.Arrays.level2;
import java.util.Scanner;

/*
An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint =>
Take input for a number of persons
Create arrays to store the weight, height, BMI, and weight status of the persons
Take input for the weight and height of the persons
Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
Display the height, weight, BMI, and weight status of each person
Use the table to determine the weight status of the person

 */
public class BMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to store weight;
        int persons=10;
        double []weight=new double[10];
        double []height=new double[10];
        double[]bmi=new double[10];
        String []status=new String[10];

        // to take input and calculate bmi
        for (int i=0;i<10;i++){
            System.out.print("Enter weight(in kg) of "+(i+1)+": ");
            weight[i]= sc.nextDouble();

            System.out.print("Enter height(in cm) of "+(i+1)+": ");
            height[i]= sc.nextDouble();
            // height in m
            height[i]/=100;

            bmi[i]=weight[i]/(height[i]*height[i]);
            if(bmi[i]<=18.4){
                status[i]="Underweight";
            } else if (bmi[i]<=24.9) {
                status[i]="Normal";
            }
            else if(bmi[i]<=39.9){
                status[i]="Overweight";
            }
            else{
                status[i]="Obese";
            }
        }
        // To Display the results
        System.out.println("\nBMI Report");

        for (int i = 0; i < persons; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("Height: " + height[i] + " m");
            System.out.printf("BMI: %.2f%n", bmi[i]);
            System.out.println("Status: " + status[i]);
        }

    }
}
