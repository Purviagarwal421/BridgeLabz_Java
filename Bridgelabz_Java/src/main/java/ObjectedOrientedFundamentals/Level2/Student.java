package ObjectedOrientedFundamentals.Level2;
/*
Problem Statement: Create a Student class with attributes name, rollNumber, and marks. Add two methods:
To calculate the grade based on the marks.
To display the student's details and grade.
Explanation: The Student class organizes all relevant details about a student as attributes. Methods are used to calculate the grade and provide a way to display all information.

 */

import java.util.Scanner;

public class Student {
    private String name;
    private String rollNo;
    private float marks;
    // methods for getter and setters
    // methods for getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(float marks) {
        if(marks<0){
            marks=0.0f;
            return;
        }
        this.marks = marks;
    }

    public String getName() {
        return name;
    }
    public String getRollNo() {
        return rollNo;
    }

    public float getMarks() {
        return marks;
    }
    // method to calculate grade
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else if (marks >= 40) {
            return "E";
        } else {
            return "F";
        }
    }
    //method to display details
    public void showDetails(){
        System.out.println("Student Name: "+getName());
        System.out.println("Student RollNumber: "+getRollNo());
        System.out.println("Student RollNumber: "+getMarks());
        System.out.println("Grade: "+calculateGrade());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        student1.setName(name);

        System.out.print("Enter roll number: ");
        String rollNo = sc.nextLine();
        student1.setRollNo(rollNo);

        System.out.print("Enter marks: ");
        float marks = sc.nextFloat();
        student1.setMarks(marks);

        student1.showDetails();
    }

}
