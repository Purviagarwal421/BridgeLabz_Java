package ControlFlow.level1;
import java.util.Scanner;

/*
Write a program to input marks in Physics, Chemistry and Maths.
Compute the percentage and calculate the grade based on the guidelines.

I/P => physics, chemistry, maths

O/P =>
Average Mark: ___
Grade: ___
Remarks: ___

Grade Guidelines:
A: 80% and above
B: 70-79%
C: 60-69%
D: 50-59%
E: 40-49%
R: 39% and below
*/

public class CalculateGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();

        // To calculate the average mark and percentage
        double average = (physics + chemistry + maths) / 3;
        double percentage = average;

        char grade;
        String remarks;

        // To calculate the grade based on percentage
        if (percentage >= 80) {
            grade = 'A';
            remarks = "Above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "At agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // To display the average mark, grade and remarks
        System.out.println("Average Mark: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
