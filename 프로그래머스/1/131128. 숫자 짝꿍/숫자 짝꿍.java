import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();
        Map<String, Integer> matchMap = new HashMap<>();
        List<String> keyList = new ArrayList<>();
        
        for (String s : X.split("")) { xMap.put(s, xMap.getOrDefault(s, 0) + 1); }
        for (String s : Y.split("")) { yMap.put(s, yMap.getOrDefault(s, 0) + 1); }
        
        for (String xKey : xMap.keySet()) {
            if (yMap.containsKey(xKey)) {
                keyList.add(xKey);
                matchMap.put(xKey, Math.min(xMap.get(xKey), yMap.get(xKey)));
            }
        }
        
        keyList.sort(Comparator.reverseOrder());
        for (String key : keyList) {
            answer += key.repeat(matchMap.get(key));
        }
        
        if (answer.isEmpty()) { answer = "-1"; }
        else if (answer.replace("0", "").isEmpty()) { answer = "0"; }
        
        return answer;
    }
}