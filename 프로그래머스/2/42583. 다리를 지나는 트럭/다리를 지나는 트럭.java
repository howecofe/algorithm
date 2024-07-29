import java.util.*;

class Solution {
    static LinkedList<Integer> waitQ = new LinkedList<>();
    static LinkedList<Integer> ingQ = new LinkedList<>();
    static int t;
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 다리에 올라갈 수 있는 트럭 수 bridge_length
        // 다리가 견딜 수 있는 무게 weight
        // 트럭 별 무게 truck_weights

        for (int n : truck_weights) waitQ.offer(n);
        int w = 0;
        while (!waitQ.isEmpty()) {
            for (int i = 0; i < bridge_length; i++) {
                t++;
                if (!waitQ.isEmpty()) {
                    int truck = waitQ.peek();

                    if (ingQ.size() < bridge_length && w + truck <= weight) {
                        waitQ.poll(); // 대기열에서 빼기
                        ingQ.offer(truck); // 다리 건너기
                        w += truck; // 다리 건너는 트럭 무게 증가
                    }
                }
            }

            int completedTruck = ingQ.poll();
            w -= completedTruck;
            t++;
        }

        return t;
    }
}