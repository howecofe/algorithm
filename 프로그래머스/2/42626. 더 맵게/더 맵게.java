import java.util.*;

class Solution {
    static Queue<Integer> pq = new PriorityQueue<>();
    static int cnt;
    
    public int solution(int[] scoville, int K) {
        for (int s : scoville) pq.offer(s);

        while (pq.size() >= 2 && pq.peek() < K) {
            int k1 = pq.poll();
            int k2 = pq.poll();
            pq.offer(k1 + k2 * 2);
            cnt++;
        }

        if (!pq.isEmpty() && pq.peek() >= K) return cnt;

        return -1;
    }
}