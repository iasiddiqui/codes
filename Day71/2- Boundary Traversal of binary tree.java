/*
Given a Binary Tree, find its Boundary Traversal. The traversal should be in the following order: 

Left boundary nodes: defined as the path from the root to the left-most node ie- the leaf node you could reach when you always travel preferring the left subtree over the right subtree. 
Leaf nodes: All the leaf nodes except for the ones that are part of left or right boundary.
Reverse right boundary nodes: defined as the path from the right-most node to the root. The right-most node is the leaf node you could reach when you always travel preferring the right subtree over the left subtree. Exclude the root from this as it was already included in the traversal of left boundary nodes.
Note: If the root doesn't have a left subtree or right subtree, then the root itself is the left or right boundary. 

Example 1:

Input:
        1 
      /   \
     2     3  
    / \   / \ 
   4   5 6   7
      / \
     8   9
   
Output: 1 2 4 8 9 6 7 3
Explanation:

*/


class Solution
{
   static ArrayList<Integer> ans;
	ArrayList <Integer> boundary(Node node)
	{
	    ans=new ArrayList<>();
    	if(node==null)
    	   return ans;
	    ans.add(node.data);
	    if(isLeaf(node))
	    return ans;
	    left(node.left);
	    leaves(node);
	    right(node.right);
	    return ans;
	}
	
	static boolean isLeaf(Node root)
	{
	    return (root.left==null) && (root.right==null);
	}
	static void left(Node root)
	{
	    if(root==null)
	    return;
        if(root.left!=null){
            ans.add(root.data);
            left(root.left);
        }
        else if(root.right!=null){
            ans.add(root.data);
            left(root.right);
        }
	}
	static void leaves(Node root)
	{
	        if(root==null)
	        return;
	        if(isLeaf(root)){
	        ans.add(root.data);
	        return;
	        }
	        leaves(root.left);
	        leaves(root.right);
	}
	
	static void right(Node root)
	{
	    if(root==null)
	    return;
        if(root.right!=null){
            right(root.right);
            ans.add(root.data);
        }
        else if(root.left!=null){
            right(root.left);
            ans.add(root.data);
        }
	}
}
