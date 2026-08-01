import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Deque<String> stack = new ArrayDeque<>();

        for(String s : split){
            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else if(s.equals(".") || s.equals("")){
            }
            else{
                stack.push(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        if(stack.isEmpty()){
            return "/";
        }
        while(!stack.isEmpty()){
            sb.append("/"+stack.removeLast());
        }
        return sb.toString();
    }
}