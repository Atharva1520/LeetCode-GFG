/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return symmetric(root.right,root.left);
    }
    public boolean symmetric(TreeNode right,TreeNode left){
        if(right == null || left == null)
            return left == right;
        if(right.val != left.val)
            return false;
        
        return symmetric(right.right,left.left) && symmetric(right.left,left.right);
        
    }
}