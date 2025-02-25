import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesSimple {

    // Method to remove duplicates from an array
    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        // Use a Set to store unique elements
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : array) {
            uniqueSet.add(num);
        }

        // Convert the Set back to an array
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {1, 2, 3, 4, 2, 3, 5};
        System.out.println("Original Array: " + Arrays.toString(array));
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}