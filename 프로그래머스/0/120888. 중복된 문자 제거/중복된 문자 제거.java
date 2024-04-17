import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String str : my_string.split("")) {
            set.add(str);
        }
        
        for (String data : set) {
            answer += data;
        }
        
        return answer;
    }
}