
package StaticThisFinal.Level1;

import java.util.Scanner;

/*
Create a Patient class with the following features:
1. Static:
   - A static variable hospitalName shared among all patients.
   - A static method getTotalPatients() to count the total patients admitted.
2. This:
   - Use this to initialize name, age, and ailment in the constructor.
3. Final:
   - Use a final variable patientID to uniquely identify each patient.
4. Instanceof:
   - Check if an object is an instance of the Patient class before displaying its details.
*/

public class Patient {

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    // Constructor using this
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        totalPatients++;
    }

    // Static method to get total patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Display patient details
    public void displayDetails() {
        System.out.println("\n----- Patient Details -----");
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Patient 1:");

        System.out.print("Patient ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name1 = sc.nextLine();

        System.out.print("Age: ");
        int age1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Ailment: ");
        String ailment1 = sc.nextLine();

        Patient patient1 = new Patient(name1, age1, ailment1, id1);

        System.out.println("\nEnter details for Patient 2:");

        System.out.print("Patient ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name2 = sc.nextLine();

        System.out.print("Age: ");
        int age2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Ailment: ");
        String ailment2 = sc.nextLine();

        Patient patient2 = new Patient(name2, age2, ailment2, id2);

        // Display total patients
        System.out.println("\nTotal Patients Admitted: " + Patient.getTotalPatients());

        // Check using instanceof before displaying details
        Object obj = patient1;

        if (obj instanceof Patient) {
            ((Patient) obj).displayDetails();
        } else {
            System.out.println("Object is not a Patient.");
        }

        Object obj2 = patient2;

        if (obj2 instanceof Patient) {
            ((Patient) obj2).displayDetails();
        } else {
            System.out.println("Object is not a Patient.");
        }

        sc.close();
    }
}
