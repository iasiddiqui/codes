/*
Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. 
 

Example 1:

Input:
a1[] = {11, 1, 13, 21, 3, 7}
a2[] = {11, 3, 7, 1}
Output:
Yes
Explanation:
a2[] is a subset of a1[]
*/



//User function Template for Java


class Compute {
    

    public String isSubset( long a1[], long a2[], long n, long m) {
        
        Arrays.sort(a1);
        Arrays.sort(a2);
        

        int second = 0;
        int first = 0;
        
        String found = "Yes";
        
        if(n < m) {
            return "No";
        }
        
        while(second < m && first < n) {
            if(a1[(int)first] < a2[(int)second]) {
                first++;
            }else if(a1[(int)first] == a2[(int)second]) {
                first++;
                second++;
            }
            else if(a1[(int)first] > a2[(int)second]) {
                found = "No";
                break;
            }
        }
        
        return found;
        
        
        
    }
}
