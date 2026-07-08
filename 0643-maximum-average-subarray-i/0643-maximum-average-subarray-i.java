class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum=0;
        for(int i=0;i<k;i++){
            maxSum+=nums[i];
        }
        int sum = maxSum;
        for(int i=k;i<nums.length;i++){
            sum = nums[i]+sum-nums[i-k];
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return (double)maxSum/k;
    }
}