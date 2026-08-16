import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int n = nums1.length;
         int[] result = new int[n];
         int[] nextGreaterElementArray = new int[10001];
         Arrays.fill(nextGreaterElementArray, -1);

         Deque<Integer> stack = new ArrayDeque<>();
         // monotonic stack
         for(int i = 0; i < nums2.length; i++){
             while(!stack.isEmpty() && stack.peek() < nums2[i]){
                 nextGreaterElementArray[stack.pop()] = nums2[i];
             }
             stack.push(nums2[i]);
         }
         
         for(int i = 0; i < n; i++){
             result[i] = nextGreaterElementArray[nums1[i]];
         }
         return result;
    }
}