import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long start = 0;
        long end = (long)times[times.length - 1] * n; // 심사시간이 가장 오래 걸리는 심사관이 모든 사람을 처리할 경우 (최대 시간)

        // 이분탐색 lower bound : 최초로 target(사람 수 n) 값 이상의 값이 등장하는 위치(시간 mid)를 구한다.
        while (start < end) {
            long mid = (start + end) / 2;

            // 주어진 시간에 심사관들이 처리할 수 있는 최대 사람 수 구하기
            long people = 0;
            for (int t : times) people += mid / t;

            if (people < n) { // target 값보다 작은 경우, 큰 범위 탐색으로 조정
                start = mid + 1;
            } else { // target 값과 같거나 큰 경우, 작은 범위 탐색으로 조정
                end = mid;
            }
        }

        return end;
    }
}