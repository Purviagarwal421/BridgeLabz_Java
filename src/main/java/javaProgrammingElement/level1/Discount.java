package CorePrograms.JavaProgrammingElement.level1;

import java.util.Scanner;

class Discount{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
//        double amt=125000;
//        double discountedPrice=amt*0.10;
//        double discountedAmt=amt-discountedPrice;
//        System.out.println("The discount amount is INR "+discountedPrice+" and final discounted fee is INR "+discountedAmt);

        //user input
        double amount=sc.nextDouble();
        int discount=sc.nextInt();
        double discountedPrice=amount*((double) discount /100);
        double discountedAmt=amount-discountedPrice;
        System.out.println("The discount amount is INR "+discountedPrice+" and final discounted fee is INR "+discountedAmt);


    }
}