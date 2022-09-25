class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1>n2) return findMedianSortedArrays(nums2,nums1);
    int l=0;
    int r=n1;
    
    while(l<=r){
        
        int mid1=l+(r-l)/2;
        int mid2=(n1+n2+1)/2 - mid1;
        // we are doing +1 because we want more elements in left side. 
        // to make buckets
        
        int max1= mid1==0 ? Integer.MIN_VALUE : nums1[mid1-1];
        int max2= mid2==0 ? Integer.MIN_VALUE : nums2[mid2-1];
        
        int min1= mid1==n1 ? Integer.MAX_VALUE :  nums1[mid1];
        int min2= mid2==n2 ? Integer.MAX_VALUE : nums2[mid2];
        // when even elements where will be two median , when odd middle will be median . 
        if(max1<=min2 && max2<=min1){
            if((n1+n2)%2==0){
                return ((double)Math.max(max1,max2) +  Math.min(min1,min2))/2;
            }
            else// odd
                return (double)Math.max(max1,max2);
        }
        else{
            if(max2>min1){
                l=mid1+1;
            }
            else
                r=mid1-1;
        }
        
    }
    
    return 0.0;
    
    
}

}