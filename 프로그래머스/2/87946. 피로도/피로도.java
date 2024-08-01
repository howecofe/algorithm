import java.util.*;

class Solution {
    static int max;
    static boolean[] visited;
    static int[][] dg;
    
    public int solution(int k, int[][] dungeons) {
        dg = dungeons.clone();
        visited = new boolean[dg.length];

        dfs(0, 0, k);

        return max;
    }

    static void dfs(int depth, int cnt, int k) {
        if (depth == dg.length) {
            max = Math.max(max, cnt);
            return;
        }

        for (int i = 0; i < dg.length; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            if (dg[i][0] <= k) {
                dfs(depth + 1, cnt + 1, k - dg[i][1]);
            } else {
                dfs(depth + 1, cnt, k);
            }
            visited[i] = false;
        }
    }
}