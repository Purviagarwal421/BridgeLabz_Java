package CorePrograms.Arrays.level2;
import java.util.Scanner;
/*
Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
Hint =>
Take the input for a number
Find the count of digits in the number
Find the digits in the number and save them in an array
Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
Display the frequency of each digit in the number

 */

public class FrequencyDigits {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        // count digits
        int count=0,originalNumber=number;
        while (originalNumber!=0){
            count++;
            originalNumber=originalNumber/10;
        }
        int []digits=new int[count];
        // to store ech digits in an array
        originalNumber=number;
        int index=0;
        while(originalNumber!=0){
            digits[index++]=originalNumber%10;
            originalNumber/=10;

        }
        // to calculate frequency of each digit
        int []frequencies=new int[10];
        for(int i=0;i<digits.length;i++){
            frequencies[digits[i]]+=1;
        }
        // to display the frequency
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                System.out.println(i + " occurs " + frequencies[i] + " time(s)");
            }
        }



    }
}
