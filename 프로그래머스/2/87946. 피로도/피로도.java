import java.util.*;

class Solution {
    static int max = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        int cnt = 0;
        int depth = 1;
        
        dfs(k, dungeons, visited, depth, cnt);
        
        return max;
    }
    
    private static void dfs(int k, int[][] dungeons, boolean[] visited, int depth, int cnt) {
        if (depth > dungeons.length) {
            if (cnt > max) { max = cnt; }
            return;
        }
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                if (k >= dungeons[i][0]) { // 탐험 가능하면
                    dfs(k - dungeons[i][1], dungeons, visited, depth + 1, cnt + 1);
                } else {
                    dfs(k, dungeons, visited, depth + 1, cnt);
                }
                visited[i] = false;
            }
        }
    }
}