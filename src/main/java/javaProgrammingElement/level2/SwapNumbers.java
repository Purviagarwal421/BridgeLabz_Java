package CorePrograms.JavaProgrammingElement.level2;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String []Args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int temporary=num1;
        num1=num2;
        num2=temporary;
        System.out.println("The swapped numbers are "+num1+" and "+num2);
    }
}
