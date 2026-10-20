package CorePrograms.Methods.Level1;
import java.util.Scanner;
/*
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
Hint =>
Simple Interest = Principal * Rate * Time / 100
Take user input for principal, rate, time
Write a method to calculate the simple interest given principle, rate and time as parameters
Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”

 */
public class SimpleInterest {
    // method to calculate S.I.
    double calculateSimpleInterset(double principal,double rate,double time){
        double si=(principal*rate*time)/100;
        return si;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // to take input
        double principal=sc.nextDouble();
        double rate=sc.nextDouble();
        double time=sc.nextDouble();
        // to call method
        SimpleInterest si=new SimpleInterest();
        double simpleInterest=si.calculateSimpleInterset(principal,rate,time);
        // to print the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
    }
}
