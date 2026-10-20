package CorePrograms.JavaProgrammingElement.level1;

import java.util.Scanner;

class Calculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int addition=a+b;
        int substraction=a>b?a-b:b-a;
        int multiplication=a*b;
        int greaterNum= Math.max(a, b);
        int smallerNum=Math.min(a,b);
        double division=0;
        if(smallerNum!=0){
            division=(double)greaterNum/smallerNum;
        }
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+a+" and "+b+" is "+ addition +", "+ substraction+", "+ multiplication+" and "+ division);

    }
}
