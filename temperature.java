import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {

        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = Scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("Temperature in Celsius: " + celsius);
        }
    }
}
