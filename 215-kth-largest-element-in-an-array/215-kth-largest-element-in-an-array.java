class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i = 0 ; i < nums.length ; i++){
            ans.add(nums[i]);
        }
        while(k > 1){
            ans.remove(ans.peek());
            k--;
        }
        return ans.peek();
    }
}