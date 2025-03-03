import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value");
        int n=input.nextInt();
        int a0=0;
        int a1=1;
        int a;

        for(int i=1;i<=n;i++)
        {
            a=a0+a1;
            System.out.print(a0+ "  ");
            a0=a1;
            a1=a;

        }
        input.close();
    }
}
