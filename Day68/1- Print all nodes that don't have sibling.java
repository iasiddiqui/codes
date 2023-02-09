/*
Given a Binary Tree of size N, find all the nodes which don't have any sibling. You need to return a list of integers containing all the nodes that don't have a sibling in sorted order.

Note: Root node can not have a sibling so it cannot be included in our answer.

Example 1:

Input :
       37
      /   
    20
    /     
  113 

Output: 20 113
Explanation: 20 and 113 dont have any siblings.
*/

class Tree

{   
    
    public static void rec(ArrayList<Integer> ans,Node node){
         if(node==null ){
            return ;
        }
        if(node.left!=null && node.right==null){
            ans.add(node.left.data);
        }
         if(node.left==null && node.right!=null){
            ans.add(node.right.data);
        }
        rec(ans,node.left);
        rec(ans,node.right);
        
    }
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
            ArrayList<Integer> ans =new ArrayList<>();
       
       rec(ans,node);
       if(ans.size()==0){
           ans.add(-1);
           return ans;
       }
         Collections.sort(ans);
        return ans;
    }
}
