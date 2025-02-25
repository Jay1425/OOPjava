import java.util.Scanner;

public class LargestCommonPrefix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Find the largest common prefix
        String commonPrefix = findCommonPrefix(str1, str2);

        // Display the result
        if (commonPrefix.isEmpty()) {
            System.out.println("There is no common prefix.");
        } else {
            System.out.println("The largest common prefix is: " + commonPrefix);
        }
    }

    // Method to find the largest common prefix
    public static String findCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        StringBuilder commonPrefix = new StringBuilder();

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefix.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return commonPrefix.toString();
    }
}