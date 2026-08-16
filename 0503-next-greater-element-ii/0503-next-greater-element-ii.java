import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int[] res = new int[n];

        Arrays.fill(res, -1);

        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() &&  nums[stack.peek()] < nums[i]){
                 res[stack.pop()] = nums[i];
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            int idx = stack.pop();
            for(int i = 0;i<idx;i++){
                if(nums[i] > nums[idx]){
                    res[idx] = nums[i];
                    break;
                }
            }
        }
        return res;
    }
}