import java.util.*;

class Solution {
   
    boolean solution(String s) {
        char[] arr = s.toCharArray();
        Deque<Character> stk = new ArrayDeque<>();
        
        for (char c : arr) {
            if (c == '(') {
                stk.push(c);
                continue;
            }
            
            // c == ')'
            if (!stk.isEmpty() && stk.peek() == '(') stk.pop();
            else return false;
            
        }
        
        if (!stk.isEmpty()) return false;
        
        return true;
    }
}