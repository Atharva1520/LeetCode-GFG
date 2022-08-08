class Solution {
public:
    int majorityElement(vector<int>& a) {
       int n=a.size();
        int c=0;
        int can;
        for(int i=0;i<n;i++)
        {
            if(c==0)
            {
                can=a[i];
            }
            if(can==a[i])
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        return can;
    }
    
};