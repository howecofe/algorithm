import java.util.*;

class Solution {
    static char[] dict = {'A', 'E', 'I', 'O', 'U'};
    static int cnt, answer;
    static String target;

    public int solution(String word) {
        target = word;
        
        dfs(0, "");
        
        return answer;
    }

    static void dfs(int depth, String word) {
        if (word.equals(target)) {
            answer = cnt;
            return;
        }

        if (depth == 5) return;

        for (int i = 0; i < 5; i++) {
            cnt++;
            dfs(depth + 1, word + dict[i]);
        }
    }
}