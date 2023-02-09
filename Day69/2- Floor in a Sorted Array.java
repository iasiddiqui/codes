/*
Given a sorted array arr[] of size N without duplicates, and given a value x. Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x. Find the index of K(0-based indexing).

Example 1:

Input:
N = 7, x = 0 
arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less 
than 0 is found. So output 
is "-1".
*/



class Solution{
 
    static int findFloor(long arr[], int n, long x)
    {
        int start=0,end=n-1;
        int res=-1;
        while(start<=end)
        {
              int mid=(start)+(end-start)/2;
              if(arr[mid]>x)
              {
                  end=mid-1;
              }
              else
              {
                  res=mid;
                  start=mid+1;
              }
        }
        return res;
    }
    
}
