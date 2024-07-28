import java.util.*;

class Solution {
    public static int[] solution(int[] prices) {
        int[] secArr = new int[prices.length];
        ArrayDeque<Integer> stk = new ArrayDeque<>(); // (주식가격, 인덱스) 저장

        // 현재 주식가격과 스택의 주식가격을 비교해서, 하락장이 나타나면 (현재 인덱스 - 스택의 해당 인덱스)로 secArr 갱신 후 스택에서 제거
        for (int i = 0; i < prices.length; i++) {
            while (!stk.isEmpty() && prices[i] < prices[stk.peek()]) {
                int idx = stk.pop();
                secArr[idx] = i - idx;
            }

            stk.push(i);
        }

        // 끝까지 하락하지 않은 주식가격들 처리
        while(!stk.isEmpty()) {
            int idx = stk.pop();
            secArr[idx] = prices.length - idx - 1;
        }

        return secArr;
    }
}