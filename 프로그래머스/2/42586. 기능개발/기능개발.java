import java.util.*;

class Solution {

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> ansList = new ArrayList<>();
        LinkedList<Integer> pgs = new LinkedList<>();
        LinkedList<Integer> spd = new LinkedList<>();
        int len = progresses.length;

        for (int i = 0; i < len; i++) {
            pgs.offer(progresses[i]);
            spd.offer(speeds[i]);
        }

        while (!pgs.isEmpty() && !spd.isEmpty()) {
            int firstPgs = pgs.peek();
            int firstSpd = spd.peek();

            // 첫 요소가 100 이상이면 배포 카운트
            if (firstPgs >= 100) {
                int cnt = 0;

                while (!pgs.isEmpty()) {
                    if (pgs.peek() >= 100) {
                        pgs.poll();
                        spd.poll();
                        cnt++;
                    } else {
                        break;
                    }
                }

                ansList.add(cnt);
            } else { // 모든 요소를 순회하며 값 증가시키기
                int days = (int) Math.ceil((100 - firstPgs) / (double) firstSpd);

                for (int i = 0; i < pgs.size(); i++) {
                    int p = pgs.poll();
                    int s = spd.poll();
                    pgs.offer(p + s * days);
                    spd.offer(s);
                }
            }

        }

        // list -> array
        int[] answer = new int[ansList.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = ansList.get(i);

        return answer;
    }
}