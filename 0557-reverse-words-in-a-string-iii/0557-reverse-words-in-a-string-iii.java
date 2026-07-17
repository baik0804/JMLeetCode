import java.util.StringTokenizer;

class Solution {
    public String reverseWords(String s) {
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder reversed = new StringBuilder();
        while(true){
            StringBuilder sb = new StringBuilder(st.nextToken());
            sb.reverse();
            reversed.append(sb);
            if(!st.hasMoreTokens()){
                break;
            }
            reversed.append(' ');
        }
        return reversed.toString();
    }
}