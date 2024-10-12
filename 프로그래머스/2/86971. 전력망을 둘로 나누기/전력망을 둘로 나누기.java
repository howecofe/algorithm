import java.util.*;

class Solution {
    static int answer, cnt;
    static int[][] map;
    static int[][] copied;
    
    public int solution(int n, int[][] wires) {
        answer = 101;
        map = new int[n + 1][n + 1]; // 0 dummy
        copied = new int[n + 1][n + 1];
        
        for (int[] w : wires) {
            map[w[0]][w[1]] = 1;
            map[w[1]][w[0]] = 1;
        }
        
        for (int[] w : wires) {
            for (int i = 0; i <= n; i++) {
                copied[i] = map[i].clone();
            }
            
            copied[w[0]][w[1]] = 0;
            copied[w[1]][w[0]] = 0;
            
            cnt = 1;
            dfs(1);
            
            answer = Math.min(answer, Math.abs(cnt - (n - cnt)));
        }
        
        return answer;
    }
    
    static void dfs(int start) {
        
        for (int i = 1; i < copied.length; i++) {
            if (copied[start][i] == 1) {
                copied[start][i] = 0;
                copied[i][start] = 0;
                cnt++;
                dfs(i);
            }
        }
    }
}