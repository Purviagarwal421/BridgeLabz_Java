package PillarsOops;

/*
Description: Develop a library management system:
- Use an abstract class LibraryItem with fields like itemId, title, and author.
- Add an abstract method getLoanDuration() and a concrete method getItemDetails().
- Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
- Implement an interface Reservable with methods reserveItem() and checkAvailability().
- Apply encapsulation to secure details like the borrower's personal data.
- Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/

import java.util.ArrayList;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}

class Book extends LibraryItem implements Reservable {
    private boolean available;
    private String borrowerName;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
        this.borrowerName = null;
    }

    @Override
    public int getLoanDuration() {
        return 14;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available;
    private String borrowerName;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
        this.borrowerName = null;
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available;
    private String borrowerName;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
        this.available = true;
        this.borrowerName = null;
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (checkAvailability()) {
            this.borrowerName = borrowerName;
            available = false;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return available;
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<>();

        Book book = new Book(101, "Java Programming", "James Gosling");
        Magazine magazine = new Magazine(102, "Tech Today", "Editorial Team");
        DVD dvd = new DVD(103, "Java Tutorials", "Training Team");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        for (LibraryItem item : items) {
            item.getItemDetails();

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;

                System.out.println("Available: "
                        + reservable.checkAvailability());

                reservable.reserveItem("Rahul");

                System.out.println("Available after reservation: "
                        + reservable.checkAvailability());
            }

            System.out.println("----------------------");
        }
    }
}