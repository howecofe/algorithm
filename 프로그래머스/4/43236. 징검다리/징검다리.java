import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        // 모든 바위를 제거한 경우
        if (n == rocks.length) return distance;

        int ans = 0;
        int start = 1;
        int end = distance;

        Arrays.sort(rocks);

        // 이분탐색 기준 값은 바위 사이의 최소 간격들의 최댓값
        // -> 바위를 모두 제거했을 때의 거리(출발점 ~ 끝점)가 최댓값이므로 이를 반으로 줄여나가면서 탐색
        while (start <= end) {
            int mid = (start + end) / 2;
            int startLoc = 0;
            int cnt = 0;

            for (int currLoc : rocks) {
                if (currLoc - startLoc < mid) { // 기준 값보다 작으면 돌 제거
                    cnt++;
                } else { // 그렇지 않으면 시작점을 현재 위치로 초기화
                    startLoc = currLoc;
                }
            }

            // 도착지점까지의 거리도 고려
            if (distance - startLoc < mid) cnt++;

            // 제거한 바위 수가 n보다 큰 경우: 기준값의 범위를 줄여야 한다. -> end 조정
            // 제거한 바위 수가 n보다 작거나 같은 경우: 기준값의 범위를 늘려야 한다. -> 최댓값 갱신 후 start 조정
            if (cnt > n) {
                end = mid - 1;
            } else {
                ans = mid; // 최대 거리로 갱신
                start = mid + 1;
            }
        }

        return ans;
    }
}