import java.util.*;

class Solution {
    public int solution(String s) {
//         int sum = 0;
//         int prev = 0;
        
//         for (String str : s.split(" ")) {
//             if (str.equals("Z")) {
//                 sum -= prev;
//             } else {
//                 prev = Integer.parseInt(str);
//                 sum += prev;
//             }
//         }
        
//         return sum;
        
        Stack<Integer> stack = new Stack<>();
        for (String str : s.split(" ")) {
            if (str.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        
        int sum = 0;
        for (int n : stack) {
            sum += n;
        }
        
        return sum;
    }
}