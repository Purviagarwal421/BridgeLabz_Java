package CorePrograms.JavaProgrammingElement.level2;
import java.util.Scanner;
class Division{
    public static  void main(String []args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num2!=0){
            double quotient=(double)num1/num2;
            int remainder=num1%num2;
            System.out.println("The Quotient is "+quotient+" and Reminder is"+remainder);
        }
    }
}