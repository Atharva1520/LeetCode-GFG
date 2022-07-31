class Solution {
public:
   vector<vector<int>> res;
    void loop(int index,vector<int > &nums,int nums_size)
    {
        if(index==nums_size-1)
        {
            res.push_back(nums);
            return ;
        }
        for(int i = index; i<nums.size();i++)
        {
            swap(nums[i],nums[index]);
            loop(index+1,nums,nums_size);
            swap(nums[i],nums[index]); //bactrack
        }
    }
    vector<vector<int>> permute(vector<int>& nums) 
    {
        vector<int >ch;
        loop(0,nums,nums.size());    
        return res;
    }
};