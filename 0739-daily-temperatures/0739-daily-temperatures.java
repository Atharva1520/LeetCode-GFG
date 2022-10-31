class Solution {
    static class Pair{
       int temp;
        int ind;
        Pair(int temp,int ind){
            this.temp = temp;
            this.ind = ind;
        }
    }
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        ans[n-1]=0;
        Stack<Pair> st = new Stack();
        st.push(new Pair(temp[n-1],n-1));
        for(int i=n-2;i>=0;i--){
           while(!st.isEmpty() && temp[i] >= st.peek().temp){
               st.pop();
           }
            if(!st.isEmpty()){
                ans[i]=st.peek().ind-i;
            }
            st.push(new Pair(temp[i],i));
        }
        return ans;
    }
}