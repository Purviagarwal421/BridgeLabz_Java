package CorePrograms.Arrays.level1;
import java.util.Scanner;
/*
Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
Hint =>
Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
Finally, display the result from the array in the format number * i = ___
 */

public class Multiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int [] multiplication6To9 =new int[4];
        int index=0;
        // to calculate result from 6 to 9
        for(int i=6;i<=9;i++){
            multiplication6To9[index++]=number*i;
        }
        // to print
        for (int i=0;i<5;i++){
            System.out.println(number+" * "+(i+6)+" = "+ multiplication6To9[i]);
        }
    }
}
