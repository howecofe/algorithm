import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int tang : tangerine) {
            map.put(tang, map.getOrDefault(tang, 0) + 1);
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1))); // value 기준으로 key를 내림차순 정렬
        
        for (Integer key : keySet) {
            answer++;
            k -= map.get(key);
            
            if (k <= 0) { break; }
        }
        
        return answer;
    }
}