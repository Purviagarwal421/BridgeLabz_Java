
package Constructors.Level3;

import java.util.Scanner;

/*
Design a Book class with:
ISBN (public).
title (protected).
author (private).

Write methods to:
Set and get the author name.
Create a subclass EBook to access ISBN and title
and demonstrate access modifiers.
*/

public class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Parameterized constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        String ISBN = sc.nextLine();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        // Create Book object
        Book book = new Book(ISBN, title, author);

        System.out.println("\nBook Details:");
        book.displayBookDetails();

        // Modify author using setter
        System.out.print("\nEnter updated author name: ");
        String updatedAuthor = sc.nextLine();

        book.setAuthor(updatedAuthor);

        System.out.println("\nUpdated Book Details:");
        book.displayBookDetails();

        // Create EBook object
        EBook ebook = new EBook("978-12345", "Java Programming", "James");

        System.out.println("\nEBook Details:");
        ebook.displayEBookDetails();

        sc.close();
    }
}

// Subclass to demonstrate access modifiers
class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        // Public member: accessible in subclass
        System.out.println("ISBN: " + ISBN);

        // Protected member: accessible in subclass
        System.out.println("Title: " + title);

        // Private member: access through public getter
        System.out.println("Author: " + getAuthor());
    }
}
