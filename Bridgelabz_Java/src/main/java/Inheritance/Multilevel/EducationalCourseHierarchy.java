package Inheritance.Multilevel;
/*
Sample Problem 2: Educational Course Hierarchy
Description:
Model a course system where Course is the base class,
OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.

Tasks:
1. Define a superclass Course with attributes courseName and duration.
2. Define OnlineCourse with additional attributes platform and isRecorded.
3. Define PaidOnlineCourse with additional attributes fee and discount.

Goal:
Demonstrate how each level of inheritance builds on the previous
level by adding more specific attributes.
*/

class Course {

    // Common attributes shared by all courses
    protected String courseName;
    protected int duration;

    // Constructor to initialize common course details
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display general course information
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
    }
}

// OnlineCourse inherits common attributes from Course
class OnlineCourse extends Course {

    // Additional attributes for online courses
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {

        // Initialize the parent class attributes
        super(courseName, duration);

        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override the method to display online course details
    @Override
    public void displayDetails() {
        System.out.println("\n--- Online Course Details ---");

        // Reuse the parent class method
        super.displayDetails();

        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

// PaidOnlineCourse inherits from OnlineCourse, which inherits from Course
class PaidOnlineCourse extends OnlineCourse {

    // Additional attributes for paid online courses
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {

        // Initialize Course and OnlineCourse attributes
        super(courseName, duration, platform, isRecorded);

        this.fee = fee;
        this.discount = discount;
    }

    // Override the method to display paid course details
    @Override
    public void displayDetails() {
        System.out.println("\n--- Paid Online Course Details ---");

        // Display course and online-specific details
        super.displayDetails();

        System.out.println("Fee: Rs. " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: Rs. " + (fee - (fee * discount / 100)));
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {

        // Create a general Course object
        Course course = new Course("Java Basics", 2);

        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Web Development", 4,
                        "Coursera", true);

        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 6,
                        "Udemy", true, 5000, 20);

        // Display details for each course type
        course.displayDetails();
        onlineCourse.displayDetails();
        paidCourse.displayDetails();
    }
}

