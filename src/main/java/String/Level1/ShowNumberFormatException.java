package CorePrograms.String.Level1;

import java.util.Scanner;

public class ShowNumberFormatException {
    // Method to generate NumberFormatException
    static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }
    // Method to handle NumberFormatException
    static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String text = sc.next();

        // Calling method to generate the exception
//        try {
//            generateException(text);
//        } catch (RuntimeException e) {
//            System.out.println("Exception generated: " + e);
//        }

        // Calling method to handle the exception
        handleException(text);

        sc.close();
    }

}
