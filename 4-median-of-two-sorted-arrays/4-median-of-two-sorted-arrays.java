class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n+m];
        for(int i =0;i<n;i++){
            ans[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            ans[n+i]=nums2[i];
        }
        Arrays.sort(ans);
        n = n+m;
    if(n%2==1) 
        return ans[((n+1)/2)-1];
    else return ((double)ans[(n/2)-1]+(double)ans[(n/2)])/2.0;
    }
}