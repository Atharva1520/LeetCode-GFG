class Solution {
public:
    bool isHappy(int n) {
        int sum = 0;
        int count = 0;
        int cycle = 0;
        while(true)
        {   
            sum = 0;
            while(n != 0)
            {
                sum += (n%10)*(n%10);
                n /= 10;
            }
            if(count == 10)
                cycle = sum;
            if(sum == 1)
                return true;
            else if(sum == cycle && count != 10)
                return false;
            else
                n = sum;
            count++;
        }
    }
};