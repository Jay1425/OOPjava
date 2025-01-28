import  java.util.*;

public class Bmi
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Weight in pounds: ");
        double mass = sc.nextDouble();
        System.out.print("enter height in inch: ");
        double height = sc.nextDouble();

        double m = mass*0.45359237;
        double h = height*0.0254;

        double bmi = m/(h*h);

        System.out.println("your BMI: "+bmi);
    }
}
