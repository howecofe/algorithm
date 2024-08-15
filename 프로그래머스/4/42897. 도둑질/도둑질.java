class Solution {
    public int solution(int[] money) {
        int homeCnt = money.length;
        int[] dp = new int[homeCnt];
        int ans = 0;

        // case1 : 첫 번째 집을 포함하는 경우 : 마지막 집 포함 X
        dp[0] = money[0]; // 첫 번째 집 고려 대상 O
        dp[1] = Math.max(dp[0], money[1]); // 첫 번째만 방문하거나, 두번째만 방문하는 경우 중 최댓값

        for (int i = 2; i < homeCnt - 1; i++) { // 마지막 집 고려 X
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + money[i]); // 현재 집 방문하지 않거나(이전 집이 최대), 현재 집 방문하거나.
        }

        ans = dp[homeCnt - 2];

        // case2 : 첫 번째 집을 포함하지 않는 경우 : 마지막 집 포함 O
        dp[0] = 0; // 첫 번째 집은 고려 대상 X
        dp[1] = money[1];

        for (int i = 2; i < homeCnt; i++) { // 마지막 집 고려 O
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + money[i]);
        }

        // 두 case 중 최댓값 구하기
        ans = Math.max(ans, dp[homeCnt - 1]);

        return ans;
    }
}