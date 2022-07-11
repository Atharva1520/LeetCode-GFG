class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set <List<Integer>> list  = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum ==0)
                   list.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
           if(sum > 0)
                k--;
        if(sum < 0)
            j++;
            }
        }
        return new ArrayList<List<Integer>>(list);
    }
}