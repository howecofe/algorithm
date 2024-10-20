import java.util.*;

class Solution {
    static boolean[] visited;
    static int answer;
    
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        answer = Integer.MAX_VALUE;
        
        dfs(begin, target, words, 0);
        
        if (answer == Integer.MAX_VALUE) return 0;
        
        return answer;
    }
    
    static void dfs(String before, String target, String[] words, int cnt) {
        if (before.equals(target)) {
            answer = Math.min(answer, cnt);
            return;
        }
        
        for (int i = 0; i < words.length; i++) {
            if (visited[i]) continue;
            
            int diffCnt = 0;
            
            for (int j = 0; j < before.length(); j++) {
                if (before.charAt(j) != words[i].charAt(j)) diffCnt++;
            }
            
            if (diffCnt == 1) {
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
}