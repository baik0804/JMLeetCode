import java.util.Stack;

class MyQueue {
    private int front;
    private int rear;
    private Stack<Integer> queue;

    public MyQueue() {
        queue = new Stack<>();
    }
    
    public void push(int x) {
        queue.push(x);
    }

    public int pop() {
        int size = queue.size();
        Stack<Integer> newQueue = new Stack<>();
        if(size == 1){
            return queue.pop();
        }
        else{
            for(int i = 0; i < size-1; i++){
                newQueue.push(queue.pop());
            }
            int result = queue.pop();
            for(int i = 0; i < size-1; i++){
                queue.push(newQueue.pop());
            }
            return result;
        }
    }

    public int peek() {
        int size = queue.size();
        Stack<Integer> newQueue = new Stack<>();
        if(size == 1){
            return queue.peek();
        }
        else{
            for(int i = 0; i < size-1; i++){
                newQueue.push(queue.pop());
            }
            int result = queue.pop();
            newQueue.push(result);
            for(int i = 0; i < size; i++){
                queue.push(newQueue.pop());
            }
            return result;
        }
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */