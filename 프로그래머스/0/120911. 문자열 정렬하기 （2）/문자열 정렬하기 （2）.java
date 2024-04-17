import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] words = my_string.toLowerCase().split("");
        Arrays.sort(words);
        
        for (String s : words) {
            answer += s;
        }
        
        return answer;
    }
}