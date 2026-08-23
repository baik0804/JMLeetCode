import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] dirs = {{-1,0}, {0,1}, {1,0}, {0,-1}};
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        int fresh = 0;

        Queue<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        if (queue.isEmpty()) {
            if(fresh == 0){
                return 0;
            }
            else
                return -1;
        }

        while(!queue.isEmpty()){
            int num = queue.size();
            for(int i = 0; i < num; i++){
                int[] curOrange = queue.poll();
                for(int[] dir: dirs){
                    int x = curOrange[0] + dir[0];
                    int y = curOrange[1] + dir[1];
                    if(x<row && x>=0 && y<col && y>=0){
                        if(grid[x][y] == 1){
                            grid[x][y] = 2;
                            fresh--;
                            queue.offer(new int[]{x,y});
                        }
                    }
                }
            }
            count++;
        }
        if(fresh != 0){
            return -1;
        }
        return count-1;
    }
}