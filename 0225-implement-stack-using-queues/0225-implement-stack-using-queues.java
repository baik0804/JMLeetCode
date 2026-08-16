import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        if(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size-1; i++){
                q.add(q.poll());
            }
        }
        return q.poll();
    }

    public int top() {
        if(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size-1; i++){
                q.add(q.poll());
            }
        }
        int result = q.poll();
        q.add(result);
        return result;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}