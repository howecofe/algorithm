// LRU 알고리즘

import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> que = new LinkedList<>();
        
        for (String city : cities) {
            city = city.toLowerCase();
            if (que.contains(city)) {
                que.remove(city);
                que.add(city);
                answer += 1;
            } else {
                if (cacheSize != 0) {
                    if (que.size() == cacheSize) {
                        que.poll();
                    }
                    que.add(city);
                }
                
                answer += 5;
            }
        }
        
        return answer;
    }
}