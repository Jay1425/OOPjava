import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a password
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Check if the password is valid
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    // Method to check if a password is valid
    public static boolean isValidPassword(String password) {
        // Rule 1: Password must have at least eight characters
        if (password.length() < 8) {
            return false;
        }

        // Rule 2: Password consists of only letters and digits
        // Rule 3: Password must contain at least two digits
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false; // Invalid character found
            }
            if (Character.isDigit(ch)) {
                digitCount++; // Count the number of digits
            }
        }

        // Check if there are at least two digits
        return digitCount >= 2;
    }
}