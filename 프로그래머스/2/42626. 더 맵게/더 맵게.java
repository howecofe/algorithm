import java.util.*;

class Solution {
    
    public int solution(int[] scoville, int K) {
        int cnt = 0;
        Queue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1 - o2);
        
        for (int s : scoville) pq.offer(s);
        
        while (!pq.isEmpty()) {
            if (pq.peek() >= K) break;
            
            if (pq.size() == 1 && pq.peek() < K) return -1;
            
            if (pq.size() > 1 && pq.peek() < K) {
                int s1 = pq.poll();
                int s2 = pq.poll();
                int score = s1 + s2 * 2;
                pq.offer(score);
                cnt++;
            }
        }
        
        return cnt;
    }
}