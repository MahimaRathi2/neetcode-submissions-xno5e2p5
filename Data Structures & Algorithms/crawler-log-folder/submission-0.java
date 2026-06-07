class Solution {
    public int minOperations(String[] logs) {
         Deque<String> stack = new ArrayDeque<>();
        for(String log : logs){
            if(log.equals("../")){
                if(stack.isEmpty())
                    continue;

                stack.pop();
            }else if(log.equals("./"))
                continue;
            else
                stack.push(log);
        }

        return stack.size();
    }
}