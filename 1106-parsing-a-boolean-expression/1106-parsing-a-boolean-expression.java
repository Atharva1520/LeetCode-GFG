class Solution {
    public boolean parseBoolExpr(String str) {
        return parse(str, 2, str.length()-2, str.charAt(0));
    }
    
    boolean parse(String str, int st, int en, char op){
        for(int i=st;i<=en;i++){
            char ch = str.charAt(i);
            
            if(ch == '&' || ch =='|' || ch == '!'){
                int nwStart = i+2;
                int nwEnd = nwStart;
				
                // Find ending ')' to evaluate
                int temp = nwStart; int level = 1;
                while(temp<str.length()){
                    char chInternal = str.charAt(temp);
                    if(chInternal=='(') level++;
                    else if(chInternal==')') level--;
                    if(level == 0) {
                        nwEnd = temp-1;
                        break;
                    }
                    temp++;
                }
                
				// calculate recursively and stop processing further if not required.
                boolean eval = parse(str, nwStart, nwEnd, ch);
                if(op == '&' && !eval) return false; // found false. No point in going forward.
                if(op == '|' && eval) return true; // found true. No point in going forward.
                if(op == '!') return !eval; // apparently ! will have single expression
                i = nwEnd+1;
            }else if(ch == 'f'){
                if(op == '&') return false;
                //if(op == '|') // continue further
                if(op == '!') return true;
            }else if(ch == 't'){
                //if(op == '&')  // continue further
                if(op == '|') return true;
                if(op == '!') return false;
            }else{ // ,
                // Do nothing
            }
        }
        
        if(op == '&') return true; // survived till here
        else if(op == '|') return false; // couldn't find true until here
        else return true; // should not happen. can it??
    }
  
}