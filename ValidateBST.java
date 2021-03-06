/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 Logic : 
 Setting the range of Every Node
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
    
     return isValidBSTUtil(root,Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
    
     public boolean isValidBSTUtil(TreeNode root,long min, long max) {
        if(root == null)
            return true;
            
        return (root.val < max && root.val > min) && isValidBSTUtil(root.left,min,root.val) && isValidBSTUtil(root.right,root.val,max);
    }
}
