package CorePrograms.String.Level1;
/*
Write a program to convert the complete text to uppercase and compare the results
Hint =>
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Lower Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the Lowercase Text and compare the two strings using the user-defined method. And finally display the result

 */

import java.util.Scanner;

public class ConvertLowerCase {

    // method to convert to all in uppercase using ASCII code
    public static String convertLowercase(String sentence){
        String lowercase="";
        for (int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            if(ch>='A' && ch<='Z'){
                lowercase+=(char)(ch+32);
            }
            else{
                lowercase+= ch;
            }

        }
        return lowercase;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking complete text as input
        System.out.println("Enter a text:");
        String text = sc.nextLine();

        // Using user-defined method
        String userLowerCase = convertLowercase(text);

        // Using built-in method
        String builtInLowerCase = text.toLowerCase();


        System.out.println("Uppercase using user-defined method: " + userLowerCase);
        System.out.println("Uppercase using built-in method: " + builtInLowerCase);

        sc.close();
    }

}

