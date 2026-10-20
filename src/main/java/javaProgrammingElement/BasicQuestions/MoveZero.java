package CorePrograms.BasicQuestions;

import java.util.Scanner;

public class MoveZero {
    public static void main(String []Args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of an array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
            }
        }
        for(int i=k;i<n;i++){
            arr[i]=0;
        }
        System.out.println("Array after moving zero's to the end---");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
