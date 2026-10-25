package Inheritance.SingleInheritance;

/*
Sample Problem 1: Library Management with Books and Authors

Description:
Model a Book system where Book is the superclass, and Author is a subclass.

Tasks:
1. Define a superclass Book with attributes title and publicationYear.
2. Define a subclass Author with additional attributes name and bio.
3. Create a method displayInfo() to show details of the book and its author.

Goal:
Practice single inheritance by extending the base class and adding
more specific details in the subclass.
*/

class Book {

    // Common attributes of a book
    protected String title;
    protected int publicationYear;

    // Constructor to initialize book details
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display general book information
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Author inherits the properties and methods of Book
class Author extends Book {

    // Additional attributes for Author
    private String name;
    private String bio;

    // Constructor to initialize book and author details
    public Author(String title, int publicationYear, String name, String bio) {

        // Call the parent class constructor
        super(title, publicationYear);

        this.name = name;
        this.bio = bio;
    }

    // Override the parent method to display book and author details
    @Override
    public void displayInfo() {
        System.out.println("\n--- Book and Author Details ---");

        // Display inherited book details
        super.displayInfo();

        // Display author-specific details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object with book and author details
        Author author = new Author("The Alchemist", 1988, "Paulo Coelho", "Brazilian novelist known for philosophical fiction.");
        // Call the overridden method to display all details
        author.displayInfo();
    }
}

