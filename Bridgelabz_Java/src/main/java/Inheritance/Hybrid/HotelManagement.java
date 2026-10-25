
package Inheritance.Hybrid;
/*
Description:
Person is the superclass, and Chef and Waiter are subclasses.
Both Chef and Waiter implement the Worker interface.

Tasks:
1. Define Person with name and id.
2. Create a Worker interface with performDuties().
3. Create Chef and Waiter classes that extend Person and
   implement Worker.
4. Provide unique implementations of performDuties().

Goal:
Demonstrate hybrid inheritance using a class hierarchy
and an interface.
*/

// Interface defines a contract for restaurant workers
interface Worker {
    void performDuties();
    // Default method with a common implementation
    default void showRole() {
        System.out.println("Role: Restaurant Worker");
    }
}

// Superclass containing common attributes
class Person {
    String name;
    int id;

    // Constructor to initialize common details
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Displays common person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Chef inherits Person and implements Worker
class Chef extends Person implements Worker {
    String specialty;

    // Constructor initializes parent and chef-specific attributes
    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Provides the chef's specific duties
    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        displayDetails();
        System.out.println("Specialty: " + specialty);
        System.out.println("Duty: Preparing and cooking food.");
    }
}

// Waiter inherits Person and implements Worker
class Waiter extends Person implements Worker {
    int tableCount;

    // Constructor initializes parent and waiter-specific attributes
    Waiter(String name, int id, int tableCount) {
        super(name, id);
        this.tableCount = tableCount;
    }

    // Provides the waiter's specific duties
    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        displayDetails();
        System.out.println("Tables Assigned: " + tableCount);
        System.out.println("Duty: Taking orders and serving food.");
    }
}

public class HotelManagement {
    public static void main(String[] args) {

        // Create objects of both worker types
        Chef chef = new Chef("Rahul", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("Priya", 102, 5);

        // Call the methods implemented by each worker
        chef.performDuties();
        System.out.println();

        waiter.performDuties();
    }
}
