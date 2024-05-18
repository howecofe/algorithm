import java.util.*;

class Solution {
    static List<String> list = new ArrayList<>();
    static char[] alpha = {'A', 'E', 'I', 'O', 'U'};
    static int answer = 0;
    
    public int solution(String word) {
        dfs(word, "", 0);
        answer = list.indexOf(word);
        
        return answer;
    }
    
    private static void dfs(String word, String tmp, int depth) {
        if (depth > alpha.length) { return; }
        
        list.add(tmp);
        
        if (list.contains(word)) {
            answer = list.indexOf(word);
            return;
        }
        
        for (int i = 0; i < alpha.length; i++) {
            dfs(word, tmp + alpha[i], depth + 1);
        }
    }
}