package CorePrograms.String.Level1;
/*
Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint =>
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

 */

import java.util.Scanner;

public class ShowArrayIndexOutOfBoundsException {
    // Method to generate ArrayIndexOutOfBoundsException
    static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }
    // Method to handle ArrayIndexOutOfBoundsException
    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for array of names
        System.out.println("Enter the number of names:");
        int size = sc.nextInt();

        String[] names = new String[size];

        System.out.println("Enter the names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        // Calling method to generate the exception
//        try {
//            generateException(names);
//        } catch (RuntimeException e) {
//            System.out.println("Exception generated: " + e);
//        }
        // Calling method to handle the exception
        handleException(names);

        sc.close();
    }

}
