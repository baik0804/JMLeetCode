class Solution {
    public int maxSubArray(int[] nums) {
        int globalMax = nums[0];
        int currnetMax = nums[0];
        int length = nums.length;

        for(int i=1;i<length;i++){
            currnetMax = Math.max(currnetMax+nums[i],nums[i]);
            globalMax = Math.max(globalMax,currnetMax);
        }
        
        return globalMax;
    }
}