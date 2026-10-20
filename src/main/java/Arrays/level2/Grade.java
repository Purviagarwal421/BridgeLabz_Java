package CorePrograms.Arrays.level2;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[] physicsMarks = new double[number];
        double[] chemistryMarks = new double[number];
        double[] mathsMarks = new double[number];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // to store inputs and calculate percentage
        for(int i=0;i<number;i++){
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            physicsMarks[i]=sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            chemistryMarks[i]=sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            mathsMarks[i]=sc.nextDouble();

            if(physicsMarks[i]<0 || physicsMarks[i]>100 || chemistryMarks[i]<0 || chemistryMarks[i]>100 ||mathsMarks[i]<0 || mathsMarks[i]>100){
                System.out.println("Invalid marks. Enter marks from 0 to 100.");
                i--;
                continue;
            }
            double totalMarks=physicsMarks[i]+chemistryMarks[i]+mathsMarks[i];
            percentage[i]=(totalMarks/300)*100;

            // To calculate grade
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "C";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }
        // To Display results
        System.out.println("\nStudent Results");

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + physicsMarks[i]);
            System.out.println("Chemistry: " + chemistryMarks[i]);
            System.out.println("Maths: " + mathsMarks[i]);
            System.out.printf("Percentage: %.2f%%%n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }


    }
}
