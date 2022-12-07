import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int num = sc.nextInt();
        int num1 = num;
        int result = 0;
        while (num1 > 0) {
            int rem = num1 % 10;
            result = result * 10 + rem;
            num1 = num1 / 10;
        }
        if (num == result) {
            System.out.println("given number in palindrom number");
        } else {
            System.out.println("Not a palindrom number");
        }

    }

}
