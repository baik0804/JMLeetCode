import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    HashMap<String,List<Integer>> memo = new HashMap<>();
    public List<Integer> diffWaysToCompute(String expression) {
        if(memo.containsKey(expression))
            return memo.get(expression);
        
        int length = expression.length();
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < length; i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                List<Integer> leftResults = diffWaysToCompute(expression.substring(0,i));
                List<Integer> rightResults = diffWaysToCompute(expression.substring(i+1));

                for(int leftNums : leftResults){
                    for(int rightNums : rightResults){
                        if(ch == '+'){
                            res.add(leftNums + rightNums);
                        }
                        else if(ch == '-'){
                            res.add(leftNums - rightNums);
                        }
                        else if(ch == '*'){
                            res.add(leftNums * rightNums);
                        }
                    }
                }
            }
        }

        if(res.isEmpty()){
            res.add(Integer.parseInt(expression));
        }
        else{
            memo.put(expression,res);
        }

        return res;
    }

}