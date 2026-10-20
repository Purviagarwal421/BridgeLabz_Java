package ControlFlow.level1;
import java.util.Scanner;
/*
Write a program to check if a number is divisible by 5
I/P => number
O/P => Is the number ___ divisible by 5? ___

*/

public class Divisibility5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        // to check if its divisible by 5 or not
        if(num%5==0){
            System.out.println(num+ " is divisible by 5");
        }
        else{
            System.out.println(num+ " is not divisible by 5");
        }
    }
}
