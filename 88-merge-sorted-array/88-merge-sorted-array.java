class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m;
        int j=0;
        while(i < nums1.length) nums1[i++] = nums2[j++];
          int gap=((n+m)%2==1 && (n+m)!=1)?((n+m)/2+1):((n+m)/2);
    while (gap!=0){
        for( i =0 ; i < m+n-gap;i++){
            if(nums1[i]>nums1[i+gap]){
                int temp = nums1[i];
                nums1[i]=nums1[i+gap];
                nums1[i+gap]=temp;
            }
         
        }
        gap=(gap%2==1 && gap!=1)?(gap/2+1):(gap/2);
    }    
        
    }  
}
