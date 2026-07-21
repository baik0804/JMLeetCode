class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int strsLen = strs.length;
        int index = 0;
        int minStrLen = 200;
        for(int i = 0; i < strsLen; i++) {
            minStrLen = Math.min(minStrLen, strs[i].length());
        }

        Pos1:
        while(index < minStrLen){
            for(int i = 1; i < strsLen; i++){
                if(strs[i].charAt(index) != strs[i-1].charAt(index))
                    break Pos1;
            }
            sb.append(strs[0].charAt(index));
            index++;
        }
        return sb.toString();
    }
}