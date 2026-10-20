package CorePrograms.Methods.Level2;
import java.util.Scanner;
/*
Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint =>
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array
public double[] findAverageMinMax(int[] numbers)

 */

public class RandomNumbers {
    // method to generate 4 digit random numbers
    public int[] generate4DigitRandomArray(int size){
        int []randomNumbers=new int[4];
        for(int i=0;i<4;i++){
            randomNumbers[i]=(int)(Math.random()*9000)+1000;
        }
        return randomNumbers;
    }
    // method to find average, min and max value of an array
    public double[] findAverageMinMax(int[] numbers){
        double []result=new double[3];
        double sum=0;
        int min = numbers[0];
        int max = numbers[0];
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        double avg=sum/numbers.length;
        result[0] = avg;
        result[1] = min;
        result[2] = max;

        return result;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // to create object
        RandomNumbers obj = new RandomNumbers();

        // to generate five random numbers
        int[] numbers = obj.generate4DigitRandomArray(5);

        // to call method
        double[] result = obj.findAverageMinMax(numbers);

        // to print the random numbers
        System.out.println("Random numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // to print the results
        System.out.println("Average = " + result[0]);
        System.out.println("Minimum = " + result[1]);
        System.out.println("Maximum = " + result[2]);


    }

}
