import java.io.*;
import java.util.*;

public class PetersonNumberExample1 {
    static long[] factorial = new int[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        if (isPeterson(n))
            System.out.println("The given number is a Peterson number.");
        else
            System.out.println("The given number is not a Peterson number.");
    }

    static boolean isPeterson(int n) {
        int num = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += factorial[digit];
            n = n / 10;
        }
        return (sum == num);
    }
}
