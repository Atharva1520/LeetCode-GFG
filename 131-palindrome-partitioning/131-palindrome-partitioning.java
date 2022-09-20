class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path= new ArrayList<>();
        fun(0,s,path,res);
        return res;
        
    }
    public void fun(int ind,String s,  List<String> path, List<List<String>> res){
        if(ind == s.length()){
            res.add(new ArrayList<> (path));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s,ind,i)){
                path.add(s.substring(ind,i+1));
                fun(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int st,int ed){
        while(st <= ed){
            if(s.charAt(st++) != s.charAt(ed--)){
                return false;
            }
        }
        return true;
    }
}