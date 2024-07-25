import java.util.*;

class Solution {
    static int cnt;
    static LinkedList<Integer> pq = new LinkedList<>(); // 우선순위 담는 큐
    static LinkedList<Integer> iq = new LinkedList<>(); // idx 담는 큐
    public int solution(int[] priorities, int location) {
        // 프로세스의 중요도가 순서대로 담긴 배열 priorities : 숫자가 클수록 우선순위가 높다.
        // 몇 번째로 실행되는지 알고싶은 프로세스의 위치를 알려주는 location
        // 해당 프로세스가 몇 번째로 실행되는지 return

        for (int i = 0; i < priorities.length; i++) {
            pq.offer(priorities[i]);
            iq.offer(i);
        }

        Arrays.sort(priorities);
        for (int i = priorities.length - 1; i >= 0; i--) {
            while (!pq.isEmpty()) {
                int p = pq.poll();
                int idx = iq.poll();

                if (p == priorities[i]) {
                    cnt++;
                    if (idx == location) return cnt;
                    break;
                } else {
                    pq.offer(p);
                    iq.offer(idx);
                }
            }
        }

        return cnt;
    }
}