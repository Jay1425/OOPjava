import java.util.Scanner;

public class MatrixOperations {

    // Method to add two 3x3 matrices
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two 3x3 matrices
    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two 3x3 matrices
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to print a 3x3 matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Matrix 1
        System.out.println("Enter elements of Matrix 1 (3x3):");
        int[][] matrix1 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for Matrix 2
        System.out.println("Enter elements of Matrix 2 (3x3):");
        int[][] matrix2 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Ask for the operation
        System.out.println("Enter the operation (+, -, *):");
        char operation = scanner.next().charAt(0);

        // Perform the operation
        int[][] result;
        switch (operation) {
            case '+':
                result = add(matrix1, matrix2);
                System.out.println("Result of Addition:");
                break;
            case '-':
                result = subtract(matrix1, matrix2);
                System.out.println("Result of Subtraction:");
                break;
            case '*':
                result = multiply(matrix1, matrix2);
                System.out.println("Result of Multiplication:");
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        // Print the result
        printMatrix(result);
    }
}