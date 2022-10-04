class Solution {
    public int countVowelStrings(int n) {
        String vow = "aeiou";
        return f(0,vow,n);
    }
    static int f(int ind,String vow,int n){
        if(n == 0)return 1;
        if(ind>= 5)return 0;
        
        int pick=f(ind,vow,n-1);
        int not = f(ind+1,vow,n);
        return pick + not;
    }
}