class Solution {
    public String removeDuplicates(String s) {
        char[] arr = s.toCharArray();
        char[] stack = new char[arr.length];
        int top = -1;
        for(char c : arr){
            if(top == -1){
                stack[++top] = c;
            }
            else if(c == stack[top]){
                top--;
            }
            else{
                stack[++top] = c;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=top;i++){
            sb.append(stack[i]);
        }
        return sb.toString();
    }
}