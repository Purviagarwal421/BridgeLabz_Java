package LinkedList.Single;

import java.util.Scanner;

class Student{
    int rollNumber;
    String name;
    int age;
    char grade;
    Student(int rollNumber, String name, int age, char grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    void showDetails(){
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
class Node{
    Student student;
    Node next;
    Node(int rollNumber,String name,int age,char grade){
        this.student =new Student(rollNumber,name,age,grade);
        this.next=null;
    }
}

public class StudentRecordManagement {
    private Node head;
    void insertAtBeginning(int rollNumber, String name, int age, char grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }
    void insertAtEnd(int rollNumber, String name, int age, char grade) {
        Node newNode = new Node(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    void insertAtPosition(int rollNumber, String name, int age, char grade, int position){
        if (position < 0) {
            return;
        }
        Node newNode=new Node(rollNumber, name, age, grade);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currentNode = head;
        int index = 0;

        while (currentNode != null && index < position - 1) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;

    }
    void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node prevNode = null;
        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.student.rollNumber == rollNumber) {

                if (prevNode == null) {
                    head = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;,
                }

                System.out.println("Student deleted successfully.");
                return;
            }

            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        System.out.println("Student not found.");
    }
    void searchByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("Student list is empty.");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.student.rollNumber == rollNumber) {
                System.out.println("Student found!");
                currentNode.student.showDetails();
                return;
            }

            currentNode = currentNode.next;
        }

        System.out.println("Student not found.");
    }
    void displayStudents() {
        if (head == null) {
            System.out.println("Student list is empty.");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            currentNode.student.showDetails();
            System.out.println("--------------------");

            currentNode = currentNode.next;
        }
    }
    void updateGrade(int rollNumber, char newGrade) {
        if (head == null) {
            System.out.println("Student list is empty.");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.student.rollNumber == rollNumber) {
                currentNode.student.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }

            currentNode = currentNode.next;
        }

        System.out.println("Student not found.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentRecordManagement list = new StudentRecordManagement();

        int choice;

        do {
            System.out.println("\n===== Student Record Management =====");
            System.out.println("1. Add student at beginning");
            System.out.println("2. Add student at end");
            System.out.println("3. Add student at a position");
            System.out.println("4. Delete student by roll number");
            System.out.println("5. Search student by roll number");
            System.out.println("6. Display all students");
            System.out.println("7. Update student grade");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3: {
                    System.out.print("Enter roll number: ");
                    int rollNumber = sc.nextInt();

                    sc.nextLine(); // Consume newline

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter grade: ");
                    char grade = sc.next().charAt(0);

                    if (choice == 1) {
                        list.insertAtBeginning(
                                rollNumber, name, age, grade
                        );
                    } else if (choice == 2) {
                        list.insertAtEnd(
                                rollNumber, name, age, grade
                        );
                    } else {
                        System.out.print("Enter position (0-based): ");
                        int position = sc.nextInt();

                        list.insertAtPosition(
                                rollNumber, name, age, grade, position
                        );
                    }
                    break;
                }

                case 4:
                    System.out.print("Enter roll number to delete: ");
                    list.deleteByRollNumber(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Enter roll number to search: ");
                    list.searchByRollNumber(sc.nextInt());
                    break;

                case 6:
                    list.displayStudents();
                    break;

                case 7:
                    System.out.print("Enter roll number: ");
                    int roll = sc.nextInt();

                    System.out.print("Enter new grade: ");
                    char newGrade = sc.next().charAt(0);

                    list.updateGrade(roll, newGrade);
                    break;

                case 0:
                    System.out.println("Exiting Student Record Management.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }


}
