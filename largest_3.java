import java.util.Scanner;

public class largest_3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number a : ");

        int a = input.nextInt();

        System.out.print("Enter number b : ");

        int b = input.nextInt();

        System.out.print("Enter number c : ");

        int c = input.nextInt();

        int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

        System.out.print("The largest number is : " + largest);

        input.close();

    }

}
