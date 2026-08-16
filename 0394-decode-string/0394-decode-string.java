import java.util.ArrayDeque;
import java.util.Deque;


class Solution {
    public String decodeString(String s) {
         Deque<Integer> countStack = new ArrayDeque<>();
         Deque<StringBuilder> stringStack = new ArrayDeque<>();
         
         int currentNumber = 0;
         StringBuilder currentString = new StringBuilder();
         
         for(char c : s.toCharArray()){
             if(Character.isDigit(c)){
                 currentNumber = 10*currentNumber + (c - '0');
             }
             else if(c == '['){
                 countStack.push(currentNumber);
                 stringStack.push(currentString);
                 
                 currentNumber = 0;
                 currentString = new StringBuilder();
             }
             else if(c == ']'){
                 StringBuilder decodedString = stringStack.pop();
                 int repeatTimes = countStack.pop();
                 
                 for(int i = 0; i < repeatTimes; i++){
                     decodedString.append(currentString);
                 }
                 currentString = decodedString;
             }
             else{
                 currentString.append(c);
             }
         }
         return currentString.toString();
    }
}