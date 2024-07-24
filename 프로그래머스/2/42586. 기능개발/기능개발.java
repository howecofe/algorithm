import java.util.*;

class Solution {
    static LinkedList<Integer> pq = new LinkedList<>();
    static LinkedList<Integer> sq = new LinkedList<>();
    static List<Integer> cntList = new ArrayList<>();
    static int[] ans;
    public int[] solution(int[] progresses, int[] speeds) {
        // 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses
        // 각 작업의 개발 속도가 적힌 정수 배열 speeds
        // 각 배포마다 몇 개의 기능이 배포되는지를 return
        // 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고, 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포

        // 풀이
        // 맨 앞 기능이 100 이상이 될 때까지 순회하면서 작업
        // 맨 앞 기능이 100 이상이 되면, 100을 넘는 작업들 꺼내기

        for (int p : progresses) pq.offer(p);
        for (int s : speeds) sq.offer(s);

        while (!pq.isEmpty()) {
            for (int i = 0; i < pq.size(); i++) {
                int p = pq.poll();
                int s = sq.poll();
                pq.offer(p + s);
                sq.offer(s);
            }

            int cnt = 0;
            // 완료된 작업(100)까지만 빼내기
            while (pq.peek() != null && pq.peek() >= 100) {
                cnt++;
                pq.poll();
                sq.poll();
            }

            if (cnt > 0) cntList.add(cnt);
        }

        // list -> array
        ans = new int[cntList.size()];
        for (int i = 0; i < ans.length; i++) ans[i] = cntList.get(i);

        return ans;
    }
}