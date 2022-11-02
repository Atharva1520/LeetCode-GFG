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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)return 0;
        int ans = Integer.MIN_VALUE;
        ArrayDeque<Pair<TreeNode,Integer>> q = new ArrayDeque<>();
        q.add(new Pair(root,0));
    
        while(!q.isEmpty()){
            int size = q.size();
            ans = Math.max(ans,q.getLast().getValue() - q.getFirst().getValue()+1);
            for(int i=0;i<size;i++){
                Pair<TreeNode,Integer> p = q.poll();
                TreeNode temp = p.getKey();
                int ind = p.getValue();
               if(temp.left != null) q.add(new Pair(temp.left,2*ind+1));
               if(temp.right != null) q.add(new Pair(temp.right,2*ind+2));
            }
        }
        return ans;
    }
}