import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        int length = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < length-2; i++) {
            int x = nums[i];
            int y = i+1;
            int z = length-1;

            while(y<z){
                int sum = x+nums[y]+nums[z];

                if(sum == 0){
                    set.add(Arrays.asList(nums[i],nums[y],nums[z]));
                    y++;
                }
                else if(sum < 0){
                    y++;
                }
                else{
                    z--;
                }
            }
        }
        for(List<Integer> list : set){
            res.add(list);
        }
        return res;
    }
}