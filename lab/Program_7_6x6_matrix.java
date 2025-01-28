import java.util.Random;

public class Program_7_6x6_matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        Random random = new Random();

        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = random.nextInt(2); 
            }
        }

        
        System.out.println("Generated 6x6 Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        
        System.out.println("\nRows with odd number of 1s:");
        for (int i = 0; i < 6; i++) {
            int countOnes = 0;
            for (int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes % 2 != 0) {
                System.out.println("Row " + (i + 1));
            }
        }

        System.out.println("\nColumns with odd number of 1s:");
        for (int j = 0; j < 6; j++) {
            int countOnes = 0;
            for (int i = 0; i < 6; i++) {
                if (matrix[i][j] == 1) {
                    countOnes++;
                }
            }
            if (countOnes % 2 != 0) {
                System.out.println("Column " + (j + 1));
            }
        }
    }
}
