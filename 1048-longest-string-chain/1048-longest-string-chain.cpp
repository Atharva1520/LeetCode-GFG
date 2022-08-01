class Solution {
public:
    bool checkPossible(string &s1,string &s2){
        if(s1.size() != s2.size() + 1){
            return false;
        }
        int f=0;
        int s =0;
        while(f < s1.size()){
            if(s1[f] == s2[s]){
                f++;
                s++;
            }else{
                f++;
            }
        }
        if(f == s1.size() && s == s2.size())return true;
        
        return false;
    }
 static   bool comp(string &s1,string &s2){
        return s1.size() < s2.size();
    }
    int longestStrChain(vector<string>& words) {
     int n = words.size();
        sort(words.begin(),words.end(),comp);
        vector <int> dp(n,1);
        int maxi =1;
        for(int i=0;i<n;i++){
            for(int j = 0;j < i; j++){
                if(checkPossible(words[i],words[j]) && dp[i] < 1 + dp[j]){
                    dp[i]=1+dp[j];
                }
            }
            if(dp[i] > maxi){
                maxi  = dp[i];
            }
        }
        return maxi;
    }
};
