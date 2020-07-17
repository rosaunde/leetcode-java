package easy;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == '(' || chars[i] == '[' || chars[i] == '{'){
                stack.push(chars[i]);
            } else if(chars[i] == ')'){
                if(stack.empty() || stack.pop() != '('){
                    return false;
                }
            } else if (chars[i] == ']'){
                if(stack.empty() || stack.pop() != '['){
                    return false;
                }
            } else if (chars[i] == '}'){
                if(stack.empty() || stack.pop() != '{'){
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}