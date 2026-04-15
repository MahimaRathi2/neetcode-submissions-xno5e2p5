class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int MinLenWindow = Integer.MAX_VALUE;
       int currSum=0;
       int low=0,high=0;
       while(high<nums.length){
        currSum += nums[high];
        high++;
        while(currSum>=target){
            int currLenWindow = high-low;
            MinLenWindow = Math.min(MinLenWindow,currLenWindow);
           currSum -=nums[low];
           low++;

        }
       } 
     return MinLenWindow == Integer.MAX_VALUE ? 0: MinLenWindow;
    }
}