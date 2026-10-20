package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
Create a program to find the maximum number of handshakes among N number of students.
Hint =>
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formula to calculate the number of handshakes
 */

public class HandShakesMethod {
    int calculateHandshakes(int n){
        int maximumHandShakes=(n*(n-1))/2;
        return maximumHandShakes;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take input
        int n = sc.nextInt();

        // to call method
        HandShakesMethod hs = new HandShakesMethod();
        int handshakes = hs.calculateHandshakes(n);

        // to print the result
        System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes);

    }
}
