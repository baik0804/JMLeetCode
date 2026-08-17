import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int len = tickets.length;
        
        for(int i = 0; i < len; i++){
            if(i<=k){
                time += Math.min(tickets[i], tickets[k]);
            }
            else{
                time += Math.min(tickets[i], tickets[k]-1);
            }
        }
        return time;
    }
}