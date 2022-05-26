class Solution {
    ArrayList<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
      ans = new ArrayList<>();
        subsetmaker(0,new ArrayList<>(),nums);
        return ans;
        
    }
    public void subsetmaker(int start, ArrayList<Integer> al,int nums[]){
        ans.add(new ArrayList<>(al));
        for(int i = start;i < nums.length;i++){
            al.add(nums[i]);
            subsetmaker(i+1,al,nums);
            al.remove(al.size() - 1);
        }
        
    }
}