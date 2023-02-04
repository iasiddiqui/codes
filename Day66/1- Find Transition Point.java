/*

Given a sorted array containing only 0s and 1s, find the transition point. 


Example 1:

Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition 
point where 1 begins.
*/

class GfG {
    int transitionPoint(int arr[], int n) {
        // code here
           int l = 0, h = n - 1;

            while(l <= h)

            {

               int m = (l + h) / 2;

               if(arr[m] == 1)

               {

                   if(m==0 || arr[m-1]==0) 

                    return m;

                else 

                    h = m - 1;

                }

                else 

                {

                    l = m + 1;

                } 

            } 

            return -1;
    }
}
