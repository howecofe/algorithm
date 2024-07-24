import java.lang.reflect.Array;
import java.util.*;

class Solution {
    static ArrayDeque<Character> stk = new ArrayDeque<>();
    static char[] arr;
    boolean solution(String s) {
        // '(' 또는 ')' 로만 이루어진 문자열 s
        // s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return

        arr = s.toCharArray();
        for (char c : arr) {
            if (c == '(') stk.push(c);
            else { // c == ')'
                if (stk.isEmpty() || stk.peek() == ')') return false;
                
                stk.pop(); // '('이면 꺼내기
            }
        }

        if (!stk.isEmpty()) return false;

        return true;
    }
}