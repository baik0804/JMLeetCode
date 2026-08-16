import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] numberOfDaysYouHaveToWait = new int[n];

        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i = 0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int popIdx = stack.pop();
                numberOfDaysYouHaveToWait[popIdx] = i - popIdx;
            }
            stack.push(i);
        }
        return numberOfDaysYouHaveToWait;
    }
}