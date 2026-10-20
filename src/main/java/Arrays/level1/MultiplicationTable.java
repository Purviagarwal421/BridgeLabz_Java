package CorePrograms.Arrays.level1;
import java.util.Scanner;
/*
Create a program to print a multiplication table of a number.
Hint =>
Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 1
Run a loop from 1 to 10 and store the results in the multiplication table array
Finally, display the result from the array in the format number * i = ___

 */

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int []multiplicationTable=new int[10];
        // to store results of multiplication
        for(int i=0;i<10;i++){
            multiplicationTable[i]=number*(i+1);
        }
        // to print the results
        for(int i=0;i<10;i++){
            System.out.println(number+" * "+(i+1)+" = "+multiplicationTable[i]);
        }

    }
}
