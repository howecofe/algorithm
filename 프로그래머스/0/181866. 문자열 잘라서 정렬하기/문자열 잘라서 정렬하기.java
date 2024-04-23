import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.replaceAll("x+", "x").split("x");
        int cnt = 0;
        for (String s : str) {
            if (s.isEmpty()) { cnt++; }
        }
        
        String[] answer = new String[str.length - cnt];
        int idx = 0;
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) { answer[idx++] = str[i]; }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}