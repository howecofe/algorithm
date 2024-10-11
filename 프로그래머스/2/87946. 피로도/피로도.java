import java.util.*;

class Solution {
    
    static boolean[] visited;
    static int[][] dg;
    static int len, answer;
    
    public int solution(int k, int[][] dungeons) {
        len = dungeons.length;
        visited = new boolean[len];
        dg = new int[len][];
        
        for (int i = 0; i < len; i++) {
            dg[i] = dungeons[i].clone();
        }
        
        dfs(0, 0, k);
        
        return answer;
    }
    
    static void dfs(int depth, int cnt, int power) {
        if (depth == len) {
            answer = Math.max(answer, cnt);
            return;
        }
        
        for (int i = 0; i < len; i++) {
            if (visited[i]) continue;
            
            visited[i] = true;
            
            if (dg[i][0] <= power) {
                dfs(depth + 1, cnt + 1, power - dg[i][1]);
            } else {
                dfs(depth + 1, cnt, power);
            }
            
            visited[i] = false;
        }
    }

}