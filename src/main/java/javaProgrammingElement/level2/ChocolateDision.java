package CorePrograms.JavaProgrammingElement.level2;

import java.util.Scanner;

public class ChocolateDision {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int numberOfChocolates=sc.nextInt();
        int numberOfChildren=sc.nextInt();
        int chocolatesEach =numberOfChocolates/numberOfChildren;
        int chocolatesRemaining=numberOfChocolates%numberOfChildren;
        System.out.println("The number of chocolates each child gets is "+ chocolatesEach +"and the number of remaining chocolates are "+chocolatesRemaining);

    }
}
