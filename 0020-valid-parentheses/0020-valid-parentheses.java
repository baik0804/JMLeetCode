class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        char[] stack = new char[chars.length];
        int top = 0;

        for(char c : chars){
            stack[top] = c;

            switch(c){
                case '}':
                    if(top == 0)
                        return false;
                    if(stack[top-1] == '{'){
                        top -= 2;
                    }
                    else{
                        return false;
                    }
                    break;

                case ')':
                    if(top == 0)
                        return false;
                    if(stack[top-1] == '('){
                        top -= 2;
                    }
                    else{
                        return false;
                    }
                    break;

                case ']':
                    if(top == 0)
                        return false;
                    if(stack[top-1] == '['){
                        top -= 2;
                    }
                    else{
                        return false;
                    }
                    break;
            }
            top++;
        }
        if(top == 0){
            return true;
        }
        else{
            return false;
        }
    }
}