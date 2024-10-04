import java.util.*;

class Solution {
    
    class Truck {
        int w, c;
        
        Truck(int w, int c) {
            this.w = w;
            this.c = c;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        LinkedList<Integer> truck = new LinkedList<>();
        LinkedList<Truck> bridge = new LinkedList<>();
        int currWeight = 0;
        
        for (int t : truck_weights) truck.add(t);
        
        // 첫번째 트럭을 다리 위로 올리기
        int init = truck.poll();
        bridge.add(new Truck(init, 1));
        currWeight += init;
        time++;
        
        while (!bridge.isEmpty()) {
            time++;
            
            // 첫번째 트럭이 다리 끝에 도착했다면 방출
            Truck first = bridge.peek();
            if (first.c == bridge_length) {
                bridge.poll();
                currWeight -= first.w;
            }
            
            // 현재 다리 위의 모든 트럭들 카운트 증가
            for (int i = 0; i < bridge.size(); i++) {
                Truck t = bridge.poll();
                bridge.add(new Truck(t.w, t.c + 1));
            }
            
            // 다음 트럭이 올라갈 수 있는 경우, 다음 트럭 올리기
            if (bridge.size() < bridge_length) { // 다리가 꽉 차지 않은 경우
                // 무게를 초과하지 않는 경우
                if (!truck.isEmpty() && currWeight + truck.peek() <= weight) { 
                    int w = truck.poll();
                    bridge.add(new Truck(w, 1));
                    currWeight += w;
                }
                
            }
        }
        
        return time;
    }
}