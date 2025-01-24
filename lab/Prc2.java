import java.util.Scanner;

public class Prc2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value in Meters : ");
        double mtr = sc.nextDouble();

        double result = 3.28*mtr;  

        System.out.println("your result in feet : "+result);
    }
}