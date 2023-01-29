/*
The cost of stock on each day is given in an array A[] of size N. Find all the segments of days on which you buy and sell the stock so that in between those days your profit is maximum.

Note: Since there can be multiple solutions, the driver code will print 1 if your answer is correct, otherwise, it will return 0. In case there's no profit the driver code will print the string "No Profit" for a correct solution.

Example 1:

Input:
N = 7
A[] = {100,180,260,310,40,535,695}
Output:
1
Explanation:
One possible solution is (0 3) (4 6)
We can buy stock on day 0,
and sell it on 3rd day, which will 
give us maximum profit. Now, we buy 
stock on day 4 and sell it on day 6.
*/

class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int buy=0;
        for(int i=1;i<=n;i++){
            if(i==n || arr[i]<arr[i-1]){
                if(arr[i-1]-arr[buy]>0){
                    list.add(new ArrayList<Integer>(Arrays.asList(buy,i-1)));
                }
                buy=i;
            }
        }
        return list;
    }
}
