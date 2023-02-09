/*
Given a Binary Tree, convert it into its mirror.
MirrorTree1            

Example 1:

Input:
      1
    /  \
   2    3
Output: 3 1 2
Explanation: The tree is
   1    (mirror)  1
 /  \    =>      /  \
2    3          3    2
The inorder of mirror is 3 1 2
*/

class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node root) {
        // Your code here
        if(root==null) return ;
        else{
            Node temp = root.left;
        root.left= root.right;
        root.right= temp;
        mirror(root.left);
        mirror(root.right);
        }
    }
   
}
