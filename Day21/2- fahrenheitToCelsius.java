import java.util.Scanner;

public class fahrenheitToCelsius {

    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value (degree) in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}
