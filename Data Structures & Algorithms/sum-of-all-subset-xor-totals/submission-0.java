class Solution {
    public int subsetXORSum(int[] nums) {
       return  SumXor(nums,0,0);
    }
    private int SumXor(int []nums, int index,int currXor){
    if(index==nums.length){
        return currXor;
    }

        int yes = SumXor(nums,index+1,currXor^nums[index]);
        int no = SumXor(nums,index+1,currXor);
        return yes+no;
    }
}