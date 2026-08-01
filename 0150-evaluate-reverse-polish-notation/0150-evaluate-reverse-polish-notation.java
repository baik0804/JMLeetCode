import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int evalRPN(String[] tokens) {
        Deque<String> stack = new ArrayDeque<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                int operand2 = Integer.parseInt(stack.pop());
                int operand1 = Integer.parseInt(stack.pop());
                switch (token) {
                    case "+":
                        stack.push(String.valueOf(operand1 + operand2));
                        break;
                    case "-":
                        stack.push(String.valueOf(operand1 - operand2));
                        break;
                    case "*":
                        stack.push(String.valueOf(operand1 * operand2));
                        break;
                    case "/":
                        stack.push(String.valueOf(operand1 / operand2));
                        break;
                }
            }
            else{
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}