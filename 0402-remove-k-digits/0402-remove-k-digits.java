import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char c : num.toCharArray()){
            while(!stack.isEmpty() && stack.peek() > c && k>0){
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }
        
        if(stack.isEmpty()) return "0";

        StringBuilder res = new StringBuilder();

        while(!stack.isEmpty()){
            char c = stack.removeLast();
            if(res.length() == 0 && c == '0'){
                continue;
            }
            res.append(c);
        }
        if(res.length() == 0) return "0";
        return res.toString();
    }
}
