class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
       vector<pair<int,string>> res;
        for(int i=0;i<names.size();i++){
            res.push_back({heights[i],names[i]});
        }
        sort(res.rbegin(),res.rend());
        vector<string> ans;
        for(int i=0;i<res.size();i++){
            ans.push_back(res[i].second);
        }
        return ans;
    }
};