package ObjectedOrientedFundamentals.Level2;
/*
Program to Check Palindrome String
Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.
 */

import java.util.Scanner;

public class PalindromeChecker {
    private String text;
    // methods for getters and setters
    public void setText(String text){
        this.text=text;
    }
    public String getText(){
        return text;
    }
    // method to check palinddrome
    public boolean isPalindrome(){
        for(int i=0;i<text.length()/2;i++){
            if(text.charAt(i)!=text.charAt(text.length()-i-1)){
                return  false;
            }
        }
        return true;
    }
    // method to display the result
    public void showResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PalindromeChecker palindrome = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        palindrome.setText(text);

        palindrome.showResult();

        sc.close();
    }



}
