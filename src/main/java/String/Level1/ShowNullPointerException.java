package CorePrograms.String.Level1;
/*
Write a program to demonstrate NullPointerException.
Hint =>
Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
 */

public class ShowNullPointerException {
    // method to generate exception
    static void generateEcxeption( ){
        String text=null;
        System.out.println(text.length());
    }
    // method to handle the exception
    static void handleEcxeption( ){
        String text=null;
        try {
            System.out.println(text.length());
        } catch (Exception e) {
            System.out.println("NullPointerExceptions");
        }
    }
    public static void main(String[] args){
        // Calling method to handle the exception
        handleEcxeption();
        // Calling method to generate the exception
        try{
            generateEcxeption();
        } catch (Exception e) {
            System.out.println("error ");
        }

    }

}
