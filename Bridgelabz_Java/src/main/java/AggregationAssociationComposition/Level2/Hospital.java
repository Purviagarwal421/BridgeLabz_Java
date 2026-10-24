
package AggregationAssociationComposition.Level2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Problem: Hospital, Doctors, and Patients (Association)

Description:
Model a Hospital where Doctor and Patient objects interact
through consultations. A doctor can see multiple patients,
and each patient can consult multiple doctors.

Tasks:
1. Define a Hospital class containing Doctor and Patient classes.
2. Create a method consult() in the Doctor class to show
   communication between a doctor and a patient.
3. Model an association between doctors and patients to show
   that doctors and patients can have multiple relationships.

Goal:
Practice creating an association with communication between
objects by modeling doctor-patient consultations.
*/

// Doctor class
class Doctor {

    private String doctorName;
    private String specialization;
    private ArrayList<Patient> patients;

    // Constructor
    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Method to consult a patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }

        patient.addDoctor(this);

        System.out.println(doctorName + " is consulting "
                + patient.getPatientName() + ".");
    }

    // Display doctor details and patients
    public void displayDoctorDetails() {
        System.out.println("\nDoctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
        System.out.println("Patients:");

        if (patients.isEmpty()) {
            System.out.println("No patients consulted.");
            return;
        }

        for (Patient patient : patients) {
            System.out.println(patient.getPatientName());
        }
    }

    public String getDoctorName() {
        return doctorName;
    }
}

// Patient class
class Patient {

    private String patientName;
    private int patientID;
    private ArrayList<Doctor> doctors;

    // Constructor
    public Patient(String patientName, int patientID) {
        this.patientName = patientName;
        this.patientID = patientID;
        this.doctors = new ArrayList<>();
    }

    // Add a doctor to the patient's consultation list
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Display patient details and doctors
    public void displayPatientDetails() {
        System.out.println("\nPatient ID: " + patientID);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Consulted Doctors:");

        if (doctors.isEmpty()) {
            System.out.println("No doctors consulted.");
            return;
        }

        for (Doctor doctor : doctors) {
            System.out.println(doctor.getDoctorName());
        }
    }

    public String getPatientName() {
        return patientName;
    }
}

// Hospital class
public class Hospital {

    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add an existing doctor to the hospital
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Add an existing patient to the hospital
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Display hospital details
    public void displayHospitalDetails() {
        System.out.println("\n===== " + hospitalName + " =====");

        System.out.println("\nHospital Doctors:");
        for (Doctor doctor : doctors) {
            doctor.displayDoctorDetails();
        }

        System.out.println("\nHospital Patients:");
        for (Patient patient : patients) {
            patient.displayPatientDetails();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create hospital
        System.out.print("Enter hospital name: ");
        String hospitalName = sc.nextLine();

        Hospital hospital = new Hospital(hospitalName);

        // Create Doctor 1
        System.out.println("\nEnter Doctor 1 details:");

        System.out.print("Doctor name: ");
        String doctorName1 = sc.nextLine();

        System.out.print("Specialization: ");
        String specialization1 = sc.nextLine();

        Doctor doctor1 = new Doctor(doctorName1, specialization1);

        // Create Doctor 2
        System.out.println("\nEnter Doctor 2 details:");

        System.out.print("Doctor name: ");
        String doctorName2 = sc.nextLine();

        System.out.print("Specialization: ");
        String specialization2 = sc.nextLine();

        Doctor doctor2 = new Doctor(doctorName2, specialization2);

        // Create Patient 1
        System.out.println("\nEnter Patient 1 details:");

        System.out.print("Patient ID: ");
        int patientID1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Patient name: ");
        String patientName1 = sc.nextLine();

        Patient patient1 = new Patient(patientName1, patientID1);

        // Create Patient 2
        System.out.println("\nEnter Patient 2 details:");

        System.out.print("Patient ID: ");
        int patientID2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Patient name: ");
        String patientName2 = sc.nextLine();

        Patient patient2 = new Patient(patientName2, patientID2);

        // Add doctors and patients to hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Create consultations (many-to-many association)
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display all details
        hospital.displayHospitalDetails();

        sc.close();
    }
}
