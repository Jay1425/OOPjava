import java.util.Scanner;

public class Prc4
{
    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        {
            System.out.println(ch + " is vowel.");
        }
        else
        {
            System.out.println(ch + " is consonent.");
        }
    }
}