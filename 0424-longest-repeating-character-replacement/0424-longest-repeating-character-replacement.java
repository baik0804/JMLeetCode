import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        char[] words = s.toCharArray();
        int left = 0, right = 0;
        int strLen = s.length();
        int maxLen = 0;
        int currLen = 0;
        int maxFreq = 0;

        while(right < strLen){
            if(freq.containsKey(words[right])){
                freq.put(words[right], freq.get(words[right]) + 1);
            }
            else{
                freq.put(words[right], 1);
            }
            maxFreq = Math.max(maxFreq, Collections.max(freq.values()));
            currLen++;

            if(k<currLen-maxFreq){
                freq.put(words[left], freq.get(words[left]) - 1);
                left++;
                currLen--;
            }

            maxLen = Math.max(maxLen, currLen);
            right++;
        }
        return maxLen;
    }
}