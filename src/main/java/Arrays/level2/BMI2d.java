package CorePrograms.Arrays.level2;
import java.util.Scanner;

/*
Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint =>
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person

 */
public class BMI2d {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to store weight;
        //int persons=10;
        double [][]persons=new double[10][3];
        String []status=new String[10];

        // to take input and calculate bmi
        for (int i=0;i<10;i++){
            System.out.print("Enter weight(in kg) of "+(i+1)+": ");
            persons[i][0]= sc.nextDouble();
            double weight=persons[i][0];

            System.out.print("Enter height(in cm) of "+(i+1)+": ");
            persons[i][1]= sc.nextDouble();
            double height=persons[i][1];
            // height in m
            height/=100;

            persons[i][2]=weight/(height*height);
            double bmi=persons[i][2];
            if(bmi<=18.4){
                status[i]="Underweight";
            } else if (bmi<=24.9) {
                status[i]="Normal";
            }
            else if(bmi<=39.9){
                status[i]="Overweight";
            }
            else{
                status[i]="Obese";
            }
        }
        // To Display the results
        System.out.println("\nBMI Report");

        for (int i = 0; i < persons.length; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight: " + persons[i][0] + " kg");
            System.out.println("Height: " + persons[i][1] + " m");
            System.out.println("BMI: " + persons[i][2]);
            System.out.println("Status: " + status[i]);
        }

    }
}
