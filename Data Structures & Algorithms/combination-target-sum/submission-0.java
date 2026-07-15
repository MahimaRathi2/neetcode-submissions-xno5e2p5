class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
         List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] nums, int target, int start,
                           List<Integer> curr, List<List<Integer>> ans) {

        // Base Case
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0) {
            return;
        }

        // Try every number starting from 'start'
        for (int i = start; i < nums.length; i++) {
            curr.add(nums[i]);                    // Choose
            backtrack(nums, target - nums[i], i, curr, ans); // Reuse same number
            curr.remove(curr.size() - 1);         // Backtrack
        }
    }
}
