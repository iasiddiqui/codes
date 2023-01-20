import java.util.Scanner;

public class Plus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        System.out.print("Enter Symbol : ");

        char c = sc.next().charAt(0);

        for (int i = 1; i <= n * 2 - 1; i++) {
            if (i != n)
                for (int j = 1; j <= n; j++)

                {
                    if (j == n)
                        System.out.print(c);
                    System.out.print(" ");

                }
            else
                for (int j = 1; j <= n * 2 - 1; j++)

                {

                    System.out.print(c);

                }

            System.out.println();

        }

    }
}
