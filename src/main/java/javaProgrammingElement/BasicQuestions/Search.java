package CorePrograms.BasicQuestions;

import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0,right=arr.length-1,index=-1,mid=0;
        boolean flag=false;
        while(left<=right){
            mid=left + (right - left) / 2;
            if(target==arr[mid]){
                flag=true;
                index=mid;
                break;
            }
            else if(target<arr[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        if(flag){
            System.out.println("Found at an index "+index);
        }
        else{
            System.out.println("Not Found");
        }

    }
}
