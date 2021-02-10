package easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
            char myChar = s.charAt(i);
            if(myChar == '(' || myChar == '{' || myChar == '['){
                stack.push(myChar);
            }else if(myChar == ')'){
                if(stack.isEmpty() || stack.peekFirst() != '('){
                    return false;
                }
                stack.pop();
            } else if(myChar == '}'){
                if(stack.isEmpty() || stack.peekFirst() != '{'){
                    return false;
                }
                stack.pop();
            }  else if(myChar == ']'){
                if(stack.isEmpty() || stack.peekFirst() != '['){
                    return false;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}