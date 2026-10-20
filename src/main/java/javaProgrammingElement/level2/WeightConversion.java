package level2;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double weightPounds=sc.nextDouble();
        double weightKg=weightPounds/2.2;
        System.out.println("The weight of the person in pound is "+weightPounds+" and in kg is "+weightKg);
    }
}
