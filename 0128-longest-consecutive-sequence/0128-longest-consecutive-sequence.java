import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int curNum = num;
                int currentMax = 1;

                while(set.contains(curNum+1)){
                    curNum++;
                    currentMax++;
                }
                max = Math.max(max, currentMax);
            }
        }
        return max;
    }
}