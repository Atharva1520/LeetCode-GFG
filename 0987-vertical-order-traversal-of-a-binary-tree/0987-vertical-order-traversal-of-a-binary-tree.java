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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        dfs(root,0,0,map);
        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> m : map.values()){
            ans.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes:m.values()){
                while(!nodes.isEmpty()){
                    ans.get(ans.size()  - 1).add(nodes.poll());
                }
            }
        }
        return ans;
    }
    void dfs(TreeNode root,int level,int vertical,TreeMap<Integer, TreeMap<Integer,PriorityQueue<Integer>>> map){
        if(root == null)return;
        if(!map.containsKey(vertical)){
            map.put(vertical,new TreeMap<>());
        }
        if(!map.get(vertical).containsKey(level)){
            map.get(vertical).put(level,new PriorityQueue<>());
        }
        map.get(vertical).get(level).add(root.val);
        dfs(root.left,level+1,vertical-1,map);
        dfs(root.right,level+1,vertical+1,map);
    }
}