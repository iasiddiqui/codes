/* 
Sum of Array Elements

Given an integer array arr of size n, you need to sum the elements of arr.

Example 1:

Input:
n = 3
arr[] = {3 2 1}
Output: 6
*/

//User function Template for Java

class Get
{
    public static int sumElement(int arr[], int n)
    {
        // Your code here
        int sum = 0;
        for(int i = 0;i <n; i++){
            sum = sum +arr[i];
        }
        return sum;
    }
}
