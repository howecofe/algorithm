import java.util.*;

class Solution {
    static Map<String, Integer> map = new HashMap<>();
    static int order = 1;
    
    public int solution(String word) {
        char[] alpha = {'A', 'E', 'I', 'O', 'U'};
        
        dfs(alpha, "", 1);
        
        return map.get(word);
    }
    
    private static void dfs(char[] alpha, String tmp, int depth) {
        if (depth > alpha.length) { return; }
        
        for (int i = 0; i < alpha.length; i++) {
            map.put(tmp + alpha[i], order++);
            dfs(alpha, tmp + alpha[i], depth + 1);
        }
    }
}