import java.util.Scanner;

class ArrayAlter {
    public static void main(String[] args) {
        int n, res, i, j = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements ");
        for (i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (i = 0; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
