public class Program_2_solve_equation {
    public static void main(String[] args) {
        
        double a1 = 3.4, b1 = 50.2, c1 = 44.5;
        double a2 = 2.1, b2 = 0.5, c2 = 5.9;

        
        double determinant = (a1 * b2) - (a2 * b1);

        if (determinant == 0) {
            System.out.println(" determinant is zero.");
        } else {
            
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;

            
            System.out.printf("The solution is: x = %.2f, y = %.2f%n", x, y);
        }
    }
}
