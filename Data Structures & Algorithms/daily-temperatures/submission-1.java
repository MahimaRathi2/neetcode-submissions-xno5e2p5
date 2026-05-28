class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n =temperatures.length;
        Stack<Integer> s = new Stack<>();
        int result[] = new int[temperatures.length];
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&temperatures[s.peek()]<temperatures[i]){
                int idx = s.pop();
                result[idx]=i-idx;
            }
            s.push(i);
        }
    return result;
    }
}
