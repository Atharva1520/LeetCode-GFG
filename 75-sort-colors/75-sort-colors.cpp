class Solution {
public:
    void sortColors(vector<int>& nums) {
       
 int a=0,b=nums.size()-1,i=0;
        
        while(i<=b)
        {
            if(nums[i]==2)
            {
                swap(nums[i],nums[b]);
                b--;
            }
            else if(nums[i]==0)
            {
                swap(nums[i],nums[a]);
                i=a+1;
                a++;
            }
           else
               i++;
        }
    }
};