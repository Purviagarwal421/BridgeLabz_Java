package CorePrograms.Arrays.level2;
import java.util.Scanner;
import java.util.Arrays;
/*
Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
Hint =>
Take user input for a number.
Find the count of digits in the number.
Find the digits in the number and save them in an array
Create an array to store the elements of the digits array in reverse order
Finally, display the elements of the array in reverse order

 */

public class ReverseNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();

        //count no of digits
        int originalNumber=number,count=0;
        while(originalNumber!=0){
            count++;
            originalNumber=originalNumber/10;
        }
        originalNumber=number;
        int []digits=new int[count];
        int []reverseDigit=new int[count];
        // if number=0
        if (number == 0) {
            digits[0] = 0;
        }
        // to store digits in an array
        int index=0;
        while (originalNumber!=0){
            digits[index--]=originalNumber%10;
            originalNumber=originalNumber/10;
        }
        // to find reverse
        for(int i=0;i<digits.length;i++){
            reverseDigit[i]=digits[digits.length-i-1];
        }

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed array: " + Arrays.toString(reverseDigit));

    }

}
