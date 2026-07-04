class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int curWealth = 0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                curWealth += accounts[i][j];
            }
            if(curWealth>maxWealth){
                maxWealth = curWealth;
            }
            curWealth = 0;
        }

        return maxWealth;
    }
}