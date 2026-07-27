import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        int count = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        if(s1Len > s2Len){
            return false;
        }

        for(int i =0;i<s1Len;i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }
            else{
                map.put(s1.charAt(i), 1);
                count++;
            }
        }
        int start = 0;
        int end = 0;

        while(end < s2Len){
            if(map.containsKey(s2.charAt(end))){
                map.put(s2.charAt(end), map.get(s2.charAt(end))-1);
                if(map.get(s2.charAt(end)) == 0){
                    count--;
                }
            }
            if(end - start + 1 < s1Len){
                end++;
            }
            else if(end - start + 1 == s1Len){
                if(count == 0){
                    return true;
                }
                else{
                    if(map.containsKey(s2.charAt(start))) {
                        map.put(s2.charAt(start), map.get(s2.charAt(start)) + 1);
                        if (map.get(s2.charAt(start)) == 1) {
                            count++;
                        }
                    }    
                    start++;
                    end++;
                }
            }
        }
        return false;
    }
}