package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
Create a program to find the maximum number of handshakes among N number of students.
Hint =>
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
*/
public class HandShakes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // to take input
        int numberOfStudents = sc.nextInt();

        // to calculate handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // to print the result
        System.out.println("The maximum number of possible handshakes is " + handshakes);

        sc.close();
    }
}