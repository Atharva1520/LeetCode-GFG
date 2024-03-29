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
int ans =0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxht(root);
        return ans;
    }
  private  int maxht(TreeNode root){
        if(root == null)return 0;
        int lh = maxht(root.left);
        int rh = maxht(root.right);
        ans = Math.max(ans,lh+rh);
        return 1 + Math.max(lh,rh);
        
    }
}