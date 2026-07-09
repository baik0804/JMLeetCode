import java.util.Arrays;

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDifference = 100000;
        for(int i=0;i<nums.length-k+1;i++){
            if(nums[i+k-1] - nums[i] < minDifference){
                minDifference = nums[i+k-1] - nums[i];
            }
        }
        return minDifference;
    }
}