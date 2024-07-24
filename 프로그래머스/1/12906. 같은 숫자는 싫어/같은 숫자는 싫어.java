import java.util.*;

class Solution {
    static ArrayDeque<Integer> stk = new ArrayDeque<>();
    static int[] ans;
    public int[] solution(int[] arr) {
        // 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return
        // 원소들의 순서를 유지

        for (int n : arr) {
            if (stk.isEmpty()) stk.push(n);
            else if (!stk.isEmpty() && stk.peek() != n) stk.push(n);
        }

        int size = stk.size();
        ans = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            ans[i] = stk.pop();
        }

        return ans;
    }
}