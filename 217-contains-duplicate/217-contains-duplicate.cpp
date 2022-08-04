class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
         bool flag = false;
        unordered_map <int, int> count;
        for(auto i:nums) {
            if(count[i]>0){
                flag = true;
                break;
            }
            count[i]++;
        }
        return flag;
    }
};