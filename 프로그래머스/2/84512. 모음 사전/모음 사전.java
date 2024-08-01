import java.util.*;

class Solution {
    static String[] alpha = {"A", "E", "I", "O", "U"};
    static List<String> dict = new ArrayList<>();
    static String target;
    static int res;
    
    public static int solution(String word) {
        target = word;

        dfs(0, "");

        return res;
    }

    static void dfs(int depth, String s) {
        if (depth == alpha.length) return;

        for (int i = 0; i < alpha.length; i++) {
            dict.add(s + alpha[i]);

            // 찾으려는 단어가 있는지 확인
            if (dict.contains(target)) {
                res = dict.indexOf(target) + 1;
                return;
            }

            dfs(depth + 1, s + alpha[i]);
        }
    }
}