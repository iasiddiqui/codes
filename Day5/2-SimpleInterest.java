
import java.util.Scanner;

public class SimpleInterest {
    public static void find() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price");
        int p = sc.nextInt();
        System.out.println("enter rate of interest");
        int r = sc.nextInt();
        System.out.println("enter time");
        int t = sc.nextInt();
        int SI = (p * r * t) / 100;
        System.out.println("Simple intereset=" + SI);
    }

    public static void main(String[] args) {
        find();
    }

}
