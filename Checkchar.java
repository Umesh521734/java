import java.util.Scanner;
public class Checkchar
{    
    public static void main(String [] args)
    {
    Scanner input = new Scanner(System.in); 
    System.out.println("Enter the alphabet :");
    char alphabet=input.next().charAt(0);
   
    
    if( alphabet >='a' && alphabet >='Z' || alphabet >='A'&& alphabet >='Z')
    {
        System.out.println("It is an alphabet ");
    }
    else
    {
        System.out.println("It is not an alphabet ");
    }
    input.close();
}
}
