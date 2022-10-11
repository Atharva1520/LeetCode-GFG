class Solution {
    public String removeDigit(String number, char digit) {
    
        for(int i=0;i<number.length()-1;i++){
            if(number.charAt(i) == digit && number.charAt(i+1) >  digit){
                return number.substring(0,i)+number.substring(i+1,number.length());
            }
        }
       int lastIdx = number.lastIndexOf(digit);
        return number.substring(0, lastIdx) + number.substring(lastIdx + 1);
}
}