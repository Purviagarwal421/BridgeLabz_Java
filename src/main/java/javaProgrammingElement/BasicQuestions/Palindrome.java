package CorePrograms.BasicQuestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while (n>0){
            int d=n%10;
            System.out.println("d: "+d);
            rev=rev*10+d;
            System.out.println("rev: "+rev);
            n=n/10;
        }
        if(rev==n){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}
