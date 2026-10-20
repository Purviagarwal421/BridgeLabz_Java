package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
Write a program to find the smallest and the largest of the 3 numbers.
Hint =>
Take user input for 3 numbers
Write a single method to find the smallest and largest of the three numbers
public static int[] findSmallestAndLargest(int number1, int number2, int number3)

 */

public class SmallestLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int []result=new int[2];
        int smallest=number1,largest=number1;
        if(number1<number2 && number1<number3){
            smallest=number1;
        } else if (number2<number1 && number2<number3) {
            smallest=number3;
        }
        else{
            smallest=number2;
        }
        if(number1>number2 && number1>number3){
            largest=number1;
        } else if (number2>number1 && number2>number3) {
            largest=number3;
        }
        else{
            largest=number2;
        }
        result[0]=smallest;
        result[1]=largest;
        return result;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2= sc.nextInt();
        int number3=sc.nextInt();

        // to call method
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // to print the result
        System.out.println("The smallest number is " + result[0]);
        System.out.println("The largest number is " + result[1]);

    }
}
