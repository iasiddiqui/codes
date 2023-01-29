/*
Given an array arr[] of size N and an integer K, the task is to left rotate the array K indexes

Example 1:

Input: N = 7, K = 2
arr[] = {1, 2, 3, 4, 5, 6, 7}
Output: 3 4 5 6 7 1 2
Explanation: Rotation of the above array by 2 will make the output array .
*/

class Solution
{
    void leftRotate(long arr[], int k,int n)
    {
        k=k%n;
        int low=0;
        int high=k-1;
        while(low<high){
            long temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        low=k;
        high=n-1;
        while(low<high){
            long temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        low=0;
        high=n-1;
        while(low<high){
            long temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
    }
}
