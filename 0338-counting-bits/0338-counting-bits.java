class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        int before = 1;
        for(int i=1;i<=n;i++){
            if(i/(before*2) == 1)
                before *= 2;
            ans[i] = 1 + ans[i-before];
        }
        return ans;
    }
}