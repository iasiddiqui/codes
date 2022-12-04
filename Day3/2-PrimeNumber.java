package lab.com;

import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number do you want to insert");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("given number is a prime number");
        } else {
            System.out.println("not a prime number");
        }
    }

}
