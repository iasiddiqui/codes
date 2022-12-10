import java.util.*;

public class sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int num = sc.nextInt();
        int number[] = new int[num];

        // input
        System.out.println("Enter the value to be check ");
        for (int i = 0; i < num; i++) {
            number[i] = sc.nextInt();
        }

        // output
        boolean isAscending = true;
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]) {
                isAscending = false;
                // System.out.println(number[i]);
                // System.out.print("Array is Sorted");
            }
        }
        if (isAscending) {
            System.out.println("array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
        /*
          else {
          int temp = number[i];
          number[i] = number[i + 1];
          System.out.println("not sorted");
          }
         */
    }

}
