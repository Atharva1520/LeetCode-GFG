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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans =  new ArrayList<>();
        if(root != null){
            f(ans,"",root);
        }
        return ans;
    }
    public static void f(List<String> ans,String cur,TreeNode node){
        if(node.left == null && node.right == null) ans.add(cur +node.val);
        if(node.left != null) f(ans, cur + node.val + "->",node.left);
         if(node.right != null) f(ans,cur + node.val + "->",node.right);
        
    }
}