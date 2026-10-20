
package CorePrograms.Arrays.level2;
import java.util.Scanner;
/*
Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
Hint =>
All the steps are the same as the problem 8 except the marks are stored in a 2D array
Use the 2D array to calculate the percentages, and grades of the students

 */
public class Grade2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];

        // To take marks for each student
        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextDouble();

            // Validate marks
            if (marks[i][0] < 0 || marks[i][0] > 100 ||
                    marks[i][1] < 0 || marks[i][1] > 100 ||
                    marks[i][2] < 0 || marks[i][2] > 100) {

                System.out.println("Invalid marks. Enter marks from 0 to 100.");
                i--;
                continue;
            }

            //To  calculate percentage
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300) * 100;

            //To  calculate grade
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

        // To display results
        System.out.println("\nStudent Results");

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%%n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }

    }
}

