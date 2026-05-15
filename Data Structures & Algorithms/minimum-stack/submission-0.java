class MinStack {
    ArrayList<Integer> list = new ArrayList<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        list.add(val);
    }
    
    public void pop() {
        if(list.isEmpty()) return;
        list.remove(list.size()-1);
    }
    
    public int top() {
         int top = list.get(list.size()-1);
         return top;
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for(int val:list){
            min = Math.min(min,val);
        }
        return min;
    }
}
