import java.util.Scanner;

public class Prc3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a<b)
        {
            int temp = a;
            a = b;
            b = temp;
        }
        if(a<c)
        {
            int temp = a;
            a = c;
            c = temp;
        }
        if(b<c)
        {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a+" "+b+" "+c);
    
    }
}