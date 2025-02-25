import java.util.Scanner;

public class Cashier
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        sc.close();

        int[] denominations = {100, 50, 10, 5, 2, 1};

        for (int note : denominations)
        {
            int count = amount / note;
            if (count > 0)
            {
                System.out.println(note + ": " + count);
            }
            amount %= note;
        }
    }
}
