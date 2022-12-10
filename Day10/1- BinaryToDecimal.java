import java.util.Scanner;

class BinaryToDecimal {
    public static void main(String args[]) {
        Scanner ish = new Scanner(System.in);

        System.out.println("Enter  binary number:");
        int n = ish.nextInt();

        int decimal = 0, p = 0;

        while (n != 0) {
            decimal += ((n % 10) * Math.pow(2, p));
            n = n / 10;
            p++;
        }

        System.out.println(decimal);
    }
}
