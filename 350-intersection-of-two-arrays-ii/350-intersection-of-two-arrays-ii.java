class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n1 : nums1) {
            if(map.containsKey(n1))
                map.put(n1, map.get(n1) + 1);
            else
                map.put(n1, 1);
        }
        
        for (int n2 : nums2) {
            if (map.containsKey(n2) && map.get(n2) > 0) {
                list.add(n2);
                map.put(n2, map.get(n2) - 1);
            }
        }
        
        int ans[] = new int[list.size()];
        int i = 0;
        for (int ele : list) {
            ans[i++] = ele;
        }
        return ans;
    }
}