package CorePrograms.Arrays.level2;
import java.util.Scanner;
/*
Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
Hint =>
Create a number variable and Take user input.
Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
Create an integer variable index with the value 0 to reflect the array index.
Use a loop to iterate until the number is not equal to 0.
Remove the last digit from the number in each iteration and add it to the array.
Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
Define variable to store largest and second largest digit and initialize it to zero
Loop through the array and use conditional statements to find the largest and second largest number in the array
Finally display the largest  and second-largest number.

 */

public class LargestSecondLargestDigit {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int []digits=new int[10];
        int originalNumber=number,index=0;
        while(originalNumber!=0){
            if(index==10){
                break;
            }
            digits[index++]=originalNumber%10;
            originalNumber=originalNumber/10;
        }
        if (index < 2) {
            System.out.println("At least two digits are required.");
            sc.close();
            return;
        }

        // to find largest and Second largest number
        int largest=-1,secondLargest=-1;
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                secondLargest=largest;
                largest=digits[i];
            } else if (digits[i]>secondLargest && digits[i]<largest) {
                secondLargest=digits[i];
            }
        }
        // to display largest and secondLargest
        if (secondLargest == -1) {
            System.out.println("No distinct second-largest digit.");
        } else {
            System.out.println("Largest: " + largest);
            System.out.println("Second largest: " + secondLargest);
        }
    }
}
