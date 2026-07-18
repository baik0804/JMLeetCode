class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int longest = 0;
        int start = 0;
        int end = 0;
        int[] index = new int[128];
        for(int i=0;i<128;i++){
            index[i] = -1;
        }
        char[] chars = s.toCharArray();

        for(int i = 0; i < len; i++) {
            if(index[chars[i]] == -1) {
                index[chars[i]] = i;
                end = i;
            }
            else{
                for(int j=start;j<index[chars[i]];j++){
                    index[chars[j]] = -1;
                }
                start = index[chars[i]]+1;
                index[chars[i]] = i;
                end = i;
            }
            longest = Math.max(longest, end-start+1);
        }
        return longest;
    }
}