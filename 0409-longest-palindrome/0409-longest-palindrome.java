class Solution {
    public int longestPalindrome(String s) {
        int[] words = new int[64];
        int len = s.length();
        int longest = 0;
        boolean oddFlag = false;
        for(int i=0;i<len;i++){
            words[s.charAt(i)-'A']++;
        }

        for(int i=0;i<64;i++){
            int number = words[i];
            if(number % 2 != 0){
                if(!oddFlag){
                    oddFlag = true;
                }
                longest += number-1;
            }
            else{
                longest += number;
            }
        }
        if(oddFlag){
            longest++;
        }
        return longest;
    }
}