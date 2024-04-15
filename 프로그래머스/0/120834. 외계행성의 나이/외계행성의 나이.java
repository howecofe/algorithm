import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        Map<String, String> ageAlpha = new HashMap();
        ageAlpha.put("0", "a");
        ageAlpha.put("1", "b");
        ageAlpha.put("2", "c");
        ageAlpha.put("3", "d");
        ageAlpha.put("4", "e");
        ageAlpha.put("5", "f");
        ageAlpha.put("6", "g");
        ageAlpha.put("7", "h");
        ageAlpha.put("8", "i");
        ageAlpha.put("9", "j");
        
        String[] str = Integer.toString(age).split("");
        
        for (String s : str) {
            answer += ageAlpha.get(s);
        }
        
        return answer;
    }
}