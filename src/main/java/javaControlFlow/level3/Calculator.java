package ControlFlow.level3;
import java.util.Scanner;

/*
Write a program to create a calculator using switch...case.
Hint =>
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.

 */

public class Calculator {
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        double first=sc.nextDouble();
        double second=sc.nextDouble();
        String choice=sc.next();
        switch (choice){
            case "+":
                System.out.println(first+second);
                break;
            case "-":
                System.out.println(first-second);
                break;
            case "*":
                System.out.println(first*second);
                break;
            case "/":
                if(second!=0){
                    System.out.println(first/second);
                }
                else {
                    System.out.println("Can't divide by 0");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

    }
}
