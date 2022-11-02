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
    int cnt=0;
    public int countNodes(TreeNode root) {
        Set<TreeNode> vis = new HashSet<>();
        
        if(root == null)cnt =0;
        dfs(root,vis);
        return cnt;
        
    }
    void dfs(TreeNode root,Set<TreeNode> vis){
        if(root == null)return;
        if(!vis.contains(root)){
            cnt++;
            vis.add(root);
        }
        if(root.left != null)dfs(root.left,vis);
        if(root.right != null)dfs(root.right,vis);
        
    }
}