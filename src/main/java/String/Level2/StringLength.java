package CorePrograms.String.Level2;
/*
Write a program to find and return the length of a string without using the length() method
Hint =>
Take user input using the Scanner next() method
Create a method to find and return a string's length without using the built-in length() method. The logic for this is to
use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
The main function calls the user-defined method as well as the built-in length() method and displays the result

 */

import java.util.Scanner;

public class StringLength {
    //method to return the length of the String
    public static int findLength(String string){
        int i=0;
        while(true){
            try{
                char ch=string.charAt(i);
                i++;
            } catch (Exception e) {
                return i;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a string:");
        String text = sc.next();

        // Using user-defined method
        int userLength = findLength(text);

        // Using built-in method
        int builtInLength = text.length();

        // Displaying the results
        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in method: " + builtInLength);

        sc.close();
    }

}
