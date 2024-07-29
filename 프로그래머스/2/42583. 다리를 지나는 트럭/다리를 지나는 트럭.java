import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        LinkedList<Integer[]> brQ = new LinkedList<>(); // 다리 위 트럭 큐
        LinkedList<Integer> waitQ = new LinkedList<>(); // 대기 트럭 큐
        for (int w : truck_weights) waitQ.offer(w);

        int brW = 0; // 다리 위의 트럭들의 무게
        int time = 0;

        while (!waitQ.isEmpty() || !brQ.isEmpty()) {
            // 트럭이 나가야 하는 경우
            if (!brQ.isEmpty() && brQ.peek()[1] == time) {
                brW -= brQ.poll()[0];
            }

            // 새로운 트럭을 추가했을 때 무게와 다리 길이를 초과하지 않으면 추가
            if (!waitQ.isEmpty() && brW + waitQ.peek() <= weight && brQ.size() + 1 <= bridge_length) {
                int w = waitQ.poll();
                brQ.offer(new Integer[]{w, time + bridge_length}); // (트럭 무게, 트럭이 큐에서 나가야 하는 시간)
                brW += w;
            }

            time++;
        }

        return time;
    }
}