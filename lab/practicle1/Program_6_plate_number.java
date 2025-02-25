import java.util.Random;

public class Program_6_plate_number {
    public static void main(String[] args) {
        Random rm = new Random();

        
        String letters = "" + 
                         (char) ('A' + rm.nextInt(26)) + 
                         (char) ('A' + rm.nextInt(26)) + 
                         (char) ('A' + rm.nextInt(26));

        
        String digits = "" + rm.nextInt(10) + 
                             rm.nextInt(10) + 
                             rm.nextInt(10) + 
                             rm.nextInt(10);

        
        String plateNumber = letters + digits;

        
        System.out.println("Generated Vehicle Plate Number: " + plateNumber);
    }
}
