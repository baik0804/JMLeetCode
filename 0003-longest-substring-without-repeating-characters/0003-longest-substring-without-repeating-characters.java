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
                start = Math.max(start,index[chars[i]]+1);
                index[chars[i]] = i;
                end = i;
            }
            longest = Math.max(longest, end-start+1);
        }
        return longest;
    }
}