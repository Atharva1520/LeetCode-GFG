class Solution {
public:
    bool judgeCircle(string moves) {
         int u=0,d=0, l=0,r=0;
        
        for(auto x : moves){
            
            if (x=='U') u++;
            
            else if (x=='D') d++;
            
            else if (x=='L') l++;
            
            else r++;
        }
        
        
            return (u!=d || l!=r) ? false : true;
    }
};