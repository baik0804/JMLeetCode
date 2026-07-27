import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int stringLen = s.length();
        int anagramLen = p.length();
        int[] charFreq = new int[26];
        List<Integer> ans = new ArrayList<>();

        for(int i =0;i<anagramLen;i++) {
            charFreq[p.charAt(i)-'a']++;
        }

        Pos1:
        for(int i =0;i<=stringLen-anagramLen;i++) {
            int[] freq = new int[26];
            for(int j =0;j<anagramLen;j++) {
                freq[s.charAt(i+j)-'a']++;
            }
            for(int j=0;j<26;j++){
                if(charFreq[j] != freq[j]) {
                    continue Pos1;
                }
            }
            ans.add(i);
        }
        return ans;
    }
}