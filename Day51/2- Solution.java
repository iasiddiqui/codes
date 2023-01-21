/*Given an array arr[] of size N and an integer K. Find the maximum for each and every contiguous subarray of size K.

Example 1:

Input:
N = 9, K = 3
arr[] = 1 2 3 1 4 5 2 3 6
Output: 
3 3 4 5 5 5 6 
Explanation: 
1st contiguous subarray = {1 2 3} Max = 3
2nd contiguous subarray = {2 3 1} Max = 3
3rd contiguous subarray = {3 1 4} Max = 4
4th contiguous subarray = {1 4 5} Max = 5
5th contiguous subarray = {4 5 2} Max = 5
6th contiguous subarray = {5 2 3} Max = 5
7th contiguous subarray = {2 3 6} Max = 6  */






//User function template for JAVA

class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        //your code here
        ArrayList<Integer> AL = new ArrayList<Integer>();
        int start = 0;
        int end = k;
        int max1 = 0;
        while(start >= 0 && end <= n){
            for(int i = start;i<end;i++){
                max1 = Math.max(max1,arr[i]);
            }
            AL.add(max1);
            max1 = 0;
            start++;
            end++;
        }
        return AL;
    }
}

