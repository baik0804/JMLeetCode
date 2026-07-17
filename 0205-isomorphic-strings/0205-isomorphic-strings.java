import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Character> map = new HashMap<Character,Character>();
        int len = s.length();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        for(int i=0;i<len;i++){
            if(map.containsKey(ss[i])){
                if(!map.get(ss[i]).equals(tt[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(tt[i])){
                    return false;
                }
                map.put(ss[i],tt[i]);
            }
        }
        return true;
    }
}