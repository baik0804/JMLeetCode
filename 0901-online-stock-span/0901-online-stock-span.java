import java.util.ArrayDeque;
import java.util.Deque;

class StockSpanner {
    private Deque<Integer> span;
    private int[] stock;
    private int[] res;
    private int currentIndex;

    public StockSpanner() {
        span = new ArrayDeque<>();
        stock = new int[10000];
        res = new int[10000];
        currentIndex = -1;
    }

    public int next(int price) {
        int spans = 1;
        currentIndex++;
        while(!span.isEmpty() && stock[span.peek()] <= price){
            spans += res[span.pop()];
        }
        span.push(currentIndex);
        stock[currentIndex] = price;
        res[currentIndex] = spans;
        
        return spans;
    }
}