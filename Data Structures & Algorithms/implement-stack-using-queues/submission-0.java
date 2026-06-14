class MyStack {
    Deque<Integer> D ;
    public MyStack() {
      D = new LinkedList<>();  
    }
    
    public void push(int x) {
        D.addLast(x);
    }
    
    public int pop() {
        return D.removeLast();
    }
    
    public int top() {
       return D.getLast(); 
    }
    
    public boolean empty() {
        if(D.isEmpty()) return true;   
    return false; 
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