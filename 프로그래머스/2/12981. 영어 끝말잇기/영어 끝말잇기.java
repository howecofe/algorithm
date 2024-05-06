import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        
        int alpha = words[0].charAt(words[0].length() - 1);
        
        for (int i = 1; i < words.length; i++) {
            if (list.contains(words[i]) || words[i].charAt(0) != alpha) {
                return new int[]{i % n + 1, i / n + 1};
            }
            
            list.add(words[i]);
            alpha = words[i].charAt(words[i].length() - 1);
        }

        return new int[]{0, 0};
    }
}