package CorePrograms.Methods.Level3;
import java.util.Scanner;

/*
Create a program to generate marks for Physics, Chemistry,
and Mathematics for students and calculate total, average,
percentage, and grade.

Hint =>
1. Take input for the number of students.
2. Generate random 2-digit marks for PCM using a 2D array.
3. Calculate total, average, and percentage.
4. Display the scorecard in tabular format.
*/

public class StudentScoreCard {
    // Method to generate random marks for all students
    // Column 0 = Physics, Column 1 = Chemistry, Column 2 = Maths
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int) (Math.random() * 90) + 10;
            }
        }

        return marks;
    }
    // Method to calculate total, average, and percentage
    // Column 0 = Total, Column 1 = Average, Column 2 = Percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }
    // Method to determine grade from percentage
    public static String getGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }
    // Method to display the scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("\nSTUDENT SCORECARD");

        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t\t" + marks[i][2] + "\t" +
                            (int) results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2] + "%\t\t" +
                            getGrade(results[i][2])
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        if (students <= 0) {
            System.out.println("Number of students must be positive.");
        } else {
            int[][] marks = generateMarks(students);
            double[][] results = calculateResults(marks);

            displayScorecard(marks, results);
        }

        sc.close();
    }




}
