import java.util.Scanner;

public class leepyear 
{
    public static void main(String[] args)
    {
          Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the  number ");
        int a = scanner.nextInt();
        if(a%4==0)
        {
            if(a%100==0)
            {
                if(a%400==0)
                {
                    System.out.println("It is a leap year");
                }
                else
                {
                    System.out.println("It is not a leap year");
                }
            }
            else
            {
                System.out.println("It is a leap year");
            }
        }
        else
        {
            System.out.println("It is not a leap year");
        }
        scanner.close();
    }
}
