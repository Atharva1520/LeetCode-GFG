class Solution {
public:
    int findMin(vector<int>& nums) {
        
        // int mn=*min_element(nums.begin(),nums.end());
        // return mn;
        int l=0;
        int r=nums.size()-1;
        // return search(nums,l,r);
		
		//Iterative c++ solution
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[r]){
                l=mid+1;
            }else if(nums[mid]<nums[r]){
                r=mid;
            }else{
                r=r-1;
            }
        }
        return nums[l];
    
    }
};