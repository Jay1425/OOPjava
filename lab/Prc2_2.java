import java.util.Scanner;

public class Prc2_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int A = sc.nextInt();
        int div = 2;

        if(A<=1)
        {
            System.out.println("value less than equal to 1.");
            return;
        }

        while(A>1)
        {   if(A%div==0)
            {
                System.out.println(div+" ");
                A = A/div;
            }
            else
            {
                div++;
            }
        }


    }
}
