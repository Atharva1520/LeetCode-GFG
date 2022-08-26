class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Integer i : count.keySet()) {
            if (count.get(i) > nums.length / 3) {
                ans.add(i);
            }
        }

        return ans;
    }
}