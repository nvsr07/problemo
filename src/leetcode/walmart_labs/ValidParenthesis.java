package leetcode.walmart_labs;

import java.util.Stack;

public class ValidParenthesis {
    /**
     * https://leetcode.com/problems/valid-parentheses/*/

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char element = s.charAt(i);
            if(element == '(' || element == '{' || element == '['){
                stack.push(element);
            }else if(element == ')'){
                if(stack.isEmpty()) return false;
                if(stack.pop() != '('){
                    return false;
                }
            }else if(element == '}'){
                if(stack.isEmpty()) return false;
                if(stack.pop() != '{'){
                    return false;
                }
            }else if(element == ']'){
                if(stack.isEmpty()) return false;
                if(stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
