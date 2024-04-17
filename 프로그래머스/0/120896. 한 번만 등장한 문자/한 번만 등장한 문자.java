import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>();
        for (String str : s.split("")) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        
        for (String key : map.keySet()) {
            if (map.get(key) == 1) { answer += key; }
        }
        
        char[] chArr = answer.toCharArray();
        Arrays.sort(chArr);
        
        return new String(chArr);
    }
}