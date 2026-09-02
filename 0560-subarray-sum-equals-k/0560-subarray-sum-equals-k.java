import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int currentSum = 0;
        int length = nums.length;

        map.put(0,1);
        for(int i = 0; i < length; i++){
            currentSum += nums[i];
            if(map.containsKey(currentSum - k)){
                count += map.get(currentSum - k);
            }
            map.put(currentSum,map.getOrDefault(currentSum,0) + 1);
        }
        return count;
    }
}