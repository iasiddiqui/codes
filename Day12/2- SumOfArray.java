
/*Java Program to find the sum of all the elements in the array using */
import java.util.*;
import java.util.Arrays;

//Driver Code
public class SumOfArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n; // Declare array size
        System.out.println("Enter the total number of elements ");
        n = sc.nextInt(); // Initialize array size

        int arr[] = new int[n]; // Declare the array
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < n; i++) // Initialize the array
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0; // Variable to calculate the total sum
        // Using For each loop
        for (int num : arr) {
            sum = sum + num; // Increment the value of sum in each iteration
        }

        // Print the total sum
        System.out.println("The sum of all the elements in the array is " + sum);

    }
}
