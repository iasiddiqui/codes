/*
You are given a connected undirected graph. Perform a Depth First Traversal of the graph.
Note: Use a recursive approach to find the DFS traversal of the graph starting from the 0th vertex from left to right according to the graph.


Example 1:

Input: V = 5 , adj = [[2,3,1] , [0], [0,4], [0], [2]]

Output: 0 2 4 3 1
Explanation: 
0 is connected to 2, 3, 1.
1 is connected to 0.
2 is connected to 0 and 4.
3 is connected to 0.
4 is connected to 2.
so starting from 0, it will go to 2 then 4,
and then 3 and 1.
Thus dfs will be 0 2 4 3 1.
*/

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] vis = new int[V];
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(vis , ans , adj , 0);
        return ans;
    }
    
    public void dfs(int[] vis , ArrayList<Integer> ans , ArrayList<ArrayList<Integer>> adj , int node){
        vis[node] = 1;
        ans.add(node);
        for(int n : adj.get(node)){
            if(vis[n] == 0){
                dfs(vis , ans , adj , n);
            }
        }
    }
}
