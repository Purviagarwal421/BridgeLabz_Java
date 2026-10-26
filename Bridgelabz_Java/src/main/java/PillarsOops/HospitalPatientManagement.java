package PillarsOops;

/*
Description: Design a system to manage patients in a hospital:
- Create an abstract class Patient with fields like patientId, name, and age.
- Add an abstract method calculateBill() and a concrete method getPatientDetails().
- Create subclasses InPatient and OutPatient with different billing logic.
- Implement an interface MedicalRecord with methods addRecord() and viewRecords().
- Use encapsulation to protect sensitive patient data like diagnosis and medical history.
- Use polymorphism to handle different patient types and display billing details dynamically.
*/

import java.util.ArrayList;

interface MedicalRecord {
    void addRecord(String diagnosis, String medicalHistory);

    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Bill: " + calculateBill());
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomCharge;
    private double treatmentCharge;
    private String diagnosis;
    private String medicalHistory;

    public InPatient(int patientId, String name, int age,
                     int daysAdmitted, double roomCharge,
                     double treatmentCharge) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomCharge = roomCharge;
        this.treatmentCharge = treatmentCharge;
    }

    @Override
    public double calculateBill() {
        return (daysAdmitted * roomCharge) + treatmentCharge;
    }

    @Override
    public void addRecord(String diagnosis, String medicalHistory) {
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medical History: " + medicalHistory);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private double testCharges;
    private String diagnosis;
    private String medicalHistory;

    public OutPatient(int patientId, String name, int age,
                      double consultationFee, double testCharges) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.testCharges = testCharges;
    }

    @Override
    public double calculateBill() {
        return consultationFee + testCharges;
    }

    @Override
    public void addRecord(String diagnosis, String medicalHistory) {
        this.diagnosis = diagnosis;
        this.medicalHistory = medicalHistory;
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medical History: " + medicalHistory);
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        ArrayList<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient(
                101, "Aarav", 45, 3, 2000, 5000);

        OutPatient p2 = new OutPatient(
                102, "Priya", 28, 800, 1200);

        p1.addRecord("Recovery after surgery", "No known allergies");
        p2.addRecord("Seasonal fever", "Previous viral infection");

        patients.add(p1);
        patients.add(p2);

        for (Patient patient : patients) {
            patient.getPatientDetails();

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.viewRecords();
            }

            System.out.println("----------------------");
        }
    }
}