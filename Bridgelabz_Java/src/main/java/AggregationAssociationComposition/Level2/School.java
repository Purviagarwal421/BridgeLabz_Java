
package AggregationAssociationComposition.Level2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Problem 1: School and Students with Courses (Association and Aggregation)

Description:
Model a School with multiple Student objects, where each student
can enroll in multiple courses, and each course can have multiple
students.

Tasks:
1. Define School, Student, and Course classes.
2. Model an association between Student and Course to show that
   students can enroll in multiple courses.
3. Model an aggregation relationship between School and Student.
4. Demonstrate how a student can view the courses they are enrolled
   in and how a course can show its enrolled students.

Goal:
Practice association by modeling many-to-many relationships
between students and courses.
*/

// Student class
class Student {

    private String studentName;
    private int studentID;
    private ArrayList<Course> courses;

    // Constructor
    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    // Enroll student in a course
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    // Display student details and enrolled courses
    public void displayStudentDetails() {
        System.out.println("\nStudent ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Enrolled Courses:");

        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
            return;
        }

        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    public String getStudentName() {
        return studentName;
    }
}

// Course class
class Course {

    private String courseName;
    private ArrayList<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Add student to course
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display students enrolled in the course
    public void displayEnrolledStudents() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Enrolled Students:");

        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }

        for (Student student : students) {
            System.out.println(student.getStudentName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// School class
public class School {

    private String schoolName;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Add an existing student to the school (Aggregation)
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Add an existing course to the school
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    // Display all students in the school
    public void displaySchoolStudents() {
        System.out.println("\nSchool: " + schoolName);
        System.out.println("Students:");

        for (Student student : students) {
            System.out.println(student.getStudentName());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create the school
        System.out.print("Enter school name: ");
        String schoolName = sc.nextLine();

        School school = new School(schoolName);

        // Create courses independently
        System.out.print("Enter first course name: ");
        String courseName1 = sc.nextLine();
        Course course1 = new Course(courseName1);

        System.out.print("Enter second course name: ");
        String courseName2 = sc.nextLine();
        Course course2 = new Course(courseName2);

        school.addCourse(course1);
        school.addCourse(course2);

        // Create Student 1 independently
        System.out.println("\nEnter details for Student 1:");

        System.out.print("Student ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Student Name: ");
        String name1 = sc.nextLine();

        Student student1 = new Student(name1, id1);
        school.addStudent(student1);

        // Create Student 2 independently
        System.out.println("\nEnter details for Student 2:");

        System.out.print("Student ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Student Name: ");
        String name2 = sc.nextLine();

        Student student2 = new Student(name2, id2);
        school.addStudent(student2);

        // Enroll students in multiple courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course1);

        // Display school students
        school.displaySchoolStudents();

        // Display each student's enrolled courses
        System.out.println("\n===== Student Details =====");
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Display students enrolled in each course
        System.out.println("\n===== Course Details =====");
        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();

        sc.close();
    }
}
