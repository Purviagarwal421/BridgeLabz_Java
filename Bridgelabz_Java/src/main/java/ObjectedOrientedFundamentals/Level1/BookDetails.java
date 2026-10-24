package ObjectedOrientedFundamentals.Level1;

import java.util.Scanner;

/*
Program to Handle Book Details
Problem Statement: Write a program to create a Book class with attributes title, author
, and price. Add a method to display the book details.

 */
public class BookDetails {
    String title;
    String  author;
    double price;

    // method for getters and setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    // method to display book details
    public void showDetails() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // to create an object
        BookDetails book1 = new BookDetails();

        // to take inputs and display it
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        book1.setTitle(title);

        System.out.print("Enter author name: ");
        String author = sc.nextLine();
        book1.setAuthor(author);

        System.out.print("Enter book price: ");
        double price = sc.nextDouble();
        book1.setPrice(price);

        book1.showDetails();

        sc.close();
    }




}
