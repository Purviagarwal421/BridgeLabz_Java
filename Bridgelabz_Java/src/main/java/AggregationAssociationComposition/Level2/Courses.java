
package AggregationAssociationComposition.Level2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Problem: University System (Association and Aggregation)

Description:
Model a university system with Students, Professor, and Courses.
Students enroll in courses, and professors teach courses.

Tasks:
1. Define Students, Professor, and Courses classes.
2. Students enroll in courses using enrollCourse().
3. Professors are assigned to courses using assignProfessor().
4. Demonstrate communication and relationships among the objects.

Goal:
Use association and aggregation to create a university system
that emphasizes relationships and interactions among students,
professors, and courses.
*/

// Students class
class Students {

    private String studentName;
    private int studentID;
    private ArrayList<Courses> courses;

    // Constructor
    public Students(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    // Enroll student in a course
    public void enrollCourse(Courses course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);

            System.out.println(studentName + " enrolled in "
                    + course.getCourseName());
        } else {
            System.out.println(studentName + " is already enrolled in "
                    + course.getCourseName());
        }
    }

    // Display student details
    public void displayStudentDetails() {
        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Courses:");

        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
            return;
        }

        for (Courses course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    public String getStudentName() {
        return studentName;
    }
}

// Professor class
class Professor {

    private String professorName;
    private String specialization;

    // Constructor
    public Professor(String professorName, String specialization) {
        this.professorName = professorName;
        this.specialization = specialization;
    }

    // Assign professor to a course
    public void assignProfessor(Courses course) {
        course.setProfessor(this);

        System.out.println(professorName + " is assigned to teach "
                + course.getCourseName());
    }

    // Display professor details
    public void displayProfessorDetails() {
        System.out.println("\nProfessor Name: " + professorName);
        System.out.println("Specialization: " + specialization);
    }

    public String getProfessorName() {
        return professorName;
    }
}

// Courses class
public class Courses {

    private String courseName;
    private ArrayList<Students> students;
    private Professor professor;

    // Constructor
    public Courses(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.professor = null;
    }

    // Add student to course
    public void addStudent(Students student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Assign professor to course
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("\n----- Course Details -----");
        System.out.println("Course Name: " + courseName);

        if (professor != null) {
            System.out.println("Professor: "
                    + professor.getProfessorName());
        } else {
            System.out.println("No professor assigned.");
        }

        System.out.println("Enrolled Students:");

        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (Students student : students) {
                System.out.println(student.getStudentName());
            }
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create courses independently
        System.out.print("Enter first course name: ");
        String courseName1 = sc.nextLine();

        Courses course1 = new Courses(courseName1);

        System.out.print("Enter second course name: ");
        String courseName2 = sc.nextLine();

        Courses course2 = new Courses(courseName2);

        // Create Student 1
        System.out.println("\nEnter Student 1 details:");

        System.out.print("Student ID: ");
        int studentID1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Student Name: ");
        String studentName1 = sc.nextLine();

        Students student1 = new Students(studentName1, studentID1);

        // Create Student 2
        System.out.println("\nEnter Student 2 details:");

        System.out.print("Student ID: ");
        int studentID2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Student Name: ");
        String studentName2 = sc.nextLine();

        Students student2 = new Students(studentName2, studentID2);

        // Create Professor 1
        System.out.println("\nEnter Professor 1 details:");

        System.out.print("Professor Name: ");
        String professorName1 = sc.nextLine();

        System.out.print("Specialization: ");
        String specialization1 = sc.nextLine();

        Professor professor1 =
                new Professor(professorName1, specialization1);

        // Create Professor 2
        System.out.println("\nEnter Professor 2 details:");

        System.out.print("Professor Name: ");
        String professorName2 = sc.nextLine();

        System.out.print("Specialization: ");
        String specialization2 = sc.nextLine();

        Professor professor2 =
                new Professor(professorName2, specialization2);

        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Assign professors to courses
        professor1.assignProfessor(course1);
        professor2.assignProfessor(course2);

        // Display student details
        System.out.println("\n===== Student Details =====");
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Display professor details
        System.out.println("\n===== Professor Details =====");
        professor1.displayProfessorDetails();
        professor2.displayProfessorDetails();

        // Display course details
        System.out.println("\n===== Course Details =====");
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        sc.close();
    }
}
