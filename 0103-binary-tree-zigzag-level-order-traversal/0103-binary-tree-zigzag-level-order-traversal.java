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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> ar=new ArrayList<>();
        if(root==null){
            return ar;
        }
        Deque<TreeNode> dq=new LinkedList<>();
        int n=0;
        dq.offerFirst(root);
        while(!dq.isEmpty()){
            List<Integer> x=new ArrayList<>();
            if(n%2==0){
                int l=dq.size();
                for(int i=0;i<l;i++){
                    TreeNode temp=dq.pollFirst();
                    x.add(temp.val);
                    if(temp.left!=null)
                    dq.offerLast(temp.left);
                    if(temp.right!=null)
                        dq.offerLast(temp.right);
                }
            }else{
                int l=dq.size();
                for(int i=0;i<l;i++){
                    TreeNode temp=dq.pollLast();
                    x.add(temp.val);
                    if(temp.right!=null){
                        dq.offerFirst(temp.right);
                    }if(temp.left!=null){
                        dq.offerFirst(temp.left);
                    }
                }
            }
            ar.add(x);
            n++;
        }
        return ar;
    }
}