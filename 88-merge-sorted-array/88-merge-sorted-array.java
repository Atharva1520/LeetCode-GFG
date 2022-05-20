class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int j = 0;
        for(int i = nums1.length - n;i<nums1.length;i++){
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }
}