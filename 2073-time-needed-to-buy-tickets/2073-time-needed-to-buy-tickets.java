import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int numberOfTickets = tickets.length;
        int time = 0;
        int currentIdx = 0;
        
        while(true){
            if(tickets[currentIdx] <= 0){}
            else{
                tickets[currentIdx]--;
                time++;
                if(tickets[currentIdx] == 0 && currentIdx == k){
                    break;
                }
            }
            currentIdx = (currentIdx + 1) % numberOfTickets;
        }
        return time;
    }
}