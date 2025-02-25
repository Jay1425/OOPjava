import java.util.Scanner;

public class Program_3_conver_meter_to_feet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        final double METERS_TO_FEET = 3.28084;
        
        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();

        
        double feet = meters * METERS_TO_FEET;

        
        System.out.printf("The distance in feet is: %.2f%n", feet);

    }
}
