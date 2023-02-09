/*
Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of elements in the intersection (or common elements) of the two arrays.

For this question, the intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

Example 1:

Input:
n = 5, m = 3
a[] = {89, 24, 75, 11, 23}
b[] = {89, 2, 4}

Output: 1

Explanation: 
89 is the only element 
in the intersection of two arrays
*/



// User function Template for Java

class Solution {

    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        int count=0;
   HashSet<Integer>map=new HashSet<>();
   for(int i=0;i<n;i++){
       map.add(a[i]);
       
   }
   for(int i=0;i<m;i++){
       if(map.contains(b[i])){
           count++;
           map.remove(b[i]);
       }
   }
   return count;
    }
}
