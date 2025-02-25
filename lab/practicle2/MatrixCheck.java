import java.util.Random;

public class MatrixCheck {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        Random rand = new Random();
        
        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = rand.nextInt(2); // Generates 0 or 1
            }
        }
        
        // Display the matrix
        System.out.println("Generated 6x6 Matrix:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Check rows for odd number of 1s
        boolean rowsValid = true;
        for (int i = 0; i < 6; i++) {
            int count = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                rowsValid = false;
                break;
            }
        }
        
        // Check columns for odd number of 1s
        boolean colsValid = true;
        for (int j = 0; j < 6; j++) {
            int count = 0;
            for (int i = 0; i < 6; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                colsValid = false;
                break;
            }
        }
        
        // Display result
        if (rowsValid && colsValid) {
            System.out.println("Every row and column has an odd number of 1s.");
        } else {
            System.out.println("Not all rows and columns have an odd number of 1s.");
        }
    }
}
