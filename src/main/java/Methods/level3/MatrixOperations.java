
package CorePrograms.Methods.Level3;
import java.util.Scanner;

/*
Write a program to perform matrix operations:
1. Addition
2. Subtraction
3. Multiplication
4. Transpose
5. Determinant of 2x2 and 3x3 matrices
6. Inverse of 2x2 and 3x3 matrices
*/

public class MatrixOperations {

    // Method to create a random matrix
    public static double[][] createMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        return matrix;
    }

    // Method to add two matrices
    public static double[][] addMatrices(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static double[][] subtractMatrices(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static double[][] multiplyMatrices(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = b[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    // Method to find the transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        double[][] transpose = new double[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    // Method to find determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);

        if (det == 0) {
            return null;
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;

        return inverse;
    }

    // Method to find inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);

        if (det == 0) {
            return null;
        }

        double[][] inverse = new double[3][3];

        inverse[0][0] = (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) / det;

        inverse[0][1] = (matrix[0][2] * matrix[2][1] - matrix[0][1] * matrix[2][2]) / det;

        inverse[0][2] = (matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1]) / det;

        inverse[1][0] = (matrix[1][2] * matrix[2][0] - matrix[1][0] * matrix[2][2]) / det;

        inverse[1][1] = (matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0]) / det;

        inverse[1][2] = (matrix[0][2] * matrix[1][0] - matrix[0][0] * matrix[1][2]) / det;

        inverse[2][0] = (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]) / det;

        inverse[2][1] = (matrix[0][1] * matrix[2][0] - matrix[0][0] * matrix[2][1]) / det;

        inverse[2][2] = (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]) / det;

        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Inverse does not exist because determinant is 0.");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf("%10.2f", matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns (2 or 3): ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        if ((rows != 2 && rows != 3) ||
                (cols != 2 && cols != 3)) {
            System.out.println("Rows and columns must be 2 or 3.");
            sc.close();
            return;
        }

        double[][] a = createMatrix(rows, cols);
        double[][] b = createMatrix(rows, cols);

        System.out.println("\nMatrix A:");
        displayMatrix(a);

        System.out.println("\nMatrix B:");
        displayMatrix(b);

        if (rows == cols) {
            System.out.println("\nAddition:");
            displayMatrix(addMatrices(a, b));

            System.out.println("\nSubtraction:");
            displayMatrix(subtractMatrices(a, b));

            System.out.println("\nMultiplication:");
            displayMatrix(multiplyMatrices(a, b));

            System.out.println("\nTranspose of Matrix A:");
            displayMatrix(transposeMatrix(a));

            double det;
            double[][] inverse;

            if (rows == 2) {
                det = determinant2x2(a);
                inverse = inverse2x2(a);
            } else {
                det = determinant3x3(a);
                inverse = inverse3x3(a);
            }

            System.out.println("\nDeterminant of Matrix A: " + det);

            System.out.println("\nInverse of Matrix A:");
            displayMatrix(inverse);
        } else {
            System.out.println(
                    "\nAddition, subtraction, and determinant/inverse " +
                            "require square matrices of matching dimensions."
            );

            System.out.println("\nTranspose of Matrix A:");
            displayMatrix(transposeMatrix(a));

            System.out.println("\nTranspose of Matrix B:");
            displayMatrix(transposeMatrix(b));
        }

        sc.close();
    }
}
