import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        
        String[] str = s.split("");
        int[] answer = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            if (!map.containsKey(str[i])) {
                answer[i] = -1;
            } else {
                answer[i] = i - map.get(str[i]);
            }
            map.put(str[i], i);
        }
        
        return answer;
    }
}