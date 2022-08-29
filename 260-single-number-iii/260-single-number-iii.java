class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    for(int i = 0 ; i<nums.length ; i++){
        if( i < nums.length-1 && nums[i] == nums[i+1]){
            i = i+1;
        }
        else{
            list.add(nums[i]);
        }
    }
    
    int [] ans = new int[list.size()];
    for(int i = 0 ; i<list.size(); i++){
        ans[i] = list.get(i);    
    }
    return ans;
    }
}