
package Constructors.Level2;

/*
Design a Course class with:

Instance Variables: courseName, duration, fee.
Class Variable: instituteName (common for all courses).

Methods:
An instance method displayCourseDetails() to display
the course details.
A class method updateInstituteName() to modify
the institute name for all courses.
*/

import java.util.Scanner;

public class Course {
    private String courseName;
    private int duration;
    private double fee;

    // Class variable
    private static String instituteName = "ABC Institute";

    //default constructor
    public Course(){
        this("",0,0.0);
    }
    // Parameterized constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("\n----- Course Details -----");
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: Rs. " + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
        System.out.println("Institute name updated successfully.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first course name: ");
        String courseName1 = sc.nextLine();

        System.out.print("Enter duration in months: ");
        int duration1 = sc.nextInt();

        System.out.print("Enter course fee: ");
        double fee1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter second course name: ");
        String courseName2 = sc.nextLine();

        System.out.print("Enter duration in months: ");
        int duration2 = sc.nextInt();

        System.out.print("Enter course fee: ");
        double fee2 = sc.nextDouble();
        sc.nextLine();

        // Create course objects
        Course course1 = new Course(courseName1, duration1, fee1);
        Course course2 = new Course(courseName2, duration2, fee2);

        // Display details before updating institute name
        System.out.println("\nBefore updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update the common institute name
        System.out.print("\nEnter new institute name: ");
        String newInstituteName = sc.nextLine();

        Course.updateInstituteName(newInstituteName);

        // Display details after updating institute name
        System.out.println("\nAfter updating institute name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        sc.close();
    }
}
