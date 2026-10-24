
package Constructors.Level3;

/*
Create a Student class with:
rollNumber (public).
name (protected).
CGPA (private).

Write methods to:
Access and modify CGPA using public methods.
Create a subclass PostgraduateStudent to demonstrate
the use of protected members.
*/

import java.util.Scanner;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Parameterized constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access private CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify private CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("CGPA must be between 0 and 10.");
        }
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double CGPA = sc.nextDouble();

        // Create Student object
        Student student = new Student(rollNumber, name, CGPA);

        System.out.println("\nStudent Details:");
        student.displayStudentDetails();

        System.out.print("\nEnter updated CGPA: ");
        double updatedCGPA = sc.nextDouble();

        student.setCGPA(updatedCGPA);

        System.out.println("\nUpdated Student Details:");
        student.displayStudentDetails();

        // Create PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Rahul", 9.0);

        System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();

        sc.close();
    }
}

// Subclass to demonstrate protected access
class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayPostgraduateDetails() {
        // Protected name is accessible in the subclass
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);

        // Private CGPA is accessed through the public getter
        System.out.println("CGPA: " + getCGPA());
    }
}

