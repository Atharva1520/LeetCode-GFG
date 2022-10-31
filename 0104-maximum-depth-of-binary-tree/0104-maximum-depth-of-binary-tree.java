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
    public int maxDepth(TreeNode root) {
      if (root == null) return 0;
   
    int level = 0;
    Queue<TreeNode> BFSqueue = new LinkedList<>();
    BFSqueue.offer(root);
    
    while ( !BFSqueue.isEmpty() ){
        int size = BFSqueue.size();
        for ( int i = 0; i < size; i++ ) {
            
            TreeNode child = BFSqueue.poll();
            
            if ( child.left != null ) BFSqueue.offer(child.left);
            
            if ( child.right != null ) BFSqueue.offer(child.right);
            
        }
        level++;
    }
    return level;
        
    }
}