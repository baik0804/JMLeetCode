class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        for(int num : nums){
            rightSum += num;
        }
        rightSum = rightSum - nums[0];
        ans[0] = rightSum;
        for(int i = 1; i < nums.length; i++){
            rightSum -= nums[i];
            leftSum += nums[i-1];
            ans[i] = Math.abs(leftSum - rightSum);
        }
        return ans;
    }
}