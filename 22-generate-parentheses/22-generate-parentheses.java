class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int o =n;
        int cl =n;
        String op ="";
        f(op,o,cl,ans);
        return ans;
    }
    static void f(String op,int o,int cl,List<String> ans){
      if(o == 0 && cl == 0){
          ans.add(op);
          return;
      }
        if(o != 0){
            f(op + "(" , o-1,cl,ans);
        }
        if(cl > o){
            f(op + ")",o,cl-1,ans);
            return;
        }
    }
    
}