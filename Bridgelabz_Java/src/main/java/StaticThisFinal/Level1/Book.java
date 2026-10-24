
package StaticThisFinal.Level1;

/*
Create a Book class to manage library books.
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier
of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class
before displaying its details.
*/

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private final String isbn;

    // Static variable
    private static String libraryName = "Central Library";

    // Parameterized constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Instance method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Input for first book
        System.out.print("Enter first book title: ");
        String title1 = sc.nextLine();

        System.out.print("Enter first book author: ");
        String author1 = sc.nextLine();

        System.out.print("Enter first book ISBN: ");
        String isbn1 = sc.nextLine();

        // Input for second book
        System.out.print("\nEnter second book title: ");
        String title2 = sc.nextLine();

        System.out.print("Enter second book author: ");
        String author2 = sc.nextLine();

        System.out.print("Enter second book ISBN: ");
        String isbn2 = sc.nextLine();

        // Create objects using parameterized constructor
        Book book1 = new Book(title1, author1, isbn1);
        Book book2 = new Book(title2, author2, isbn2);

        // Display shared library name
        Book.displayLibraryName();

        // Check instanceof before displaying details
        Object obj = book1;

        if (obj instanceof Book) {
            System.out.println("\nObject is an instance of Book.");
            ((Book) obj).displayBookDetails();
        } else {
            System.out.println("Object is not an instance of Book.");
        }

        System.out.println("\nSecond Book Details:");
        book2.displayBookDetails();
    }
}
