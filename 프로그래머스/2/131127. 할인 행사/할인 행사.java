import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            map.put(want[i], number[i]);
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> copyMap = new HashMap<>(map);
            boolean exists = true;
            
            for (int j = i; j < i + 10; j++) {
                if (copyMap.containsKey(discount[j])) {
                    copyMap.put(discount[j], copyMap.get(discount[j]) - 1);
                } else {
                    exists = false;
                    break;
                }
            }
            
            if (!exists) {
                continue;
            } else {
               for (int val : copyMap.values()) {
                    if (val != 0) {
                        exists = false;
                        break;
                    }
                } 
            }
            
            if (exists) { answer++; }
            
        }
        
        return answer;
    }
}