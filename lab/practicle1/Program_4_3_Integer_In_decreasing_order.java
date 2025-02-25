import java.util.Scanner;

public class Program_4_3_Integer_In_decreasing_order {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();
        
        System.out.print("Enter the third integer: ");
        int c = sc.nextInt();

        
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            int temp = b;
            b = c;
            c = temp;
        }
       
        System.out.println("Numbers in decreasing order: " + a + ", " + b + ", " + c);
    }
}
