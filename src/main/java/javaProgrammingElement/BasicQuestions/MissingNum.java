package CorePrograms.BasicQuestions;

import java.util.Scanner;

public class MissingNum {
    public static void main(String []Args){
        Scanner sc=new Scanner(System.in);
        //enter array in a sorted way
        System.out.println("Enter array length: ");
        int n=sc.nextInt();
        System.out.println("Enter array in a sorted continuous way: ");
        int []arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int totsum=((n+1)*(n+2))/2;
        System.out.println("Missing num: "+(totsum-sum));

    }
}
