
package ObjectOrientedProgramming.CompositionAggregation;

import java.util.ArrayList;
import java.util.Scanner;

/*
Problem 2: University, Departments, and Faculty
(Composition and Aggregation)

Description:
Create a University with multiple Faculty members and Department
objects. The University and its Departments have a composition
relationship, while Faculty members have an aggregation
relationship with Departments.

Tasks:
1. Define University, Department, and Faculty classes.
2. Demonstrate how deleting a University also removes its Departments.
3. Show that Faculty members can exist independently of a Department.

Goal:
Understand the differences between composition and aggregation
in modeling complex hierarchical relationships.
*/

// Faculty class
class Faculty {

    private String facultyName;
    private String specialization;

    // Constructor
    public Faculty(String facultyName, String specialization) {
        this.facultyName = facultyName;
        this.specialization = specialization;
    }

    // Method to display faculty details
    public void displayFacultyDetails() {
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Specialization: " + specialization);
    }

    public String getFacultyName() {
        return facultyName;
    }
}

// Department class
class Department {

    private String departmentName;
    private ArrayList<Faculty> facultyMembers;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    // Add an existing Faculty object (Aggregation)
    public void addFaculty(Faculty faculty) {
        if (!facultyMembers.contains(faculty)) {
            facultyMembers.add(faculty);
        }
    }

    // Display department and faculty details
    public void displayDepartmentDetails() {
        System.out.println("\nDepartment: " + departmentName);

        if (facultyMembers.isEmpty()) {
            System.out.println("No faculty members assigned.");
            return;
        }

        System.out.println("Faculty Members:");

        for (Faculty faculty : facultyMembers) {
            faculty.displayFacultyDetails();
            System.out.println();
        }
    }
}

// University class
public class University {

    private String universityName;
    private ArrayList<Department> departments;

    // Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
    }

    // Create a department inside the University (Composition)
    public Department addDepartment(String departmentName) {
        Department department = new Department(departmentName);
        departments.add(department);
        return department;
    }

    // Display university details
    public void displayUniversityDetails() {
        System.out.println("\nUniversity: " + universityName);

        if (departments.isEmpty()) {
            System.out.println("No departments available.");
            return;
        }

        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
    }

    // Remove all departments owned by this University
    public void deleteUniversity() {
        departments.clear();
        universityName = null;

        System.out.println(
                "\nUniversity deleted. All its departments have been removed.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create University
        System.out.print("Enter university name: ");
        String universityName = sc.nextLine();

        University university = new University(universityName);

        // Create departments through the University
        System.out.print("\nEnter first department name: ");
        String departmentName1 = sc.nextLine();

        Department department1 =
                university.addDepartment(departmentName1);

        System.out.print("Enter second department name: ");
        String departmentName2 = sc.nextLine();

        Department department2 =
                university.addDepartment(departmentName2);

        // Create faculty independently of departments
        System.out.println("\nEnter Faculty 1 details:");

        System.out.print("Faculty name: ");
        String facultyName1 = sc.nextLine();

        System.out.print("Specialization: ");
        String specialization1 = sc.nextLine();

        Faculty faculty1 =
                new Faculty(facultyName1, specialization1);

        System.out.println("\nEnter Faculty 2 details:");

        System.out.print("Faculty name: ");
        String facultyName2 = sc.nextLine();

        System.out.print("Specialization: ");
        String specialization2 = sc.nextLine();

        Faculty faculty2 =
                new Faculty(facultyName2, specialization2);

        // Assign existing faculty to departments (Aggregation)
        department1.addFaculty(faculty1);
        department2.addFaculty(faculty2);

        // Display university details
        System.out.println("\n===== University Details =====");
        university.displayUniversityDetails();

        // Demonstrate that Faculty can exist independently
        System.out.println("\n===== Independent Faculty =====");
        faculty1.displayFacultyDetails();

        // Ask whether to delete the university
        System.out.print("\nDelete the university? (yes/no): ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            university.deleteUniversity();

            System.out.println("\n===== After Deletion =====");
            university.displayUniversityDetails();

            System.out.println("\nFaculty still exists independently:");
            faculty1.displayFacultyDetails();
        }

        sc.close();
    }
}
