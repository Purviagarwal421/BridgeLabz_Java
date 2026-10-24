
package AggregationAssociationComposition.Level1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Problem 1: Library and Books (Aggregation)

Description:
Create a Library class that contains multiple Book objects.
A library can have many books, but a book can exist independently
outside a specific library.

Tasks:
1. Define a Library class with an ArrayList of Book objects.
2. Define a Book class with attributes such as title and author.
3. Demonstrate aggregation by creating books and adding them
   to different libraries.

Goal:
Understand aggregation by modeling a real-world relationship
where the Library aggregates Book objects.
*/

// Book class
class Book {

    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Library class
public class Library {

    private String libraryName;
    private ArrayList<Book> books;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add an existing Book object
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display library details
    public void displayLibraryDetails() {
        System.out.println("\nLibrary Name: " + libraryName);
        System.out.println("Books in the library:");

        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println();
                book.displayBookDetails();
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input for Book 1
        System.out.println("Enter details for Book 1:");

        System.out.print("Enter title: ");
        String title1 = sc.nextLine();

        System.out.print("Enter author: ");
        String author1 = sc.nextLine();

        Book book1 = new Book(title1, author1);

        // Input for Book 2
        System.out.println("\nEnter details for Book 2:");

        System.out.print("Enter title: ");
        String title2 = sc.nextLine();

        System.out.print("Enter author: ");
        String author2 = sc.nextLine();

        Book book2 = new Book(title2, author2);

        // Create two libraries
        Library library1 = new Library("Central Library");
        Library library2 = new Library("Community Library");

        // Add books to different libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book1);

        // Display library details
        library1.displayLibraryDetails();
        library2.displayLibraryDetails();

        // Demonstrate independent existence of Book
        System.out.println("\nBook exists independently:");
        book1.displayBookDetails();

        sc.close();
    }
}
