/*
Given a sorted array Arr of size N and a number X, you need to find the number of occurrences of X in Arr.

Example 1:

Input:
N = 7, X = 2
Arr[] = {1, 1, 2, 2, 2, 2, 3}
Output: 4
Explanation: 2 occurs 4 times in the given array.
*/

class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int count=0;
        int st=0;
        while(st<arr.length){
            if(arr[st]==x){
                count++;
            }
            st++;
        }
        return count;
    }
}
