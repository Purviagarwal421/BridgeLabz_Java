package CorePrograms.String.Level1;
/*
Write a program to demonstrate IllegalArgumentException
Hint =>
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program.
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

 */

import java.util.Scanner;

public class ShowIllegalArgumentException {
    // method to generate error
    static void generateError(String string){
        System.out.println("Substring: "+string.substring(string.length()-1,0));
    }
    // method to handle error
    static void handleError(String string){
        try{
            System.out.println("Substring: "+string.substring(string.length()-1,0));
        } catch (Exception e) {
            System.err.println("ShowIllegalArgumentException ");
            //throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // to take input
        String string=sc.next();

        // to generate error
        generateError(string);

        // to handle error
        handleError(string);

    }
}
