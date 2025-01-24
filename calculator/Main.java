import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name :");
        String user = scanner.nextLine();

        System.out.println("Hello, "+ user +"!");

        System.out.println("please choose any one number,\n1.addition\n2.substraction\n3.multiplication\n4.division");
        int num = scanner.nextInt();

        if(num>0 && num<5)
        {
            System.out.println("Enter value 1 :");
            int  a = scanner.nextInt();
            System.out.println("Enter value 2 :");
            int  b = scanner.nextInt();
            switch(num)
            {
                case 1:
                    System.out.println("addition : " + Calculator.add(a, b));
                    break;
    
                case 2:
                    System.out.println("substraction : " + Calculator.sub(a, b));
                    break;
    
                case 3:
                    System.out.println("multiplication : " + Calculator.mul(a, b));
                    break;
    
                case 4:
                    System.out.println("division : " + Calculator.div(a, b));
                    break;
            }
        }
        else
        {
            System.out.println("Incorrect Value!");
        }
    }
}