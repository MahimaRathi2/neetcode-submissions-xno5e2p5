class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
         int nextGreater[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
             Stack<Integer> s= new Stack<>();
             int idx=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    idx = j;
                    break;
                }
            }
            for(int j=n-1;j>idx;j--){
                while(!s.isEmpty()&&s.peek()<=nums2[j]){
                    s.pop();
                }
                s.push(nums2[j]);
            }
                while(!s.isEmpty() && s.peek()<=nums1[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    nextGreater[i]=-1;
                }else{
                    nextGreater[i]=s.peek();
                }
               
            
        }
        return nextGreater;
    }
}