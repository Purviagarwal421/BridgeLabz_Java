package ObjectedOrientedFundamentals.Level2;
/*
Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
Book a ticket (assign seat and update price).
Display ticket details.
Explanation: The MovieTicket class organizes ticket information with attributes.
The methods handle booking logic and display ticket details.

 */

import java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    static String seatNo;
    // methods for getters and setters
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMovieName() {
        return movieName;
    }
    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }
    // method to book a ticket
    public void bookTicket(String movieName, String seatNumber, double price) {
        if (seatNumber == null || seatNumber.trim().isEmpty()) {
            System.out.println("Invalid seat number.");
            return;
        }

        if (price <= 0) {
            System.out.println("Ticket price must be positive.");
            return;
        }

        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }
    // method to display it
    public void showDetails() {
        System.out.println("Movie Name: " + getMovieName());
        System.out.println("Seat Number: " + getSeatNumber());
        System.out.println("Ticket Price: " + getPrice());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MovieTicket ticket1 = new MovieTicket();

        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter seat number: ");
        String seatNumber = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        ticket1.bookTicket(movieName, seatNumber, price);

        if (ticket1.getMovieName() != null) {
            ticket1.showDetails();
        }

        sc.close();
    }


}
