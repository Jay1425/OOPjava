import java.util.Scanner;

public class Cgpa
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks out of 300 :");
        int a = sc.nextInt();

        int c = (10*a)/300;

        System.out.println("your cgpa : "+c);
    }
}