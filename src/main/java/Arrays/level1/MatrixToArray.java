package CorePrograms.Arrays.level1;
import java.util.Arrays;
import java.util.Scanner;

/*
Write a Java program to create a 2D array
and copy it into a 1D array.

Hint =>
1. Take input for rows and columns.
2. Create a 2D array and read its elements.
3. Create a 1D array of size rows * columns.
4. Copy every matrix element into the 1D array.
*/

public class MatrixToArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        // to take matrix input
        int [][]matrix=new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // to copy elements into array
        int []array=new int[rows*columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        // to print matrix
        System.out.println("2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // to print array
        System.out.println("1D Array: " + Arrays.toString(array));
    }
}
