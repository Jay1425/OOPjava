import java.util.Scanner;

public class Program_5_vowel_or_constant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

    
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else  {
                System.out.println(ch + " is a consonant.");
            }
      


    }
}
