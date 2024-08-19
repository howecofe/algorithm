import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        int ans = n;
        int[][] graph = new int[n + 1][n + 1]; // 0: dummy

        for (int i = 1; i <= n; i++) Arrays.fill(graph[i], -100);
        for (int i = 1; i <= n; i++) graph[i][i] = 0; // 자기 자신은 0

        for (int[] res : results) {
            graph[res[0]][res[1]] = 1; // win
            graph[res[1]][res[0]] = -1; // lose
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (graph[i][k] == 1 && graph[k][j] == 1) { // i가 k를 이겼는데, k가 j를 이겼으면, i는 j를 이길 수 있음.
                        graph[i][j] = 1;
                        graph[j][i] = -1;
                    }
                }
            }
        }

        // -100을 가지고 있으면 순위 매길 수 없는 선수
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (graph[i][j] == -100) {
                    ans--;
                    break;
                }
            }
        }

        return ans;
    }
}