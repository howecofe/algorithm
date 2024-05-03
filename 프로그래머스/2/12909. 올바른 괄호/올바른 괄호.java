import java.util.*;

class Solution {
    boolean solution(String s) {
        if (s.charAt(0) == ')') { return false; }
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        
        if (stack.size() == 0) { return true; }
    
        return false;
    }
}