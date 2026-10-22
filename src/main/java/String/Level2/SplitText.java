package CorePrograms.String.Level2;
/*
Write a program to split the text into words, compare the result with the split() method and display the result
Hint =>
Take user input using the Scanner nextLine() method
Create a Method to find the length of the String without using the built-in length() method.
Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
Then Create an array to store the words and use the indexes to extract the words
Create a method to compare the two String arrays and return a boolean
The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result

 */

import java.util.Arrays;
import java.util.Scanner;

public class SplitText {
    // method to split the text into words using the charAt() method
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
    static String[] textToWords(String string){
        // to count words
        int count=0;
        int i=0;
        while(i<string.length()){
            if(string.charAt(i)==' '){
                count++;
            }
            i++;
        }
        String []array=new String[count];
        int index=0;
        String wd="";
        boolean inWord = false;
        while(i<string.length()){
            if(string.charAt(i)!=' '){
                wd+=string.charAt(i);
                inWord = true;
            }
            else{
                array[index]=wd;
                wd="";
                inWord = false;
            }
            i++;
        }
        // Store the final word
        if (inWord) {
            array[index] = wd;
        }
        return array;
    }
    // Method to compare two String arrays
    static boolean compareArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking complete text as input
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // Using user-defined method
        String[] userWords = textToWords(text);

        // Using built-in split() method
        String trimmedText = text.trim();
        String[] builtInWords;

        if (trimmedText.isEmpty()) {
            builtInWords = new String[0];
        } else {
            builtInWords = trimmedText.split("\\s+");
        }

        // Comparing both arrays
        boolean result = compareArrays(userWords, builtInWords);

        System.out.println("Words using user-defined method: " + Arrays.toString(userWords));
        System.out.println("Words using split(): " + Arrays.toString(builtInWords));
        System.out.println("Are both arrays equal? " + result);

        sc.close();
    }

}
