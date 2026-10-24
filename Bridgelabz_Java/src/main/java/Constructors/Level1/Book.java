package Constructors.Level1;

import java.util.Scanner;

/*
Create a Book class with attributes title, author, and price.
Provide both default and parameterized constructors.


 */
public class Book {
    private String title;
    private String  author;
    private double price;
    // default constructor
    public Book(){
        title="";
        author="";
        price=0.0;
    }
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    // method for getters
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
        // to take inputs and display it
        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Enter book price: ");
        double price = sc.nextDouble();

        // to create an object
        Book book1 = new Book(title,author,price);
        book1.showDetails();

        sc.close();
    }




}
