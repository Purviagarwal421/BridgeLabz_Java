package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
Write a program to check whether a number is positive, negative, or zero.
Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1 for positive number and 0 if number is zero

 */

public class PositiveNegativeZero {
    int checkNumber(int number){
        if(number<0){
            return -1;
        } else if (number>0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // to take input
        int number = sc.nextInt();

        // to call method
        PositiveNegativeZero obj = new PositiveNegativeZero();
        int result = obj.checkNumber(number);

        // to print the result
        if(result == -1){
            System.out.println("The number is negative.");
        } else if(result == 1){
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }



    }


}
