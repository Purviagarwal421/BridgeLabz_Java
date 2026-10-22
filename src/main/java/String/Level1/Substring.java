package CorePrograms.String.Level1;
import java.util.Scanner;
/*
Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
Hint =>
Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
Write a method to compare two strings using the charAt() method and return a boolean result
Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result

 */

public class Substring {
    //method to to get the substring from the strings using the charAt()
    static String usingCharAt(String string,int start,int stop){
        if(start<0 || stop>string.length()|| start > stop || string.isEmpty()){
            return "";
        }
        String substring="";
        for(int i=start;i<stop;i++){
            substring+=string.charAt(i);
        }
        return substring;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // to take input
        String myString=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();
        // using built-in functions
        if(start>myString.length()){
            System.err.println("Invalid Credentials");
            System.exit(0);
        }
        String substring=myString.substring(start,end);
        System.out.println("Substring using built in function "+substring);
        // using method call
        String methodSubstring=Substring.usingCharAt(myString,start,end);
        System.out.println("Substring using charAt() and method call  "+methodSubstring);
    }
}
