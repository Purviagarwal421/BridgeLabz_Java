package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
Write a program to find the sum of n natural numbers using loop
Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop

 */

public class Sum {
    // method to calculate sum of n natural numbers
    int sumNaturalNumber(int number){
        int sum=0;
        for(int i=1;i<number;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();

        // to call method
        Sum obj = new Sum();
        int sum = obj.sumNaturalNumber(number);

        // to print the result
        System.out.println("The sum of " + number + " natural numbers is " + sum);

    }
}
