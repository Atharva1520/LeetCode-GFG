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
    static ArrayList<Integer> ans;
    public List<Integer> postorderTraversal(TreeNode root) {
        ans = new ArrayList<>();
        postorder(root);
        return ans;
    }
    static void postorder(TreeNode root){
       if(root == null){
           return ;
       }
        
        postorder(root.left);
        postorder(root.right);
        ans.add(root.val);
        
    }
}