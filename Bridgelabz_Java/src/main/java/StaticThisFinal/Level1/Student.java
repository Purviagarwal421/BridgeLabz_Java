
package StaticThisFinal.Level1;

import java.util.Scanner;

public class Student {

    private String name;
    private final int rollNumber;
    private char grade;

    private static String universityName = "ABC University";
    private static int totalStudents = 0;

    // Constructor using this
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Display student details
    public void displayDetails() {
        System.out.println("\n----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }

    // Update student grade
    public void updateGrade(char newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated successfully.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();

        System.out.print("Roll Number: ");
        int roll1 = sc.nextInt();

        System.out.print("Grade: ");
        char grade1 = sc.next().charAt(0);
        sc.nextLine();

        Student student1 = new Student(name1, roll1, grade1);

        System.out.println("\nEnter details for Student 2:");
        System.out.print("Name: ");
        String name2 = sc.nextLine();

        System.out.print("Roll Number: ");
        int roll2 = sc.nextInt();

        System.out.print("Grade: ");
        char grade2 = sc.next().charAt(0);

        Student student2 = new Student(name2, roll2, grade2);

        // Display total students
        Student.displayTotalStudents();

        // instanceof check before displaying details
        Object obj = student1;

        if (obj instanceof Student) {
            System.out.println("\nFirst Student:");
            ((Student) obj).displayDetails();
        } else {
            System.out.println("Object is not a Student.");
        }

        // instanceof check before updating grade
        Object obj2 = student2;

        if (obj2 instanceof Student) {
            System.out.print("\nEnter new grade for Student 2: ");
            char newGrade = sc.next().charAt(0);
            ((Student) obj2).updateGrade(newGrade);
            ((Student) obj2).displayDetails();
        } else {
            System.out.println("Cannot update grade. Object is not a Student.");
        }

        sc.close();
    }
}
