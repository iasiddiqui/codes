/*
Given an array of positive integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
 

Example 1:

Input:
N = 7
a[] = {2,6,1,9,4,5,3}
Output:
6
Explanation:
The consecutive numbers here
are 1, 2, 3, 4, 5, 6. These 6 
numbers form the longest consecutive
subsquence.
*/



//User function Template for Java

class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   // add your code here
	   int count=1,ans=0,num=0;
	   Arrays.sort(arr);
	   TreeSet<Integer> set = new TreeSet<Integer>();
	   for(int i=0;i<n;i++)
	   {
	       set.add(arr[i]);
	   }
	   int ele = set.stream().findFirst().get();
	   for(int val : set)
	   {
	       if(ele+1==val) count++;
	       else count=1;
	       ans=Math.max(ans,count);
	       ele=val;
	   }
	   return ans;
	   
	}
}
