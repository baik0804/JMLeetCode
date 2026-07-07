class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        for(;fast<nums.length; fast++) {
            if(nums[fast] != 0){
                swap(nums, slow++, fast);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}