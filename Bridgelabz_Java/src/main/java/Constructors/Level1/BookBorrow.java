
package Constructors.Level1;

import java.util.Scanner;

/*
Library Book System:
Create a Book class with attributes title, author, price, and availability.
Implement a method to borrow a book.
*/

public class BookBorrow {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Parameterized constructor
    public BookBorrow(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, this book is not available.");
        }
    }

    // Method to display book details
    public void showDetails() {
        System.out.println("\n----- Book Details -----");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Enter book price: ");
        double price = sc.nextDouble();

        System.out.print("Is the book available? (true/false): ");
        boolean availability = sc.nextBoolean();

        // Create object
        BookBorrow book1 = new BookBorrow(title, author, price, availability);

        book1.showDetails();

        // Borrow the book
        book1.borrowBook();

        // Display updated details
        book1.showDetails();

        sc.close();
    }
}

