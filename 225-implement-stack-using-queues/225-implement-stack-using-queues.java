class MyStack {
        int [] st;
    int top;
    public MyStack() {
        st = new int[10000];
        Arrays.fill(st,-1);
        top = -1;
    }
    
    public void push(int x) {
        top++;
        st[top]=x;
        
    }
    
    public int pop() {
        int x = st[top];
        top--;
        return x;
    }
    
    public int top() {
        return st[top];
    }
    
    public boolean empty() {
       if(top +1 == 0)return true;
        else return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */