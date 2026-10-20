package CorePrograms.JavaProgrammingElement.level2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double principal=sc.nextDouble();
        double rate=sc.nextDouble();
        int time=sc.nextInt();
        double simpleInterest=(principal*rate*time)/100;
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal"+principal+" ,Rate"+rate+" and Time "+time);
    }
}
