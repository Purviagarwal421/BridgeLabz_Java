package CorePrograms.JavaProgrammingElement.level1;

import java.util.Scanner;

class Price{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float unitPrice=sc.nextFloat();
        int quantity=sc.nextInt();
        float totalPrice=unitPrice*quantity;
        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);

    }
}
