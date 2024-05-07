import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                s = s.substring(1) + s.substring(0, 1);
            }
            
            char[] arr = s.toCharArray();
            Stack<Character> stack = new Stack<>();
            
            for (char c : arr) {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if ((stack.peek() == '[' && c == ']')
                       || (stack.peek() == '(' && c == ')')
                       || (stack.peek() == '{' && c == '}')) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            
            if (stack.isEmpty()) { answer++; }
        }
        
        return answer;
    }
}