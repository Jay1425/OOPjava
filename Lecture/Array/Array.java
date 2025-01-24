import java.util.Scanner;

public class Array
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++)
        {
            System.out.print("Enter Value Of element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2!=0)
            {
                sum = sum + arr[i];
            }
        }

        System.out.println("sum of given array's odd number : "+ sum);


    }
}