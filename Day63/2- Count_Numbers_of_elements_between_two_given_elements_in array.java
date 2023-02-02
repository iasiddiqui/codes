/*
Given an unsorted array and two elements num1 and num2. The task is to count the number of elements occurs between the given elements (excluding num1 and num2). If there are multiple occurrences of num1 and num2, we need to consider leftmost occurrence of num1 and rightmost occurrence of num2.

 

Example 1:

Input : Arr[] = {4, 2, 1, 10, 6}
num1 = 4 and num2 = 6
Output : 3
Explanation:
We have an array [4, 2, 1, 10, 6] and num1 = 4 and num2 = 6. 
So, the left most index of num1 is 0 and rightmost index of num2 is 4. 
So, the total number of element between them is [2, 1, 10] So, function will return 3 as an answer.
*/


class Solution{
    
    static int getCount(int arr[], int n, int num1, int num2) 
    { 
        // Complete the function
        int count=0;
        int i=0;
        int j=n-1;
        while(arr[i]!=num1){
            i++;
        }
        while(arr[j]!=num2){
            j--;
        }
        while(i+1<j){
            count++;
            j--;
        }
        return count;
    }
}
