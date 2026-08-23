import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int numSquares(int n) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n+1];
        int level = 0;

        visited[n] = true;
        queue.add(n);

        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int cur = queue.poll();
                for(int j = 1; j*j <= cur; j++){
                    int next = cur - j*j;
                    if(next == 0){
                        return level;
                    }
                    if(!visited[next]){
                        visited[next] = true;
                        queue.add(next);
                    }
                }
            }
        }
        return level;
    }
}