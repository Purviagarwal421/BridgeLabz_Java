package CorePrograms.Arrays.level2;
import java.util.Scanner;
/*
Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
Hint =>
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
Finally display the youngest and tallest of the 3 friends

 */

public class YoungestFriend {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // to take inputs
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ":");
            age[i] = sc.nextInt();

            System.out.println("Enter height of " + names[i] + " in cm:");
            height[i] = sc.nextDouble();
        }
        int youngest = 0,tallest = 0;;
        // To find the youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }

            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }

        // To display the results
        System.out.println("Youngest friend: " + names[youngest]);
        System.out.println("Age: " + age[youngest]);

        System.out.println("Tallest friend: " + names[tallest]);
        System.out.println("Height: " + height[tallest] + " cm");

    }

}
