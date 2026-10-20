package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint =>
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends

 */

public class FriendsComparison {
    // method to find the youngest friend
    int youngestFriend(int []ages){
        int youngest=0;
        for(int i=0;i<ages.length;i++){
            if(ages[i]<ages[youngest]){
                youngest=i;
            }
        }
        return youngest;
    }

    // method to find the tallest friend
    int tallestFriend(double []heights){
        int tallest = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // to store the names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // to create arrays for ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];
        // to take input
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " in feet: ");
            heights[i] = sc.nextDouble();
        }
        // to create object
        FriendsComparison obj = new FriendsComparison();
        // to call methods
        int youngest = obj.youngestFriend(ages);
        int tallest = obj.tallestFriend(heights);

        // to print the results
        System.out.println("The youngest friend is " + names[youngest] + " with age " + ages[youngest]);

        System.out.println("The tallest friend is " + names[tallest] + " with height " + heights[tallest] + " feet");



    }
}
