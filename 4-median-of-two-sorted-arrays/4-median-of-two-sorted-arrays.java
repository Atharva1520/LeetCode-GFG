class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
        double a = 0.0;
        int n=nums1.length;
        int m = nums2.length;
        for(int i=0;i<n;i++){
            pq.add(nums1[i]);
        }
        for(int i=0;i<m;i++){
            pq.add(nums2[i]);
        }
        int ans[] = new int[n+m+1];
        int k=0;
        while(!pq.isEmpty()){
            ans[k] = pq.remove();
            k++;
        }
        if((n + m) % 2 ==0 ) 
            a =(double) (ans[((n+m)/2 ) - 1]+ans[((n+m)/2)]) / 2;
        else
       a =  ans[(n+m)/2];
        
        
        return a;
    }
}