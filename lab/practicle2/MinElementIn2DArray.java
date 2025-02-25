public class MinElementIn2DArray {

    // Generic method to find the minimum element and its indices in a 2D array
    public static <T extends Comparable<T>> String findMinElement(T[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        T min = array[0][0]; // Assume the first element is the minimum
        int minRow = 0;
        int minCol = 0;

        // Iterate through the 2D array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].compareTo(min) < 0) {
                    min = array[i][j]; // Update the minimum element
                    minRow = i;        // Update the row index
                    minCol = j;        // Update the column index
                }
            }
        }

        return "Minimum Element: " + min + ", Found at: (" + minRow + ", " + minCol + ")";
    }

    public static void main(String[] args) {
        // Example usage with Integer array
        Integer[][] intArray = {
            {5, 3, 9},
            {1, 4, 8},
            {7, 2, 6}
        };
        System.out.println(findMinElement(intArray));

        // Example usage with String array
        String[][] strArray = {
            {"apple", "banana"},
            {"cherry", "date"},
            {"fig", "grape"}
        };
        System.out.println(findMinElement(strArray));
    }
}