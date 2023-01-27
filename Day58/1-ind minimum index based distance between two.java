/*You are given an array A, of N elements. Find minimum index based distance between two elements of the array, x and y.

Example 1:

Input:
N = 4
A[] = {1,2,3,2}
x = 1, y = 2
Output: 1
Explanation: x = 1 and y = 2. There are two distances between x and y, which are 1 and 3 out of which the least is 1.
*/

class Solution {
    int minDist(int a[], int n, int x, int y) {
        // code here
        int dist = 0;
        ArrayList <Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(a[i]==x){
                for(int j=0;j<n;j++){
                    if(a[j]==y){
                        dist=Math.abs(i-j);
                         l.add(dist);
                    }
                }
            }
        }
        if(l.isEmpty()==true){
            return -1;
        }
        else{
            Collections.sort(l);
            return l.get(0);
        }
    }
}
