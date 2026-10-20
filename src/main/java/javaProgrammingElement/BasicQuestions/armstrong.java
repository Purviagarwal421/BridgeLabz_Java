package CorePrograms.BasicQuestions;

import java.util.Scanner;
public class armstrong {
    public static void main(String[]Args){
        Scanner sc=new Scanner(System.in);
        //count no of digits
        int n=sc.nextInt();
        int count=0,m=n;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Digits: "+count);
        int res=0;
        while(m>0){
            int d=m%10;
            res+=(int)Math.pow(d,count);
            m=m/10;
        }
        System.out.println("res: "+res);




    }
}
