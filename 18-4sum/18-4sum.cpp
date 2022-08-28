class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
          vector<vector<int>> res;
        
        sort(nums.begin(),nums.end());
        
        int n=nums.size();
        
        
        
        for(int i=0;i<n;i++)
        {   
            if(i!=0 && nums[i]==nums[i-1])
               continue;
            for(int j=i+1;j<n;j++)
            {
                //4 sum to 3 sum
                if(j!=i+1 && nums[j]==nums[j-1])
                        continue;
                
                  long long tgt=(long long)target-(long long)nums[i] -(long long)nums[j];
                
                
                 int fst=j+1;
                int scnd=n-1;
            
                if(fst>=scnd)
                    continue;
            
            while(fst<scnd)
            {
                if((long long)(nums[fst]+nums[scnd])==tgt)
                {
                    res.push_back({nums[fst],nums[scnd],nums[i],nums[j]});
                    
                    fst++;
                   while(fst<scnd && nums[fst]==nums[fst-1])
                       fst++;
                    scnd--;
                    while(scnd>fst && nums[scnd]==nums[scnd+1])
                       scnd--;
                    
                    
                }
                
                
                else if((long long)(nums[fst]+nums[scnd])>tgt)
                    scnd--;
                else
                    fst++;
            
            
            }
                
                
            }
        }
      return res;       

    }
};