import java.util.ArrayDeque;
import java.util.Deque;

class RecentCounter {
    private Deque<Integer> queue;
    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        int past_3000 = t-3000;
        while(!queue.isEmpty() && queue.getFirst() < past_3000){
            queue.removeFirst();
        }
        queue.addLast(t);

        return queue.size();
    }
}