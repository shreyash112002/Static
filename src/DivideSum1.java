


import java.util.Scanner;

class DivideSum1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers ");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;

        try
        {
            c=a/b;
            System.out.println("Division result is "+c);
        }
        catch(ArithmeticException AE)
        {
            System.out.println("Denominator should be positive");
        }
        c=a+b;
        System.out.println("Addition result is "+c);
    }
}
