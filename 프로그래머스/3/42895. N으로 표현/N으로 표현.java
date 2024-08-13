import java.util.*;

class Solution {
    public int solution(int N, int number) {
        List<Set<Integer>> dp = new ArrayList<>();

        for (int i = 0; i <= 8; i++) dp.add(new HashSet<>());

        for (int i = 1; i <= 8; i++) {
            // N을 i번 연속한 숫자 추가
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < i; j++) sb.append(N);
            dp.get(i).add(Integer.parseInt(sb.toString()));

            // N을 i번 사용한 연산으로 만들 수 있는 숫자 추가
            // dp[1] 부터 dp[i-1] 까지의 수들을 연산해서 dp[i] 구하기
            for (int j = 1; j < i; j++) {
                for (int n1 : dp.get(j)) {
                    for (int n2 : dp.get(i - j)) {
                        dp.get(i).add(n1 + n2);
                        dp.get(i).add(n1 - n2);
                        dp.get(i).add(n1 * n2);
                        if (n2 != 0) dp.get(i).add(n1 / n2);
                    }
                }
            }

            // N을 i번 사용해서 만든 수 중 찾고자 하는 number가 있는지 확인
            if (dp.get(i).contains(number)) return i;
        }

        return -1;
    }
}