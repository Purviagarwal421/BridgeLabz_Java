package CorePrograms.Arrays.level1;
import java.util.Scanner;
/*
Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
Hint =>
Define an integer array of 5 elements and get user input to store in the array.
Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
If the number is negative, print negative. Else if the number is zero, print zero.
Finally compare the first and last element of the array and display if they equal, greater or less

 */

public class PositiveNegativeZero {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []numbers=new int[5];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        // to check positive ,negative or zero
        for(int number:numbers){
            if(number>0){
                if(number%2==0){
                    System.out.println(number+" is an even number.");
                }
                else{
                    System.out.println(number+" is an even number.");
                }
            }
            else if (number<0) {
                System.out.println(number+" is a negative number.");

            }
            else{
                System.out.println(number+" is zero.");
            }
        }
        int firstElement=numbers[0];
        int lastElement=numbers[numbers.length-1];
        // to check equality
        if(firstElement>lastElement){
            System.out.println("First element is greater");
        } else if (firstElement<lastElement) {
            System.out.println("Second element is greater");
        }
        else{
            System.out.println("Both are equal.");
        }

    }
}
