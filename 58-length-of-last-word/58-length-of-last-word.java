class Solution {
    public int lengthOfLastWord(String s) {
        int count =0 ;
      int ind = s.length() - 1;
        while(ind >= 0 && s.charAt(ind) == ' '){
            ind--;
        }
        while(ind >= 0 && s.charAt(ind) != ' '){
            ind--;
            count++;
        }
        return count;
    }
}