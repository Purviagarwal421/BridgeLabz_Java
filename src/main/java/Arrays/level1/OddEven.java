package CorePrograms.Arrays.level1;

import java.util.Arrays;
import java.util.Scanner;


public class OddEven {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       if(number<=0){
           System.out.println("Not a natural Number");
           return;
       }
       int []odd=new int[number/2+1];
       int []even=new int[number/2+1];
       int indexEven=0,indexOdd=0;
       for(int i=1;i<=number;i++){
           if(i%2==0){
               even[indexEven++]=i;
           }
           else{
               odd[indexOdd++]=i;
           }
       }
        System.out.println("Odd numbers: " + Arrays.toString(odd));
        System.out.println("Even numbers: " + Arrays.toString(even));
    }
}
