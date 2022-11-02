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
    public int countNodes(TreeNode root) {
        int cnt=0;
        Set<TreeNode> vis = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)return cnt;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                cnt++;
                if(cur.left != null)q.add(cur.left);
                if(cur.right != null)q.add(cur.right);
                
            }
        }
        return cnt;
    }
}