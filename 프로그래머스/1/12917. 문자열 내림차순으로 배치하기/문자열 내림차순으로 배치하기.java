import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        
        String answer = "";
        for (String string : str) { answer += string; }
        
        return answer;
    }
}