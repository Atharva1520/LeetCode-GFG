class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
    for(int val:nums) sum+=val;
    int t[][]=new int[nums.length+1][(Math.abs(target)+sum)/2+1];
    int s=(target+sum)/2;
    if((float)(target+sum)/2>(float)sum||(target+sum)%2!=0||Math.abs(sum)<Math.abs(target))return 0;
    for(int i=0;i<nums.length+1;i++)
    {
        for(int j=0;j<s+1;j++)
        {
            if(i==0 && j!=0) t[i][j]=0;
            else if(i==0 && j==0) t[i][j]=1;
            else if(nums[i-1]<=j) t[i][j]=t[i-1][j-nums[i-1]]+t[i-1][j];
            else t[i][j]=t[i-1][j];                 
            
        }
    }
    return t[nums.length][s];
    
    }
}