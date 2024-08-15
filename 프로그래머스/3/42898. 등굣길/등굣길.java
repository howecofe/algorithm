class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n + 1][m + 1]; // 0: dummy
        for (int[] pd : puddles) dp[pd[1]][pd[0]] = -1; // -1은 물웅덩이 => 갈 수 없는 곳

        int[] dy = {-1, 0}; // 상, 좌
        int[] dx = {0, -1};

        dp[1][1] = 1;

        // 현재 위치에 도달할 수 있는 최단 경로의 수 : 상, 좌 경로의 합, -1인 경우는 제외하고 합할 것
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // 현재 위치가 물웅덩이인지 체크
                if (dp[i][j] == -1) continue;

                for (int d = 0; d < 2; d++) {
                    int beforeY = i + dy[d];
                    int beforeX = j + dx[d];

                    // 상, 좌 경계값 체크, 물웅덩이 체크
                    if (beforeY < 1 || beforeY > n || beforeX < 1 || beforeX > m || dp[beforeY][beforeX] == -1) continue;

                    dp[i][j] += dp[beforeY][beforeX];
                }
                dp[i][j] %= 1000000007; // 마지막에 나눠야 모든 값이 1000000007 미만으로 보장된다.
            }
        }

        return dp[n][m];
    }
}