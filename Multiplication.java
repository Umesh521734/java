import java.util.Scanner;

public class Multiplication
{
    public static void main(String [] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the any number");
       int n=input.nextInt();
    System.out.println(n+"th Table");
       for(int i=1;i<=10;i++)
       {
         int s =n*i;
        System.out.println(n+" * " + i+ " = "+s);
       }
      input.close();
    }
}
