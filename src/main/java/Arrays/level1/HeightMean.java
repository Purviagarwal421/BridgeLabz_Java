package CorePrograms.Arrays.level1;
import java.util.Scanner;
/*
Create a program to find the mean height of players present in a football team.
Hint =>
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team

 */

public class HeightMean {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double []heights=new double[11];
        for(int i=0;i<heights.length;i++){
            heights[i]=sc.nextInt();
        }
        double sum=0;
        for(double height: heights){
            sum+=height;
        }
        double mean=sum/heights.length;
        System.out.println("Mean height of the football team is "+mean);

    }
}
