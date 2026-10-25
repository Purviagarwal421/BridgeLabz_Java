
package Inheritance.Hierarchical;

/*
Description:
Create a hierarchy for a school system where Person is the superclass,
and Teacher, Student, and Staff are subclasses.

Tasks:
1. Define Person with common attributes name and age.
2. Define Teacher, Student, and Staff with specific attributes.
3. Implement displayRole() in each subclass.

Goal:
Demonstrate hierarchical inheritance.
*/

class Person {
    String name;
    int age;

    // Constructor to initialize common attributes
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    // Constructor initializes Person attributes and subject
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Displays the teacher's role and details
    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    char grade;

    // Constructor initializes Person attributes and grade
    Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    // Displays the student's role and details
    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String shift;

    // Constructor initializes Person attributes and shift
    Staff(String name, int age, String shift) {
        super(name, age);
        this.shift = shift;
    }
    // Displays the staff member's role and details
    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Shift: " + shift);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {

        // Create objects using the respective constructors
        Teacher teacher = new Teacher("Anita", 35, "Mathematics");
        Student student = new Student("Rahul", 16, 'A');
        Staff staff = new Staff("Priya", 40, "Morning");

        // Display the details of each role
        teacher.displayRole();
        System.out.println();

        student.displayRole();
        System.out.println();

        staff.displayRole();
    }
}
