import java.util.Scanner;
public class Sum 
{
    public static void main(String [] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the any number");
       int n=input.nextInt();
       int sum=0;
       for(int i=1;i<=n;i++)
       {
         sum=sum+i;
       }
       System.out.println("The sum of first " + n + " natural numbers is "+sum);
       input.close();
    }
}
