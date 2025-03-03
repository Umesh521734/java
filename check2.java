import java.util.Scanner;
public class check2 
{
    public static void main(String [] args)
{
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter any alphabet");
    char a =scanner.next().charAt(0);
    if(a=='a'||a=='e'|| a=='i'|| a=='o'|| a=='u')
    {
         System.out.println("The alphabet is vowel") ;
    }
    else
    {
        System.out.println("The alphabet is consonant") ;
    }
    scanner.close();
}
}
