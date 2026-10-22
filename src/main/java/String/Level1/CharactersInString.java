package CorePrograms.String.Level1;
import java.util.Scanner;

/*
Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
Hint =>
Take user input using the  Scanner next() method to take the text into a String variable
Write a method to return the characters in a string without using the toCharArray()
Write a method to compare two string arrays and return a boolean result
In the main() call the user-defined method and the String built-in toCharArray() method, compare the 2 arrays, and finally display the result

 */
public class CharactersInString {
    //method to convert String into character
    static char [] toCharacterArray(String string){
        char[] array = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            array[i] = string.charAt(i);
        }
        return array;
    }
    // Method to compare two character arrays
    static boolean compareArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // To take input
        String string = sc.next();
        // Using user-defined method
        char[] userArray = toCharacterArray(string);

        // Using built-in method
        char[] builtInArray = string.toCharArray();

        // Comparing both arrays
        boolean result = compareArrays(userArray, builtInArray);

        System.out.println("Characters using user-defined method:");
        System.out.println(userArray);

        System.out.println("Characters using toCharArray():");
        System.out.println(builtInArray);

        System.out.println("Are both arrays equal? " + result);
    }

}
