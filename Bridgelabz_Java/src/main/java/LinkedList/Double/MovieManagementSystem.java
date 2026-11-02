package LinkedList.Double;

import java.util.Scanner;

class Movie{
    String title;
    String director;
    int  yearOfRelease;
    double rating;
    Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
    }
    void showDetails(){
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Year: " + yearOfRelease);
        System.out.println("Rating: " + rating);
    }
}
class Node{
    Movie movie;
    Node next;
    Node prev;
    Node(String title, String director, int yearOfRelease, double rating) {
        this.movie = new Movie(title, director, yearOfRelease, rating);
        this.next = null;
        this.prev = null;
    }
}
public class MovieManagementSystem {
    private Node head;
    private Node tail;
    public void insertAtBeginning(String title, String director, int yearOfRelease, double rating){
        Node node=new Node(title, director, yearOfRelease, rating);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        node.next=head;
        head.prev=node;
        head=node;
    }
    void insertAtEnd(String title, String director, int yearOfRelease, double rating){
        Node node=new Node(title, director, yearOfRelease, rating);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        node.prev=tail;
        tail.next=node;
        tail=node;
    }
    void insertAtPosition(String title, String director, int yearOfRelease, double rating, int position){
        Node node=new Node(title, director, yearOfRelease, rating);
        if(position<0){
            System.out.println("Invalid position");
            return;
        }
        if(position==0){
            insertAtBeginning(title, director, yearOfRelease, rating);
            return;
        }
        int index=0;
        Node currentNode=head;
        while(currentNode!=null&& index<position-1){
            currentNode=currentNode.next;
            index++;
        }
        if(currentNode==null){
            return;
        }
        if(currentNode==tail){
            insertAtEnd(title, director, yearOfRelease, rating);
            return;
        }
        node.next=currentNode.next;
        currentNode.next.prev=node;
        currentNode.next=node;
        node.prev=currentNode;

    }
    void removeByTitle(String title){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null){
            if(currentNode.movie.title.equalsIgnoreCase(title)){
                if (head == tail) {
                    head = null;
                    tail = null;
                    //return;
                }
                 else if(currentNode==head){
                     head.next.prev=null;
                     head=head.next;
                     //return;
                 }
                 else if(currentNode==tail){
                     currentNode.prev.next=null;
                     tail=currentNode.prev;
                     //return;
                 }
                 else{
                    currentNode.next.prev=currentNode.prev;
                    currentNode.prev.next=currentNode.next;
                }
                System.out.println("Movie removed successfully");
                return;

            }
            currentNode=currentNode.next;
        }
        System.out.println("Movie not found");

    }
    void searchByTitle(String title){
        if (head == null) {
            System.out.println("Movie list is empty");
            return;
        }
        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.movie.title.equalsIgnoreCase(title)) {
                System.out.println("Movie found!");
                currentNode.movie.showDetails();
                return;
            }

            currentNode = currentNode.next;
        }

        System.out.println("Movie not found");
    }
    void displayForward() {
        if (head == null) {
            System.out.println("Movie list is empty");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            currentNode.movie.showDetails();
            System.out.println("--------------------");
            currentNode = currentNode.next;
        }
    }
    void displayBackward() {
        if (tail == null) {
            System.out.println("Movie list is empty");
            return;
        }
        Node currentNode = tail;
        while (currentNode != null) {
            currentNode.movie.showDetails();
            System.out.println("--------------------");
            currentNode = currentNode.prev;
        }
    }
    void updateMovieRating(String title, double newRating) {
        if (head == null) {
            System.out.println("Movie list is empty");
            return;
        }

        if (newRating < 0 || newRating > 10) {
            System.out.println("Rating must be between 0 and 10");
            return;
        }

        Node currentNode = head;

        while (currentNode != null) {
            if (currentNode.movie.title.equalsIgnoreCase(title)) {
                currentNode.movie.rating = newRating;

                System.out.println("Movie rating updated successfully!");
                currentNode.movie.showDetails();
                return;
            }

            currentNode = currentNode.next;
        }

        System.out.println("Movie not found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieManagementSystem system = new MovieManagementSystem();

        int choice;

        do {
            System.out.println("\n===== Movie Management System =====");
            System.out.println("1. Insert Movie at Beginning");
            System.out.println("2. Insert Movie at End");
            System.out.println("3. Insert Movie at Position");
            System.out.println("4. Remove Movie by Title");
            System.out.println("5. Search Movie by Title");
            System.out.println("6. Display Movies Forward");
            System.out.println("7. Display Movies Backward");
            System.out.println("8. Update Movie Rating");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter movie title: ");
                    String title1 = sc.nextLine();

                    System.out.print("Enter director: ");
                    String director1 = sc.nextLine();

                    System.out.print("Enter release year: ");
                    int year1 = sc.nextInt();

                    System.out.print("Enter rating (0-10): ");
                    double rating1 = sc.nextDouble();
                    sc.nextLine();

                    system.insertAtBeginning(
                            title1, director1, year1, rating1
                    );
                    break;

                case 2:
                    System.out.print("Enter movie title: ");
                    String title2 = sc.nextLine();

                    System.out.print("Enter director: ");
                    String director2 = sc.nextLine();

                    System.out.print("Enter release year: ");
                    int year2 = sc.nextInt();

                    System.out.print("Enter rating (0-10): ");
                    double rating2 = sc.nextDouble();
                    sc.nextLine();

                    system.insertAtEnd(
                            title2, director2, year2, rating2
                    );
                    break;

                case 3:
                    System.out.print("Enter movie title: ");
                    String title3 = sc.nextLine();

                    System.out.print("Enter director: ");
                    String director3 = sc.nextLine();

                    System.out.print("Enter release year: ");
                    int year3 = sc.nextInt();

                    System.out.print("Enter rating (0-10): ");
                    double rating3 = sc.nextDouble();

                    System.out.print("Enter position (0-based): ");
                    int position = sc.nextInt();
                    sc.nextLine();

                    system.insertAtPosition(
                            title3, director3, year3, rating3, position
                    );
                    break;

                case 4:
                    System.out.print("Enter movie title to remove: ");
                    String removeTitle = sc.nextLine();
                    system.removeByTitle(removeTitle);
                    break;

                case 5:
                    System.out.print("Enter movie title to search: ");
                    String searchTitle = sc.nextLine();
                    system.searchByTitle(searchTitle);
                    break;

                case 6:
                    system.displayForward();
                    break;

                case 7:
                    system.displayBackward();
                    break;

                case 8:
                    System.out.print("Enter movie title: ");
                    String updateTitle = sc.nextLine();

                    System.out.print("Enter new rating (0-10): ");
                    double newRating = sc.nextDouble();
                    sc.nextLine();

                    system.updateMovieRating(updateTitle, newRating);
                    break;

                case 0:
                    System.out.println("Exiting Movie Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

}
