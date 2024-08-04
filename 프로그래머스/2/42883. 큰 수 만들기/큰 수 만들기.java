import java.util.*;

class Solution {
    public String solution(String number, int k) {
        char[] arr = number.toCharArray();
        Deque<Character> stk = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        int size = number.length() - k;

        for (int i = 0; i < arr.length; i++) {
            // 현재 수보다 이전 수가 작으면 제거 (k번)
            while (!stk.isEmpty() && stk.peekLast() < arr[i] && k > 0) {
                stk.pollLast();
                k--;
            }
            stk.addLast(arr[i]);
        }

        for (int i = 0; i < size; i++) {
            sb.append(stk.pollFirst());
        }

        return sb.toString();

    }
}